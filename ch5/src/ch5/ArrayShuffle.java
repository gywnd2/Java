package ch5;

public class ArrayShuffle {

	public static void main(String[] args) {
		int[] numArr=new int[10];
		
		for(int i=0; i<numArr.length;i++) {
			numArr[i]=i;
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100; i++) {
			int n=(int)(Math.random()*10); 
			//random() 메서드는 0~9 사이의 값을 무작위로 출력
			int tmp=numArr[0];
			numArr[0]=numArr[n];
			numArr[n]=tmp;
		}
		
		for(int i=0;i<numArr.length;i++)
			System.out.print(numArr[i]);

	}

}
