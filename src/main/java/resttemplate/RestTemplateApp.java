package resttemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import resttemplate.component.Communication;

@SpringBootApplication
public class RestTemplateApp {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(RestTemplateApp.class, args);

        Communication communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllUsers());
        System.out.println(communication.addUser());
        System.out.println(communication.updateUser());
        System.out.println(communication.deleteUser());
        System.out.println("Answer: " + communication.getAnswer());
    }
}

