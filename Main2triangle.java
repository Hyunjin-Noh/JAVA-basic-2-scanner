import java.util.Scanner;

public class Main2triangle
{
	public static void main(String[] args) {
	    Scanner side = new Scanner(System.in);
	    System.out.print("Input 3 integer values>> ");
	    int a = side.nextInt();
	    int b = side.nextInt();
	    int c = side.nextInt();
	    
        if ((a + b > c) && (b + c > a) && (a + c > b)) System.out.print("Yes, this is a triangle.");
        //���� ���� �亯���̺��� �� �� ���� ���� ũ�� ������ ������ ���ǿ����� �� ���� ������ ���� �ٸ� �� ���� ���� ���� Ŀ�� �Ѵٰ� �����Ƿ� &&���� ������ ������. 
        else System.out.print("No, this is NOT a triangle.");
        side.close();
	}
}
