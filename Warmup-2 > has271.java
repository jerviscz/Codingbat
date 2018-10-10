/* Given an array of ints, return true if it contains a 2, 7, 1 pattern -- 
 * a value, followed by the value plus 5, followed by the value minus 1. 
 * Additionally the 271 counts even if the "1" differs by 2 or less from the 
 * correct value.
 */

public boolean has271(int[] nums) {
   // i<length-2 in order to put i+1 and i+2 in the loop
  for (int i=0; i < (nums.length-2); i++){   
    int var = nums[i];
    if(nums[i+1] == var+5 && Math.abs(nums[i+2] - (var-1)) <=2 ){
      return true;
    }
  }
  return false;
}
