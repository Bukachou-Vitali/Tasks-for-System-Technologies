package testApplication.testTask.task1;

public class Child extends Parent {
    private String fio;

    public Child() {
        this.fio = "АН'НА-МАРИЯ оглы";
    }

    /**
     * This method get input String
     * and upper case first letter in words, separated by delimiter ' or - or " "
     * <p>
     * StringBuilder wordBuffer - this is a buffer that accumulate symbols to word before next delimiters
     *
     * @return formatted String with upper case first letter in words, separated by delimiter ' or - or " "
     */
    @Override
    public String format() {
        String fioInput = this.fio;
        StringBuilder formattedFio = new StringBuilder();
        StringBuilder wordBuffer = new StringBuilder();

        for (int i = 0; i < fioInput.length(); i++) {
            char symbol = fioInput.charAt(i);
            if ('\'' == symbol || '-' == symbol || ' ' == symbol) {
                String formattedWord = formatCaseForWord(wordBuffer.toString());
                formattedFio.append(formattedWord).append(symbol);
                cleanWordBuffer(wordBuffer);
            } else {
                wordBuffer.append(symbol);
                if (i == fioInput.length() - 1) {
                    String formattedWord = formatCaseForWord(wordBuffer.toString());
                    formattedFio.append(formattedWord);
                }
            }
        }
        return formattedFio.toString();
    }

    private void cleanWordBuffer(StringBuilder wordBuffer) {
        wordBuffer.setLength(0);
    }


    private String formatCaseForWord(String word) {
        if (word.length() > 0) {
            word = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
        return word;
    }

}
