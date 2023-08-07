package com.oops.abs;

public class AbsMain {
	public static void main(String[] args) {
		Bank bank = new Branch1();
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		
		
		Branch1 branch1=(Branch1) bank;
		branch1.staffDetails();
		
		bank = new SubBranch();
		bank.admin();
		bank.carLoan();
		bank.eduLoan();
		bank.housingLoan();
		
		SubBranch subBranch = (SubBranch) bank;
		subBranch.subPay();
		subBranch.loanType();		
		
		Branch2 branch2 = (Branch2) bank;
		branch2.loanType();
	}
}
