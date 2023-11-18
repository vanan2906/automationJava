package Baitapjava;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n:");
        int n = sc.nextInt();
        if (n==0){
            System.out.println("Số 0 không là số âm cũng không là số dương");
        }else if (n>0) {
            System.out.println("Đây là số nguyên dương");

        } else {
            System.out.println("Đây là số nguyên âm");
        }
    }
}