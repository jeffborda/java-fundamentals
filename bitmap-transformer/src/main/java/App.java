import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        //Bitmap bmp = new Bitmap(args[0], args[1], args[2]);

        Bitmap bmp1 = new Bitmap("resources/smiley.bmp", "resources/smiley_test.bmp", "no_transform");
        Bitmap bmp2 = new Bitmap("resources/nice_day.bmp", "resources/nice_day_test.bmp", "no_transform");
//        bmp1.flipVertically();
//        bmp2.flipVertically();

//        bmp1.flipHorizontally();
//        bmp2.flipHorizontally();


        bmp1.save();
        bmp2.save();





    }

}
