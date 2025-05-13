import java.io.DataInputStream;
class Cuboid
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
        int l,b,h,a;
        l=Integer.parseInt(data.readLine());
        b=Integer.parseInt(data.readLine());
        h=Integer.parseInt(data.readLine());
        a=2*(l*b+b*h+h*l);
        System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}