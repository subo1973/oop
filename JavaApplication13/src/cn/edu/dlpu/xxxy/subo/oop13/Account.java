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
public class Account {

    String accountID;
    int balance;

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public Account(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }

}
