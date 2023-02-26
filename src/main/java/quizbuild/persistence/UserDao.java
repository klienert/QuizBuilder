package quizbuild.persistence;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;


/**
 * The type User dao.
 */
public class UserDao {

    // TODO: Create CRUD





    //    private final Logger logger = LogManager.getLogger(this.getClass());
//
//    /**
//     * Returns an open session from the SessionFactory
//     * @return  session
//     */
//    private Session getSession() {
//        return SessionFactoryProvider.getSessionFactory().openSession();
//    }
//
//    /**
//     * Get User by id
//     *
//     * @param id the id
//     * @return the by id
//     */
//    public User getById(int id) {
//        Session session = getSession();
//        User User = session.get( User.class, id );
//        session.close();
//        return User;
//    }
//
//    /**
//     * update User
//     *
//     * @param User User to be inserted or updated
//     */
//    public void saveOrUpdate(User User) {
//        Session session = getSession();
//        Transaction transaction = session.beginTransaction();
//        session.saveOrUpdate(User);
//        transaction.commit();
//        session.close();
//    }
//
//    /**
//     * insert User
//     *
//     * @param User User to be inserted
//     * @return the int
//     */
//    public int insert(User User) {
//        int id = 0;
//        Session session = getSession();
//        Transaction transaction = session.beginTransaction();
//        id = (int)session.save(User);
//        transaction.commit();
//        session.close();
//        return id;
//    }
//
//    /**
//     * Delete a User
//     * NOTE: needs to delete all books by said User
//     * @param User User to be deleted
//     */
//    public void delete(User User) {
//        Session session = getSession();
//        Transaction transaction = session.beginTransaction();
//        int UserId = User.getId(); // to delete
//
//        bookDao.getAll();
//
//        session.delete(User);
//        transaction.commit();
//        session.close();
//    }
//
//
//    /**
//     * Return a list of all Users
//     *
//     * @return All Users
//     */
//    public List<User> getAll() {
//
//        Session session = getSession();
//
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery( User.class );
//        Root<User> root = query.from( User.class );
//        List<User> Users = session.createQuery( query ).getResultList();
//
//        logger.debug("The list of Users " + Users);
//        session.close();
//
//        return Users;
//    }
//
//    /**
//     * Gets a list of Users by property (exact match).
//     *
//     * @param propertyName the property name
//     * @param value        the value
//     * @return the by property equal
//     */
//    public List<User> getByPropertyEqual(String propertyName, String value) {
//        Session session = getSession();
//        logger.debug("Searching for User with " + propertyName + " == " + value);
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery(User.class);
//        Root<User> root = query.from( User.class);
//        query.select(root).where(builder.equal(root.get(propertyName), value));
//        List<User> Users = session.createQuery( query ).getResultList();
//        session.close();
//        return Users;
//    }
//
//    /**
//     * Gets a list of Users by property ('like' match).
//     *
//     * @param propertyName the property name
//     * @param value        the value
//     * @return the by property like
//     */
//    public List<User> getByPropertyLike(String propertyName, String value) {
//        Session session = getSession();
//        logger.debug("Searching for User with {} = {}",  propertyName, value);
//        CriteriaBuilder builder = session.getCriteriaBuilder();
//        CriteriaQuery<User> query = builder.createQuery(User.class);
//        Root<User> root = query.from( User.class);
//        Expression<String> propertyPath = root.get(propertyName);
//        query.where(builder.like(propertyPath, "%" + value + "%"));
//        List<User> Users = session.createQuery( query ).getResultList();
//        session.close();
//        return Users;
//    }

}

