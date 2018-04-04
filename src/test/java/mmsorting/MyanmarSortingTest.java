package mmsorting;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ibm.icu.text.Collator;

/**
 * 
 * @author Chan Mrate Ko Ko
 *
 */
public class MyanmarSortingTest {
	
	Locale myanmar = null;
	Collator coll = null;
	
	@Before
	public void before(){
		myanmar = new Locale("my", "MM", "");
		coll = Collator.getInstance(myanmar);
	}
	
	@After
	public void after(){
		myanmar = null;
		coll = null;
	}

	@Test
	public void sort(){
		List<String> myanmarWordList = Arrays.asList("ရှမ်း", "ချင်း", "ကချင်", "ကရင်", "ရခိုင်", "ဗမာ", "ကယား",  "မွန်");
		Collections.sort(myanmarWordList, coll);
		List<String> expectedWordList  = Arrays.asList("ကချင်", "ကယား", "ကရင်", "ချင်း", "ဗမာ", "မွန်", "ရခိုင်", "ရှမ်း");
		assertEquals(expectedWordList, myanmarWordList);
	}
}
