import java.io.*;
class Add79
{
    public static void main(String args[])throws IOException
    {
         int a,b,c;
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter any 2 numbers");
         a=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
         c=a+b;
         System.out.println("Sum="+c);
    }
}