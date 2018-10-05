
/*Given a string, return true if it ends in "ly".*/

public boolean endsLy(String str) {
  if (str.length()<2){
    return false;
  }else{
    String lastTwo = str.substring(str.length()-2);
    return lastTwo.equals("ly");
    
  }
}
