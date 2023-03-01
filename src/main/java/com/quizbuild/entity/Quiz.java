package com.quizbuild.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Quiz object
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

    public Quiz() { }

    public Quiz(int id, User user, String title, String summary, int type, double score) {
        this.id = id;
        this.user = user;
        this.title = title;
        this.summary = summary;
        this.type = type;
        this.score = score;
    }

    public Quiz(User user, String title, String summary, int type, double score) {
        this.user = user;
        this.title = title;
        this.summary = summary;
        this.type = type;
        this.score = score;
    }

    // GETTERS & SETTERS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getScore() {
        return score;
    }

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
