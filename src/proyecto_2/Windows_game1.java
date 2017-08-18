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
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import static proyecto_2.Cronometro.h0;
import static proyecto_2.Cronometro.m0;
import static proyecto_2.Cronometro.s0;
import static proyecto_2.Cronometro.saber;

/**
 *
 * @author Anthonny
 */
public class Windows_game1 extends JFrame {

    JLabel nadador1, nadador2, nadador3, nadador4, nadador5, piscina, linea1, linea2 , separador1 , separador2,separador3,separador4;
    JRadioButton botones[];
    JTextArea txtNadadores;
    JRadioButton nadado1, nadado2, nadado3, nadado4, nadado5;

    JButton bntInicio, bntRegresar;
    int x = 50, y = 0, Ancho = 1000, alto = 700;

    public Windows_game1() {
        super("Competencia de natacion");

        //Permiter poner nuestros componentes donde queranos
        getContentPane().setLayout(null);
        int cP;
        SpinnerNumberModel model = new SpinnerNumberModel();
        ArrayList<String> ListaNadadores = new ArrayList<>();
        ListaNadadores.add("Anthonny");
        ListaNadadores.add("Maria");
        ListaNadadores.add("Kendall");
        ListaNadadores.add("CaraVaca");
        ListaNadadores.add("Tavo");

        piscina = new JLabel();
        getContentPane().add(piscina);
        this.getContentPane().setBackground(Color.BLUE);
        piscina.setBounds(100, 0, 1000, 700);

        //RADIOS BUTTONS
        nadado1 = new JRadioButton("NADADOR1");
        piscina.add(nadado1);
        nadado1.setSelected(true);
        //nadado1.setBounds(x, cP, cP, cP);
        nadado1.setBounds(700,5,100,25);

        nadado2 = new JRadioButton("NADADOR2");
        piscina.add(nadado2);
        nadado2.setSelected(true);
        nadado2.setBounds(700, 25, 100, 25);

        nadado3 = new JRadioButton("NADADOR3");
        piscina.add(nadado3);
        nadado3.setSelected(true);
        nadado3.setBounds(700, 45, 100, 25);

        nadado4 = new JRadioButton("NADADOR4");
        piscina.add(nadado4);
        nadado4.setSelected(true);
        nadado4.setBounds(700, 65, 100, 25);

        nadado5 = new JRadioButton("NADADOR5");
        piscina.add(nadado5);
        nadado5.setSelected(true);
        nadado5.setBounds(700, 85, 100, 25);

        ButtonGroup group = new ButtonGroup();
        group.add(nadado1);
        group.add(nadado2);
        group.add(nadado3);
        group.add(nadado4);
        group.add(nadado5);
        
        
        
        
        
        
        
//        separador1=new JLabel();
//        piscina.add(separador1);
//        this.getContentPane().setBackground(Color.WHITE);
//        separador1.setBounds(150,0,0,0);
        
        
        

        //Hacemos los JLabel de cada nadador
        nadador1 = new JLabel();
        nadador1.setText("Nadador 1");
        piscina.add(nadador1); //Agrega la imagen al panel
        nadador1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
        nadador1.setBounds(100, alto - 150, 73, 100);
        nadador1.setVisible(false);

        nadador2 = new JLabel();
        nadador2.setText("Nadador 2");
        piscina.add(nadador2);
        nadador2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
        nadador2.setBounds(200, alto - 150, 73, 100);
        nadador2.setVisible(false);

        nadador3 = new JLabel();
        nadador3.setText("Nadador 3");
        piscina.add(nadador3);
        nadador3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
        nadador3.setBounds(300, alto - 150, 73, 100);
        nadador3.setVisible(false);

        nadador4 = new JLabel();
        nadador4.setText("Nadador 4");
        piscina.add(nadador4);
        nadador4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
        nadador4.setBounds(400, alto - 150, 73, 100);
        nadador4.setVisible(false);

        nadador5 = new JLabel();
        nadador5.setText("Nadador 5");
        piscina.add(nadador5);
        nadador5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/o.jpg")));
        nadador5.setBounds(500, alto - 150, 73, 100);
        nadador5.setVisible(false);

        txtNadadores = new JTextArea();
        //txtNadadores.setBounds(678, 450,200,200);
        JScrollPane scroll = new JScrollPane(txtNadadores);
        scroll.setBounds(650, 450, 200, 200);
        txtNadadores.setEditable(false);

        piscina.add(scroll);

        {
            //boton de inicio del juego
            ImageIcon start = new ImageIcon(getClass().getResource("/Imagenes/5.png"));//Colocamos la imagen en el boton
            Icon icono = new ImageIcon(start.getImage().getScaledInstance(100, 50, 1));
            bntInicio = new JButton(icono);
            getContentPane().add(bntInicio);
            bntInicio.setBounds(0, 0, 100, 50);

            bntInicio.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {

                    txtNadadores.setText(txtNadadores.getText() + "-------------------------------------\n");

                    if (nadado1.isSelected()) {
                        nadador1.setVisible(true);
                        Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1, txtNadadores);
                        hiloNadador1.start();

                    } else {
                        if (nadado2.isSelected()) {
                            nadador1.setVisible(true);
                            Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1, txtNadadores);
                            hiloNadador1.start();

                            nadador2.setVisible(true);
                            Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2, txtNadadores);
                            hiloNadador2.start();

                        } else {
                            if (nadado3.isSelected()) {
                                nadador1.setVisible(true);
                                Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1, txtNadadores);
                                hiloNadador1.start();

                                nadador2.setVisible(true);
                                Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2, txtNadadores);
                                hiloNadador2.start();

                                nadador3.setVisible(true);
                                Super_Metodo hiloNadador3 = new Super_Metodo(280, alto, nadador3, txtNadadores);
                                hiloNadador3.start();
                            } else {
                                if (nadado4.isSelected()) {
                                    nadador1.setVisible(true);
                                    Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1, txtNadadores);
                                    hiloNadador1.start();

                                    nadador2.setVisible(true);
                                    Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2, txtNadadores);
                                    hiloNadador2.start();

                                    nadador3.setVisible(true);
                                    Super_Metodo hiloNadador3 = new Super_Metodo(280, alto, nadador3, txtNadadores);
                                    hiloNadador3.start();

                                    nadador4.setVisible(true);
                                    Super_Metodo hiloNadador4 = new Super_Metodo(400, alto, nadador4, txtNadadores);
                                    hiloNadador4.start();
                                } else {
                                    if (nadado5.isSelected()) {
                                        //Aqui llamo los metodos de los hilos de cada nadador
                                        nadador1.setVisible(true);
                                        Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1, txtNadadores);
                                        hiloNadador1.start();//Arranca la ejecucion de cada hilo

                                        nadador2.setVisible(true);
                                        Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2, txtNadadores);
                                        hiloNadador2.start();

                                        nadador3.setVisible(true);
                                        Super_Metodo hiloNadador3 = new Super_Metodo(280, alto, nadador3, txtNadadores);
                                        hiloNadador3.start();

                                        nadador4.setVisible(true);
                                        Super_Metodo hiloNadador4 = new Super_Metodo(400, alto, nadador4, txtNadadores);
                                        hiloNadador4.start();

                                        nadador5.setVisible(true);
                                        Super_Metodo hiloNadador5 = new Super_Metodo(500, alto, nadador5, txtNadadores);
                                        hiloNadador5.start();
                                    }
                                }
                            }
                        }
                    }
                }
            });

            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setBounds(x, y, Ancho, alto);
            setVisible(true);
            setResizable(false);//no poder cambiar dimensiones
        }
    }
}


