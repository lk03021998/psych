package com.psych.game.model;

import com.psych.game.Constants;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question extends Auditable{
    @Setter
    @Getter
    @NotBlank
    @Column(length = Constants.MAX_QUESTION_LENGTH)
    private String  questionText;

    @Setter
    @Getter
    @NotBlank
    @Column(length = Constants.MAX_ANSWER_LENGTH)
    private String correctAnswer;

    @Setter
    @Getter
    @NotNull
    private Game_mode gameMode ;

    @OneToMany(mappedBy = "question")
    @Getter @Setter
    private List<EllenAnswer> EllenAnswers;
}
