import java.io.DataInputStream;
class Ci
{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int p,r,t,P,R,T,choose;
            double si,ci;
            System.out.println("enter p");
            p=Integer.parseInt(data.readLine());
             System.out.println("enter r ");
            r=Integer.parseInt(data.readLine());
             System.out.println("enter t ");
            t=Integer.parseInt(data.readLine());
             System.out.println("enter P ");
            import java.io.DataInputStream;
            System.out.println("enter 1.SI ,, 2.CI ");
            choose=Integer.parseInt(data.readLine());
            switch(choose)
            {
                case 1:
                    si=(p*r*t)/100;
                    System.out.println(si);
                    break;
                case 2:
                    ci=P*((1+(R/100))*(T-1));
                    System.out.println(ci);
                    break;  
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}