/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2;
import java.awt.*;
import javax.swing.*;
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

public class MyTicTac extends JFrame{
    MyTicTacEvent tictac = new MyTicTacEvent(this);
    ImageIcon a = new ImageIcon("x.png");
    ImageIcon b = new ImageIcon("o.png");
    ImageIcon back = new ImageIcon("cardback.jpg");
    ImageIcon game = new ImageIcon("game.png");
    ImageIcon title = new ImageIcon("title.png");
    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[5][5];
    JButton play = new JButton("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JTextField blank3 = new JTextField();
    JTextField blank4 = new JTextField();
    JLabel box1 = new JLabel(game);
    JLabel box2 = new JLabel(game);
    JLabel titleBox = new JLabel(title);
    JLabel box3 = new JLabel(game);
    JLabel box4 = new JLabel(game);
    
    public MyTicTac() {
        super("Tic Tac Toe");
        setSize(900,900);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;

        GridLayout layout1 = new GridLayout(7, 5, 10, 10);
        row1.setLayout(layout1);
        row1.add(box1);
        row1.add(box2);
        row1.add(titleBox);
        row1.add(box3);
        row1.add(box4);
        for (int x=0; x<=4; x++){
            for (int y=0; y<=4; y++){
                name = name + 1;
                newname = Integer.toString(name);
                boxes[x][y] = new JButton(newname);
                boxes[x][y].setIcon(back);
                row1.add(boxes[x][y]);
            }
        }
        row1.add(blank1);
        row1.add(blank2);
        row1.add(play);
        row1.add(blank3);
        row1.add(blank4);
        add (row1);

        play.addActionListener(tictac);
        for (int x=0; x<=4; x++){
            for (int y=0; y<=4; y++){
                boxes[x][y].addActionListener(tictac);
            }
        }


        setVisible(true);
    }
    
    public static void main(String[] arguments){
        MyTicTac frame = new MyTicTac();
    }
}

