package lessons.stepik.module3.ex5.task3;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    abstract String[] getKeywords();
    abstract Label getLabel();
    public abstract Label processText(String string);
}
