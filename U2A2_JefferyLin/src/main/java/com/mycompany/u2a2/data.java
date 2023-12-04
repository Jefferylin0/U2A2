/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 342441086
 */
public class data {
    int winX = 0, winO = 0, tie = 0;
    public void readFromFile() {
        String data = "";
        String[] scores = new String[3];
        try {
            File myFile = new File("accounts.txt");
            Scanner fileInput = new Scanner(myFile);
            data = fileInput.nextLine();
            scores = data.split(",");
            winX = Integer.parseInt(scores[0]);
            winO = Integer.parseInt(scores[1]);
            tie = Integer.parseInt(scores[2]);
            fileInput.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
