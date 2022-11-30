package app.service;

import app.DAO.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.DAO.UserDao;
import app.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService  {
    UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl () {}
    @Transactional
    @Override
    public void add(User user) { userDao.add(user); }
    @Transactional
    @Override
    public void remove(int id) {
        userDao.remove(id);
    }
    @Transactional
    @Override
    public void update(int id, User user) { userDao.update(id, user); }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User get(int id) { return userDao.get(id); }
}
