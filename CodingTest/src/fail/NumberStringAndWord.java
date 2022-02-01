package fail;

public class NumberStringAndWord {
	    public static int solution(int[] lottos, int[] win_nums) {
			//실패
			String s ="one4seveneight";
	        if(s.contains("one")){
	            s= s.replace("one", "1");
	        }
	        if(s.contains("two")){
	            s= s.replace("two", "2");
	        }
	        if(s.contains("three")){
	            s= s.replace("three", "3");
	        }
	        if(s.contains("four")){
	            s= s.replace("four", "4");
	        }   
	        if(s.contains("five")){
	           s= s.replace("five", "5");
	        }
	        if(s.contains("six")){
	            s= s.replace("six", "6");
	        }
	        if(s.contains("seven")){
	            s= s.replace("seven", "7");
	        }   
	        if(s.contains("eight")){
	            s= s.replace("eight", "8");
	        }   
	        if(s.contains("nine")){
	            s= s.replace("nine", "9");
	        }
	          
	        int answer = 0;
	        
	        answer = Integer.parseInt(s);
	        System.out.println(answer);
	        return answer;

	        /*
	         * 
	        //모범 답안 1  https://velog.io/@cheal3/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%88%AB%EC%9E%90-%EB%AC%B8%EC%9E%90%EC%97%B4%EA%B3%BC-%EC%98%81%EB%8B%A8%EC%96%B4-%EC%9E%90%EB%B0%94
	        
	        String[]  num= {"0","1","2","3","4","5","6","7","8","9"};
	        String[] word= {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
	            for (int i = 0 ; i <10 ; i++){
	                s = s.replace(word[i] , num[i]);
	            }
	            return Integer.parseInt(s);
	            
	            
			//모범 답안 2
			int answer = 0;
		    StringBuilder sb = new StringBuilder("");
		    int len = s.length();
		    String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
		    String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		    for(int i=0; i<10; i++){
		        s = s.replaceAll(alphabets[i],digits[i]);
		    }
		    return Integer.parseInt(s);
		    
	         * */
	        

	    }
	
	public static void main(String[] args) {
		int[] lottos = {1,2,3,4,5,6};
		int[] win_nums = {1,2,3,4,5,6};
		solution(lottos, win_nums);
	}
}


