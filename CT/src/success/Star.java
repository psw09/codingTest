package success;

import java.util.Scanner;

public class Star {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = "";
        
        for(int i=1;i<=b;i++){
           for(int j=1;j<=a;j++){
               sb.append("*");
            }
            sb.append("\n");
        }
        
       System.out.println(sb);
	}
}