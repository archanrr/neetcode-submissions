class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String, List<String>> hmap = new HashMap<>();

       for(int i=0;i<strs.length;i++) {
        char[] arr = strs[i].toCharArray();
        Arrays.sort(arr);
        String st = new String(arr);
        if(hmap.containsKey(st)) {
            hmap.get(st).add(strs[i]);
        } else {
            List<String> newStr = new ArrayList<String>();
            newStr.add(strs[i]);
            hmap.put(st, newStr);
        }
       }

       return new ArrayList<>(hmap.values());
    }
}