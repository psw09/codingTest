package success;

public class Hashard {
	public static boolean solution(int x) {
        boolean answer = true;
        String numStr = Integer.toString(x);
        char[] numArr =numStr.toCharArray();
        int numAdd = 0;
        
        for(int i=0;i<=numArr.length-1;i++) {
        	int numInt = Character.getNumericValue(numArr[i]);
        	numAdd +=numInt; 
        }
        System.out.println("numAdd=="+numAdd);
        
        if(x % numAdd !=0) {
        	answer =false;
        };
       
        return answer;
    }
	/* 모범답안 1
	public boolean isHarshad(int num) {

		String[] temp = String.valueOf(num).split("");

		int sum = 0;
		for (String s : temp) {
			sum += Integer.parseInt(s);
		}

		if (num % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(1234);
	}

}
