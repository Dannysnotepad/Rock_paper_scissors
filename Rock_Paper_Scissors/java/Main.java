package com.dannysnotepad.rock_paper_scissors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  
        
        Scanner reader = new Scanner(System.in);
        
        //Creating and declaring needed variables
        int loses = 0, wins = 0, draws = 0, userChoice = 0;
        String game[] = {"Rock🗿","Paper📃", "Scissors✂️"};
        
        System.out.println("Rock🗿, Paper📃, Scissors ✂️");
        System.out.println("Enter 0 for rock, 1 for paper, 2 for scissors");
        
        while(userChoice != 3){
            
            int computerChoice = (int)(Math.random()*3);
            String computerFinalChoice = game[computerChoice];
            System.out.print("Enter: ");
            userChoice = reader.nextInt();
            
            if(userChoice > 2){
                break;
            }
            
            String userFinalChoice = game[userChoice];
            System.out.println(userFinalChoice);
            System.out.println(computerFinalChoice);
            
            if (userChoice == computerChoice){
                draws++;
                System.out.println("Draw");
            }else if(userChoice == 0 && computerChoice == 1){
                loses++;
                System.out.println("Paper covers rock \nYou lose");
            }else if(userChoice == 1 && computerChoice == 0){
                wins++;
                System.out.println("Paper covers rock \nYou win");
            }else if(userChoice == 2 && computerChoice == 0){
                loses++;
                System.out.println("Rock breaks scissors \nYou lose");
            }else if(userChoice == 0 && computerChoice == 2){
                wins++;
                System.out.println("Rock breaks scissors \nYou win");
            }else if(userChoice == 1 && computerChoice == 2){
                loses++;
                System.out.println("Scissors cuts paper \nYou lose");
            }else if(userChoice == 2 && computerChoice == 1){
                wins++;
                System.out.println("Scissors cuts paper \nYou win");
            }
            System.out.println("If you want to quit enter any number greater than 2");
            System.out.println("");
        } 
        
        System.out.println(wins + " wins");
        System.out.println(loses + " loses");
        System.out.println(draws + " draws");
                
    }
}