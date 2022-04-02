package lessons.stepik.modul3.ex5.task3;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    public Label processText(String string) {
        for (String s:getKeywords()) {
            if (string.contains(s)) {
                return getLabel();
            }
        }
        return Label.OK;
    }
}
