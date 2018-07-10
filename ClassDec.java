/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classdec;

/**
 *
 * @author ONIKAN YOUTH CENTRE3
 */class Car{
     int Wheels = 4 ;
     String color = "blue";
     //Behaviour or methods
public void Moving (){
System.out.println("my car is moving");} 
public void Break (){
System.out.println("the break has failed");}}
public class ClassDec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car Toyota = new Car ();
        Toyota.color = "red";
        Toyota.Wheels= 5 ;
      Car Camry = new Car ();
       // System.out.println(Toyota.color);
        
        Toyota.Moving();
        Toyota.Break();
        System.out.println(Toyota.color   + " " +   Toyota.Wheels);
        
        Camry.Moving();
        Camry.Break();
        System.out.println(Camry.Wheels   + " " + Camry.color  );
    }
    
}