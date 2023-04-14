package cw1;

public class WordReplacer {
    public String replaceWordInText(Text text, Word wordToReplace, Word newWord) {
        String stringText = text.getText();
        if (stringText.contains(wordToReplace.getWord())) {
            stringText = stringText.replace(wordToReplace.getWord(), newWord.getWord());
        }
        return stringText;
    }
}
