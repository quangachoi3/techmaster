import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bai5();
    }
    public static void bai1()
    {
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int[] arr ;
        arr = new int[max];
        for(int i = 0; i < max; i++)
        {
            System.out.println("Nhap phan tu thu: " + i);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < max; i++)
        {
            System.out.print(arr[i] + " ");

        }
        for(int i = 0; i < max; i++)
        {
            if(arr[i] % 2 == 0)
            {
                arr[i] = arr[i] + 1;
            }

        }
        for(int i = 0; i < max; i++)
        {
                System.out.print(arr[i] + " ");

        }
    }

    public static void bai2()
    {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int length = numbers.length;
        double result = 0;
        for(int i = 0; i < length; i++)
        {
            result = result + numbers[i];
        }
        result = result/length;
        System.out.println(result);
    }

    public static void bai3()
    {
        int[] my_array = new int[]{25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int my_array_length = my_array.length;
        int[] result = new int[my_array_length +1];
        for(int i = 0; i < 3; i++)
        {
            result[i] = my_array[i];
        }
        result[3] = 5;
        for(int i = 4; i < result.length; i++)
        {
            result[i] = my_array[i-1];
        }
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }

    public static void bai4()
    {
        String[] array1 = new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
        for(int i = 0; i < array1.length; i++)
        {
            for(int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]) == true)
                {
                    System.out.println(array1[i]);
                }
            }
        }
    }

    public static void bai5()
    {
        int[] array_nums = new int[]{5, 7, 2, 4, 9};
        int length = array_nums.length;
        int tmp = 0;
        double result = 0;
        for(int i = 0; i < length; i++)
        {
            for(int j = i+1; j < length; j++)
            {
                if(array_nums[i] > array_nums[j])
                {
                    tmp = array_nums[i];
                    array_nums[i] = array_nums[j];
                    array_nums[j] = tmp;
                }
            }
        }
        for(int i = 1; i < length-1; i++)
        {
            result += array_nums[i];
        }
        result = result/(length-2);
        System.out.println(result);
    }
}