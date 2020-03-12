package spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {
	@Autowired
	//@Qualifier(value = "spellChecker1")
	private SpellChecker demo1;

	public TextEditor() {
		System.out.println("Inside TextEditor constructor.");

	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.demo1 = spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return demo1;
	}

	public void spellCheck() {
		demo1.checkSpelling();

	}
}
