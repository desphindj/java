 import java.io.DataInputStream;
class Lfunction
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            String  opr;
            System.out.println("enter the value of a");
            a=Integer.parseInt(data.readLine());
            System.out.println("enter the value of a");
            b=Integer.parseInt(data.readLine());
            System.out.println(" select 1 + addition or 2 subtract or 3 multi or 4 division or 5 modulus");
            opr=(data.readLine());
            char ch=opr.charAt(0);

            if(ch== 1 || ch=='+')
            {
                c=a+b;
                System.out.println(c);
            }
            else if(ch==2 || ch== '-' )
            {
                c=a-b;
                System.out.println(c);
            }
            else if(ch==3 || ch== '*')
            {
                c=a*b;
                System.out.println(c);
            }
            else if(ch==4 || ch== '/')
            {
                c=a/b;
                System.out.println(c);
            }
            else 
            {
                c=a%b;
                System.out.println(c);
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}