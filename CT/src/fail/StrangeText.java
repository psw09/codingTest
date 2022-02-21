package fail;

import java.util.Arrays;

public class StrangeText {
//실패
	public static String solution(String s) {
		String[] sArrBlk = s.split(" ");
		String answer = "";
		
		for(int j=0;j<sArrBlk.length;j++) {
			
			String[] sArr = sArrBlk[j].split("");
			
			for(int i=0;i<sArr.length;i++) {
				if(i%2==0) {
					answer +=sArr[i].toUpperCase();
				}else {
					answer +=sArr[i].toLowerCase();
				}
			}
			answer+= " ";
		}
		answer = answer.trim();
        return answer;
        
    }
	
	
	/*
	 * public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        } 
        
        return answer;
    }
	 * 
	 * /
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution("try hello world");
	}

}
