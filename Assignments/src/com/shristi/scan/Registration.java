package com.shristi.scan;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = { "user1", "user2", "user3" };
        System.out.print("Enter name to register: ");
        String nameToRegister = scanner.next();
        boolean isUnique = true;
        for (String username : usernames) {
            if (username.equals(nameToRegister)) {
                isUnique = false;
                break;
            }
        }
        if (isUnique) {
            System.out.println("You are registered");
        } else {
            System.out.println("Name is not unique");
        }
    }
}