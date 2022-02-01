package practice;

public class KeyPadPush {

	public static void main(String[] args) {
		//실패
        String answer = "";
        int[] numbers = {1,3,4,5,6};
        String hand ="";
        for(int i=0;i<=numbers.length-1;i++) {
            int num = numbers[i];
            int oldNum = 10;
            if(i != 0){
                oldNum = numbers[i-1];
            };
            
            if(num==1||num==4||num==7){
                answer += "L";
            }else if(num==3||num==6||num==9){
                answer += "R";
            }else{
                if(oldNum !=10){
                    
                    int topNum = 10;
                    int botNum = 10;
                    int leftNum = 10;
                    int rightNum = 10;     
                    
                    if(oldNum!=0){
                        topNum = oldNum -3;
                        botNum = oldNum +3;
                        leftNum = oldNum -1;
                        rightNum = oldNum +1;
                    }else{
                        topNum = oldNum -2;
                    }
                    String h = "";
                    h = (hand.equals("left")) ? "L" : "R";
                    int aLen = answer.length();
                    aLen += -1;
                    if(num==topNum || num==botNum || num==leftNum || num==rightNum){
                        if(answer.substring(answer.length()-1).equals(h)){
                            answer += answer.substring(aLen);
                            
                        }
                       
                        else{
                            
                           int sideNum = numbers[aLen];
                           if(sideNum==topNum || sideNum==botNum || sideNum==leftNum || sideNum==rightNum){
                               answer +=h;
                           }
                        }
                        
                    }else{
                        if(hand.equals("left")){
                            answer += "L";
                        }else{
                            answer += "R";
                        }
                        
                    }
                   
                }else{
                    if(hand.equals("left")){
                        if(num==1||num==4||num==7||num==2||num==5||num==8||num==0){
                            answer += "L";
                        }else{
                            answer += "R";
                        }
                    }else{
                        if(num==3||num==6||num==9||num==2||num==5||num==8||num==0){
                            answer += "R";
                        }else{
                            answer += "L";
                        }
                    }
                }
            }

		}

        System.out.println("answer===="+answer);
        //return answer;
    }
}


