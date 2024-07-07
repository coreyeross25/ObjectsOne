package main.java.object1;

import main.java.object1.Person;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 1);

        System.out.println(person1.height);
    }
}
