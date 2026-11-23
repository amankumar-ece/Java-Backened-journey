package com.kodewala.oops.task;

public class Driver {

    public static void main(String[] args) {

        FundTransfer account =
            new FundTransfer("Aman", 1234567890L, 5000.0);

        System.out.println(
            "Account Holder: " + account.getAccountHolderName());

        System.out.println(
            "Account Number: " + account.getAccountNumber());

        System.out.println(
            "Current Balance: " + account.getBalance());

        account.transferFund(1500.0);

        System.out.println(
            "Remaining Balance: " + account.getBalance());
    }
}
