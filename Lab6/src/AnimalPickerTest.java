import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalPickerTest {
	
	AnimalPicker ap = new AnimalPicker();

	@Test
	public void kangarooTest() {
		String result = ap.getString();
		assertTrue("Is it a mammal?".equalsIgnoreCase(result));
		
		ap.giveAnswer(true);
		result = ap.getString();
		assertTrue("Does it live with humans?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it intelligent?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it a pack hunter?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it a bear?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue(result.contains("kangaroo") || result.contains("Kangaroo"));
		
		ap.reset();
		
		result = ap.getString();
		assertTrue("Is it a mammal?".equalsIgnoreCase(result));
		
		ap.giveAnswer(true);
		result = ap.getString();
		assertTrue("Does it live with humans?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it intelligent?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it a pack hunter?".equalsIgnoreCase(result));
		
		ap.giveAnswer(false);
		result = ap.getString();
		assertTrue("Is it a bear?".equalsIgnoreCase(result));
		
		ap.giveAnswer(true);
		result = ap.getString();
		assertTrue(result.contains("bear") || result.contains("Bear"));
	}

}
