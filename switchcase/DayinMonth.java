import java.io.DataInputStream;
class DayinMonth
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int month;
            System.out.println("1.jan >> 2.feb>> 3.mar >> 4.april >> 5.may >> 6.june >> 7.july >> 8.august >> 9.sept >> 10.october >> 11.november >> 12.dec");
            month=Integer.parseInt(data.readLine());
            switch (month)
            {
                case 1:
                    System.out.println("31");
                    break;
                case 2:
                    System.out.println("28");
                    break;
                case 3:
                    System.out.println("31");
                    break;
                case 4:
                    System.out.println("30");
                    break;
                case 5:
                    System.out.println("31");
                    break;
                case 6:
                    System.out.println("30");
                    break;
                case 7:
                    System.out.println("31");
                    break;
                case 8:
                    System.out.println("30");
                    break;
                case 9:
                    System.out.println("31");
                    break;
                case 10:
                    System.out.println("30");
                    break;
                case 11:
                    System.out.println("31");
                    break;
                case 12:
                    System.out.println("30");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}