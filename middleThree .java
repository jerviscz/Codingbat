/*middleThree 
*Given a string of odd length, return the string length 3 from its middle, 
*so "Candy" yields "and". The string length will be at least 3./


  /*if(str.length() == 3){
    return str;
  }
  int middle = (str.length()-1)/2;
  return str.substring(middle-1, middle+2);
}*/

public String middleThree(String str) {
  int len = str.length() / 2;

  return str.substring(len-1,len+2);

}

