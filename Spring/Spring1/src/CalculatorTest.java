import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalculatorTest {
    public CalculatorTest() {
    }

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

        Calculator calculator = (Calculator) applicationContext.getBean("calclass"); // setter injection
        Calculator calculator1 = (Calculator) applicationContext.getBean("calclass1"); // construtor injection

        System.out.println(calculator.addition());
        System.out.println(calculator.subtraction());
        System.out.println(calculator.multiplication());
        System.out.println(calculator.division());
        System.out.println(calculator.modulo());

        System.out.println("----");

        System.out.println(calculator1.addition());
        System.out.println(calculator1.subtraction());
        System.out.println(calculator1.multiplication());
        System.out.println(calculator1.division());
        System.out.println(calculator1.modulo());

        ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext) applicationContext;
        applicationContext2.registerShutdownHook();
    }
}
