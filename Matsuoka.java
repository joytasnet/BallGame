import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int gamefreq=5,countA=0,countB=0,ballA=0,ballB=1;
		int[] balls=new int[100];
		String username="引き分け";
		for(int i=0;i<balls.length;i++){
			balls[i]=i+1;
		}
		for(int i=0;i<balls.length;i++){
			int tmp,random;
			random=new Random().nextInt(balls.length-i)+i;
			tmp=balls[i];
			balls[i]=balls[random];
			balls[random]=tmp;
		}
		for(int i=0;i<gamefreq;i++){
			System.out.printf("%d回戦\nA:%d,B:%d...",i+1,balls[ballA],balls[ballB]);
			if(balls[ballA]>balls[ballB]){
				System.out.printf("Aの勝ち\n");
				countA++;
			}else{
				System.out.printf("Bの勝ち\n");
				countB++;
			}
			ballA+=2;
			ballB+=2;
		}
		if(countA>countB){
			username="Aの勝ち";
		}else{
			username="Bのかち";
		}
		System.out.printf("%d対%dで%s",countA,countB,username);
	}
}
