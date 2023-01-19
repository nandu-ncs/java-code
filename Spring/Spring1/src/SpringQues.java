import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringQues {

    public SpringQues() {
    }

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springconfig.xml");

        Question question = (Question) applicationContext.getBean("question"); // setter injection

        System.out.println(question.getAnswers());
        System.out.println(question.getAnswers1());
        System.out.println(question.getId());
        System.out.println(question.getName());

        ConfigurableApplicationContext applicationContext2 = (ConfigurableApplicationContext) applicationContext;
        applicationContext2.registerShutdownHook(); // to shut down ioc container

    }
}
