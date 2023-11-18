package Baitapjava;

import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        float a,b,c,tongcanh1,tongcanh2,tongcanh3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        a=sc.nextFloat();
        System.out.println("Nhập vào cạnh b:");
        b= sc.nextFloat();
        System.out.println("Nhập vào cạnh c:");
        c=sc.nextFloat();
        tongcanh1=a+b;
        tongcanh2=a+c;
        tongcanh3=b+c;
        if (a<=0 || b<=0 || c<=0) {
            System.out.println("Nhập sai dữ liệu, kết thúc chương trình");
        } else if(tongcanh1>c ||tongcanh2 >b || tongcanh3 >a){
            System.out.println("Đây là 3 cạnh của 1 tam giác thường");

        }else {
            System.out.println("Đây không phải 3 cạnh của 1 tam giác thường");
        }
    }
}
