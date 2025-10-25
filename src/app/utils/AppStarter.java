package app.utils;

import app.controller.FileHandlerController;

import static app.config.FileFolderConfig.FULL_FILE_PATH;

public class AppStarter {

    public static void runApp(){
        FileHandlerController fileHandlerController = new FileHandlerController();
        fileHandlerController.writeToFile(FULL_FILE_PATH);
        fileHandlerController.readFromFile(FULL_FILE_PATH);
    }
}
