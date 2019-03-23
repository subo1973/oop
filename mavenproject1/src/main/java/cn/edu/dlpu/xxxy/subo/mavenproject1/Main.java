/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.dlpu.xxxy.subo.mavenproject1;

import java.util.Scanner;

public class Main {

    public static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt + ":");
        String input = scanner.next();
        return input;
    }

    public static void main(String[] args) {
        String accountID = input("AccountID");
        String password = input("Password");
        if (("SS".equals(accountID)) && ("123456".equals(password))) {
            System.out.println("Login Success");
            System.out.println(accountID + "账户余额: " + 10086 + "$");
        } else {
            System.out.println("Login Failed");
        }
    }
}
