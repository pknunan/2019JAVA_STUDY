package baekjoon;

import java.util.Scanner;

public class Pro1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		num = sc.nextInt();
		int lengthOfCycle = 1;  //����Ŭ ����
		int digit = num % 10;  //������ �ڸ��� ���� ������ 10�� �ڸ��� �� ��
		int target =digit*10 + ((int)(num/10) + digit)%10; // ù��° ����Ŭ ����
		
		while(target != num) { //Ÿ�ٰ� ������ ���� �ݺ�
			digit = target % 10;
			target = digit*10 +((target/10) + digit)%10;
			lengthOfCycle++;
		}
		sc.close();
		System.out.println(lengthOfCycle);
	}
}
