// import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        // for(int i=0; i<nums.length; i++){
            // for (int j=i+1; j<nums.length;j++){
            //     if(nums[i]+nums[j]==target){
            //         result[0] = i;
            //         result[1] = j;
            //         return result;
            //     }
            // }
        // }
        // int half=nums.length/2;
        // int i= half-1; int j=half;
        

        // //loop array
        // for(int k=0; k<nums.length; k++){
        //     System.out.println("i="+i+",j="+j+"\n");
        //     if(i==j){
        //         break;
        //     }
        //     if(nums[i]+nums[j]>target){
        //         if(i==0){
        //             j--;
        //         }
        //         else{
        //             i--;
        //         }
        //     }
        //     else if (nums[i]+nums[j]<target){
        //         if(j==nums.length-1){
        //             i++;
        //         }
        //         else{
        //             j++;
        //         }
        //     }
        //     else{
        //         System.out.println("ifound"+"\n");
        //         result[0] = i;
        //         result[1] = j;
        //         return result;
        //     }
        // }

        // compliment hash Map keycompli, index
        HashMap<Integer,Integer> map=new HashMap<>();

        // LOOP 0-N
        for(int i=0;i<nums.length;i++){
            // System.out.println(map+"\n");
            if(map.containsKey(nums[i])){
                result[0]=i;
                result[1]=map.get(nums[i]);
                return result;
            }
            // checking if contains numvalue as key
                // result[0] = i;
                // result[1] = map[key](value)
            // add compli in hash with index
            int compli=target-nums[i];
            map.put(compli, i);

        }
        // check hash key
            // return value,index
        //
        return result;
    }
}