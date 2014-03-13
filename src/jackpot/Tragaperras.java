/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class Tragaperras {
    public static double saldo;
    public static double deposito = 1000;
    public static int[] objetosAleatorios;
    public static double premio;
    
    Tragaperras(){ 
    }
    
    public static void apostar(){
        Random lanzamiento = new Random();
        for (int i = 0; i < 3; i++) {
           objetosAleatorios[i]= lanzamiento.nextInt(5);
        }
    }
    
    public double getPremio() {
        return premio;
    }
    
    public static double getSaldo() {       
        return saldo;
    }
    
}
