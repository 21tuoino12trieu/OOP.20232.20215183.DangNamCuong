package OtherProjects.hust.soict;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator{
    public static void main(String[] args) throws IOException{
        String filename = "D:/CodeViet/OOP Java/OtherProjects/hust/soict/test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(filename));
        startTime = System.currentTimeMillis();
        String outpuString = "";
        for (byte  b: inputBytes){
            outpuString += (char)b;
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
