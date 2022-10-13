package task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Files files = new Files();
        files.createFileList();
        files.Valid();
        files.Otchet();
    }
}