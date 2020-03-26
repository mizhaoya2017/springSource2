package task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ：mizhaoya
 * @date ：2020/3/26 15:59
 * @description：
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext act = new ClassPathXmlApplicationContext("task/bean.xml");
        UserService userService = (UserService)act.getBean("userService");
        User user = new User();
        user.setName("张三ccc");
        user.setAge(20);
        user.setSex("男");
        userService.save(user);
    }
}
