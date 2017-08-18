/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author Anthonny
 *
 */
public class Windows_game2 extends JFrame {
     int x = 50, y = 0, Ancho = 1000, alto = 700;

    static JFrame ventana;

    //presentacion
    JPanel panelPresentacion;
    JButton iniciar;
    JLabel fondoPresentacion , Ventana;
    ImageIcon imagenFondoPres;   
    static int matAux[][];
    private static final int COLUMNAS = 8;
    private static final int FILAS = 5;
    
     public Windows_game2() {
        super("Preguntas y Respuestas");
        Ventana = new JLabel(); 
        getContentPane().add(Ventana);
       JFrame v = new JFrame();
      v.getContentPane().setLayout(new GridLayout(FILAS,COLUMNAS));
		
      JTextField [][] textField = new JTextField [FILAS][COLUMNAS];
      for (int i=0;i<FILAS;i++)
         for (int j=0;j<COLUMNAS;j++)
         {
            textField[i][j] = new JTextField(1);
            v.getContentPane().add(textField[i][j]);
             Ventana.add(textField[i][j]);
           
         }
      
       
      v.pack();
      v.setVisible(true);
      v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        
        
        
        getContentPane().add(Ventana);
       // this.getContentPane().setBackground(Color.BLUE);
          setSize(1000,700);
     }
     

}


