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
public class User {
    String userID;
    String password;
    Account account;

    public void setAccount(Account account) {
        this.account = account;
    }

    public User(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    void scanCode(int amount) {
        this.account.withdraw(amount);
    }
    
}
