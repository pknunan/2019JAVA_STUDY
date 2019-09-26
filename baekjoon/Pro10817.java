package baekjoon;

import java.util.*;
public class Pro10817 {

	public static void main(String[] args) {
		int[] data = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++)
			data[i] = sc.nextInt();
		
		Arrays.sort(data);
		sc.close();
		System.out.println(data[1]);

	}

}
