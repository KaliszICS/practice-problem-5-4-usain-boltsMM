/**

        * File: Lesson 5.4 - Arrays, split, swapping

        * Author: Mansoor 

        * Date Created: May 7, 2026

        * Date Last Modified: May 8, 2026

        */
public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static void stringSwap(String[] arr, int index1, int index2) {
        
		String temp = arr[index1];
        
		 arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void reverse(int[] arr) {
        
		int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            	
				arr[i] = arr[arr.length - 1 - i];
            	
			arr[arr.length - 1 - i] = temp;
        }
    }

    public static String[] toWordArray(String str) {
        
		String[] words = str.split(" ");
        
		int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                count++;
           
			}
        		}

        String[] newArr = new String[count];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals("")) {
                newArr[index] = words[i];
                index++;
           	 }
        }	

        return newArr;
    }
}