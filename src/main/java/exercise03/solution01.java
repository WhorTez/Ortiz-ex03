/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Duane_Ortiz
 */
package exercise03;
import java.util.Scanner;
public class solution01 {
public static void main(String[] args){
    System.out.println("Enter a quote: ");
    Scanner input_quote = new Scanner(System.in);
    String quote = input_quote.nextLine();

    System.out.println("Who are you quoting?: ");
    Scanner input_author = new Scanner(System.in);
    String author = input_author.nextLine();

    System.out.println(author + " said, " + quote);
}
}
