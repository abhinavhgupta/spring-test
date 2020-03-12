package spring.demo.injection;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
	      
	     
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor-arg.xml");

		Triangle triangle = (Triangle) context.getBean("triangle");

		triangle.check();
		
		//Set<String> set= new TreeSet<String>((S1,S2)->{return S1.length()-S2.length();});
	}
}
