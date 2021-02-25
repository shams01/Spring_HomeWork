package case_HomeWork;

import org.springframework.stereotype.Component;

@Component
public class Lion implements Animals{
    @Override
    public void move() {
        System.out.println("Run");
    }
}
