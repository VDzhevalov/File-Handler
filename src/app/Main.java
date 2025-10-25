package app;

import static app.config.FileFolderConfig.*;

public class Main {

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileContent = "My very important information.";
        String result = handler.writeFile(FULL_FILE_PATH, fileContent);
        String content = handler.readFile(FULL_FILE_PATH);
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
