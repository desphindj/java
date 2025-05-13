import java.io.DataInputStream;
class Tsnum
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int a,b,c;
            System.out.println("enter the value of a");
            a=Integer.parseInt(data.readLine());
            System.out.println("enter the value of b");
            b=Integer.parseInt(data.readLine());
            System.out.println("enter the value of c");
            c=Integer.parseInt(data.readLine());

            if(a<b)
            {
                if(a<c)
                {
                    System.out.println("a is smaller");
                }
                else{
                     System.out.println("  is smaller");
                }
            }
            else{
                if(b<c)
                {
                     System.out.println("b is smaller");
                }
                else{
                     System.out.println("c is smaller");
                }
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
