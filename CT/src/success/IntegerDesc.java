package success;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerDesc {

	public static long solution(long n) {
		//해결
		long answer = 0;
		String answerStr = "";

		String nStr = Long.toString(n);
		String[] nStrArr = nStr.split("");

		ArrayList<Integer> nList = new ArrayList<Integer>();

		for (int i = 0; i < nStrArr.length; i++) {
			System.out.println(nStrArr[i]);
			nList.add(Integer.parseInt(nStrArr[i]));
		}
		;

		Collections.sort(nList, Collections.reverseOrder());

		for (int i : nList) {
			answerStr += i;
		}
		;

		answer = Long.parseLong(answerStr);
		return answer;
	}

	
	/*
	 *모범답안 
	 * public class ReverseInt {
    String res = "";
    public int reverseInt(int n){
        res = "";
        Integer.toString(n).chars().sorted().forEach(c -> res = Character.valueOf((char)c) + res);
        return Integer.parseInt(res);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
	 * 
	 * */
	public static void main(String[] args) {

	}

}
