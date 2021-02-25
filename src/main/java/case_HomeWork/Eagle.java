package case_HomeWork;

import org.springframework.stereotype.Component;

@Component
public class Eagle implements Animals{
    @Override
    public void move() {
        System.out.println("Fly");
    }
}
