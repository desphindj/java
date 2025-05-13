import java.io.DataInputStream;
class Day
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int day;
            System.out.println("enter the day 1(monday)>> 2(tuesday>> 3(wedensday)>>4(thursday)>> 5(friday)>> 6(saturday)>> 7(sunday)");
            day=Integer.parseInt(data.readLine());
            switch(day)
            {
                case 1:
                    System.out.println("monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}