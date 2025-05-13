import java.io.DataInputStream;
class Vowel
{
    public static void main(String args[])
    {
        try{
            String a;
            DataInputStream data=new DataInputStream(System.in);
            String oper ;
            oper=(data.readLine());
            char ch=oper.charAt(0);

            if (ch=='a' || ch=='e' ||ch=='i' ||  ch=='o' || ch=='u')
            {
                System.out.println(" its a vowel ");
            }
            else{
                System.out.println("not a vowel");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
