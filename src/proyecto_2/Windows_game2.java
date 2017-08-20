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

public class Windows_game2 extends JFrame implements ActionListener {

    public Windows_game2() {
        JToolBar barraHerramientas = new JToolBar();
//		txtColumnas = new JTextField();
//		txtFilas = new JTextField();
        btnCrear = new JButton();
        panel = new JPanel(null);
        //Para que el JFrame cierre la aplicacion
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

            for (int columna = 0; columna < columnas; columna++) 
            {
                botones[fila][columna] = new BotonMatriz(75 * columna, 100 * fila, 75, 100);

                //////START OF THE GAME///////////////
                if (fila == 0 && columna == 0) {
                    botones[fila][columna].setName("INICIO");
                    botones[fila][columna].setBackground(Color.yellow);
                    botones[fila][columna].setNombre(fila, columna);
                    
                }
                //Where the game ends
                if (fila == 4 && columna == 7) {
                    botones[fila][columna].setBackground(Color.GREEN);
                    botones[fila][columna].setNombre(fila, columna);
                   

                }

//                 //Random para generar el comodin
//                int rand2 = (int) (Math.random() * 2);
//                for (int y = 0; y < 5; y++) {
//                    if (fila == rand2) {
//                        botones[fila][columna].setBackground(Color.RED);
//                    }
//                }
                
                //Random de los osbtaculos
                int rand = (int) (Math.random() * 6);
                for (int x = 0; x < 5; x++) {
                    if (fila == rand) {
                        botones[fila][columna].setBackground(Color.MAGENTA);
                    }
                }

                //The button is added to the panel
                panel.add(botones[fila][columna]);
                if (columna == 0 && fila == 0) {

                }

            }
        }
        //The panel is updated so that the buttons are visible
        panel.updateUI();
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
