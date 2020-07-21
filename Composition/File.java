package Composition;

import java.util.Date;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class File {
    private String filename;
    private Folder folder;

    public File(String fname){
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
        Date date = new Date();
        String foldername = df.format(date);
        this.folder = new Folder(foldername);
        try{
            WriteFile(this.folder.getPath(), fname);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    private void WriteFile(String path,String fname) throws IOException{
        this.filename = fname;
        Path filePath = Paths.get(path,fname);
        byte[] myvar = "Any String you want".getBytes();
        Files.write(filePath,myvar,StandardOpenOption.CREATE);
        this.filename = filePath.toString();
    }
    public String getFilename(){
        return this.filename;
    }
}