package Baitapjava;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        String Masinhvien;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào MSSV:");

        Masinhvien = sc.nextLine();
// Phải là số khác 0
        if (Masinhvien.matches("^B[1-9]{7}$"))
            System.out.println("Mã sinh viên hợp lệ");
        else
            System.out.println("Mã sinh viên không hợp lệ");

    }
}
