import java.io.DataInputStream;
class Ltemp
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int tmp;
            System.out.println("enter the temperature readings");
            tmp=Integer.parseInt(data.readLine());
            if(tmp<=0)
            {
                System.out.println("the temperature is FREEZING");
            }
            else if(tmp<=10)
            {
                System.out.println("the temperature is very COLD");
            }
            else if(tmp<=20)
            {
                System.out.println("the temperature is  COLD");
            }
            else if(tmp<=30)
            {
                System.out.println("the temperature is normal");
            }
            else if(tmp<=40)
            {
                System.out.println("the temperature is HOT");
            }
            else
            {
                System.out.println("the temperature is VERY HOT");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}