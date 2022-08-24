import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String chuoi = "Pham Hong Quan";
        Scanner sc = new Scanner(System.in);
        int index = 0;
        System.out.println(chuoi);

        System.out.println("Nhap chi muc");
        index= sc.nextInt();

        System.out.println("Ky tu " + index + " la:" + chuoi.charAt(index));


    }
}