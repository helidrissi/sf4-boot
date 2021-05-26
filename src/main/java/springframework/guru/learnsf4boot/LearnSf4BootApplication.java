package springframework.guru.learnsf4boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springframework.guru.learnsf4boot.controller.GreetingController;

@SpringBootApplication
public class LearnSf4BootApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(LearnSf4BootApplication.class, args);
       GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.sayHello();


    }

}
