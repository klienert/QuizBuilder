## Application Flow: Quiz Builder

### Home Page
### User Sign-Up
1. User is able to sign up in the top right corner
2. Fills out sign up form to submit
3. Request goes to sign-up servlet
4. Servlet creates a user object and creates a new user in the DB
5. Response message shows on the JSP confirming new addition of user
### User Sign-In
1. User is able to sing in on the menu (top right corner)
2. Enters username/password on form to submit
3. While the user is authenticated, the server will handle allowing access to the quizzes/results pages 
4. If authentication fails, show an error message or error page
### View User profile page
1. Page sends a request to view current quizzes that the user has taken
2. Servlet uses the quizResults dao to select quizzes based on the user
3. Dao performs a select and creates a report of the completed quizzes and scores
4. Dao returns the report(list) to the servlet
5. Servlet sends the list to the quiz results JSP
6. JSP handles displaying the results as a table

## To Be Added...
1. Admin side
   * Admin Object (like user)
   * Admin profile page
   * Admin

