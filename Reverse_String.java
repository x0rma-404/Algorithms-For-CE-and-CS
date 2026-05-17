void main() {
    char[] s = { 'h', 'e', 'l', 'l', 'o' };
    System.out.println(s);
    int left = 0, right = s.length - 1;
    while (left < right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        left++;
        right--;
    }

    System.out.println(s);
}