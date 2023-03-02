package com.quizbuild.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Quiz object
 *
 * @author keithlienert
 */
@Entity(name = "Quiz")
@Table(name = "quiz")
public class Quiz {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_userID"))
    private User user;

    private String title;
    private String summary;
    private int type;
    private double score;

    /**
     * Instantiates a new Quiz.
     */
    public Quiz() { }

    /**
     * Instantiates a new Quiz.
     *
     * @param id      the id
     * @param user    the user
     * @param title   the title
     * @param summary the summary
     * @param type    the type
     * @param score   the score
     */
    public Quiz(int id, User user, String title, String summary, int type, double score) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.summary = summary;
        this.type = type;
        this.score = score;
    }

    /**
     * Instantiates a new Quiz.
     *
     * @param user    the user
     * @param title   the title
     * @param summary the summary
     * @param type    the type
     * @param score   the score
     */
    public Quiz(User user, String title, String summary, int type, double score) {
        this.user = user;
        this.title = title;
        this.summary = summary;
        this.type = type;
        this.score = score;
    }

    // GETTERS & SETTERS


    /**
     * Gets id.
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets user.
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     * @param user the user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * Gets title.
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets summary.
     * @return the summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets summary.
     * @param summary the summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * Gets type.
     * @return the type
     */
    public int getType() {
        return type;
    }

    /**
     * Sets type.
     * @param type the type
     */
    public void setType(int type) {
        this.type = type;
    }

    /**
     * Gets score.
     * @return the score
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets score.
     * @param score the score
     */
    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "id=" + id +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", summary='" + summary + '\'' +
                ", type=" + type +
                ", score=" + score +
                '}';
    }

}
