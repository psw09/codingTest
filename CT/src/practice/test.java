package practice;

public class test {
	
	public int solution(int[][] sizes) {
        int answer = 0;
        int maxNum1 = 0;
        int maxNum2 = 0;
        int maxIndex = 0;
        
        for(int i=0;i<=sizes.length-1;i++) {
        	for(int j=0;j<=sizes[i].length-1;j++) {
        		if(maxNum1 <sizes[i][j]) {
        			maxNum1 = sizes[i][j];
        			System.out.println("maxNum1@@@@"+maxNum1);
        			maxIndex = j;
        		}
        	}
        }
        if(maxIndex ==0) {
        	for(int i=0;i<=sizes.length-1;i++) {
        		if(maxNum2 < sizes[i][1] &&sizes[i][0]> sizes[i][1]) {
        			maxNum2 = sizes[i][1];
        		};
            }
        }else {
        	for(int i=0;i<=sizes.length-1;i++) {
        		if(maxNum2 < sizes[i][0] &&sizes[i][0]< sizes[i][1]) {
        			maxNum2 = sizes[i][0];
        		};
            }
        }
        answer = maxNum2 * maxNum1;
        System.out.println(maxNum1);
        System.out.println(maxNum2);
        return answer;
	}

	public static void main(String[] args) {
		int[][] i= {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
		test test = new test();
		int a = test.solution(i);
		System.out.println(a);
    }
}
