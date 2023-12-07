package org.lessons.java.wishlist;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        HashSet<String> wishlist = new HashSet<>();

        boolean stop = false;
        while (!stop){
            System.out.println("Insert a new gift in the wishlist? y/n");
            String choice = scan.nextLine();
            switch (choice){
                case "y":
                    System.out.println("Name the wanted gift");
                    String gift = scan.nextLine();
                    boolean added = wishlist.add(gift);
                    if (!added){
                        System.out.println("Gift already in the list");
                    }
                    break;
                case "n":
                    stop = true;
                    break;
                default:
                    System.out.println("Invalid request");
                    break;
            }
        }
        System.out.println(wishlist);


        scan.close();
    }
}
