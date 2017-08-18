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
import static com.sun.java.accessibility.util.AWTEventMonitor.addActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LabelMatriz extends JLabel implements ActionListener {
    
    //-------- Constructor con parametros para posicionar a los LABELS ------//
    public LabelMatriz( int pos_x, int pos_y, int ancho, int alto ){ 
        //Se coloca el label en un lugar y se le da un tamanio
        setBounds(pos_x, pos_y, ancho, alto);
        
        //Se agrega el action listener en este caso la misma clase
        addActionListener( this );
    }
    //------------------------------------------------------------------------//
    
    //---------------------- Se asigna una el nombre al label ---------------//
    public void setNombre( int f, int c ){
        setText( f + " , " + c);
    }
    //------------------------------------------------------------------------//
    
    //------------------ Al darle click realizara este metodo ----------------//
    public void actionPerformed( ActionEvent e ){
        //Se asigna el color de fondo azul
        setBackground(Color.BLUE);
        //Se asigna un color de letra color blanco
        setForeground(Color.WHITE);
    }
    //------------------------------------------------------------------------//
}