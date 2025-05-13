import java.io.DataInputStream;
class Vowel
{
    public static void main(String args[])
    {
        try{
            DataInputStream data= new DataInputStream(System.in);
            String vowel;
            System.out.println("enter the alphabet to find vowel or consonent");
            vowel=(data.readLine());
            switch(vowel)
            {
                case "a":
                    System.out.println("a vowel");
                    break;
                case "b":
                    System.out.println("its a consonent");
                    break;
                case "c":
                    System.out.println("its a consonent");
                    break;
                case "d":
                    System.out.println("its a consonent");
                    break;
                case "e":
                    System.out.println("a vowel");
                    break;
                case "f":
                    System.out.println("its a consonent");
                    break;
                case "g":
                    System.out.println("its a consonent");
                    break;
                case "h":
                    System.out.println("its a consonent");
                    break;
                case "i":
                    System.out.println("a vowel");
                    break;
                case "j":
                    System.out.println("its a consonent");
                    break;
                case "k":
                    System.out.println("its a consonent");
                    break;
                case "l":
                    System.out.println("its a consonent");
                    break;
                case "m":
                    System.out.println("its a consonentl");
                    break;
                case "n":
                    System.out.println("its a consonent");
                    break;
                case "o":
                    System.out.println("a vowel");
                    break;
                case "p":
                    System.out.println("its a consonent");
                    break;
                case "q":
                    System.out.println("its a consonent");
                    break;
                case "r":
                    System.out.println("its a consonent");
                    break;
                case "s":
                    System.out.println("its a consonent");
                    break;
                case "t":
                    System.out.println("its a consonent");
                    break;
                case "u":
                    System.out.println("a vowel");
                    break;
                case "v":
                    System.out.println("its a consonent");
                    break;
                case "w":
                    System.out.println("its a consonent");
                    break;
                case "x":
                    System.out.println("its a consonent");
                    break;
                case "y":
                    System.out.println("its a consonent");
                    break;
                case "z":
                    System.out.println("its a consonent");
                    break;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}