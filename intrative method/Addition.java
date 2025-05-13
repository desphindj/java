import java.io.DataInputStream;
class Addition 
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            System.out.println("enter the a value");
            a=Integer.parseInt(data.readLine());
            System.out.println("enter the b value");
            b=Integer.parseInt(data.readLine());
            c=a+b;
            System.out.println("Addition of two numbers=>"+c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    } 
}