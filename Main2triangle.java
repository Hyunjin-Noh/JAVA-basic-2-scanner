/*p.110 실습문제5
예시 입력 1 
4 3 5
예시 출력 1
Yes, this is a triangle.
예시 입력 2 
4 9 4
예시 출력 2
No, this is NOT a triangle.
예시 입력 3 
1 2 3
예시 출력 3
No, this is NOT a triangle.
*/

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
        //원래 가장 긴변길이보다 두 변 길이 합이 크면 되지만 문제의 조건에서는 두 변의 길이의 합이 다른 한 변의 길이 보다 커야 한다고 했으므로 &&으로 세가지 연결함. 
        else System.out.print("No, this is NOT a triangle.");
        side.close();
	}
} 
