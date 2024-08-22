class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String newS = new String(arr1);
        String newT = new String(arr2);

        return newS.equals(newT);
    }
}
