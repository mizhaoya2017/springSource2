package mybatis;

import mybatis.dao.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：mizhaoya
 * @date ：2020/3/19 17:28
 * @description：
 */
public class UserServiceTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("mybatis/applicationContext3.xml");
        UserMapper userDao = (UserMapper)context.getBean("userMapper");
        System.out.println(userDao.getUser(1));
    }
}
