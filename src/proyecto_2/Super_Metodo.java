/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2;


import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author Anthonny
 */
public class Super_Metodo extends Thread {

    int posicionX, limite;
    JLabel nadador1;
    JTextArea txtNadadores;

    public Super_Metodo(int posicionX, int limite, JLabel nadador1, JTextArea txtNadadores) {
        this.posicionX = posicionX;
        this.limite = limite;
        this.nadador1 = nadador1;
        this.txtNadadores = txtNadadores;
    }

    @Override

 //Swim algorithm, works with yarn that causes swimmers to move with a random speed
    public void run() {
        Random rnd = new Random();
        int numero;
        for (int i = limite - 150; i > 0; i--) {
            numero = 0 + rnd.nextInt(15);
            nadador1.setBounds(posicionX, i, 73, 100); //Position the label with its size and width

            try {
                sleep(numero);//Speed ​​of the thread with the swimmer receiving the varibale random

            } catch (Exception e) {
            }
        }
        

        txtNadadores.setText(txtNadadores.getText() + "Llegó el " + nadador1.getText() + "\n");

        yield();
        nadador1.setVisible(false);
    }
}




