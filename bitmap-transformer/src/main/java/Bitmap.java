import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bitmap {

    private String input;
    private String output;
    private String transform;
    BufferedImage bmp = null;
    List<List<Integer>> bmpMatrix = new ArrayList<List<Integer>>();


    public Bitmap(String input, String output, String transform) {
        System.out.println("in the Bitmap constructor");

        this.input = input;
        this.output = output;
        this.transform = transform;


        try {
            bmp = ImageIO.read(new File(input)); //"resources/smiley.bmp"

            for(int i = 0; i < bmp.getHeight(); i++) {
                for(int j = 0; j < bmp.getWidth(); j++) {
                    System.out.println(bmp.getRGB(j, i));
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }


    public void flip() {
        //read in file
        //save
    }

}
