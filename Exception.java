/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author ONIKAN YOUTH CENTRE3
 */
public class Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
        int [] x = new int [3];
        x [0]= 2;
        x [1]= 4;
        x [2]= 6;
        System.out.println(x[3]);
    }catch (IndexOutOfBoundsException e){
        System.out.println("Exception thrown" + e);
    }
      try{
          int num = 50/0 ;
          
         } catch (ArithmeticException e){
          System.out.println(e);         
          } } } 
