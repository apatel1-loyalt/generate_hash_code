package org.example;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String[] args) {
        File folder = new File("input_file_for_hashcode_gen");
        File[] listOfFiles = folder.listFiles();
        try {
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    String filename = file.getName();
                    InputStream inputStream = new FileInputStream(file);
                    String md5Hex = DigestUtils.md5Hex(inputStream);
                    System.out.println(filename + "," + md5Hex);
                    inputStream.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
