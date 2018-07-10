/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional1;
import java.util.*;

/**
 *
 * @author ONIKAN YOUTH CENTRE3
 */
public class Conditional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner (System.in);
                System.out.println("what is your name");
              String  amoo=  inp.nextLine();
      // String x = "Hello";
       
       switch(amoo){
       case "amoohotel":
       System.out.println("you are welcome" + amoo);
       break ;
       case "amoo":
       System.out.println("you are welcome" + amoo);
       break ;
       case "faruq":
               System.out.println("you are welcome" + amoo);
               break;
       default :
           System.out.println("try other operator" + amoo);
       
    }
    
}
}