package com.org.xochitl.java17;

public class Records {
    public static void main(String[] args) {
        Account account = new Account("Xochitl", "root", true);
        Account account1 = new Account("Rocio", "root");

        System.out.println(account.identifier());
        account.hasPrivileges();
        System.out.println(account1.identifier());
        account1.hasPrivileges();

    }
}
