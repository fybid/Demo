package Controller;

import Service.UserService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    private Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
    private SessionFactory sessionFactory = configuration.buildSessionFactory();
    private Session session = sessionFactory.getCurrentSession();

    private UserService userService = new UserService();

    @RequestMapping("/hello")
    public String hello(){
        try {
//                数据库写操作
//
//                UserEntity user = new UserEntity();
//                user.setId(2);
//                user.setUsername("付");
//                user.setPassword("123");
//                user.setAge(22);
//
//                session.beginTransaction();
//                session.save(user);
//                session.getTransaction().commit();
//
//                return "数据保存成功";

//            数据库读操作


             Object[] user = userService.getAll().toArray();

            return "hello," + user[1];
        }catch (Exception e){
            return "Error!";
        }
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}