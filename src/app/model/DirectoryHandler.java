package app.model;

import java.io.File;

public class DirectoryHandler {

    public boolean ifDirectoryExists(String directoryName){
        File file = new File(directoryName);
        return file.exists();
    }

    public String createDirectoryIfNotExist(String directoryName){
        try {
            File directory = new File(directoryName);;
            if(!ifDirectoryExists(directoryName)){
                if (directory.mkdir()){
                    return String.format("Directory %s created", directory.getName());
                } else  {
                    return String.format("Directory %s could not be created", directory.getName());
                }
            }
            else  {
                return String.format("Directory %s already exists", directory.getName());
            }
        } catch(Exception e){
            return  "Error: something went wrong" + e.getMessage();
        }
    }
}
