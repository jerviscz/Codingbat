//Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
boolean doubleX(String str) {
  int a = str.indexOf("x");
  if (a == -1) return false;
  
  if(a+1 >=str.length()) return false;
  return str.substring(a+1, a+2).equals("x");
}
