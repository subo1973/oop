/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.dlpu.xxxy.subo.java07;

/**
 *
 * @author Administrator
 */
public class ArrayDemo {

    public static void main(String[] args) {
        int[] pm2_5s = {20, 34, 567, 56, 66}; //{beijing, shanghai, tianjin , hangzhou, dalian}
        pm2_5s = new int[16]; //{最新值， 前1小时， 前2小时， 前3小时,......, 前15小时}}
        for (int i = 0; i < pm2_5s.length; i++) {
            pm2_5s[i] = i * i;
        }
        for (int i = 0; i < pm2_5s.length; i++) {
            System.out.println("numbers[" + i + "]=" + pm2_5s[i]);
        }
        int[] orderAmounts = new int[3]; //{张三订货数， 李四订货数， 王五订货数}
        orderAmounts = new int[2]; // {馅饼数量， 包子数量}
        // begin
        int[][] goodOrderAmounts = new int[2][3];//{张三订货{馅饼数量，包子数量, 米条数量}，李四订货{馅饼数量，包子数量, 面条数量}}
        goodOrderAmounts[0][0] = 1;
        goodOrderAmounts[0][1] = 2;
        goodOrderAmounts[0][2] = 1;
        goodOrderAmounts[1][0] = 2;
        goodOrderAmounts[1][1] = 1;
        goodOrderAmounts[1][2] = 5;
        int[] goodPrices = new int[3]; //{馅饼单价，包子单价, 面条单价} 单价：元
        goodPrices[0] = 1;
        goodPrices[1] = 2;
        goodPrices[2] = 5;
        int[] totals = new int[2]; // {张三的总价， 李四总价}
        for (int i = 0; i < totals.length; i++) {
            totals[i] = 0;
        }
        for (int k = 0; k < goodOrderAmounts.length; k++) { // k代表了第k个人
            for (int i = 0; i < goodPrices.length; i++) { //i代表第i个商品
                int price = goodPrices[i] * goodOrderAmounts[k][i];
                System.out.println("jiage = " + price);
                totals[k] += price;
            }
        }
        for (int i = 0; i < totals.length; i++) {
            System.out.println("totals[" + i + "]=" + totals[i]);
        }
        //end
    }
}
