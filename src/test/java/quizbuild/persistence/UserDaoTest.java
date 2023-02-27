package quizbuild.persistence;

import org.junit.jupiter.api.Disabled;
import quizbuild.entity.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import quizbuild.testUtils.Database;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


/**
 * The type User dao test.
 */
public class UserDaoTest {

    /**
     * The User dao.
     */
    // TODO: Try with GenericDao, once all tests pass...
//    GenericDao<User> UserDao;
    UserDao userDao;

    /**
     * Sets up.
     */
    @BeforeEach
    void setUp() {
        userDao = new UserDao();
        Database database = Database.getInstance();
        database.runSQL("cleandb.sql");
    }

    /**
     * Gets all Users success.
     */
    @Test
    void getAllUsersSuccess() {
        List<User> Users = userDao.getAll();
        assertEquals(4, Users.size());
    }

//    @Test
//    void getAllUserByNameSuccess() {
//        List<User> bartUser = userDao.getByPropertyEqual("firstName", "Bart");
//        assertEquals(1, bartUser.size());
//        assertEquals(bartUser, userDao.getByPropertyEqual("firstName", "Bart"));
//        assertEquals(bartUser, userDao.getByPropertyEqual("email", "bsimpson@email.com"));
//    }

    /**
     * Gets by id success.
     */
    @Disabled
    @Test
    void getByIdSuccess() {
//        User retrievedUser = (User)UserDao.getById(4);
//        assertNotNull(retrievedUser);
//        assertEquals(retrievedUser, UserDao.getByPropertyEqual("email", "lsimpson@email.com"));
//        assertEquals(retrievedUser, UserDao.getByPropertyEqual("firstName", "Lisa"));
    }

    /**
     * Insert User success.
     */
    @Disabled
    @Test
    void insertUserSuccess() {
        User newUser = new User("Maggie", "Simpson", "magssimpson", "donuts5", "maggiesimpsom@email.com");
        int id = userDao.insert(newUser);
        assertNotEquals(0, id);
        User insertedUser = userDao.getById(id);
        assertEquals(insertedUser, newUser);
    }

    /**
     * Update User success.
     */
    @Disabled
    @Test
    void updateUserSuccess() {
//        String wrongName = "Steven";
//        User UserToUpdate = (User)UserDao.getById(4);
//        UserToUpdate.setFirstName(wrongName);
//        UserDao.saveOrUpdate(UserToUpdate);
//        User retrievedUser = (User)UserDao.getById(4);
//        assertEquals(wrongName, retrievedUser.getFirstName());
    }

    /**
     * Insert new book and User success.
     */
    @Disabled
    @Test
    void insertNewBookANDUserSuccess() {
//        User jkRowling = new User("J.K.", "Rowling");
//        int idUser = UserDao.insert(jkRowling);
//        Book newBook = new Book("Harry Potter and the Sorcerer's Stone", jkRowling, "978-0439708180", 1998);
//        int idBook = bookDao.insert(newBook);
//        User retrieveJK = (User)UserDao.getById(idUser);
//        Book retrieveHP = (Book)bookDao.getById(idBook);
//        assertEquals(idUser, retrieveJK.getId());
//        assertEquals(idBook, retrieveHP.getId());
    }

    /**
     * Delete User success.
     */
    @Disabled
    @Test
    void deleteUserSuccess() {
        // needs to delete the books as well
//        UserDao.deleteEntity(UserDao.getById(4));
//        assertNull(UserDao.getById(4));
//        assertNotEquals("Carrie", bookDao.getByPropertyLike("title", "Ca"));
//        assertNotEquals("Firestarter", bookDao.getByPropertyEqual("title", "Firestarter"));
//        assertNull(bookDao.getById(7)); // King book - "It"
    }
}
