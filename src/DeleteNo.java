import java.util.Scanner;

public class DeleteNo
{
    public static void main(String[] args) {
        int a[] = {23, 34, 45, 56, 67, 78, 90};
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println(" \n  Which no you want to delete->  ");
        int b = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (b == a[i])
            {
                for (int j = i; j < a.length - 1; j++)
                {
                    a[j] = a[j + 1];
                }

            }


        }
        for (int i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + "  ");
        }

    }
}

