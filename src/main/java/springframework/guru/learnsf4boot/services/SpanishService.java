package springframework.guru.learnsf4boot.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spanish")
public class SpanishService implements HelloService{
    @Override
    public void sayHello() {
        System.out.println("Hola mundo !!!!");
    }
}
