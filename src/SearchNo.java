import java.util.Scanner;

public class SearchNo
{
    public static void main(String[] args)
    {
        int a[]={10,15,20,25,22},y=0;
        Scanner s = new Scanner(System.in);
        System.out.println(" the number is given below ->");
        for (int i=0; i<5; i++)
        {
            System.out.print(" "+a[i]);
        }

        System.out.println("\n  Enter that no which you want to search in Array ->");
        int x= s.nextInt();
        for (int i=1; i<5; i++)
        {
            if (x==a[i])
            {
                y++;
            }
        }
        if (y!=0)
        {
            System.out.println(" No is matched.");
        }
        else
        {
            System.out.println(" No is not matched.");
        }
    }

}
