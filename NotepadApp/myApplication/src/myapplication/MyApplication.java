/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import javax.swing.JFrame;

/**
 *
 * @author burhancabiroglu
 */
public class MyApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myGui mygui=new myGui();
        mygui.setBounds(500,100,695,750);
        mygui.setTitle("NotepadApp");
        mygui.setResizable(false);
        mygui.setVisible(true);
        mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
