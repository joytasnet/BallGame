import java.util.*;
public class MorozumiMain{
	public static void main(String[] args){
		int[] balls = new int[100];
		//100このボールを用意する。
		for(int i=0; i<balls.length; i++){
			balls[i] = i+1;
		}
		//シャッフルする
		for(int i=0; i<balls.length-1; i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int tmp = balls[index];
			balls[index] = balls[i];
			balls[i] = tmp;
		}

		//ボールの取り出し
		int a = 0,countA=0;
		int b = 1,countB=0;
		for(int i=0; i<5; i++ ){
			System.out.println(i+1+"回戦");
			System.out.print("A:"+balls[a]+",B"+balls[b]);
			if(balls[a]>balls[b]){
				System.out.println(" Aの勝ち");
				countA++;
			}else{
				System.out.println(" Bの勝ち");
				countB++;
			}
			a=a+2;
			b=b+2;
		}
		if(countA>countB){
			System.out.println(countA + "対" + countB + "でAの勝ち");
		}else{
			System.out.println(countA + "対" + countB + "でBの勝ち");

		}




	}
}
