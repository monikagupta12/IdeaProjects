package Fileclass;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAsStringWriter {
    public static void main(String[] args) throws IOException {
        String s="this is java program.";
        String fileNmae="C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\my.txt";
        Files.writeString(Path.of(fileNmae),s);
    }
}
