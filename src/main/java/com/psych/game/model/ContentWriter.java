package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "contentWriters")
public class ContentWriter extends Employee {
    @ManyToMany
    @Getter
    @Setter
    List<Question> editedQuestion;

}
