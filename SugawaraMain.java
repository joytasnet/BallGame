import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int n =5;
		String nameA ="Aさん";
		String nameB ="Bさん";

		//100種(1～100)の100個のボールが入った袋[]Bag宣言とfor文により値生成
		int[] balls = new int[100];
		for(int i=0 ; i<balls.length ; i++){
			balls[i] = i+1;
		}

		//AさんBさん交互に5回ずつランダムに[]Bagから取り出す
		//まずはAさん
		int[] mrA = new int[n];
		for(int i=0; i<mrA.length ; i++){
			int rndBall = new Random().nextInt(balls.length-i)+i;
			mrA[i] = rndBall;//mrAのi番目の部屋に引いたボールを入れる
			int tmp = balls[rndBall];//今引いたボールを先頭と入れ替える処理
			balls[rndBall] = balls[i];
			balls[i] = tmp;
		}
		//次はBさん
		int[] mrB = new int[n];
		for(int i=0; i<mrB.length ; i++){
			int rndBall = new Random().nextInt(balls.length-i)+i;
			mrB[i] = rndBall;//mrBのi番目の部屋に引いたボールを入れる
			int tmp = balls[rndBall];//今引いたボールを先頭と入れ替える処理
			balls[rndBall] = balls[i];
			balls[i] = tmp;
		}

		//両者のボールの値を比較し勝敗表示
		int winA=0;
		int winB=0;

		for(int i=0 ; i<mrA.length ; i++){
			System.out.printf("%s:%d / %s:%d ",nameA,mrA[i],nameB,mrB[i]);
			System.out.println(mrA[i]>mrB[i] ? "Aさんの勝ち" : "Bさんの勝ち");
			System.out.println();
			if(mrA[i]>mrB[i]){
				winA++;
			}else{
				winB++;
			}
		}
		//勝った回数と総合勝者の表示
		//フラグ
		System.out.printf("%d : %d%n",winA,winB);
		if(winA > winB){
			System.out.printf("%sの勝ちです！%n",nameA);
		}else{
			System.out.printf("%sの勝ちです！%n",nameB);
		}
	}
}
