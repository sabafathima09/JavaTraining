package com.userapp.client;
	        
import java.util.Scanner;

import com.userapp.exception.NameExistsException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImp1;

public class Register {

	public static void main(String[] args) throws NameExistsException{
		Scanner scanner = new Scanner(System.in);
		IValidationService validationService = new ValidationServiceImp1();
		 System.out.print("Enter your username: ");
	        String enteredUsername = scanner.next();

	        System.out.print("Enter your Password: ");
	        String enteredPassword = scanner.next();
	        
		try {
			if(validationService.validateUsername("saba"))
				if(validationService.validatePassword("fathima")) {
					System.out.println("Registered");
				}
		}catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("try with different username");
			scanner.close();
		}
		}
		    
}
	        

	        
	        
	        
	        
	        
	        
	        
	        
	        
