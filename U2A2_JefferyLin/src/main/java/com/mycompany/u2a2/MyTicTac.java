/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u1a2;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 342441086
 */

public class MyTicTac extends JFrame{
    MyTicTacEvent tictac = new MyTicTacEvent(this);
    
    ImageIcon a = new ImageIcon("x.jpg");
    ImageIcon b = new ImageIcon("o.jpg");
    ImageIcon c = new ImageIcon("Winner");
    JPanel row1 = new JPanel();
    JButton[][] boxes = new JButton[5][5];
    JButton play = new JButton("Play");
    JTextField blank1 = new JTextField();
    JTextField blank2 = new JTextField();
    JTextField blank3 = new JTextField();
    JTextField blank4 = new JTextField();
    JOptionPane win = new JOptionPane("Winner");
    ImageIcon back = new ImageIcon("cardback.jpg");
    JPanel head = new JPanel();
    JLabel box1 = new JLabel("a");
    JLabel box2 = new JLabel("a");
    JLabel title = new JLabel("TicTacToe");
    JLabel box3 = new JLabel("a");
    JLabel box4 = new JLabel("d");
    
    public MyTicTac() {
        super("Tic Tac Toe");
        setSize(900,900);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        setLayout(layout);
        int name = 0;
        String newname;
        
        head.add(box1);
        head.add(box2);
        head.add(title);
        head.add(box3);
        head.add(box4);
        
        GridLayout layout1 = new GridLayout(7, 5, 10, 10);
        row1.add(head);
        row1.setLayout(layout1);
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

