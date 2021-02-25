package case_HomeWork;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Eagle eagle = context.getBean(Eagle.class);
        eagle.move();
        Lion lion = context.getBean(Lion.class);
        lion.move();
        Shark shark = context.getBean(Shark.class);
        shark.move();

        System.out.println("/////////");

        Animals animals = context.getBean(Eagle.class);
        animals.move();
    }
}
