import java.io.DataInputStream;
class Tnum
{
    public static void main(String args[])
    {
        try {
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            c=Integer.parseInt(data.readLine());
            if(a>b)
            {
                if(a>c)
                {
                    System.out.println("a is bigger");
                }
                else
                {
                    System.out.println("c is bigger");
                }
            }
            else
            {
                if(b>c)
                {
                    System.out.println("b is bigger");
                }
                else{
                    System.out.println("c is bigger");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}