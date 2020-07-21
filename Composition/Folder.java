package Composition;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Folder {
    private Path path;

    public Folder(String name) {
        this.path = Paths.get(name);
        try{
            this.CreateDir();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    private void CreateDir() throws IOException {
        if(!Files.exists(this.path)){
            Files.createDirectory(this.path);
        }else{
            System.out.printf("%s already exists\n",this.path.toString());
        }
    }
    public String getPath(){
        return this.path.toString();
    }
}