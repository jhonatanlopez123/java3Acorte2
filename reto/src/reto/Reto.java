/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Reto {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 0;
        Scanner l = new Scanner(System.in);
       System.out.println("digite la cantidad de numeros: ");
       int a = l.nextInt();
       int b[] = new int [a];
       for (int i = 1;i<=a;i++){
            System.out.println("digite un numero: ");
            x = l.nextInt();
//            System.out.println(i);
            b[i-1] = x;
            if (i>=3){
                int v = b[i-2] + b[i-3];
                if (v == b[i-1]){
                    System.out.println("-----------");
                    System.out.println("ERROR");
                    System.out.println("-----------");
                    i--;
                }
            }
       }
    }   
}
