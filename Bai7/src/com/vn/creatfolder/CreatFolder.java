package com.vn.creatfolder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CreatFolder {
public static void main(String[] args) {

    Path path = Paths.get("E:\\CreatFolder1");

    if(Files.notExists(path))
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}