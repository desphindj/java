import java.io.DataInputStream;
class Nfour
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c,d;
            a=Integer.parseInt(data.readLine());
            b=Integer.parseInt(data.readLine());
            c=Integer.parseInt(data.readLine());
            d=Integer.parseInt(data.readLine());
            if(a<b)
            {
                if(a<c)
                {
                    if(a<d)
                    {
                        System.out.println("a is smaller number");
                    }
                    else{
                        System.out.println("d is smaller number");
                    }
                }
                else
                {
                    if(c<d)
                    {
                        System.out.println("c is smaller");
                    }
                    else{
                        System.out.println("d is smaller");
                    }
                }
            }
            else
            {
                if(b<c)
                {
                    if(b<d)
                    {
                        System.out.println("b is smaller");
                    }
                    else
                    {
                        System.out.println("c is smaller");
                    }
                }
                else
                {
                    if(c<d)
                    {
                        System.out.println("c is smaller ");
                    }
                    else{
                        System.out.println("d is smaller");
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}