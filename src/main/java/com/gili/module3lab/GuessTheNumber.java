/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.module3lab;

/**
 *
 * @author Window
 */
import java.security.SecureRandom;
import java.util.Scanner;
public class GuessTheNumber {
    
    public static void main(String[] args) {
        
    
        SecureRandom random = new SecureRandom();
        Scanner input = new Scanner(System.in);
        int randomNum = random.nextInt(1001);


        System.out.println("Enter guess:");
        int userIn = input.nextInt();
        while(userIn != randomNum){
            if(userIn > randomNum){
                System.out.println("Too high");
            }
            else if(userIn < randomNum){
                System.out.println("Too low");
            }
        userIn = input.nextInt();   
        }
        System.out.println("You guessed the correct number!");
    }
    
}
