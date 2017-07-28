/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;

/**
 *
 * @author Anthonny
 */
public class Windows_game1 extends JFrame {
    JLabel nadador1 , auto2, auto3 , nadador4, nadador5, piscina;
    JButton bntInicio;
    int x=50 , y=0 , Ancho=1000 , alto=700;
    public Windows_game1(){
        super("Competencia de natacion");
        
        //Permiter poner nuestros componentes donde queranos
        getContentPane().setLayout(null);
        
        
        
        piscina= new JLabel();
        getContentPane().add(piscina);
       // piscina.setIcon(new ImageIcon(getClass().getResource("/Imagenes/3.jpg")));
        //Cambia el color del panel
      this.getContentPane().setBackground(Color.BLUE);
        piscina.setBounds(100,0,1000,700);
        
        
        
        //Hacemos los JLabel de cada nadador
        nadador1 = new JLabel();
        //getContentPane().add(auto1); //Agregue al frame
        piscina.add(nadador1); //Agrega la imagen al panel
        nadador1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/1.png")));
        nadador1.setBounds(30,alto-150,73,100);
        
        
        auto2 = new JLabel();
        //getContentPane().add(auto2);
        piscina.add(auto2);
        auto2.setIcon(new ImageIcon(getClass().getResource("/Imagenes/2.gif")));
        auto2.setBounds(150,alto-150,73,100);
        
        auto3 = new JLabel();
        piscina.add(auto3);
        auto3.setIcon(new ImageIcon(getClass().getResource("/Imagenes/1.png")));
        auto3.setBounds(280,alto-150,73,100);
        
        nadador4= new JLabel();
        piscina.add(nadador4);
        nadador4.setIcon(new ImageIcon(getClass().getResource("/Imagenes/4.png")));
        nadador4.setBounds(400,alto-150,73,100);
        
        nadador5= new JLabel();
        piscina.add(nadador5);
        nadador5.setIcon(new ImageIcon(getClass().getResource("/Imagenes/5.png")));
        nadador5.setBounds(500,alto-150,73,100);
        
        
        //boton de arranque
        //Colocamos la imagen en el boton
        ImageIcon start = new ImageIcon(getClass().getResource("/Imagenes/5.png"));
        Icon icono = new ImageIcon(start.getImage().getScaledInstance(100, 50, 1));
        bntInicio = new JButton(icono);
        getContentPane().add(bntInicio);
        bntInicio.setBounds(0,0,100,50);
        bntInicio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Inicio");
                //Aqui llamo los metodos de los hilos de cada nadador
                Super_Metodo hiloNadador = new   Super_Metodo(30,alto,nadador1);
                  Super_Metodo hiloNadador2 = new   Super_Metodo(150,alto,auto2);
                  Super_Metodo hiloNadador3 = new   Super_Metodo(280,alto,auto3);
                  Super_Metodo hiloNadador4= new   Super_Metodo(400,alto,nadador4);
                  Super_Metodo hiloNadador5= new   Super_Metodo(500,alto,nadador5);

               
              //Arranca la ejecucion del hilo
                hiloNadador.start();
                hiloNadador2.start();
                hiloNadador3.start();
                hiloNadador4.start();
                hiloNadador5.start();
            }
        });
        
        
//        //ramdnom rando= ew ramdom
//        int number
//                for(int n=0, n<limite,n++){
//                    number=0+rando.nextInt(10);
//                }
//        //
        //

                
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(x, y , Ancho,alto);
        setVisible(true);
        setResizable(false);//no poder cambiar dimensiones
        
}
        
        
        
    }
    


    

