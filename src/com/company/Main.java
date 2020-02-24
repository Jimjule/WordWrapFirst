package com.company;

public class Main {

    public static void main(String[] args) {
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
