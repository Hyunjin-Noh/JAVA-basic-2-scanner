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

