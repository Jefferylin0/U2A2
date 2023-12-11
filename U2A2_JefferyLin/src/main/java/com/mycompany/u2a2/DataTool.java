/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Importing all the tools to read and write to the file
package com.mycompany.u2a2;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 342441086
 */
public class DataTool {
    int winx = 0, wino = 0, tie = 0;
    // Method that reads the file and returns an array
    public int[] read() {
        String data = ""; 
        String[] scores = new String[3];
        int[] scores2 = new int[3]; 
        try {
            File myFile = new File("winsTracker.txt");
            Scanner fileInput = new Scanner(myFile);
            data = fileInput.nextLine();
            scores = data.split(",");
            winx = Integer.parseInt(scores[0]);
            wino = Integer.parseInt(scores[1]);
            tie = Integer.parseInt(scores[2]);
            scores2[0] = winx;
            scores2[1] = wino;
            scores2[2] = tie;
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return scores2;
    }
    // Method that takes the 3 stats and writes it to the file
    public void write(int winx, int wino, int tie) {
        String newLine = "";
        try {
            FileWriter myWriter = new FileWriter("winsTracker.txt", false);
            newLine = Integer.toString(winx) + "," + Integer.toString(wino) + "," + Integer.toString(tie);
            myWriter.write(newLine);
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
