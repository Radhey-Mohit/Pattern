import java.util.Scanner;

public class RunTimeArray
{


    public static void main(String[] args)
    {
        System.out.println("Enter the array size");
        Scanner sc= new Scanner(System.in);
        int arr_size=sc.nextInt();
        int a[]= new int [arr_size];
        for(int i = 0;i<arr_size;i++)
        {
            System.out.println(" Enter the  "+(i+1)+"  of no is ->");
             a [i] = sc.nextInt();
        }
        System.out.print("\n\nArray is -> ");
        for (int i=0 ; i< a.length; i++)
        {
            System.out.print(a[i]+" ");
            
        }
   }
}
