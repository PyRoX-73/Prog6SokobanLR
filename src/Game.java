import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream; //InputStream
import java.util.Scanner; //Scanner

class Game {

    // Since the program is going to read a file, we need the exception to be thrown.
    public static void main(String args[]) throws java.io.IOException{
        // I'm going to use this to test a few of my own files.
        Scanner sc = new Scanner(new File("tests/_dumb_test"));
        sc.useDelimiter(" ");

        while (sc.hasNext()) {
            System.out.println(sc.next()+"");
        }
    }
}
