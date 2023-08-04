package com.shristi.scan;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = { "user1", "user2", "user3" };
        System.out.print("Enter username to login: ");
        String usernameToLogin = scanner.next();
        boolean isValid = false;
        for (String username : usernames) {
            if (username.equals(usernameToLogin)) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            System.out.println("You are logged in successfully");
        } else {
            System.out.println("Invalid username");
        }
    }
}