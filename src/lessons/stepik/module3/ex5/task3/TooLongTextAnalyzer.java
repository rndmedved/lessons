package lessons.stepik.module3.ex5.task3;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    @Override
    public Label processText(String text) {
        return null;
    }

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }
}
