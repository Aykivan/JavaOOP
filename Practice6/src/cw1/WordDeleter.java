package cw1;

public class WordDeleter {
    public String deleteWordInText(Text text, Word wordToDelete) {
        String stringText = text.getText();
        if (stringText.contains(wordToDelete.getWord())) {
            stringText = stringText.replace(wordToDelete.getWord(), "");
        }
        return stringText;
    }
}
