package rh.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rh.study.spring.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        System.out.println(helloWorld);

        helloWorld.hello();
    }
}
