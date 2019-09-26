package baekjoon;

import java.util.Scanner;

public class Pro1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int lengthOfCycle = 1;  //싸이클 길이
		int digit = num % 10;  //마지막 자리수 이자 숫자의 10의 자리가 될 수
		int target =digit*10 + ((int)(num/10) + digit)%10; // 첫번째 사이클 돌림
		
		while(target != num) { //타겟과 같을떄 까지 반복
			digit = target % 10;
			target = digit*10 +((target/10) + digit)%10;
			lengthOfCycle++;
		}
		sc.close();
		System.out.println(lengthOfCycle);
	}
}
