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
import javax.swing.JOptionPane;
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

    JLabel nadador1, nadador2, nadador3, nadador4, nadador5, piscina, linea1, linea2 ,separador, separador1 , separador2,separador3,separador4 , separador5;
    JRadioButton botones[];
    JTextArea txtNadadores;
    JRadioButton nadado1, nadado2, nadado3, nadado4, nadado5;
    int contador = 0;

    JButton bntInicio, btnReport1, btnReport2, btnReport3, btnReport4, btnReport5,bntReport;
    int x = 50, y = 0, Ancho = 1000, alto = 700;

    public Windows_game1() {
        super("Swimming competition");

        //Allow to put our components wherever you want
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
        
        
        ///Here we put the line that divides swimmers///
        
        separador=new JLabel();
        piscina.add(separador);
        separador.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador.setBounds(10,7,10,645);
        
        separador1=new JLabel();
        piscina.add(separador1);
        separador1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador1.setBounds(130,7,10,645);
        
        separador2=new JLabel();
        piscina.add(separador2);
        separador2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador2.setBounds(250,7,10,645);
        
        separador3=new JLabel();
        piscina.add(separador3);
        separador3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador3.setBounds(373,7,10,645);
        
        separador4=new JLabel();
        piscina.add(separador4);
        separador4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador4.setBounds(475,7,10,645);
          
        separador5=new JLabel();
        piscina.add(separador5);
        separador5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/linea.png")));
        separador5.setBounds(600,7,10,645);
       


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
        //We make every swimmer's JLabel
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
            //Start button game
            ImageIcon start = new ImageIcon(getClass().getResource("/Imagenes/5.png"));//We put the image on the button
            Icon icono = new ImageIcon(start.getImage().getScaledInstance(100, 50, 1));
            bntInicio = new JButton(icono);
            getContentPane().add(bntInicio);
            bntInicio.setBounds(0, 0, 100, 50);

            bntInicio.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent ae) {
                    
                    txtNadadores.setText(txtNadadores.getText() + "-------------------------------------\n");
                    contador += 1;
                    
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
                                        //Here I call the methods of the threads of each swimmer
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
            
            btnReport1 = new JButton("Report 1");
            getContentPane().add(btnReport1);
            btnReport1.setBounds(800, 200, 100, 25);
            btnReport1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Integer[] listaGanadores = {0,0,0,0,0,0};
                    String nadadores = txtNadadores.getText().replaceAll("Llegó el Nadador ", "").replaceAll("\n", "");
                    String[] listaNadadores = nadadores.replaceAll("\n", "").split("-------------------------------------");
                    
                    for(int i = 1; i<listaNadadores.length;i++){
                        int num = Integer.parseInt(listaNadadores[i].substring(0,1));
                        listaGanadores[num] += 1;
                    }                 
                    
                    String texto = "El nadador 1 ha ganado: " + listaGanadores[1] + "\n" +
                                   "El nadador 2 ha ganado: " + listaGanadores[2] + "\n" +
                                   "El nadador 3 ha ganado: " + listaGanadores[3] + "\n" +
                                   "El nadador 4 ha ganado: " + listaGanadores[4] + "\n" +
                                   "El nadador 5 ha ganado: " + listaGanadores[5] + "\n";
                    
                    JOptionPane.showMessageDialog(null, texto);
                    
                }
            });
            
            btnReport2 = new JButton("Report 2");
            getContentPane().add(btnReport2);
            btnReport2.setBounds(800, 230, 100, 25);
            btnReport2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Cantidad de carreras efectuadas: " + contador);
                }
            });
            
            btnReport3 = new JButton("Report 3");
            getContentPane().add(btnReport3);
            btnReport3.setBounds(800, 260, 100, 25);
            btnReport3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Integer[] listaGanadores = {0, 0, 0, 0, 0, 0};
                    String nadadores = txtNadadores.getText().replaceAll("Llegó el Nadador ", "").replaceAll("\n", "");
                    String[] listaNadadores = nadadores.replaceAll("\n", "").split("-------------------------------------");

                    for (int i = 1; i < listaNadadores.length; i++) {
                        int num = Integer.parseInt(listaNadadores[i].substring(0, 1));
                        listaGanadores[num] += 1;
                    }
                    
                    int max,i, nadador=0;
                    
                    max = listaGanadores[1];

                    for (i = 1; i < listaGanadores.length; i++) {
                        if (max < listaGanadores[i]) {
                            max = listaGanadores[i];
                            nadador = i;
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null, "El nadador con más competencias ganadas es: " + nadador);

                }
            });
            
            btnReport4 = new JButton("Report 4");
            getContentPane().add(btnReport4);
            btnReport4.setBounds(800, 290, 100, 25);
            btnReport4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Integer[] listaGanadores = {0, 0, 0, 0, 0, 0};
                    String nadadores = txtNadadores.getText().replaceAll("Llegó el Nadador ", "").replaceAll("\n", "");
                    String[] listaNadadores = nadadores.replaceAll("\n", "").split("-------------------------------------");

                    for (int i = 1; i < listaNadadores.length; i++) {
                        int num = Integer.parseInt(listaNadadores[i].substring(0, 1));
                        listaGanadores[num] += 1;
                    }
                    int min, nadador=0, i;

                    min = listaGanadores[1];

                    for (i = 1; i < listaGanadores.length; i++) {
                        if (min > listaGanadores[i]) {
                            min = listaGanadores[i];
                            nadador = i;
                        }
                    }
                    JOptionPane.showMessageDialog(null, "El nadador con menos competencias ganadas es: " + nadador);
                }
            });
            btnReport5 = new JButton("Report 5");
            getContentPane().add(btnReport5);
            btnReport5.setBounds(800, 320, 100, 25);

            bntReport= new JButton("Clean");
            getContentPane().add(bntReport);
            bntReport.setBounds(800,350,100,25);
            bntReport.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    txtNadadores.setText("");
                    
                }
                });
            }
                    
                    
    
           
            
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setBounds(x, y, Ancho, alto);
            setVisible(true);
            setResizable(false);//no poder cambiar dimensiones
        }
    }


