/*p.110 실습문제3
예시 입력 1 
98765
예시 출력 1
Input money>> 98765
1 50,000won bill(s)
4 10,000won bill(s)
8 1,000won bill(s)
1 500won coin
2 100won coin(s)
1 50won coin
1 10won coin(s)
5 1won coin(s)
예시 입력 2 
65376
예시 출력 2
Input money>> 65376
1 50,000won bill(s)
1 10,000won bill(s)
5 1,000won bill(s)
3 100won coin(s)
1 50won coin
2 10won coin(s)
6 1won coin(s)
*/


import java.util.Scanner;

public class Main1money
{
	public static void main(String[] args) {
	    System.out.print("Input money>> ");
	    Scanner s = new Scanner(System.in);
	    int money = s.nextInt();
	    
	    int bill50000 = 0, bill10000 = 0, bill1000 = 0;
	    int coin500 = 0, coin100 = 0, coin50 = 0, coin10 = 0, coin1 = 0;
	    
	    bill50000 = money / 50000;	    
	    money %= 50000;
	    bill10000 = money / 10000;	    
	    money %= 10000;
	    bill1000 = money / 1000;	    
	    money %= 1000;
	    coin500 = money / 500;
	    money %= 500;
	    coin100 = money / 100;	    
	    money %= 100;
	    coin50 = money / 50;	 
	    money %= 50;
	    coin10 = money / 10;
	    coin1 = money % 10;
	   
	    if(bill50000 != 0) System.out.println(bill50000 + " 50,000won bill(s)");
	    if(bill10000 != 0) System.out.println(bill10000 + " 10,000won bill(s)");
	    if(bill1000 != 0) System.out.println(bill1000 + " 1,000won bill(s)");
	    if(coin500 != 0) System.out.println(coin500 + " 500won coin");
	    if(coin100 != 0) System.out.println(coin100 + " 100won coin(s)");
	    if(coin50 != 0) System.out.println(coin50 + " 50won coin");
	    if(coin10 != 0) System.out.println(coin10 + " 10won coin(s)");
	    if(coin1 != 0) System.out.println(coin1 + " 1won coin(s)"); 
        s.close();
	}
}

