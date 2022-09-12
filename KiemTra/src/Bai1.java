import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        bai1();
    }

    public static boolean bai1()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so bat ky");
        int num = scan.nextInt();
        System.out.println(num);
        if(num%2 == 0)
            return true;
        else
            return false;
    }
}
