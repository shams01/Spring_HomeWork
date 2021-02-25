package case_HomeWork;

import org.springframework.stereotype.Component;

@Component
public class Shark implements Animals{
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}
