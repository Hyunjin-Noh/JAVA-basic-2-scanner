/*p.112 실습문제12
예시 입력 1 
Input a equation >> 2 + 4
예시 출력 1
2.0 + 4.0 = 6.0
예시 입력 2 
Input a equation >> 100 * 7
예시 출력 2
100.0 * 7.0 = 700.0
예시 입력 3 
Input a equation >> 5 / 2
예시 출력 3
5.0 / 2.0 = 2.5
예시 입력 4 
Input a equation >> 14 / 0
예시 출력 4
Can not divide by 0
예시 입력 5 
Input a equation >> 7.5 - 9.9
예시 출력 5
7.5 - 9.9 = -2.3999996
*/

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
