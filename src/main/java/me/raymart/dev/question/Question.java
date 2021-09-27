package me.raymart.dev.question;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Question {

    private final String question;
    private final String[] choices;
    private final char answer;

}
