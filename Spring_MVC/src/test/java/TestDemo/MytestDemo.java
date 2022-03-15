package TestDemo;

import com.suweny.config.SpringConfiguration;
import com.suweny.dao.UserDao;
import com.suweny.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MytestDemo {
    @Test
    public void test1(){
        ApplicationContext app= new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService =(UserService) app.getBean("userService");
        userService.save();
    }
}
