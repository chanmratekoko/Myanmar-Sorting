package mmsorting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.junit.Test;

import com.ibm.icu.text.Collator;

/**
 * 
 * @author Chan Mrate Ko Ko
 *
 */
public class MyanmarSortingTest {
	
	Locale myanmar = new Locale("my", "MM", "");
	Collator coll = Collator.getInstance(myanmar);
	
	@Test
	public void sort(){
		List<String> inputMyanmarWord = Arrays.asList("ရှမ်း", "ချင်း", "ကချင်", "ကရင်", "ရခိုင်", "ဗမာ", "ကယား",  "မွန်");
		Collections.sort(inputMyanmarWord, coll);
		List<String> expected  = Arrays.asList("ကချင်", "ကယား", "ကရင်", "ချင်း", "ဗမာ", "မွန်", "ရခိုင်", "ရှမ်း");
		assertEquals(expected, inputMyanmarWord);
	}
}
