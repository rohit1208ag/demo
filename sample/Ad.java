import java.io.*;
class Ad
{
    public static void main(String args[])
    {
        int count,i=0,n,sum=0;
        count=args.length;
        System.out.println("No of arguments="+count);
        while(i<count)
        {
            n=Integer.parseInt(args[i]);
            sum=sum+n;
            i=i+1;
            
        }
        System.out.println("Sum="+sum);
  }
}