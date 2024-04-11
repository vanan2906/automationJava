package Baitapjava;

import java.util.Scanner;

public class javaBT {

    public static void bai1() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhập vào số n= ");
        n = sc.nextInt();
        if (n == 0) {
            System.out.println(n + " là số chẵn");
        } else if (n % 2 == 0) {
            System.out.println(n + " là số chẵn");
        }{
            System.out.println(n + " là số lẻ");
        }


    }
    public static void bai2() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập vào số a= ");
        a = sc.nextInt();
        System.out.println("Nhập vèo số b= ");
        b = sc.nextInt();

        if (a >= b) {
            System.out.println("a lớn hơn hoặc bằng b ");
        }else {
            System.out.println("a nhỏ hơn b");


        }
    }

    public static void bai3() {
        Scanner sc = new Scanner(System.in);
        String student1;
        String student2;
        System.out.println("Nhập tên học sinh 1");
        student1 = sc.nextLine();
        System.out.println("Nhập vào học sinh 2 ");
        student2 = sc.nextLine();

        if ((student1.toLowerCase()).trim().equals(student2.toLowerCase().trim())) {
            System.out.println("Học sinh 1 và học sinh 2 tên giống nhau");
        } else {
            System.out.println("2 học sinh có tên khác nhau");
            System.out.println("2 học sinh có tên khác nhau");



        }
    }

    public static void bai4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số x = ");
        int x = sc.nextInt();
        System.out.println("Nhập vèo số y = ");
        int y = sc.nextInt();
        System.out.println("Nhập vàoa số z = ");
        int z = sc.nextInt();
        // 3 số bằng nhau, 3 số bằng 0, 2 số bằng  nhau lớn hơn

        if (x == y && y == z) {
            System.out.println("3 số bằng nhau ");
        } else if (x > y && x > z) {
            System.out.println(x + " là số lớn nhất");


        } else if (y > x && y > z) {
            System.out.println(y + " là số lớn nhất");


        } else if (z > x && z > y) {
            System.out.println(z + " là số lớn nhất");
        } else if (x == y && x > z) {
            System.out.println(x + " là số lớn nhất");
        } else {
            System.out.println("hehe");
        }
    }
    public static void bai5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số 1");
        int number1  = sc.nextInt();
        System.out.println("Nhập vào số 2 ");
        int number2 = sc.nextInt();

        if (number1 >=10 && number2 <=100) {
            System.out.println("Nằm trong khoảng 10-100");
        }else {
            System.out.println("Không nằm trong khoảng  10-100");


        }
    }
    public static void bai6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm của học sinh");
        float diemA  = sc.nextFloat();

        if (diemA >=8.5 && diemA <=10) {
            System.out.println("Hoc sinh đạt điểm A");
        } else if (diemA>=7.5 && diemA<8.5) {
            System.out.println("Hoc sinh đạt điểm B");
        } else if (diemA>5 && diemA<7.5) {
            System.out.println("Hoc sinh đạt điểm C");
        }
        else if (diemA>0 && diemA<=5) {
            System.out.println("Hoc sinh đạt điểm D");
        } else {
            System.out.println("Điểm phải từ 0-10");


        }
    }
    public static void bai7() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào bất kì 1 tháng trong năm");
        int thang  = sc.nextInt();

        if (thang==1 || thang == 3 || thang ==5 || thang ==7 || thang ==8 || thang == 11 || thang == 12) {
            System.out.println(thang + " là tháng có 31 ngày");
        } else if (thang == 4 || thang ==6 || thang == 9 || thang == 10) {
            System.out.println(thang + " là tháng có 30 ngày");
        } else if (thang ==2) {
            System.out.println(thang +" là tháng có 28 ngày");
        }
        else {
            System.out.println("Tháng phải từ 1-12");


        }
    }
    public static void main(String[] args) {

        bai7();
    }

}
