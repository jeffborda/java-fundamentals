import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Bitmap class reads in a bmp file, provides image transformations, and can then save the output to a new file.
 */
public class Bitmap {

    private Path inputPath;
    private Path outputPath;
    private BufferedImage bmpData;


    public Bitmap(String input, String output) {

        this.inputPath = FileSystems.getDefault().getPath(input);
        this.outputPath = FileSystems.getDefault().getPath(output);

        BufferedImage bmp = null;

        try {
            bmp = ImageIO.read(inputPath.toFile());
            this.bmpData = bmp;

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Constructor for testing
    public Bitmap(BufferedImage bmp) {
        this.bmpData = bmp;
    }

    /**
     * Flips an image across the vertically.
     */
    public void flipVertically() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height / 2; y++) {
            for(int x = 0; x < width; x++) {
                int temp = this.bmpData.getRGB(x, y);
                this.bmpData.setRGB(x, y, this.bmpData.getRGB(x, height - y - 1));
                this.bmpData.setRGB(x, height - y - 1, temp);
            }
        }
    }

    /**
     * Flips an image across the horizontally.
     */
    public void flipHorizontally() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width / 2; x++) {
                int temp = this.bmpData.getRGB(x, y);
                this.bmpData.setRGB(x, y, this.bmpData.getRGB(width - x - 1, y));
                this.bmpData.setRGB(width - x - 1, y, temp);
            }
        }
    }

    /**
     * Adds an inset red border to the image.
     */
    public void addRedBorder() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(y < 5 || y + 5 >= height || x < 5 || x + 5 >= width) {
                    this.bmpData.setRGB(x, y, Color.red.getRGB());
                }
            }
        }
    }

    /**
     * Brightens the colors of the image.
     */
    public void brighten() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color color = new Color(this.bmpData.getRGB(x, y));
                this.bmpData.setRGB(x, y, color.brighter().getRGB());
            }
        }
    }

    /**
     * Darkens the colors of an image.
     */
    public void darken() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color color = new Color(this.bmpData.getRGB(x, y));
                this.bmpData.setRGB(x, y, color.darker().getRGB());
            }
        }
    }

    /**
     * Saves output to the given file name.
     */
    public boolean save() {

        try {
            return ImageIO.write(bmpData, "bmp", outputPath.toFile());
        } catch (IOException e) {
            System.out.println(e);
        }

        return false;
    }

    public BufferedImage getImageData() {
        return this.bmpData;
    }

}
