import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		int n =5;
		int count =0;
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
		int[] mrB = new int[n];
		for(int i=0; i<n*2 ; i++){
			int rndBall = new Random().nextInt(balls.length-i)+i;
			if(i%2==0){
				mrA[count] = balls[rndBall];//mrAのi番目の部屋に引いたボールを入れる
			}else{
				mrB[count] = balls[rndBall];//mrBのi番目の部屋に引いたボールを入れる
				count++;
			}
			int tmp = balls[rndBall];//今引いたボールを先頭と入れ替える処理
			balls[rndBall] = balls[i];
			balls[i] = tmp;
		}
		//次はBさん
		/*for(int i=0; i<mrB.length ; i++){
			int rndBall = new Random().nextInt(balls.length-i)+i;
			int tmp = balls[rndBall];//今引いたボールを先頭と入れ替える処理
			mrB[i] = rndBall;//mrBのi番目の部屋に引いたボールを入れる
			balls[rndBall] = balls[i];
			balls[i] = tmp;
			}*/

		//両者のボールの値を比較し勝敗表示
		int winA=0;
		int winB=0;

		for(int i=0 ; i<mrA.length ; i++){
			System.out.printf("%n回戦目",count);
			System.out.printf("%s:%d / %s:%d ",nameA,mrA[i],nameB,mrB[i]);
			System.out.print(mrA[i]>mrB[i] ? nameA+"の勝ち" : nameB+"の勝ち");
			System.out.println();
			if(mrA[i]>mrB[i]){
				winA++;
			}else{
				winB++;
			}
			count++;
		}
		//勝った回数と総合勝者の表示
		System.out.printf("%d : %d%n",winA,winB);
		if(winA > winB){
			System.out.printf("%sの勝ちです！%n",nameA);
		}else{
			System.out.printf("%sの勝ちです！%n",nameB);
		}
	}
}