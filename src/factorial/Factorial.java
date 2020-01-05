/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Number ");
        int x = a.nextInt();
        System.out.println("factorial "+x+"value "+fact(x)); 
        
    }

    public static int fact(int x) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
    if(x==0){
        return 1;
    }else{
        return x * fact(x-1);
    }
    
    }
    
}
