class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if(n==1) return true;
        
        char[] newArr = new char[n];
        int ptr = 0;
        for(int i=0; i<n; i++) {
            if(isAlphNum(s.charAt(i))){
                newArr[ptr++] = Character.toLowerCase(s.charAt(i));
            }
        }
        int l = 0;
        int r = ptr-1;
        while(l <= r) {
            if(newArr[l]!=newArr[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isAlphNum(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c<= '9'));
    }
}
