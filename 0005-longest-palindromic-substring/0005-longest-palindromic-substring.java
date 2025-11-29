class Solution {

    int left = 0;
    int maxLen = 0;

    // 팰린드롬 양 끝(j, k)에서 확장
    public void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        // 확장된 길이: k - j - 1
        if (maxLen < k - j - 1) {
            left = j + 1;
            maxLen = k - j - 1;
        }
    }

    public String longestPalindrome(String s) {

        int len = s.length();
        if (len < 2) return s;  // 글자 하나면 그대로 반환

        // 전체를 순회하면서 중심 확장
        for (int i = 0; i < len - 1; i++) {

            // 1) 짝수 길이 중심 (예: "abba")
            extendPalindrome(s, i, i + 1);

            // 2) 홀수 길이 중심 (예: "aba")
            extendPalindrome(s, i, i + 2);
        }

        return s.substring(left, left + maxLen);
    }
}
