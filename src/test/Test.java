package test;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		//배열숫자 순서 바꾸기
				int [] numArr = {0,1,2,3,4,5,6,7,8,9,10};
				System.out.println(Arrays.toString(numArr));
				
				for(int i =0; i<numArr.length; i++) {
					int n =(int)(Math.random()*10); //0~9임의 수 랜덤
					int tmp = numArr[i];
					numArr[i] = numArr[n];
					numArr[n]= tmp;
				}
				System.out.println(Arrays.toString(numArr));
			}
	}


