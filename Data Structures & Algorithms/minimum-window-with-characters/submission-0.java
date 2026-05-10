class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty()) return "";

        HashMap<Character, Integer> countT = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0)+1);
        }

        int[] res = new int[2];
        int minLen = Integer.MAX_VALUE;
        int l=0;

        for(int i=0;i<s.length();i++) {
            if(countT.containsKey(s.charAt(i))) {
                break;
            }
            l++;
        }

        int have = 0;
        int need = countT.size();

        for(int r=l;r<s.length();r++) {
            char c = s.charAt(r);

            window.put(c, window.getOrDefault(c,0)+1);

            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
                have++;
            }

            while(need == have) {
                if(r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    res[0] = l;
                    res[1] = r;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.getOrDefault(leftChar, 0)-1);

                if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);

    }
}
