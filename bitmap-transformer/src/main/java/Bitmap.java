import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
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

        try {
            this.bmpData = ImageIO.read(inputPath.toFile());
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Constructor for testing
    protected Bitmap(BufferedImage bmp) {
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
                int tempRGB = this.bmpData.getRGB(x, y);
                this.bmpData.setRGB(x, y, this.bmpData.getRGB(x, height - y - 1));
                this.bmpData.setRGB(x, height - y - 1, tempRGB);
            }
        }
        this.save();
    }

    /**
     * Flips an image across the horizontally.
     */
    public void flipHorizontally() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width / 2; x++) {
                int tempRGB = this.bmpData.getRGB(x, y);
                this.bmpData.setRGB(x, y, this.bmpData.getRGB(width - x - 1, y));
                this.bmpData.setRGB(width - x - 1, y, tempRGB);
            }
        }
        this.save();
    }

    /**
     * Adds an inset red border to the image.
     */
    public void addRedBorder() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();
        int borderWidth = 5;

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(y < borderWidth || y + borderWidth >= height || x < borderWidth || x + borderWidth >= width) {
                    this.bmpData.setRGB(x, y, Color.red.getRGB());
                }
            }
        }
        this.save();
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
        this.save();
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
        this.save();
    }

    /**
     * Saves output to the given file name.
     */
    public boolean save() {

        try {
            ImageIO.write(bmpData, "bmp", outputPath.toFile());
            System.out.println("Successfully saved transformed image to: " + outputPath);
            return true;
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("There was an error transforming your image.");
        return false;
    }

    public BufferedImage getImageData() {
        return this.bmpData;
    }

}
