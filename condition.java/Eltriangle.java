import java.io.DataInputStream;
class Eltriangle
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream (System.in);
            int a,b,c,d;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            c=Integer.parseInt(data.readLine());
            d=(a+b+c);
            if (d==180)
            {
                System.out.println("a perfect Triangle");
            }
            else{
                System.out.println("no a triangle");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}