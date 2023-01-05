package sdf;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) {
        
        Path cithPath = Paths.get("day03repo");

        System.out.printf("file name = %s\n", cithPath);

        File cith = cithPath.toFile();
        
        

        System.out.printf("is file = %b\n", cith.isFile());
        System.out.printf("is directory = %b\n", cith.isDirectory());

        if (cith.isDirectory()) {
            System.out.println("Contents of directory");
            // For each loop
            for (File file: cith.listFiles()){
                System.out.printf("\t%s (%d)\n", file.getAbsolutePath(), file.length());
            }

        } else {
            System.out.printf("file size = %s\n", cith.length());
            System.out.printf("absolute path = %s\n", cith.getAbsolutePath());
        }
    }
    
}
