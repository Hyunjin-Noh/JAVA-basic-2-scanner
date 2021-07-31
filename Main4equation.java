import java.util.Scanner;

public class Main4equation
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Input a equation >> ");
        float a = s.nextFloat();
        String symbol = s.next();
        float c = s.nextFloat();
        
        if (symbol.equals("+")==true) System.out.println(a+" "+symbol+" "+c+" = "+(a + c));
        else if (symbol.equals("-")==true) System.out.println(a+" "+symbol+" "+c+" = "+(a - c));
        else if (symbol.equals("*")==true) System.out.println(a+" "+symbol+" "+c+" = "+(a * c));
        else if (symbol.equals("/")==true) {
            if (c==0) System.out.println("Can not divide by 0");
            else System.out.println(a+" "+symbol+" "+c+" = "+(a / c));
        }
        s.close();
    }
}