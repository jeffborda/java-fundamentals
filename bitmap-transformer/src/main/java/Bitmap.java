import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Bitmap {

    private Path input;
    private Path output;
    private String transform;
    List<List<Integer>> bmpMatrix = new ArrayList<List<Integer>>();


    public Bitmap(Path input, Path output, String transform) {
        System.out.println("in the Bitmap constructor");

        this.input = input;
        this.output = output;
        this.transform = transform;
    }


    public void flip() {
        //read in file
        //save
    }

}
