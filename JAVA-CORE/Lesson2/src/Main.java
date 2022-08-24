import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float fDegree = degreeConvert(100);
        System.out.println(fDegree);
        double d = (double)9 / 5;
        System.out.println(d);

        System.out.println(sumNumber(999));
        bai11();

    }

    public static float degreeConvert(float cDegree)
    {
        float result = 0;
        result = (float) (cDegree - 37.5);
        return result;
    }

    public static int[] separateNumber(int input, int div)
    {
        int[] result = {0,0};
        result[0] = input % div;
        result[1] = input / div;
        return result;
    }
    public static int sumNumber(int input)
    {
        int result =0;
        int[] tmp = {0,0};
        tmp = separateNumber(input,10);
        result = result + tmp[0];
        tmp = separateNumber(tmp[1],10);
        result = result + tmp[0];
        tmp = separateNumber(tmp[1],10);
        result = result + tmp[0];
        return result;
    }
    public static void  bai7()
    {
        Scanner input = new Scanner(System.in);
    }

    public static void  bai11()
    {
        Scanner input = new Scanner(System.in);
        int hour = 0;
        int day = 0;
        int year =0;
        // Nhap vao so gio
        System.out.println("Nhap so gio input: ");
        hour = input.nextInt();
        day = hour/24;
        year = day/365;

        System.out.print("day: ");
        System.out.println(day);
        System.out.print("year: ");
        System.out.println(year);
    }
}

