class SmallestLetterSolution {
    public static void main(String[] args) {
        char[] letters = { 'c', 'f', 'j' };
        char target = 'f';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char c: letters)
            if (c > target) return c;
        return letters[0];
    }
}