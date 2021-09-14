/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Thew
 */
package com.ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input_val = new Scanner(System.in);
        String noun, verb, adj, adv;
        System.out.print("Enter a noun: ");
        noun = input_val.nextLine();
        System.out.print("Enter a verb: ");
        verb = input_val.nextLine();
        System.out.print("Enter an adjective: ");
        adj = input_val.nextLine();
        System.out.print("Enter an adverb: ");
        adv = input_val.nextLine();
        System.out.printf("Do you %s your %s %s %s? That's hilarious!",verb,adj,noun,adv);
    }
}
