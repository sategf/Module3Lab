/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gili.module3lab;

/**
 *
 * @author Gili
 */
import java.util.Scanner;
public class SeperatingDigits {
    public static int getQuotient(int n, int d){
        return n/d;
    }
    public static int getRemainder(int n, int d){
        return n%d;
    }
    public static void displayDigits(int num){
        int reversedNum = 0;
        while (num > 0) {//Get the last digit and put it in the front
            int lastDigit = getRemainder(num,10);
            reversedNum = (reversedNum * 10) + lastDigit;
            num = getQuotient(num,10);
        }
        while (reversedNum > 0){
            System.out.print(getRemainder(reversedNum,10) + " ");
            reversedNum = getQuotient(reversedNum , 10);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an int:");
        int n = input.nextInt();
        displayDigits(n);
        
    }
}



