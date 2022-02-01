package success;

public class ArrAdd {
	//해결
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		int[][] arr2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
 
		int[][] answer = new int[arr1.length][arr1[0].length];
		//solution(arr1, arr2);
		
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=0;j<=arr1[i].length-1;j++) {
				System.out.println("a==="+arr1[i][j]);
				System.out.println("b==="+arr2[i][j]);
				answer[i][j] = arr1[i][j] + arr2[i][j];
				System.out.println(answer[i][j]);
			};
		};
	};
};
