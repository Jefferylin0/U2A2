/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author 342441086
 */
public class MyTicTacEvent implements ItemListener, ActionListener, Runnable{
    MyTicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("x.png");
    ImageIcon b = new ImageIcon("o.png");
    int clicks = 0;
    int win = 0;
    int[][] check = new int[5][5];

    public MyTicTacEvent (MyTicTac in){
        gui = in;
        for (int row=0; row<=4; row++){
           for (int col=0; col<=4; col++){
               check[row][col]=0;
           }
       }
    }
    public void actionPerformed (ActionEvent event) {
       String command = event.getActionCommand();

       if (command.equals("Play")) {
           startPlaying();
       }
       if (command.equals("1")) {
           b1();
       }
       if (command.equals("2")) {
           b2();
       }
       if (command.equals("3")) {
           b3();
       }
       if (command.equals("4")) {
           b4();
       }
       if (command.equals("5")) {
           b5();
       }
       if (command.equals("6")) {
           b6();
       }
       if (command.equals("7")) {
           b7();
       }
       if (command.equals("8")) {
           b8();
       }
       if (command.equals("9")) {
           b9();
       }
       if (command.equals("10")) {
           b10();
       }
       if (command.equals("11")) {
           b11();
       }
       if (command.equals("12")) {
           b12();
       }
       if (command.equals("13")) {
           b13();
       }
       if (command.equals("14")) {
           b14();
       }
       if (command.equals("15")) {
           b15();
       }
       if (command.equals("16")) {
           b16();
       }
       if (command.equals("17")) {
           b17();
       }
       if (command.equals("18")) {
           b18();
       }
       if (command.equals("19")) {
           b19();
       }
       if (command.equals("20")) {
           b20();
       }
       if (command.equals("21")) {
           b21();
       }
       if (command.equals("22")) {
           b22();
       }
       if (command.equals("23")) {
           b23();
       }
       if (command.equals("24")) {
           b24();
       }
       if (command.equals("25")) {
           b25();
       }
    }
    void buttonCalculations(int index) {
        clicks += 1;
        int row = 0, col = 0;
        row = index / 5;
        col = (index - (row*5));
        if ((clicks%2) == 1) {
            gui.boxes[row][col].setIcon(a);
            check[row][col] = 1;
        }
        else {
            gui.boxes[row][col].setIcon(b);
            check[row][col] = 2;
        }
        winner();
    }
    void b1() {
        buttonCalculations(0);
        winner();
    }
    void b2() {
        buttonCalculations(1);
        winner();
    }
    void b3() {
        buttonCalculations(2);
        winner();
    }
    void b4() {
        buttonCalculations(3);
        winner();
    }
    void b5() {
        buttonCalculations(4);
        winner();
    }
    void b6() {
        buttonCalculations(5);
        winner();
    }
    void b7() {
        buttonCalculations(6);
        winner();
    }
    void b8() {
        buttonCalculations(7);
        winner();
    }
    void b9() {
        buttonCalculations(8);
        winner();
    }
    
    void b10() {
        buttonCalculations(9);
        winner();
    }
    
    void b11() {
        buttonCalculations(10);
        winner();
    }
    
    void b12() {
        buttonCalculations(11);
        winner();
    }
    
    void b13() {
        buttonCalculations(12);
        winner();
    }

    void b14() {
        buttonCalculations(13);
        winner();
    }
    void b15() {
        buttonCalculations(14);
        winner();
    }
    void b16() {
        buttonCalculations(15);
        winner();
    }
    void b17() {
        buttonCalculations(16);
        winner();
    }
    void b18() {
        buttonCalculations(17);
        winner();
    }
    void b19() {
        buttonCalculations(18);
        winner();
    }
    void b20() {
        buttonCalculations(19);
        winner();
    }
    void b21() {
        buttonCalculations(20);
        winner();
    }
    void b22() {
        buttonCalculations(21);
        winner();
    }
    void b23() {
        buttonCalculations(22);
        winner();
    }
    void b24() {
        buttonCalculations(23);
        winner();
    }
    void b25() {
        buttonCalculations(24);
        winner();
    }
    void winner() {
        /** Check rows for winner */
        
        for (int x=0; x<=2; x++){
            if ((check[x][0]==check[x][1])&&(check[x][0]==check[x][2])) {
                if (check[x][0]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                } else if (check[x][0]==2){
                    JOptionPane.showMessageDialog(null, "Y is the winner");
                    win = 1;
                }
            }
        }

        /** Check columns for winner */
        for (int x=0; x<=2; x++){
            if ((check[0][x]==check[1][x])&&(check[0][x]==check[2][x])) {
                if (check[0][x]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    win = 1;
                } else if (check[0][x]==2) {
                    JOptionPane.showMessageDialog(null, "Y is the winner");
                    win = 1;
                }
            }
        }

        /** Check diagonals for winner */
        if (((check[0][0]==check[1][1])&&(check[0][0]==check[2][2]))||
                ((check[2][0]==check[1][1])&&(check[1][1]==check[0][2]))){
            if (check[1][1]==1) {
                JOptionPane.showMessageDialog(null, "X is the winner");
                win = 1;
            } else if (check[1][1]==2) {
                JOptionPane.showMessageDialog(null, "Y is the winner");
                win = 1;
            }

        }

        /** Checks if the game is a tie */
        if ((clicks==25) && (win==0)) {
            JOptionPane.showMessageDialog(null, "The game is a tie");
        }
    }

     
    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
    }

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
