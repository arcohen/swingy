/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;

/**
 *
 * @author arcohen
 */
public class ReadFile {
    private String path;
    
    public ReadFile(String filePath) {
        path = filePath;
    }
    
    public ArrayList<String> OpenFile() throws IOExeption {
        FileReader fileReader = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fileReader);
        
        ArrayList<String> textData = new ArrayList<String>();
        String line;
        
        while ((line = textReader.readLine()) != null) {
            textData.add(line);
        }
        
        textReader.close( );
        return textData;
    } 
}
