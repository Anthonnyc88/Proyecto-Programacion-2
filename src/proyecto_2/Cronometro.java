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
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import static proyecto_2.Cronometro.saber;
 
public class Cronometro extends JFrame implements Runnable, ActionListener 
{ 
    JLabel tiempo;
    public static String h0, m0, s0;

    
    public Cronometro() {
        
        setTitle("Cronómetro Reloj");
        setSize( 260, 104);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout( new BorderLayout() );

        //Etiqueta donde se colocara el tiempo
        tiempo = new JLabel( h0+":"+m0+":"+s0 );
        tiempo.setFont( new Font( Font.SERIF, Font.BOLD, 50 ) );
        tiempo.setHorizontalAlignment( JLabel.CENTER );
        tiempo.setForeground( Color.BLUE );
        tiempo.setBackground( Color.WHITE );
        tiempo.setOpaque( true );
        add( tiempo, BorderLayout.NORTH );
        
        setVisible( true );
        
        Integer horas, minutos, segundos;
        horas = Integer.parseInt(h0);
        minutos = Integer.parseInt(m0);
        segundos = Integer.parseInt(s0);

        String hor=h0, min=m0, seg;
        
        long t1, t2;
        String st1, st2;
        Calendar ahora1 = Calendar.getInstance();
        t1 = ahora1.getTimeInMillis();
        st1 = Long.toString(t1);

        try {
            
            //Mientras cronometroActivo sea verdadero entonces seguira
            //aumentando el tiempo

            while( true ) {

                //La siguiente linea es para hacer un wait ayuda
                //para la precisión del siguiente proceso.- demorar un segundo
                Thread.sleep( 500 );
                
                //Esto es lo que provoca la demorada del segundo exacto
                Calendar ahora2 = Calendar.getInstance();
                t2 = ahora2.getTimeInMillis();
                st2 = Long.toString(t2);
                if (st2.charAt(st2.length()-4)!=st1.charAt(st1.length()-4)) { 
                    segundos += 1;
                    Calendar ahora3 = Calendar.getInstance();
                    t1 = ahora3.getTimeInMillis();
                    st1 = Long.toString(t1);
                }    
                //fin de lo que provoca la demorada del segundo exacto
                
                if ( segundos == 60 ) {
                    segundos=0;
                    minutos += 1;
                }    
                if( minutos == 60 ) {
                    minutos = 0;
                    horas++;
                }        
                
                //Los siguientes if's es para colocar el cero
                //a los numeros menores a 9
                if( horas < 10 ) hor = "0" + horas;
                else hor = horas.toString();
               
                if( minutos < 10 ) min = "0" + minutos;
                else min = minutos.toString();

                if( segundos < 10 ) seg = "0" + segundos;
                else seg = segundos.toString();

                tiempo.setText( hor + ":" + min + ":" + seg );
            }
        }catch(Exception e){}
    }
    
    public static void saber(){
    String array[]=null;
     h0="00";
        m0="00";
        s0="00";
        
        //Lo siguiente agarrar en ejecución MS-DOS
        //parámetros definidos separados por espacios
        if (array.length > 0) {
            h0 = array[0];
            m0 = array[1];
            s0 = array[2];
        }
        new Cronometro();
    }
    //procedure principal
    public static void main(String[] args) 
    {
       
        //
         new Cronometro();
        //Run Cronometro_Reloj()      
    }
    //

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}//Fin
