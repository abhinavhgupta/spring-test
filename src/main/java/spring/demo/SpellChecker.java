package spring.demo;

import org.springframework.stereotype.Component;

@Component
public class SpellChecker {
	int count=0;
	public SpellChecker(){
	      System.out.println("Inside SpellChecker constructor."  + ++count);
	   }
	   public void checkSpelling(){
	      System.out.println("Inside checkSpelling." );
	   }
}
