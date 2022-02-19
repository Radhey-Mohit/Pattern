import java.util.Scanner;

public class InsertNoArray
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] a= {34,54,65,76,56,78,90};

        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" \n Which No of Position you want to insert the No. ->  ");
        int x =s.nextInt();

        for (int i=a.length-1; i>=x-1; i--)
        {
              a[i]= a[i-1];
        }
        System.out.println(" Which NO. you want to insert -> ");
        int y= s.nextInt();
        a[x-1]=y;
        for (int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
