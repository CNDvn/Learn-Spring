package com.cndvn.spring;

import com.cndvn.spring.bean.GreetingService;
import com.cndvn.spring.bean.MyComponent;
import com.cndvn.spring.config.AppConfiguration;
import com.cndvn.spring.lang.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {
    public static void main(String[] args) {

        //create an object ApplicationContext by read configuration
        //in class AppConfiguration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        System.out.println("-------------------------");
        Language language = (Language) context.getBean("language");

        System.out.println("Bean Language: " + language);
        System.out.println("Call language.sayBye(): " + language.getBye());

        System.out.println("-------------------------");
        GreetingService service = (GreetingService) context.getBean("greetingService");

        service.sayGreeting();
        System.out.println("-------------------------");
        MyComponent myComponent = (MyComponent) context.getBean("myComponent");
        myComponent.showAppInfo();
    }
}
