package sdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CatInTheHat {

    // public static void main(String[] args) throws FileNotFoundException {

        public static void main(String[] args) {
    
        Path cithPath = Paths.get("./cat_in_th_hat.txt");

        File cith = cithPath.toFile();

        try {
            
            InputStream is = new FileInputStream(cith);
            OutputStream os = new FileOutputStream("copy_of_cat_in_the_hat.txt");
            byte[] buffer = new byte[4016];
            int size = is.read(buffer);

            // size > 0 when not end of file, size == -1 at EOF
            // while (size >= 0) {
            //     System.out.printf("%d\n", size);
            //     os.write(buffer, 0, size);
            //     size = is.read(buffer);
            // }

            // another way
            int size1;
            while ((size1 = is.read(buffer))>=0) {
                System.out.printf("%d\n", size);
                os.write(buffer, 0, size1);
            }



            // close input
            is.close();

            // close output
            os.flush();
            os.close();

        } catch (FileNotFoundException e) {
            System.err.printf("IO Exception: %s\n", e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.printf("IO Exception: %s\n", e.getMessage());
            e.printStackTrace();
        }

        
    }
    
}
