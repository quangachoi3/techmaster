public class Main {
    public static void main(String[] args) {
        bai7();
    }

    public static void bai1()
    {
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
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

    public static void bai6()
    {
        int count = 0;
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < count; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 6- count; j++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println("");
        }
    }

    public static void bai7()
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
                System.out.print("*");
            }
            count++;
            System.out.println("");
        }
    }
}
