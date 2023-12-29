package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDao UserDao;


    public UserServiceImpl(UserDao UserDao) {
        this.UserDao = UserDao;
    }

    @Override
    public User getUser(int id) {
        return UserDao.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return UserDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        UserDao.saveUser(user);
    }

    @Override
    public void deleteUser(int id) {
        UserDao.deleteUser(id);
    }
}