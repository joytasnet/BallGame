import java.util.*;
public class NagasuMain{
	public static void main(String[] args){
		int[] balls = new int[100];
		for(int i=0;i<balls.length;i++){
			balls[i] = i +1;
		}
		int[] playerA = new int[5];
		int[] playerB = new int[5];

		for(int i=0;i<balls.length -1 ;i++){
			int index = new Random().nextInt(100);
			int temp = balls[index];
			balls[index] = balls[i];
			balls[i] = temp;
		}
		for(int i=0;i<playerA.length;i++){
			playerA[i] = balls[i];
		}
		for(int i=0;i<playerB.length;i++){
			playerB[i] = balls[i+playerA.length];
		}
		int winA=0;
		int winB=0;
		for(int i=0;i<(playerA.length + playerB.length)/2;i++){
			System.out.printf(i +1 +"回戦%nA:%d,B:%d",playerA[i],playerB[i]);
			if(playerA[i] > playerB[i]){
				winA += 1;
				System.out.println(" Aの勝ち");
			}else{
				winB += 1;
				System.out.println(" Bの勝ち");
			}
		}
		System.out.printf("%d対%dで",winA,winB);
		System.out.println((winA > winB ? "A" : "B") +"の勝ち");
	}
}
