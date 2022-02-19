public class SameNo
{
    public static void main(String[] args)
    {
        int [] a= {34,23,34,54,65,76,65,4,36,4,76,23,54,76};
        for (int i=0 ; i<a.length; i++)
        {
            for (int j=i+1; j<a.length-1; j++)
            {
                if (a[i]==a[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
