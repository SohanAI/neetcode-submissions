class Solution {
    public boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) {
        return false;
    }

    HashMap<Character, Integer> stringS = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (stringS.containsKey(c)) {

            stringS.put(c, stringS.get(c) + 1);

        } else {
            stringS.put(c, 1);
        }
    }


    HashMap<Character, Integer> stringT = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
        char c = t.charAt(i);

        if (stringT.containsKey(c)) {

            stringT.put(c, stringT.get(c) + 1);

        } else {
            stringT.put(c, 1);
        }
    }

    return stringS.equals(stringT);




        

    }
}
