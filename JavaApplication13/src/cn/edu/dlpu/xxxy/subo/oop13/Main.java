/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.dlpu.xxxy.subo.oop13;

/**
 *
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) {
        Account account1 = new Account("6200", 100);
        User user1 = new User("user1", "p123");
        user1.setAccount(account1);
        user1.scanCode(20);
        System.out.println(account1.balance);
        Account account2 = new Account("6201", 1000);
        user1.scanCode(50);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
        user1.setAccount(account2);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
        user1.scanCode(70);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
        Account account3 = new CCBAccount("6202", 8000);
        user1.setAccount(account3);
        user1.scanCode(10);
        System.out.println(account1.balance);
        System.out.println(account2.balance);
        System.out.println(account3.balance);
//        user1.setAccount(null);
//        user1.scanCode(10);
    }
}
