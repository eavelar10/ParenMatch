/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenmatch;

import java.util.Scanner;

/**
 *
 * @author eravelar
 */
public class we {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = scan.nextInt();
        displayNumber(n);
    }
   

    public static void displayNumber(int n) {
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
            if (i % 7 == 0) {
                System.out.println("\n");
            }
        }
    }
}

