package Baitapjava;

import java.util.Scanner;

public class Baitap1 {
    public static void Bai1() {
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

    public static void Bai2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên n:");
        int n = sc.nextInt();
        switch (n){
            case 1:
                System.out.println("Một");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bốn");
                break;
            case 5:
                System.out.println("Năm");
                break;
            case 6:
                System.out.println("Sáu");
                break;
            case 7:
                System.out.println("Bảy");
                break;
            case 8:
                System.out.println("Tám");
                break;
        }
    }
    public static void Bai3() {
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
    public static void Bai4() {
        float a, b, c, tongcanh1, tongcanh2, tongcanh3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        a = sc.nextFloat();
        System.out.println("Nhập vào cạnh b:");
        b = sc.nextFloat();
        System.out.println("Nhập vào cạnh c:");
        c = sc.nextFloat();
        tongcanh1 = a + b;
        tongcanh2 = a + c;
        tongcanh3 = b + c;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Nhập sai dữ liệu, kết thúc chương trình");
        } else if ((tongcanh1 > c || tongcanh2 > b || tongcanh3 > a) && (a*a+b*b)==c*c || (b*b+c*c)==a*a || (a*a+c*c)==b*b) {
            System.out.println("Đây là 3 cạnh của 1 tam giác vuông");
        } else {
            System.out.println("Đây không phải 3 cạnh của tam giác vuông");
        }
    }
    public static void Bai5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số sinh viên: ");
        String s = scanner.nextLine();

        boolean valid = true;
        if (s.length() != 8) {
            valid = false;
        } else {
            for(int i = 0; i < s.length(); i++)
            {
                String c = String.valueOf(s.charAt(i));
                if (i == 0 && !c.equals("B")) {
                    valid = false;
                    break;
                } else if (i > 0) {
                    try {
                        Integer number = Integer.parseInt(c);
                        // Neu xxxxxxx =0 -< Faile -> kết thúc vòng lặp nhảy về cuối
                        if (number == 0){
                            valid = false;
                            break;
                        }
                        // Nếu 7 số sau là ố hợp lệ thì nhảy vào vòng in ra ngay, còn nếu  khac so sẽ exception duqwfng vòng lặp và nhay đến else
                        // cuối cùng luôn
                    } catch(Exception e) {
                        valid = false;
                        break;
                    }
                }
            }
        }
        if (valid) {
            System.out.println("Đây là mã sinh hợp lệ ___________ "+s);
        } else {
            System.out.println("Đây KHONG phải mã sinh viên, Vui lòng nhập mã sinh viên hợp lệ");
        }
    }
    public static void Bai6() {

        }






    public static void main(String[] args) {

        }
    }
