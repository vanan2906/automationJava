package Baitapjava;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Demo {
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


                        // Nếu 7 số sau là ố hợp lệ thì nhảy vào vòng in ra ngay, còn nếu  khac so sẽ exception duqwfng vòng lặp và nhay đến else
                        // cuối cùng luôn
                    } catch(Exception e) {
                        if (c.equals("0")){
                            valid = false;
                            break;
                        }
                    }
                }
            }
        }
        if (valid) {
            System.out.println("Đây là mã sinh hợp lệ");
        } else {
            System.out.println("Đây không phải mã sinh viên");
        }
    }
}

