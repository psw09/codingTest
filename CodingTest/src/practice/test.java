package practice;
import java.util.ArrayList;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int x=10;
		int n=10;
        int oldX = x;
        long num = x;
        long[] answer = new long[n];
        for(int i=0;i<=n-1;i++){
            answer[i]= num;
            num+=oldX;
        }    

        System.out.println(answer);
        //return answer;
    }
}
