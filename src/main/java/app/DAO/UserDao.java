package app.DAO;

import app.model.User;
import app.model.User;

import java.util.List;

public interface UserDao {
    void Add (User user);
    void Remove (User user);
    void Update (User user);
    List<User> getAllUsers ();
}
