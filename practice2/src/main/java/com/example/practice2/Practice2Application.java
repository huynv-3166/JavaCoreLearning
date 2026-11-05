package com.example.practice2;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Practice2Application {

	public static void main(String[] args) {
    SpringApplication.run(Practice2Application.class, args);

    Question[] questions = {
        new YesNoQuestion("Java có hỗ trợ interface không?", true),
        new ChoiceQuestion(
            "2 + 2 bằng bao nhiêu?",
            List.of("A: 3", "B: 4", "C: 5"),
            "B"
        )
    };

    String[] answers = {"yes", "b"};

    for (int i = 0; i < questions.length; i++) {
        System.out.println(questions[i].getText());
        System.out.println("Đáp án " + answers[i] + " đúng? "
                + questions[i].checkCorrect(answers[i]));
    }
}

}
