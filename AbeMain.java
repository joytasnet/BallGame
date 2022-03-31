import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		int[] balls = new int[100];
		for(int i=0;i<balls.length;i++){
			balls[i]=i+1;
		}
		for(int i=0;i<balls.length-1;i++){
			int index = new Random().nextInt(balls.length-i)+i;
			int temp = balls[index];
			balls[index] = balls[i];
			balls[i] = temp;
		}
		int wa = 0; 
		int wb = 0;
		for(int i=0;i<40;i+=2){
			int a = balls[i];
			int b = balls[i+1];
			if(a>b){
				wa++;
			}else{
				wb++;
			}
			System.out.printf("%d回戦%n",i/2+1);
			System.out.printf("A:%d, B:%d...",a,b);
			System.out.println(a>b? "Aの勝ち":"Bの勝ち");
		}
		System.out.printf("%d対%dで",wa,wb);
		System.out.println(wa>wb? "Aの勝ち":"Bの勝ち");

	}
}
