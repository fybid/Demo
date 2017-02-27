package DAO;

import Domain.UserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by studio on 2017/2/22.
 */
public class UserDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    public List<UserEntity> getAll(){
        String sql = "select id,username,password,age from UserEntity ";
        return getSession().createQuery(sql).list();
    }
}
