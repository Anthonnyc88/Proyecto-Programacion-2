/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

/**
 *
 * @author Anthonny
 */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Windows_game2 extends JFrame implements ActionListener {

    public Windows_game2() {
        JToolBar barraHerramientas = new JToolBar();
//		txtColumnas = new JTextField();
//		txtFilas = new JTextField();
        btnCrear = new JButton();
        panel = new JPanel(null);
        //Para que el JFrame cierre la aplicacion
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btnCrear.setText("Cargar Matriz de Juego");
        btnCrear.addActionListener(this);
        barraHerramientas.add(btnCrear);

        //Colocamos el JToolBar en la parte de arriba del JFrame
        this.add(barraHerramientas, BorderLayout.PAGE_START);

        //Se agrega el panel del label
        this.add(panel, BorderLayout.CENTER);

        this.setSize(620, 620);
        //Permite que la ventana se coloque al centro de la pantalla
        this.setLocationRelativeTo(null);

    }

    public void actionPerformed(ActionEvent evt) {
        int filas = 5;
        int columnas = 8;
        Random rnd = new Random();

        //An array of buttons is created according to incoming rows and columns
        BotonMatriz[][] botones = new BotonMatriz[filas][columnas];
        //Se recorren las filas
        for (int fila = 0; fila < filas; fila++) {

            for (int columna = 0; columna < columnas; columna++) {
                botones[fila][columna] = new BotonMatriz(75 * columna, 100 * fila, 75, 100);
                panel.add(botones[fila][columna]);
            }
        }

        //////START OF THE GAME///////////////
        botones[0][0].setName("INICIO");
        botones[0][0].setBackground(Color.YELLOW);
        botones[0][0].setNombre(0, 0);
        //Where the game ends
        botones[4][7].setBackground(Color.GREEN);
        botones[4][7].setNombre(4, 7);
        //obstaculos        
        obstaculosRandom(botones);
        //The panel is updated so that the buttons are visible
        panel.updateUI();
    }
    
    public static void obstaculosRandom(BotonMatriz[][] botones){
       ArrayList<String> listaObstaculos = new ArrayList();
       
       while (listaObstaculos.size() < 10) {
            int filaRandom = (int) (Math.random() * 5);
            int columnaRandom = (int) (Math.random() * 8);
            String posicion = String.valueOf(filaRandom + "," + columnaRandom);

            if (!(listaObstaculos.contains(posicion))) {
                if(filaRandom == 0 && columnaRandom == 0){
                    // no hacer nada
                }else{
                    if(filaRandom == 4 && columnaRandom == 7){
                        // no hacer nada
                    }else{
                        listaObstaculos.add(posicion);
                        botones[filaRandom][columnaRandom].setBackground(Color.RED);
                        botones[filaRandom][columnaRandom].setNombre(filaRandom,columnaRandom);
                        botones[filaRandom][columnaRandom].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Prueba de pregunta");
                            }
                        });
                    }
                }
            }
        }
       
       //return listaObstaculos;
    }

    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //new Windows_game2().setVisible(true);
    }

    JButton btnCrear;
    JTextField txtColumnas;
    JTextField txtFilas;
    JPanel panel;
}
