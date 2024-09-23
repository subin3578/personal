package com.ch02;

import com.ch02.config.AppConfig;
import com.ch02.sub1.Greeting;
import com.ch02.sub1.Hello;
import com.ch02.sub1.Welcome;
import com.ch02.sub2.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Hello hello = context.getBean(Hello.class);
        hello.show();

        Welcome welcome = (Welcome) context.getBean("welcome");
        welcome.show();

        Greeting greeting = (Greeting) context.getBean("greet");
        greeting.show();

        Computer com = (Computer) context.getBean("com");
        com.show();
    }
}
