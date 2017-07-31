/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Anthonny
 */
public class Windows_game1 extends JFrame {

    JLabel nadador1, nadador2, nadador3, nadador4, nadador5, piscina, linea1, linea2;

    JButton bntInicio, bntRegresar;
    int x = 50, y = 0, Ancho = 1000, alto = 700;

    public Windows_game1() {
        super("Competencia de natacion");
        ArrayList<String> ListaNadadores = new ArrayList<>();

        //Permiter poner nuestros componentes donde queranos
        getContentPane().setLayout(null);

//        SpinnerNumberModel model = new SpinnerNumberModel(
//                new Integer(2), // Dato visualizado al inicio en el spinner 
//                new Integer(0), // Límite inferior 
//                new Integer(5), // Límite superior 
//                new Integer(1) // incremento-decremento 
//        );
        
         

        piscina = new JLabel();
        getContentPane().add(piscina);
        this.getContentPane().setBackground(Color.BLUE);
        piscina.setBounds(100, 0, 1000, 700);

        //Hacemos los JLabel de cada nadador
        nadador1 = new JLabel();
        piscina.add(nadador1); //Agrega la imagen al panel
        nadador1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nadador.gif")));
        nadador1.setBounds(30, alto - 150, 73, 100);

        nadador2 = new JLabel();
        piscina.add(nadador2);
        nadador2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nadador.gif")));
        nadador2.setBounds(150, alto - 150, 73, 100);

        nadador3 = new JLabel();
        piscina.add(nadador3);
        nadador3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nadador.gif")));
        nadador3.setBounds(280, alto - 150, 73, 100);

        nadador4 = new JLabel();
        piscina.add(nadador4);
        nadador4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nadador.gif")));
        nadador4.setBounds(400, alto - 150, 73, 100);

        nadador5 = new JLabel();
        piscina.add(nadador5);
        nadador5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/nadador.gif")));
        nadador5.setBounds(500, alto - 150, 73, 100);

        //boton de inicio del juego
        ImageIcon start = new ImageIcon(getClass().getResource("/Imagenes/5.png"));//Colocamos la imagen en el boton
        Icon icono = new ImageIcon(start.getImage().getScaledInstance(100, 50, 1));
        bntInicio = new JButton(icono);
        getContentPane().add(bntInicio);
        bntInicio.setBounds(0, 0, 100, 50);

        bntInicio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                System.out.println("Inicio");
                //Aqui llamo los metodos de los hilos de cada nadador
                Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1);
                Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2);
                Super_Metodo hiloNadador3 = new Super_Metodo(280, alto, nadador3);
                Super_Metodo hiloNadador4 = new Super_Metodo(400, alto, nadador4);
                Super_Metodo hiloNadador5 = new Super_Metodo(500, alto, nadador5);

                Cronometro a = new Cronometro(); //Llamo el metodo del cronometro

                hiloNadador1.start(); //Arranca la ejecucion de cada hilo
                hiloNadador2.start();
                hiloNadador3.start();
                hiloNadador4.start();
                hiloNadador5.start();
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(x, y, Ancho, alto);
        setVisible(true);
        setResizable(false);//no poder cambiar dimensiones

    }

}
