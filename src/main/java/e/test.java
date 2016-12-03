package e;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/12/3.
 */
public class test {
    public static void main(String[] args) {
//        Business business = new Business(new USBWriter());
//
//        business.saveData();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.savedata();
    }
}
