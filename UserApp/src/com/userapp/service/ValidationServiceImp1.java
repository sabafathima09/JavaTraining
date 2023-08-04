package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImp1 implements IValidationService{
	String[] userNames = new String[] {"saba","noor","harman"};

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		// TODO Auto-generated method stub
		for(String uname:userNames)
				if(username.equals(uname))
					throw new NameExistsException("name already exists");
		return true;
	}

	@Override
	public boolean validatePassword(String Password) throws TooLongException, TooShortException {
		// TODO Auto-generated method stub
		if(Password.length()<6)
			throw new TooShortException();
		if(Password.length()>15)
			throw new TooLongException();	
		else return false;
	}
}
