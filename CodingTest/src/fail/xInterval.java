package fail;


public class xInterval {

	public static long[] solution(int x, int n) {
        int oldX = x;
        long num = x;
        long[] answer = new long[n];
        for(int i=0;i<=n-1;i++){
            answer[i]= num;
            num+=oldX;
        }    
        
        System.out.println(answer[1]);
        return answer;
    }
	
	public static void main(String[] args) {
		
		solution(6,5);
	}

}
