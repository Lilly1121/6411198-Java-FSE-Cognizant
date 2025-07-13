package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);
        System.out.println("SpringLearnApplication has started.");
        displayDate(); // Call the method that loads date from Spring XML
    }

    public static void displayDate() {
        // Load Spring XML config file
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        // Get dateFormat bean
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            // Parse a sample date string
            Date date = format.parse("31/12/2018");
            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
