/*
Ejercicio 3: Leer numeros hasta que se introduzca un cero 
Para cada uno indicar si es par o impar 
<primero lo mharemos con la clase Sccannef
Luego con la clase JOption Pane
*/
package Ciclos03;

import javax.swing.JOptionPane;


public class Ejercicio03 {
    public static void main(String[] args) {
          int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero % 2 == 0 ){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es Par");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es Impar");
            }
             numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        JOptionPane.showConfirmDialog(null, "El numero ingresado es "+numero+" finaliza el programa");
    }
}
