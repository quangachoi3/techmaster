public class Main {
    public static void main(String[] args) {
        printLetter(2);
    }

    public static void bai1()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void bai2()
    {
        int count = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                count++;
                System.out.print(count);
            }
            System.out.println("");
        }
    }

    public static void bai3()
    {
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                System.out.print(i+1);
            }
            System.out.println("");
        }
    }

    public static void bai4()
    {
        int count = 0;
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < i+1; j++)
            {
                count++;
                System.out.print(count);
            }
            System.out.println("");
        }
    }

    public static void bai5()
    {
        int line = 13;
        for (int i = 0; i < 7; i++)
        {
            for (int j = 1; j <= line; j++)
            {
                if( (j >= (7-i)) && (j <= (7+i)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 7; i++)
        {
            for (int j = 1; j <= line; j++)
            {
                if( (j > i+1) && (j < (13-i)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void bai7()
    {
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 6- i; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void bai8()
    {
        int count = 0;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 5-i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++)
            {
                System.out.print("@");
            }
            count++;
            System.out.println("");
        }
    }

    public static void bai9a()
    {
        int n = 13;
        for (int i = 0; i < (n+1)/2; i++)
        {
            printNumber(i+1, n-i);
            System.out.println("");
        }
        for (int i = (n-1)/2; i > 0; i--)
        {
            printNumber(i, n-i+1);
            System.out.println("");
        }
    }
    public static void printNumber(int n, int vitri)
    {
        for(int i = 0; i < vitri; i++)
        {
            System.out.print(" ");
        }
        for(int i = n; i > 0; i--)
        {
            System.out.print(i);
        }
        for(int i = 2; i <= n; i++)
        {
            System.out.print(i);
        }
    }
    public static void printLetter(int n)
    {
//        for(int i = 0; i < vitri; i++)
//        {
//            System.out.print(" ");
//        }
        for(int i = 0; i < n; i++)
        {
            System.out.print((char)(65 + i));
        }
//        for(int i = 2; i <= n; i++)
//        {
//            System.out.print(i);
//        }
    }
}
