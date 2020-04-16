/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retos_random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class Retos_random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random N = new Random();
        Scanner l = new Scanner(System.in);
        Scanner keyboard = new Scanner(System.in);
        int x = 0, i = 0, num = 0, acumP = 0, contI = 0, acumI = 0, limit = 0,aux=0, contP=0;
        
        //Quantity of numbers to generate
        System.out.println("Please, type a random limit number to generate the list: ");
        limit = keyboard.nextInt();
        System.out.println("challenge 1 ");
        System.out.println("challenge 2 ");
        System.out.println("challenge 3 ");
        System.out.println("challenge 4 ");
        num = l.nextInt();
        switch(num){
            
            case 1:
                for(aux=1;aux<=limit;aux++){   
                    x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                    //System.out.println(x);
                    if(aux % 2 != 0 && x % 2== 0){
                        contP = contP + 1; //Counter
                        acumP = acumP + x; //Accumulator
                        System.out.println(x + "es PAR");
                    }else if(aux % 2 == 0 && x % 2 != 0){
                        contI = contI + 1; //Counter
                        acumI = acumI + x; //Accumulator
                        System.out.println(x + "es IMPAR");
                    }else{
                    aux--;
                }
                }
            System.out.println("Total de pares generados: " + contP);
            System.out.println("Suma de pares generados: " + acumP);
            System.out.println("Total de impares generados: " + contI);
            System.out.println("Suma de impares generados: " + acumI);
            break;
            
            case 2:
              for(aux=1;aux<=limit;aux++){   
                x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                //System.out.println(x);
                if(aux % 2 == 0 && x % 2 != 0){
                    contP = contP + 1; //Counter
                    acumP = acumP + x; //Accumulator
                    System.out.println(x + "es PAR");
                }else if(aux % 2 != 0 && x % 2 == 0){
                    contI = contI + 1; //Counter
                    acumI = acumI + x; //Accumulator
                    System.out.println(x + "es IMPAR");
                }else{
                aux--;
            }
            }
            System.out.println("Total de pares generados: " + contP);
            System.out.println("Suma de pares generados: " + acumP);
            System.out.println("Total de impares generados: " + contI);
            System.out.println("Suma de impares generados: " + acumI);
            break;
           
            case 3:
               for(aux=1;aux<=limit;aux++){   
                x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                //System.out.println(x);
                if( x % 2 == 0){
                    contP = contP + 1; //Counter
                    acumP = acumP + x; //Accumulator
                    System.out.println(x + "es PAR");
                }else{
                    aux--;
            }
               }
               System.out.println("Total de pares generados: " + contP);
                System.out.println("Suma de pares generados: " + acumP);
                System.out.println("Total de impares generados: " + contI);
                System.out.println("Suma de impares generados: " + acumI);
                
            break;
            
            case 4:
            for(aux=1;aux<=limit;aux++){   
                x = (int)(N.nextDouble()* 10 + 1); //Limits: * UpperLimit + LowerLimit
                //System.out.println(x);
                if( x % 2 != 0){
                    contP = contP + 1; //Counter
                    acumP = acumP + x; //Accumulator
                    System.out.println(x + "es IMPAR");
                }else{
                    aux--;
                }
                }
            System.out.println("Total de pares generados: " + contP);
            System.out.println("Suma de pares generados: " + acumP);
            System.out.println("Total de impares generados: " + contI);
            System.out.println("Suma de impares generados: " + acumI);
            break;
            
            default:
               System.out.print("opcion incorrecta");   

        
            }
          }
    
        }
     