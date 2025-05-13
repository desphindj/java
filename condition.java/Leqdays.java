import java.io.DataInputStream;
class Leqdays
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int day;
            System.out.println("enter 1(sun) ,2(mon),3(tue),4(wed,5(thur),6(fri),7(sat)");
            day=Integer.parseInt(data.readLine());
            if(day==1)
            {
                System.out.println("Sunday");
            }
            else if(day==2)
            {
                System.out.println("monday");
            }
            else if(day==3)
            {
                System.out.println("tuesday");
            }
            else if(day==4)
            {
                System.out.println("wednesday");
            }
            else if(day==5)
            {
                System.out.println("thursday");
            }
            else if(day==6)
            {
                System.out.println("friday");
            }
            else 
            {
                System.out.println("Saturday");
            }
        }

        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
