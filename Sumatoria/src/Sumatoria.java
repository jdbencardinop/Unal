/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Sumatoria {
    
    public static void main (String[] args){
            //a ver si sirve :V
            java.util.Scanner lectura = new java.util.Scanner(System.in);
            int a [];
            a = new int [5];
            
            for (int i = 0; i < 5; i++) {
                System.out.println("Ingrese el dato numero "+(i+1)+":");
                a[i] = lectura.nextInt();
            }
            
            System.out.println("Su suma es: "+(suma(a)));           
            
        }
        static int suma (int[] a){
            
            int sum = 0;
            
            for (int i = 0; i < a.length; i++) {
                sum += a[i];                
            }
            
            return sum;
        }
    
}
