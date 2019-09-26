package baekjoon;

import java.util.*;
public class Pro10809 {
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		int[] alpha = new int[26]; 
		Arrays.fill(alpha, -1);//alpha를 -1로 초기화
		int cnt = 0;
		for(int i=0; i<S.length();i++) {
			int index = S.charAt(i)-'a'; // 문자끼리 비교하여 인덱스를 찾아줌
			if(alpha[index] == -1) { // 한번도 나오지 않은 문자라면
				alpha[index] = cnt++; //배열인덱스에 카운트값을 저장 카운트 늘려줌
			}
			else if(alpha[index] > -1) { //한번 이상 나온 문자라면 그냥 카운트만 늘려줌
				cnt++; 
			}
		}
		
		for(int i=0; i<alpha.length;i++) {
			System.out.print(alpha[i]+" ");
		}
		sc.close();
	}

}
