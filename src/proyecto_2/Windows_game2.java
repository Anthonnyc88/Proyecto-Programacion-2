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

public class Windows_game2 extends JFrame implements ActionListener {

	public Windows_game2() {
		JToolBar barraHerramientas = new JToolBar();
//		txtColumnas = new JTextField();
//		txtFilas = new JTextField();
		btnCrear = new JButton();
		panel = new JPanel( null );
		//Para que el JFrame cierre la aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnCrear.setText("Juego");
		btnCrear.addActionListener(this);
		barraHerramientas.add(btnCrear);

		//Colocamos el JToolBar en la parte de arriba del JFrame
		this.add(barraHerramientas, BorderLayout.PAGE_START);

		//Se agrega el panel del label
        this.add(panel, BorderLayout.CENTER);

		this.setSize(410, 330);
		//Permite que la ventana se coloque al centro de la pantalla
		this.setLocationRelativeTo(null);

	}

	public void actionPerformed( ActionEvent evt ) {
        int filas = 8;
        int columnas = 5;

        //Se crea una matriz de labels segun las filas y columnas entrantes
        LabelMatriz [][] botones = new LabelMatriz[ filas ][ columnas ];
        //Se recorren las filas
        for( int fila = 0 ; fila < filas; fila++ )
        {
            //Estando en la fila se recorrer las columnas
            for( int columna = 0 ; columna < columnas; columna++ )
            {
                //Se crea el boton y se agrega a las celda de la matriz
                botones[fila][columna] = new LabelMatriz( 75 * columna, 30 * fila, 75, 30 );
                
                //Se da el nombre en forma de coordenada enviando la fila y columna
                botones[fila][columna].setNombre(fila, columna);
                
                //Se agrega el boton al panel
                panel.add( botones[fila][columna] );
            }
        }
        
        //Se actualiza el panel para que se vean los botones
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