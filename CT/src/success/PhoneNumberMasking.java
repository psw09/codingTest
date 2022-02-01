package success;

public class PhoneNumberMasking {

	public static String solution(String phone_number) {
		String numFirst = phone_number.substring(0,phone_number.length()-4);
		String numLast = phone_number.substring(phone_number.length()-4,phone_number.length());
		
		String star ="";
		for(int i=0;i<=numFirst.length()-1;i++) {
			star += "*";
		}
		
		String answer = star + numLast;
        return answer;
    }
	
	/* 모범답안
	class Solution {
		public String solution(String phone_number) {
			char[] ch = phone_number.toCharArray();
			for (int i = 0; i < ch.length - 4; i++) {
				ch[i] = '*';
			}
			return String.valueOf(ch);
		}
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =solution("12345676");
		System.out.println(s);
	}

}
