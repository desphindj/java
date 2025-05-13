import java.io.DataInputStream;
class Tax1{
    public static void main(String args[])
    {
        try{
            DataInputStream data=new DataInputStream(System.in);
            int purchase;
            purchase=Integer.parseInt(data.readLine());
            double split,tax,aa;
            if(purchase<=0 && purchase<=10000)
            {
                tax=purchase*0;
                System.out.println(tax);
            }
            else if( purchase<=10001 && purchase<=20000)
            {
                split=(purchase-10000);
                tax=split*0.10;
                System.out.println(tax);
            }
            else{
                split=(purchase-20000);
                aa=10000*0.10;
                tax=((split*0.20)+aa);
                System.out.println(tax);
            }
           
        }
         catch(Exception e)
            {
                System.out.println(e);
            }
    }
}