import java.io.DataInputStream;
class Monthcl
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            String month;
            System.out.println("1.jan >> 2.feb>> 3.mar >> 4.april >> 5.may >> 6.june >> 7.july >> 8.august >> 9.sept >> 10.october >> 11.november >> 12.dec");
            month=(data.readLine());
            switch (month)
            {
                case "1" : case "jan":
                    System.out.println("31");
                    break;
                case "2" : case "feb":
                    System.out.println("28");
                    break;
                case "3" : case "mar":
                    System.out.println("31");
                    break;
                case "4" : case "april":
                    System.out.println("30");
                    break;
                case "5" : case "may":
                    System.out.println("31");
                    break;
                case "6" : case "june":
                    System.out.println("30");
                    break;
                case "7" : case "july":
                    System.out.println("31");
                    break;
                case "8" : case "august":
                    System.out.println("30");
                    break;
                case "9" : case "sept":
                    System.out.println("31");
                    break;
                case "10" : case "oct":
                    System.out.println("30");
                    break;
                case "11" : case "nov":
                    System.out.println("31");
                    break;
                case "12" : case "dec":
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