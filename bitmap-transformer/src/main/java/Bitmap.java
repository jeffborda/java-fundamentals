import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bitmap {

    private Path inputPath;
    private Path outputPath;
    private String transform;
    private BufferedImage bmpData;



    public Bitmap(String input, String output, String transform) {
        System.out.println("in the Bitmap constructor");

        this.inputPath = FileSystems.getDefault().getPath(input);
        this.outputPath = FileSystems.getDefault().getPath(output);
        this.transform = transform;

        BufferedImage bmp = null;



        try {
            bmp = ImageIO.read(inputPath.toFile());
            this.bmpData = bmp;

        } catch (IOException e) {
            System.out.println(e);
        }
    }


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

    public void redBorder() {

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

    public void toBlackAndWhite() {

        int height = this.bmpData.getHeight();
        int width = this.bmpData.getWidth();

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                this.bmpData.setRGB(x, y, this.bmpData.getRGB(x, y) - 10);
            }
        }
    }

    public boolean save() {

        try {
            return ImageIO.write(bmpData, "bmp", outputPath.toFile());
        } catch (IOException e) {
            System.out.println(e);
        }

        return false;
    }

}
