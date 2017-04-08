/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jukebox;

import java.util.Scanner;


/**
 *
 * @author Jason
 */
public class JukeBox {

    private static double currentBalance = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static double insertMoney (double moneyInserted)
    {
        currentBalance += moneyInserted;
        return currentBalance;
    }
            
    public static void main(String[] args) {
     
        //Display main menu.
        System.out.println("1) Insert Money");
        System.out.println("2) Search");
        System.out.println("3) Play Random");
        System.out.println("Enter a choice (1 - 3):");
        int input = scanner.nextInt();
        
        switch (input)
        {
            case 1: System.out.println("Please enter the amount of money to insert: ");
                    double moneyInserted = scanner.nextDouble();
                    insertMoney(moneyInserted);
                    break;
            
            case 2: //search();
                    break;
                    
            case 3: //playRandom();
                    break;
            
        }
    }
    
}
