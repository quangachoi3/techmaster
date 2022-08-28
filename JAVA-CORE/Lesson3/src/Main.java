import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String chuoi = "Pham Hong Quan";
//        Scanner sc = new Scanner(System.in);
//        int index = 0;
//        System.out.println(chuoi);
//
//        System.out.println("Nhap chi muc");
//        index = sc.nextInt();
//
//        System.out.println("Ky tu " + index + " la:" + chuoi.charAt(index));

        bai2();
    }

    public static void bai2() {
        String str = "techmaster";
        String result = "";
        int length = str.length();
        result += str.charAt(0);
        for (int i = 1; i < length; i++) {
            if (false == isExist(str.charAt(i), result))
            {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
    public static boolean isExist(char ch, String str) {
        int length = str.length();
        boolean flag = false;
        for (int i = 1; i < length; i++) {
            if(str.charAt(i) == ch)
            {
                flag = true;
                break;
            }
            else {
                flag = false;
            }
        }
        return flag;
    }
}


