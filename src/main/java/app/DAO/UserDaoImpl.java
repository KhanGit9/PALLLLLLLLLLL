package app.DAO;

import app.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import app.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    public UserDaoImpl () {}
    @Transactional
    @Override
    public void Add(User user) {
        entityManager.persist(user);
    }
    @Transactional
    @Override
    public void Remove(User user) {
        entityManager.remove(user);
    }
    @Transactional
    @Override
    public void Update(User user) {
        entityManager.merge(user);
    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT User from User", User.class).getResultList();
    }

}
