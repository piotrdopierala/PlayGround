package pl.dopierala.enumTest;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * ENUM functionality test
 */
public class enumMain {
    public static void main(String[] args) throws IOException {
        enumSize e1;
        e1= enumSize.SMALL;

        enumSize.SMALL.enmuFunction(34);
        e1.enmuFunction(4);

        BufferedWriter b =  Files.newBufferedWriter(Paths.get("plik.txt"));
        b.write("Zapisuje przez java.nio.file");
        b.close();

    }
}
