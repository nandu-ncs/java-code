import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring2Demo {

    public Spring2Demo() {
    }

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

        Person person = (Person) applicationContext.getBean("p"); // setter injection
        Employee employee = (Employee) applicationContext.getBean("employee"); // setter injection

        System.out.println(person.getpName());
        System.out.println(person.getCalculator().addition());
        System.out.println(person.getCalculator().multiplication());

        System.out.println(employee.getpName());

        ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext) applicationContext;
        applicationContext2.registerShutdownHook(); // to shut down ioc container

    }
}
