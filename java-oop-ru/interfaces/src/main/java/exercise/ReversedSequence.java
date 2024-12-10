package exercise;

// BEGIN
class ReversedSequence implements CharSequence {
    private static String text;

    public ReversedSequence(String text) {
        this.text = text;
    }

    public static String getText() {
        return new StringBuilder(text).reverse().toString();
    }

    public int length() {
        return getText().length();
    }

    public char charAt(int index) {
        String text1 = getText();
        if (index < 0 || index > text1.length() - 1 || text1.equals("")) {
            return 0;
        }
        char[] signs = text1.toCharArray();
        int i = index < signs.length ? index : signs.length - 1;

        return signs[i];
    }

    public CharSequence subSequence(int start, int end) {
        String text2 = getText();

        if (start == end || end < start || start > text2.length()) {
            return "";
        }

        int endIndex = end > text2.length() ? text2.length() : end;

        if (start < endIndex && start >= 0 && endIndex <= text2.length()) {
            return text2.substring(start, endIndex);
        }
        return "";
    }

    @Override
    public String toString() {
        return getText();
    }
}
// END
