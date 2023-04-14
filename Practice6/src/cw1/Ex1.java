package cw1;

public class Ex1 {
    public static void main(String[] args) {
        Text text = new Text("Жил был барсук");

        Word changeWord = new Word("барсук");
        Word newWord = new Word("енот");
        Word deleteWord = new Word("был ");
        Text appendText = new Text(" трескун");

        WordDeleter wordDeleter = new WordDeleter();
        WordFinder wordFinder = new WordFinder();
        WordReplacer wordReplacer = new WordReplacer();
        TextAppender textAppender = new TextAppender();
        TextPrinter textPrinter = new TextPrinter();

        textPrinter.printText(text);
        Text exText = new Text(wordReplacer.replaceWordInText(text, changeWord, newWord));
        System.out.println(exText);
        exText = textAppender.appendText(exText, appendText);
        System.out.println(exText);
        String exString = wordDeleter.deleteWordInText(exText, deleteWord);
        System.out.println(exString);
    }
}
