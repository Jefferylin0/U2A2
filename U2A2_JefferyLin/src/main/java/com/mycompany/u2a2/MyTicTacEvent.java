/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.u2a2;

// Importing the Java Swing things for the GUI
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author 342441086
 */
public class MyTicTacEvent implements ItemListener, ActionListener, Runnable{
    // Creating variables for the game
    MyTicTac gui;
    Thread playing;
    ImageIcon a = new ImageIcon("x.png");
    ImageIcon b = new ImageIcon("o.png");
    ImageIcon back = new ImageIcon("cardback.png");
    int winx = 0, wino = 0, tie = 0, clicks = 0;
    int[] scores = new int[3];
    int[][] check = new int[5][5];
    DataTool data = new DataTool(); // Data object to read and write from the file
    boolean game = false; 
    
    public MyTicTacEvent (MyTicTac in){
        gui = in;
        for (int row=0; row<=4; row++){
           for (int col=0; col<=4; col++){
               check[row][col]=0;
           }
       }
    }
    // Checking which button is clicked and running its method
    public void actionPerformed (ActionEvent event) {
       String command = event.getActionCommand();
       if (command.equals("Reset")) {
           reset();
       }
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
    // Method that takes in which button is clicked and runs the calculations to change its icon
    void buttonCalculations(int index) {
        // Takes the index and finds the row and column of that index
        int row = 0, col = 0;
        row = index / 5;
        col = (index - (row*5));
        // Only allow boxes to be clicked if it hasn't been clicked yet and game has started
        if (check[row][col] == 0 && game == true) {
            clicks += 1;
            // Checks if a even or odd number of clicks have been done to decide between X and O
            if ((clicks%2) == 1) {
                gui.boxes[row][col].setIcon(a);
                check[row][col] = 1;
            }
            else {
                gui.boxes[row][col].setIcon(b);
                check[row][col] = 2;
            }
            System.out.println(row + ",   " + col + game);
            winner();
        }
    }
    // Creating all the button methods and calling its calculation button in each one
    void b1() {
        buttonCalculations(0);
    }
    void b2() {
        buttonCalculations(1);
    }
    void b3() {
        buttonCalculations(2);
    }
    void b4() {
        buttonCalculations(3);
    }
    void b5() {
        buttonCalculations(4);
    }
    void b6() {
        buttonCalculations(5);
    }
    void b7() {
        buttonCalculations(6);
    }
    void b8() {
        buttonCalculations(7);
    }
    void b9() {
        buttonCalculations(8);
    }    
    void b10() {
        buttonCalculations(9);
    }    
    void b11() {
        buttonCalculations(10);
    }   
    void b12() {
        buttonCalculations(11);
    }
    void b13() {
        buttonCalculations(12);
    }
    void b14() {
        buttonCalculations(13);
    }
    void b15() {
        buttonCalculations(14);
    }
    void b16() {
        buttonCalculations(15);
    }
    void b17() {
        buttonCalculations(16);
    }
    void b18() {
        buttonCalculations(17);
    }
    void b19() {
        buttonCalculations(18);
    }
    void b20() {
        buttonCalculations(19);
    }
    void b21() {
        buttonCalculations(20);
    }
    void b22() {
        buttonCalculations(21);
    }
    void b23() {
        buttonCalculations(22);
    }
    void b24() {
        buttonCalculations(23);
    }
    void b25() {
        buttonCalculations(24);
    }
    // Method that checks for winner or tie
    void winner() {
        /** Check rows for winner */
        if (game == true) {
            for (int x=0; x<=2; x++){
                if ((check[x][0]==check[x][1]) && (check[x][0]==check[x][2]) && (check[x][0]==check[x][3]) && (check[x][0]==check[x][4]) ) {
                    if (check[x][0]==1) {
                        JOptionPane.showMessageDialog(null, "X is the winner");
                        winx += 1;
                        game = false;
                    } else if (check[x][0]==2){
                        JOptionPane.showMessageDialog(null, "O is the winner");
                        wino += 1;
                        game = false;
                    }
                }
            }

            /** Check columns for winner */
            for (int x=0; x<=2; x++){
                if ((check[0][x]==check[1][x]) && (check[0][x]==check[2][x]) && (check[0][x]==check[3][x]) && (check[0][x]==check[4][x]) ) {
                    if (check[0][x]==1) {
                        JOptionPane.showMessageDialog(null, "X is the winner");
                        winx += 1;
                        game = false;
                    } else if (check[0][x]==2) {
                        JOptionPane.showMessageDialog(null, "O is the winner");
                        wino += 1;
                        game = false;
                    }
                }
            }

            /** Check diagonals for winner */
            if (((check[0][4]==check[1][3]) && (check[0][4]==check[2][2]) && (check[0][4]==check[3][1]) && (check[0][4]==check[4][0]) )||
                    ((check[0][0]==check[1][1]) && (check[1][1]==check[2][2]) && (check[2][2]==check[3][3]) && (check[3][3]==check[4][4]) )){
                if (check[2][2]==1) {
                    JOptionPane.showMessageDialog(null, "X is the winner");
                    winx += 1;
                    game = false;
                } else if (check[2][2]==2) {
                    JOptionPane.showMessageDialog(null, "O is the winner");
                    wino += 1;
                    game = false;
                }

            }

            /** Checks if the game is a tie */
            if (clicks==25 && game == true) {
                JOptionPane.showMessageDialog(null, "The game is a tie");
                tie += 1;
                game = false;
            }
            // Using data object to write each stat to file
            data.write(winx, wino, tie);
        }
    }
    // Method to reset the game
    void reset() {
        // Looping through all the boxes to set their icon to cardback
        for (int i = 0; i<5; i++) {
            for (int j = 0; j<5; j++) {
                check[i][j] = 0;
                gui.boxes[i][j].setIcon(back);
            }
        }
        // Reading the data and changing the shown stats and updating the stats variables
        scores = data.read();
        gui.blank1.setText("Win X:\n" + scores[0]);
        gui.blank2.setText("Win O:\n" + scores[1]);
        gui.blank3.setText("Tie:\n" + scores[2]);
        winx = scores[0];
        wino = scores[1];
        tie = scores[2];
        // Resetting clicks and allowing game to start again
        clicks = 0;
        game = true;
    }
    // Method that starts the game 
    void startPlaying() {
        playing = new Thread(this);
        playing.start();
        gui.play.setEnabled(false);
        reset();
    }

    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
