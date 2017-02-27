package Service;

import DAO.UserDAO;
import Domain.UserEntity;

import java.util.List;

/**
 * Created by studio on 2017/2/22.
 */
public class UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public List<UserEntity> getAll(){
        return userDAO.getAll();
    }
}
