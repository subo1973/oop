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
public class CCBAccount extends Account {

    int fee = 5;

    public CCBAccount(String accountID, int balance) {
        super(accountID, balance);
    }

//    public void transfer(Account to, int amount) {
//        this.withdraw(amount);
//        this.withdraw(fee);
//        to.deposit(amount);
//    }

    public void withdraw(int amount) {
        super.withdraw(fee);
        super.withdraw(amount);
    }
}
