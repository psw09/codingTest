package success;

import java.util.Arrays;

public class NumberReverse {

	public static int[] solution(long n) {
		
        String[] val = String.valueOf(n).split("");
        
        int[] answer = new int[val.length];
        
        int valLen = val.length-1;
        for(int i=0;i<val.length;i++) {
        	System.out.println(val[valLen]);	
        	answer[i] = Integer.parseInt(val[valLen]);
        	valLen-=1;
        }
        	
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	
	public static void main(String[] args) {
		solution(1234567);
		

	}

}
