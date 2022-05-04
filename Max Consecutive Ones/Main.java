/*
* Given a binary array nums, return the maximum number of consecutive 1's in the array.
* Example 1:
* Input: nums = [1,1,0,1,1,1]
* Output: 3
*
* Example 2:
* Input: nums = [1,0,1,1,0,1]
* Output: 2
* */

import java.util.*;

public class Main {
    public static void main(String[] args) {

            int[] nums ={1,1,0,1,1,1};
            List<Integer> numberOfConsecutive1s = new ArrayList<>();
            int consective1sCounter = 0;
            int index = 0;


            for(var num: nums){
                index++;
                if(num == 1){
                    consective1sCounter++;
                }

                //if the number is 0,
                // add the consective1sCounter to numberOfConsecutive1s list
                //and reset the counter to 0
                if(num != 1 ){
                    numberOfConsecutive1s.add(consective1sCounter);
                    consective1sCounter = 0;
                }

                //if reached end of the list, add the consective1sCounter to numberOfConsecutive1s list
                if(index == nums.length ){
                    numberOfConsecutive1s.add(consective1sCounter);
                }
            }
            int maxNumberOfConsective1s = Collections.max(numberOfConsecutive1s);
            System.out.println(maxNumberOfConsective1s);

    }
}
