import java.io.DataInputStream;
class Four
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
            if(a>b)
            {
                if(a>c)
                {
                    if(a>d)
                    {
                        System.out.println("a is bigger");
                    }
                    else{
                        System.out.println("d is bigger");
                    }
                }
                else
                {
                    if(c>d)
                    {
                        System.out.println("c is greater");
                    }
                    else{
                        System.out.println("d is greater");
                    }
                }
            }
            else
            {
                if(b>c)
                {
                    if(b>d)
                    {
                        System.out.println("b is greater");
                    }
                    else
                    {
                        System.out.println("c is greater");
                    }
                }
                else
                {
                    if(c>d)
                    {
                        System.out.println("c is bigger ");
                    }
                    else{
                        System.out.println("d is bigger");
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