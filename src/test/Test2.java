package test;

import java.util.Arrays;

//가위바위보게임
public class Test2 {

	public static void main(String[] args) {
		String[] strArr = {"가위","바위","보"};
		
		System.out.println(Arrays.toString(strArr));
		for(int i =0; i<3; i++);
			int tmp =(int)(Math.random()*3);
			System.out.println(strArr[tmp]);

	}

}
