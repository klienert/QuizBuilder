package com.quizbuild.entity;

/**
 * The type Question.
 */
public class Question {
    private int id;
    private Quiz quiz;
    private int type;
    private int level;
    private int score;
    private String question;

    /**
     * basic constructor (no args)
     */
    public Question() {  }

    /**
     * Instantiates a new Question (no id).
     *
     * @param quiz     the quiz
     * @param type     the type
     * @param level    the level
     * @param score    the score
     * @param question the question
     */
    public Question(Quiz quiz, int type, int level, int score, String question) {
        this.quiz = quiz;
        this.type = type;
        this.level = level;
        this.score = score;
        this.question = question;
    }

    /**
     * Instantiates a new Question (all args).
     *
     * @param id       the id
     * @param quiz     the quiz
     * @param type     the type
     * @param level    the level
     * @param score    the score
     * @param question the question
     */
    public Question(int id, Quiz quiz, int type, int level, int score, String question) {
        this.id = id;
        this.quiz = quiz;
        this.type = type;
        this.level = level;
        this.score = score;
        this.question = question;
    }

    // GETTERS & SETTERS


    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets quiz.
     *
     * @return the quiz
     */
    public Quiz getQuiz() {
        return quiz;
    }

    /**
     * Sets quiz.
     *
     * @param quiz the quiz
     */
    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * Gets question.
     *
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Sets question.
     *
     * @param question the question
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", quiz=" + quiz +
                ", type=" + type +
                ", level=" + level +
                ", score=" + score +
                ", question='" + question + '\'' +
                '}';
    }
}
