package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) {
     Account acc = new Account(200);
  //    payment.balance =2000;
     acc.doCredit(200);
  //   System.out.println(payment.balance);
     
     System.out.println(acc.getBalance());
	}

}
