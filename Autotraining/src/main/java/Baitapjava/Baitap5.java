package Baitapjava;

import java.util.Scanner;

public class Baitap5 {
//    public static void main(String[] args) {
//        String Masinhvien;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào MSSV:");
//
//        Masinhvien = sc.nextLine();
//// Phải là số khác 0
//        if (Masinhvien.matches("^B[1-9]{7}$"))
//            System.out.println("Mã sinh viên hợp lệ");
//        else
//            System.out.println("Mã sinh viên không hợp lệ");
//
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập mã số sinh viên: ");
    String studentID = scanner.nextLine();

    // Kiểm tra độ dài chuỗi là 8 và bắt đầu bằng "B"
    if (studentID.length() == 8 && studentID.charAt(0) == 'B') {
        boolean isValid = true;
        for (int i = 1; i < studentID.length(); i++) {
            // Kiểm tra từng ký tự từ vị trí thứ 1 đến cuối chuỗi
            char c = studentID.charAt(i);
            if (c < '1' || c > '9') {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            System.out.println("Mã số sinh viên hợp lệ.");
        } else {
            System.out.println("Mã số sinh viên không hợp lệ.");
        }
    } else {
        System.out.println("Mã số sinh viên phải bao gồm 8 chữ sô .");
    }
}

}
