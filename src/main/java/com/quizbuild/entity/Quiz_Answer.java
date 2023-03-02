package com.quizbuild.entity;

/**
 * The type Quiz answer.
 */
public class Quiz_Answer {
    private int id;
    private Question question_id;
    private boolean active;
    private boolean correct;
    private String answer;

    /**
     * Basic Constructor (no args)
     */
    public Quiz_Answer() {   }

    /**
     * Instantiates a new Quiz answer.
     *
     * @param id          the id
     * @param question_id the question id
     * @param active      the active
     * @param correct     the correct
     * @param answer      the answer
     */
    public Quiz_Answer(int id, Question question_id, boolean active, boolean correct, String answer) {
        this.id = id;
        this.question_id = question_id;
        this.active = active;
        this.correct = correct;
        this.answer = answer;
    }

    /**
     * Instantiates a new Quiz answer.
     *
     * @param question_id the question id
     * @param active      the active
     * @param correct     the correct
     * @param answer      the answer
     */
    public Quiz_Answer(Question question_id, boolean active, boolean correct, String answer) {
        this.question_id = question_id;
        this.active = active;
        this.correct = correct;
        this.answer = answer;
    }

//    GETTERS & SETTERS


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
     * Gets question id.
     *
     * @return the question id
     */
    public Question getQuestion_id() {
        return question_id;
    }

    /**
     * Sets question id.
     *
     * @param question_id the question id
     */
    public void setQuestion_id(Question question_id) {
        this.question_id = question_id;
    }

    /**
     * Is active boolean.
     *
     * @return the boolean
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Sets active.
     *
     * @param active the active
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Is correct boolean.
     *
     * @return the boolean
     */
    public boolean isCorrect() {
        return correct;
    }

    /**
     * Sets correct.
     *
     * @param correct the correct
     */
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    /**
     * Gets answer.
     *
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * Sets answer.
     *
     * @param answer the answer
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Quiz_Answer{" +
                "id=" + id +
                ", question_id=" + question_id +
                ", active=" + active +
                ", correct=" + correct +
                ", answer='" + answer + '\'' +
                '}';
    }


}
