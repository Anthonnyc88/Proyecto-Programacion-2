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
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Anthonny
 */
public class Windows_game1 extends JFrame {

    JLabel nadador1, nadador2, nadador3, nadador4, nadador5, piscina, linea1, linea2;
    JRadioButton botones[];

    JButton bntInicio, bntRegresar;
    int x = 50, y = 0, Ancho = 1000, alto = 700;

    public Windows_game1() {
        super("Competencia de natacion");

        //Permiter poner nuestros componentes donde queranos
        getContentPane().setLayout(null);
int cP;
        SpinnerNumberModel model = new SpinnerNumberModel(
                
        );
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
        JRadioButton nadado1 = new JRadioButton("NADADOR1");
        nadado1.setMnemonic('b');
        piscina.add(nadado1);
        nadado1.setActionCommand("NADADOR1");
        nadado1.setSelected(true);
        nadado1.setBounds(0,5 , 100, 25);

        JRadioButton nadado2 = new JRadioButton("NADADOR2");
        nadado2.setMnemonic('b');
        piscina.add(nadado2);
        nadado2.setActionCommand("NADADOR2");
        nadado2.setSelected(true);
        nadado2.setBounds(0, 25, 100, 25);

        JRadioButton nadado3 = new JRadioButton("NADADOR3");
        nadado3.setMnemonic('b');
        piscina.add(nadado3);
        nadado3.setActionCommand("NADADOR3");
        nadado3.setSelected(true);
        nadado3.setBounds(0, 45, 100, 25);

        JRadioButton nadado4 = new JRadioButton("NADADOR4");
        nadado4.setMnemonic('b');
        piscina.add(nadado4);
        nadado4.setActionCommand("NADADOR4");
        nadado4.setSelected(true);
        nadado4.setBounds(0, 65, 100, 25);

        JRadioButton nadado5 = new JRadioButton("NADADOR5");
        nadado5.setMnemonic('b');
        piscina.add(nadado5);
        nadado5.setActionCommand("NADADOR5");
        nadado5.setSelected(true);
        nadado5.setBounds(0, 85, 100, 25);
        
        if(nadado1.isSelected()==true){
          
            
            
        }
        

        ButtonGroup group = new ButtonGroup();
        group.add(nadado1);
        group.add(nadado2);
        group.add(nadado3);
        group.add(nadado4);
        group.add(nadado5);

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
                    System.out.println("Inicio");
                    //Aqui llamo los metodos de los hilos de cada nadador
                    //new Cronometro();
                    JRadioButton nadado1 = new JRadioButton("NADADOR1");
                    
                    Super_Metodo hiloNadador1 = new Super_Metodo(30, alto, nadador1);
                    Super_Metodo hiloNadador2 = new Super_Metodo(150, alto, nadador2);
                    Super_Metodo hiloNadador3 = new Super_Metodo(280, alto, nadador3);
                    Super_Metodo hiloNadador4 = new Super_Metodo(400, alto, nadador4);
                    Super_Metodo hiloNadador5 = new Super_Metodo(500, alto, nadador5);

                     //Arranca la ejecucion de cada hilo
                    Cronometro t = new Cronometro();
                    hiloNadador1.start();
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
}
    //


