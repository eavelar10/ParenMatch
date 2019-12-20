/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parenmatch;

// ********************************************************************
// ParenMatch.java
//
// Determines whether or not a string of characters contains
// matching left and right parentheses.
// ********************************************************************
import java.util.*;
import java.util.Scanner;

public class ParenMatch {

    public static void main(String[] args) {
        Stack<Character> s = new Stack<Character>();
        String line; // the string of characters to be checked
        Scanner scan = new Scanner(System.in);
        System.out.println("Parenthesis Matching");
        System.out.print("Enter a parenthesized expression:\t");
        line = scan.nextLine();
        boolean errorFound = false;

        String goodSoFar = "";
// loop to process the line one character at a time
        System.out.println("Mismatches and Matches:");
        for (int i = 0; i < line.length(); i++) {

            char c = line.charAt(i);
            goodSoFar += c;

            if (c == '(') {
                s.push(line.charAt(i));
            } else if (c == ')') {
                if (s.size() > 0) {
                    s.pop();
                } else {
                    System.out.println("Error: Close parenthesis w/o matching open parenthesis!");
                    System.out.println("Error encountered here: " + goodSoFar + "^");
                    errorFound = true;
                    break;
                }
            }
        }
        if (s.size() > 0) {
            System.out.println("Error! There are " + s.size() + " extra open parenthesis!");
        } else {
            if (!errorFound) {
                System.out.println("The number of open parnethesis matched the number of close parenthesis.");
            }
        }
    }
}
