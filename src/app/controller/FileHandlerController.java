package app.controller;

import app.model.DirectoryHandler;
import app.model.FileHandler;
import app.view.ContentView;

import static app.config.FileFolderConfig.BASE_PATH;
import static app.utils.Printer.printContent;
import static app.utils.Printer.printResult;

public class FileHandlerController {
    private final FileHandler handler = new FileHandler();
    private final ContentView fileContent = new ContentView();
    private final DirectoryHandler directoryHandler = new DirectoryHandler();

    public void writeToFile(String filePath) {
        printResult(directoryHandler.createDirectoryIfNotExist(BASE_PATH));
        printResult(handler.writeFile(filePath, fileContent.getContent()));
    }

    public void readFromFile(String filePath) {
        printContent(handler.readFile(filePath));
    }

}
