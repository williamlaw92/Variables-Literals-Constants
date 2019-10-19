/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variablesliteralsconstants.variables;

/**
 *
 * @author williamlaw
 */

import java.util.Scanner;

public class Variables {
    public static void main (String [] args){
        
        //variables
        String name;
        String age;
        String weight;
        double moonWeight;
        double marsWeight;
        double jupiterWeight;

        //scanner
        Scanner v = new Scanner(System.in);
        
        System.out.println("Hello, what is your name?");
            name = v.nextLine();
        System.out.println("How old are you?");
            age = v.nextLine();
        System.out.println("How much do you weigh?");
            weight = v.nextLine();
        
        //converting string weight to int
            float z = Integer.parseInt(weight);
        
        System.out.println("Please wait, calculating..."); 
        System.out.println("All done, here are the results:");
        
        //calculation   
        moonWeight = z * 0.16f;
        marsWeight = z * 0.37f;
        jupiterWeight = z * 2.364f;
                
        System.out.printf("Earth: \t\t %.2f \n", z);
        System.out.printf("The Moon: \t %.2f \n", moonWeight);
        System.out.printf("Mars: \t\t %.2f \n", marsWeight);
        System.out.printf("Jupiter: \t %.2f \n", jupiterWeight);
        
        System.out.println("Phew that was a work out. PLease come back again.");
    }
}
