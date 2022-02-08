package fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class minNum {

	public static int[] solution(int[] arr) {
		//실패
		int[] answer = {};

		if (arr.length > 1) {
			answer = new int[arr.length - 1];
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			

			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				arrList.add(i, arr[i]);
			}
			ArrayList<Integer> arrListSort = new ArrayList<Integer>();
			arrListSort = arrList;
			Collections.sort(arrListSort);
			System.out.println(arrList.toString());
			System.out.println(arrListSort.toString());

			arrList.remove(arrListSort.get(0));
			for (int j = 0; j < arrList.size(); j++) {
				answer[j] = arrList.get(j);
			}
			;
			return answer;
		} else {
			answer = new int[1];
			answer[0] = -1;
			System.out.println(Arrays.toString(answer));
			return answer;
		}

	}
	
	//예시
//	class Exam_0424_min_remove {
//		   public static void main(String[] args) {
//		      int[] arr = {4, 3, 2, 1};
//		      System.out.println(solution(arr));
//		      
//		   }
//		   public static int[] solution(int[] arr) {
//		      int min = arr[0];
//		      int[] answer = new int[arr.length - 1];
//
//		      if (arr.length <= 1) {
//		         int[] answer2 = { -1 };
//		         return answer2;
//		      }
//
//
//		         for (int i = 0; i < arr.length; i++) {
//
//		            if (min > arr[i]) {
//		               min = arr[i];
//		            }
//
//		         }
//		           int index = 0;
//		         for (int j = 0; j < arr.length; j++) {
//		            if (min == arr[j]) {
//		               continue;
//		            } else { 
//		               answer[index++] = arr[j];
//		            }
//
//		         }
//
//
//		      return answer;
//
//		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] answer ={4,3,2,1};
		
		solution(answer);
		
		

	}

}
