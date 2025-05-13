import java.io.DataInputStream;
class Triangle
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c,d;
            System.out.println("entr a");
            a=Integer.parseInt(data.readLine());
            System.out.println("entr b");
            b=Integer.parseInt(data.readLine());
            System.out.println("entr c");
            c=Integer.parseInt(data.readLine());
            d=a+b+c;
            
            if(d==180)
            {
                System.out.println("triangle formed");
            }
            if(d!=180)
            {
                System.out.println("triangle is not formed");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}