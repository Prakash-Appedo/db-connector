package com.connector;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Andreas Koehn on 27.05.2015.
 */
public class StartApp {

    public static void main(String args[]) {
        //Get the Spring Context
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        //Get the EmployeeDAO Bean
        PersonDAO personDAO = ctx.getBean("personDAO", PersonDAO.class);

        //Get All
        List<PersonPOJO> personList = personDAO.getAll();
        System.out.println(personList);

        //Close Spring Context
        ctx.close();
    }
}
