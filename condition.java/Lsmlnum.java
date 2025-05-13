import java.io.DataInputStream;
class Lsmlnum
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            c=Integer.parseInt(data.readLine());
            if( a<b && a<c)
            {
                System.out.println("a is smaller number");
            }
            else if (b<a && b<c)
            {
                System.out.println("b is  smaller");
            }
            else{
                System.out.println("c is smaller");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}