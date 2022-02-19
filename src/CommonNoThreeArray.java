public class CommonNoThreeArray
{
    public static void main(String[] args)
    {
        int [] a= {34,54,65,76,87,98,21,90,56,23,12,33};
        int [] b = { 45,34,63,58,35,75,21,62,85,90,87,65};
        int [] c = { 33,45,65,92,41,28,88,21,44,90,34};
        for (int i=0; i<a.length; i++)
        {
            for (int j=0 ;j<b.length; j++)
            {
              if (a[i]==b[j])
              {
                  for (int k = 0; k < c.length; k++)
                  {
                      if (a[i]==c[k])
                      {
                          System.out.println(a[i]);
                      }

                  }
              }
            }
        }
    }
}
