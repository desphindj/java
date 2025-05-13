import java.io.DataInputStream;
class Maths
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int math,a,b,c,d;
             System.out.println("enter a");
            a=Integer.parseInt(data.readLine());
            System.out.println("enter b");
            b=Integer.parseInt(data.readLine());
            System.out.println("enter 1 add  ..2; sub>> 3 multi>> 4mod");
            math=Integer.parseInt(data.readLine());

            switch(math)
            {
                case 1:
                    c=a+b;
                    System.out.println(c);
                    break;
                case 2:
                    c=a-b;
                    System.out.println(c);
                    break;
                case 3:
                    c=a*b;
                    System.out.println(c);
                    break;
                case 4:
                    c=a%b;
                     System.out.println(c);
                     break;
            }
        }
        catch(Exception e)
        {
             System.out.println(e);
        }
    }
}