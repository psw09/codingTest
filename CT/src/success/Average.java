package success;

public class Average {
	
	public double solution(int[] arr) {
		double answer = 0;
		double sum = 0;
		double cnt = 0;
        for(int i=0;i<=arr.length-1;i++){
        	sum += arr[i];
            cnt = i +1;
        }
        answer =sum/cnt;
        return answer;
    }
	public static void main(String[] args) {
		Average average = new Average();
		
		
		int[] i = {1,2,3,4}; 
		average.solution(i);

	}

}
