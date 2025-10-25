package app;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

    public String writeFile(String fileName, String fileContent) {
        try(FileWriter fw = new FileWriter(fileName)) {
            fw.write(fileContent);
            return "Success. All data saved to the file: " + fileName;
        } catch (Exception e) {
            return  "Error: something went wrong" + e.getMessage();
        }
    }

    public String readFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            int sym;
            StringBuilder stringBuilder =new StringBuilder();
            while ((sym = reader.read()) != -1) {
                stringBuilder.append((char) sym);
            }
            return stringBuilder.toString();
        } catch (IOException ex) {
            return ex.getMessage();
        }
    }
}
