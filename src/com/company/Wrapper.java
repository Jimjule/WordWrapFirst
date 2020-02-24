package com.company;

public class Wrapper {

    public static void main(String[] args) {
        System.out.println(wrap("It's a sentence and stuff", 3));
    }

    public static String wrap(String text, Integer split) {
        if (split > text.length()) {
            return text;
        }
        StringBuffer wrapLines = new StringBuffer(text);
        for (Integer i = split; i < wrapLines.length(); i += split + 1) {
            wrapLines.insert(i, "\n");
        }
        return wrapLines.toString();
    }
}
