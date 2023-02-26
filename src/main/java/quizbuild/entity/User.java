package quizbuild.entity;


import java.util.HashSet;
import java.util.Set;

/**
 * public class object for User
 * @author keithlienert
 */
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private Set<Quiz> quizzes = new HashSet<>();






}
