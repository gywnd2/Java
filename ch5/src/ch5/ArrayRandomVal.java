package ch5;
import java.util.*;

public class ArrayRandomVal {
	public static void main(String[] args) {
		int[] code= {-4,-1,3,6,11};
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp=(int)(Math.random()*code.length);
			arr[i]=code[tmp];
		}
		
		System.out.println(Arrays.toString(arr)); //char형 배열은 그냥 arr해도 출력 됨.
	}

}
