package com.example.practice2;

public abstract class Question implements CheckCorrect {
    private final String text;

    protected Question(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public abstract boolean checkCorrect(String answer);
}