import java.util.Scanner;
public class Main3rectanglecollision {
    public static boolean inRect(int x, int y) {
        if ((x >= 100 && x <= 200) && (y >= 100 && y <= 200)) return true;
        else return false;
    }
	public static void main (String args[])  {
		Scanner s = new Scanner(System.in);
		System.out.print("Input the first coordination(x1, y1)>> ");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		System.out.print("Input the second coordination(x2, y2)>> ");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		
        boolean a, b;
        a = inRect(x1,y1);
        b = inRect(x2,y2);
      
        if(a == true || b == true) System.out.print("Yes, two rectangles are collided."); //곂치면이라는 조건이 더 붙었음!! 
        else System.out.print("No, two rectangles are NOT collided.");
      
		s.close();
	}
}

