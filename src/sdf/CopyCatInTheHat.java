package sdf;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyCatInTheHat {

    public static void main(String[] args)throws FileNotFoundException, IOException {

    Path cithPath = Paths.get("./cat_in_th_hat.txt");
    File cith = cithPath.toFile();

    if (!cith.exists()){
        System.err.println("Cannot Find File");
        System.exit(1);
    }

    FileReader fr = new FileReader(cith);
    BufferedReader br = new BufferedReader(fr);

    FileWriter writer = new FileWriter("CAT IN THE HAT.txt");
    String line;

    while (null != (line = br.readLine())) {
        writer.write(line.toUpperCase());
        writer.write("\n");
        
    }

    // Close reader
    br.close();
    fr.close();

    writer.flush();
    writer.close();
        
    }

    
}

