import java.io.DataInputStream;
class Lmonthdays
{
    public static void main(String args[]) 
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            String opr;
            System.out.println("enter 1(jan) ,2(feb),3(mar),4(aprl),5(may),6(june),7(july),8(august).9(septe),10(oct),11(novem),12(december)");
            opr=(data.readLine());
            if(opr=="1" || opr=="jan")
            {
                System.out.println("days==31");
            }
            else if( opr=="2" || opr== "feb")
            {
                System.out.println("days==28");
            }
            else if(opr=="3" || opr== "mar")
            {
                System.out.println("days==31");
            }
            else if(opr=="4" || opr=="aprl")
            {
                System.out.println("days==30");
            }
            else if(opr==5 || opr=="may")
            {
                System.out.println("days==31");
            }
            else if(opr==6 || opr=="june")
            {
                System.out.println("days==30");
            }
            else if(opr==7 || opr=="july")
            {
                System.out.println("days==31");
            }
            else if(opr==8 || opr=="august")
            {
                System.out.println("days==30");
            }
            else if(opr==9 || opr=="septe")
            {
                System.out.println("days==31");
            }
            else if(opr==10 || opr=="oct")
            {
                System.out.println("days==30");
            }
            else if(opr=="11" || opr=="novem")
            {
                System.out.println("days==31");
            }
            else 
            {
                System.out.println("days==30");
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
