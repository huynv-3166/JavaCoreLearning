package com.example.practice2;

import java.util.List;

public class ChoiceQuestion extends Question {
    private final List<String> options;
    private final String correctOption;

    public ChoiceQuestion(String text, List<String> options, String correctOption) {
        super(text);
        this.options = List.copyOf(options);
        this.correctOption = correctOption;
    }

    public List<String> getOptions() {
        return options;
    }

    @Override
    public boolean checkCorrect(String answer) {
        return answer != null
                && correctOption.equalsIgnoreCase(answer.trim());
    }
}