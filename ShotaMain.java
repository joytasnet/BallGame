import java.util.*;
public class ShotaMain{
	public static void main(String[] args){
		int[] ball=new int[100];
		for(int i=0; i<ball.length;i++){
			ball[i]=i+1;
		}
		for(int i=0; i<ball.length-1;i++){
			int index= new Random().nextInt(ball.length-i)+i;
			int tmp = ball[index];
			ball[index]=ball[i];
			ball[i]=tmp;
		}

		int gameCount=5;
		int[] ballA=new int[gameCount];
		for(int i=0;i<gameCount;i++){
			ballA[i]=ball[i];
		}
		int[] ballB=new int[gameCount];
		for(int i=0; i<gameCount;i++){
			ballB[i]=ball[i+gameCount];
		}
		int aWin=0;
		int bWin=0;

		for(int i=0; i<gameCount; i++){
			System.out.print(i+1+"回戦");
			if(ballA[i]>ballB[i]){
				aWin++;
			}else{
				bWin++;
			}
			System.out.print("A:"+ballA[i]+","+"B:"+ballB[i]+"...");
			System.out.println(ballA[i]>ballB[i]?"Aの勝ち":"Bの勝ち");
		}
		System.out.printf("%d対%dで",aWin,bWin);
		System.out.print(aWin>bWin?"Aの勝ち":"Bの勝ち");
	}
}

