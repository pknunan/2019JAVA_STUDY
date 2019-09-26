package baekjoon;

import java.util.*;
public class Pro10809 {
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		int[] alpha = new int[26]; 
		Arrays.fill(alpha, -1);//alpha�� -1�� �ʱ�ȭ
		int cnt = 0;
		for(int i=0; i<S.length();i++) {
			int index = S.charAt(i)-'a'; // ���ڳ��� ���Ͽ� �ε����� ã����
			if(alpha[index] == -1) { // �ѹ��� ������ ���� ���ڶ��
				alpha[index] = cnt++; //�迭�ε����� ī��Ʈ���� ���� ī��Ʈ �÷���
			}
			else if(alpha[index] > -1) { //�ѹ� �̻� ���� ���ڶ�� �׳� ī��Ʈ�� �÷���
				cnt++; 
			}
		}
		
		for(int i=0; i<alpha.length;i++) {
			System.out.print(alpha[i]+" ");
		}
		sc.close();
	}

}
