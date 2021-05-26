package springframework.guru.learnsf4boot.controller;


import org.springframework.stereotype.Controller;
import springframework.guru.learnsf4boot.services.HelloService;

@Controller
public class GreetingController {

    private final HelloService helloService;


    public GreetingController(HelloService helloService) {
        this.helloService = helloService;
    }


    public void sayHello(){

        helloService.sayHello();
    }
}
