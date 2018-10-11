
/* Given a string, return a version where all the "x" have been removed. 
 * Except an "x" at the very start or end should not be removed.
 */
 

public String stringX(String str) {
  String result = "";
  for(int i = 0; i < str.length(); i++){
    if (!(i>0 && str.charAt(i) == 'x' && i < (str.length()-1))){
      result = result + str.charAt(i);
    }
  }
  return result;
}
