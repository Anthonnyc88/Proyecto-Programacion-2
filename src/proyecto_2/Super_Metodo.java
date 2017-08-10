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
    JLabel nadador1;
    
    public Super_Metodo(int posicionX, int limite , JLabel nadador1){
        this.posicionX = posicionX;
        this.limite = limite;
        this.nadador1 = nadador1;
    }
    //sobre escribiendo el metodo
    @Override
    
    //Algoritmo de los nadadores , funciona con hilo que hace que los nadadores se muevan con una velocidad Random
    public void run(){
         Random rnd= new Random();
        int numero;
        for(int i=limite-150; i>0; i--){
            numero =0+ rnd.nextInt(15);
            System.out.println(getName()+":"+i);
            nadador1.setBounds(posicionX, i, 73, 100); //posicionr el label con su tamaño y ancho
            
            try{
                sleep(numero);
                //velocidad del hilo con el nadador que recibe la varibale random
               
            }catch(Exception e){
                           }
        }
        
            
        
        //no se ejecute los hilos al mismo tiempo
         System.out.println("Gano" + getName());
        yield();
    }
    }


    

