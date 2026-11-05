package com.example.practice2;

public class YesNoQuestion extends Question {
    private final boolean correctAnswer;

    public YesNoQuestion(String text, boolean correctAnswer) {
        super(text);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkCorrect(String answer) {
        String expected = correctAnswer ? "yes" : "no";
        return answer != null && expected.equalsIgnoreCase(answer.trim());
    }
}