package success;

import java.util.Arrays;

public class DigitAdd {

	public static int solution(int n) {
		String[] val = String.valueOf(n).split("");

		int answer = 0;

		for (int i = 0; i < val.length; i++) {
			
			answer +=Integer.parseInt(val[i]);
		}
		return answer;
	}
	/*모범
	 * public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
	 * */

	public static void main(String[] args) {
		solution(1234567);

	}

}
