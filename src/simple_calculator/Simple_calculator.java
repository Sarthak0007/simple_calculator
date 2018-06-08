/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple_calculator;

import java.util.Scanner;


public class Simple_calculator {

    
    public static void main(String[] args) {
        
         int a,b;
        int result;
        double result1 =0;
        
        Scanner scn =new Scanner (System.in);
        
        System.out.println("Enter First Number:");
        a =scn.nextInt();
        System.out.println("Enter Second Number:");
        b =scn.nextInt();
        
        
        System.out.print("\n1: Addition.\n2: Subtraction.");
         System.out.print("\n3: Multiplication.\n4: Divide.");
         System.out.print("\n5: Remainder.\n6: Exit.");
         
        System.out.println("\nEnter Your Operation");
        result =scn.nextInt();
        
        switch(result)
        {
            case 1: 
                result1 = (a+b);
                break;
                
                case 2: 
                result1 = (a-b);
                break;
                    case 3: 
                result1 = (a*b);
                break;
                        case 4: 
                result1 = (a/b);
                break;
                      case 5: 
                result1 = (a%b);
                break;
                      default:
                          System.out.println("An Invalid operation!!");
                
        }
      
        System.out.println("Answer:" + result1);
    }
    
}
