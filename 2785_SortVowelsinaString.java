class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (isAVowel(c)) {
                vowels.add(c);
            }
        }
        if (vowels.size() < 1) {
            return s;
        }
        Collections.sort(vowels);
        int idx = 0;
        StringBuilder ans = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (isAVowel(c)) {
                ans.append(vowels.get(idx++));
                continue;
            }
            ans.append(c);
        }
        return ans.toString();
    }

    public boolean isAVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' 
            || c == 'U' || c == 'O' || c == 'I' || c == 'E' || c == 'A';
    }
}
