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
}

