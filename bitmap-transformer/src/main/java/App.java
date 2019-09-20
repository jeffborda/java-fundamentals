import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public static void main(String[] args) {

        String inputPath = args[0];
        String outputPath = args[1];
        String transform = args[2];
        Bitmap bmpImage = new Bitmap(inputPath, outputPath);

        switch(transform){
            case "flipVertically" : bmpImage.flipVertically(); break;
            case "flipHorizontally" : bmpImage.flipHorizontally(); break;
            case "addRedBorder" : bmpImage.addRedBorder(); break;
            case "brighten" : bmpImage.brighten(); break;
            case "darken" : bmpImage.darken(); break;
            default : System.out.println("Invalid Transform. Choices: flipVertically, flipHorizontally, addRedBorder, brighten, or darken.");
        }
    }

}
