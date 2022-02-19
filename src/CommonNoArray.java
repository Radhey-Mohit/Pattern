public class CommonNoArray
{
    public static void main(String[] args)
    {
        int [] a = {34,54,32,3,66,76,86,43,45,41,22};
        int [] b = { 54,65,75,33,34,68,67,65,86,43,67,22};
        for (int i=0; i<a.length; i++)
        {
            for (int j=0 ;j<b.length; j++)
            {
                if (a[i]== b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
