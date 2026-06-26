class Solution {
    boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        // String str = "";
        // for(int i=s.length()-1;i>=0;i--) {
        //   str+=s.charAt(i);
        // }

        // return s.equals(str);


        int left = 0;
        int right = s.length()-1;

        while (left < right) {
           if(Character.toLowerCase(s.charAt(left)) !=  Character.toLowerCase(s.charAt(right))) {
              return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
