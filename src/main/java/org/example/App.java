/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print( "What is the quote? " );
        String quote;
        quote = in.nextLine();

        System.out.print( "Who said it? ");
        String author;
        author = in.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");

        in.close();
    }
}
