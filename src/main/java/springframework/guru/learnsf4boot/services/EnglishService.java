package springframework.guru.learnsf4boot.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class EnglishService implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("Hello World !!!!");
    }
}
