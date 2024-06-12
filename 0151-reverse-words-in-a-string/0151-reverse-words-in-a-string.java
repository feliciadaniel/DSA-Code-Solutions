class Solution {
  public String reverseWords(String s) {
    Stack<String> stck = new Stack<String>();
    String str = "";
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == ' ') {
        if (!str.isEmpty()) { // Check if str is not empty before pushing
          stck.push(str);
          str = "";
        }
      } else {
        str += s.charAt(i);
      }
    }

    // Push the last word if not empty (no need for trailing space now)
    if (!str.isEmpty()) {
      stck.push(str);
    }

    str = "";
    while (stck.size() != 1) {
      str += stck.peek() + " ";
      stck.pop();
    }
    str += stck.peek();

    return str;
  }
}
