/*
Ejercicio 8: Pedir un numero N, y mostrar todos los numeros
del 1 al N.
*/
package Ciclos08;

import javax.swing.JOptionPane;


public class Ejercicio08 {
    public static void main(String[] args) {
         System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int i = 1;
        while(i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }
        
    }
    
}
