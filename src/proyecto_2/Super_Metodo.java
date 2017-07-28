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

/**
 *
 * @author Anthonny
 */
public class Super_Metodo extends Thread {
    
      int posicionX , limite;
    JLabel nadador;
    
    public Super_Metodo(int posicionX, int limite , JLabel nadador){
        this.posicionX = posicionX;
        this.limite = limite;
        this.nadador = nadador;
    }
    //sobre escribiendo el metodo
    @Override
    public void run(){
         Random rnd= new Random();
        int numero;
        for(int i=limite-150; i>0; i--){
           
            numero =0+ rnd.nextInt(10);
            //posicionr el label donde querenos
            System.out.println(getName()+":"+i);
            nadador.setBounds(posicionX, i, 73, 100);
            try{
                //velocidad del hilo con el nadador
                sleep(numero);
               
            }catch(Exception e){
                
            }
            
        }
        //no se ejecute los hilos al mismo tiempo
         System.out.println("Final de competencia"+getName());
        yield();
    }
    }


    

