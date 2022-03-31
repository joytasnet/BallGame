import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		int[] balls = new int[100];
		for(int i=0;i<balls.length;i++){
			balls[i] = i+1;
		}
		int turn = 5;//何回戦バトルするかを定義した変数、条件変更に対応できるよう設定
		int[] Aballs = new int[turn];
		int[] Bballs = new int[turn];
		int Awin = 0;//Aの勝利数を記録する変数
		int Bwin = 0;//Bの勝利数を記録する変数
		
		//[turn]回戦を実施するためのfor文
		int draw = 0;
		for(int i=0;i<turn;i++){
			//AとBが１枚づつカードを引く
			for(int j=0;j<2;j++){
				int choice = new Random().nextInt(100-draw)+draw;
				//とったボールのを値を、AとBそれぞれに保持させる
				if(j==0){
					Aballs[i]=balls[choice];
				}else{
					Bballs[i]=balls[choice];
				}
				//選択されたボールを、袋の中から除去する
				int temp = balls[draw];
				balls[draw] = balls[choice];
				balls[choice] = temp;
				draw++;
			}
			//AとBが引き終わったので、結果を表示する
			System.out.printf("%s回戦%nA:%s,B:%s…",i+1,Aballs[i],Bballs[i]);
			if(Aballs[i] > Bballs[i]){
				Awin++;
				System.out.println("Aの勝ち");
			}else{
				Bwin++;
				System.out.println("Bの勝ち");
			}
			//ターンエンド！、もしターン数が残っていたら次のバトルへGO！
		}
		//全ターン終了、最終的な勝敗をジャッジ
		System.out.printf("%d対%dで……%sの勝ち！",Awin,Bwin,Awin>Bwin ? "A":"B");
		//補足、勝負回数が偶数の場合、AとBが同点の場合結果が変になっちゃうYO！
	}
}
