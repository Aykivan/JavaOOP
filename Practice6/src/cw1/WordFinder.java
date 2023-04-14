package cw1;

public class WordFinder {
    public Word wordFinder(Text text, Word word) {
        String[] textArr = text.getText().split(" ");
        for (String el : textArr) {
            if (el.equals(word.getWord())) return word;
        }
        return null;
    }
}
