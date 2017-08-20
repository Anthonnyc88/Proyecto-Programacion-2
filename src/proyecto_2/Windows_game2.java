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
import java.util.List;
import javax.swing.JOptionPane;

public class Windows_game2 extends JFrame implements ActionListener {

    ArrayList<String> listaObstaculos = new ArrayList();

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

    public static void llenar_listas() {
        String[] pre = {"Una variable puede ser nula?", "Una variable String puede ser convertidad a int?", "Una variable Int puede ser convertidad a String?", "Una variable String puede ser convertidad a double?",
            "Una variable puede ser utilizada en otra clase si es privated?", "Una variable public se puede utulizar en otros metodos?", "Una variable protected puede ser modificada en otra clase?", "Una variable declarada public static es global?", "Una instancia es una variable?",
            "Una instancia es una clase aparte?", "new clase(); es una instancia?", "Una variable int puede tener decimales?", "Se pueden sumar variables String?", "Una variable double puede tener numeros enteros?",
            "Una variable long puede contener numeros de gran rango?", "Una interfaz grafica puede realizarse a codigo manual?", "Se puede caer un programa cuando un ciclo de iteracion se encicla ?", "Un caracter es lo mismo que una cadena de texto?",
            "Los archivos almacenan informacion permanente?", "Las matrices almacenan todo tipo de dato?", "Las ArrayList tienen limites definidos?", "Las Listas tienen limited definidos?", "El println imprime de la misma forma que el print?",
            "El /n hace lo mismo que el System.LineSeparetor()?", "El /n hace lo mismo que el  /r/n ?", "El % significa 'porciento'?", "En java se concatena con +?", "Se pueden sumar metodos de diferentes tipo?",
            "Se puede retornar una variable en un metodo void?", "Format sirve para ordenar el codigo?", "Java es orientado a objetos?", "Una clase sin MAIN puede correr programas?", "Una forma de establecer el MAIN m?s rapido es escribiendo psvm?",
            "Para establecer el System.out.println mas rapido es escribiendo sout?", "Para elevar una potencia en programacion se utiliza ^ ?", "Para cerrar una declaracion de cualquier tipo en java se utiliza {}?", "Se puede declarar una variable de cualquier tipo NULL?",
            "Se puede declarar un metodo int con parametros String?", "Para ingresar informacion desde el teclado se utiliza la Clase Scanner?", "El BufferedReader se utiliza para la lectura de archivos?",};

        //respuestas
        String[] res = {"v", "v", "v", "f", "f", "v", "f", "v", "f", "f", "v", "f", "f", "f", "v", "v", "v", "f", "v", "f", "f", "v", "f", "v", "v", "f", "v", "f", "f", "v", "v", "f", "v", "v", "v", "v", "v", "v", "v", "v"};

    }

    public void obstaculosRandom(BotonMatriz[][] botones) {
        while (listaObstaculos.size() < 10) {
            int filaRandom = (int) (Math.random() * 5);
            int columnaRandom = (int) (Math.random() * 8);
            String posicion = String.valueOf(filaRandom + "," + columnaRandom);

            if (!(listaObstaculos.contains(posicion))) {
                if (filaRandom == 0 && columnaRandom == 0) {
                    // no hacer nada no pinta la posicion 0
                } else {
                    if (filaRandom == 4 && columnaRandom == 7) {
                        // no hacer nada no pinta la posicion donde termina al juego
                    } else {
                        listaObstaculos.add(posicion);
                        botones[filaRandom][columnaRandom].setBackground(Color.RED);
                        botones[filaRandom][columnaRandom].setNombre(filaRandom, columnaRandom);
                        botones[filaRandom][columnaRandom].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                JOptionPane.showMessageDialog(null, "Has perdido el juego");
                                dispose();//Pierda si toca los obstaculos
                            }
                        });
                    }
                }
            }
        }
        //CLIK DEL BOTON DEL COMODIN AQUI LLAMARA UNA VENTANA MAS ADELANTE XD
        while (listaObstaculos.size() < 11) {
            int filaRandom = (int) (Math.random() * 5);
            int columnaRandom = (int) (Math.random() * 8);
            String posicion = String.valueOf(filaRandom + "," + columnaRandom);

            if (!(listaObstaculos.contains(posicion))) {
                listaObstaculos.add(posicion);
                botones[filaRandom][columnaRandom].setBackground(Color.BLUE);
                botones[filaRandom][columnaRandom].setNombre(filaRandom, columnaRandom);
                botones[filaRandom][columnaRandom].addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        VentanaComodin a = new VentanaComodin();
                        a.setVisible(true);
                       
                    }

                });
            }
        }
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
