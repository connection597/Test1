package test;
//로또 번호 생성
public class LottoNumber {

	public static void main(String[] args) {
		    int [] ball = new int[45];
		    for(int i =0; i<ball.length; i++) {
			ball[i] =i+1; // ball[0] =1저장
			
			int tmp =0;
			int j =0;
			
			for(int i1 =0; i1<6; i1++) {
				j =(int)(Math.random()*45); // 0~44까지 범위
				tmp = ball[i1];
				ball[i1] = ball[j];
				ball[j] = tmp;
			}
			for(int i1 =0; i1<6; i1++) {
				System.out.printf("ball[%d]= %d%n",i1,ball[i1]);
			}
			for(int i1 =0; i1<6; i1++) {
				System.out.println(ball[i1]+"");
			}
		}

	}

}
