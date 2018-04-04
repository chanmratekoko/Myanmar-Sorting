package mmsorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import com.ibm.icu.text.Collator;

/**
 * 
 * @author Chan Mrate Ko Ko
 *
 */
public class MyanmarSorting {

	public static void main(String[] args) {

		List<String> myanmarWordList = Arrays.asList("ရှမ်း", "ချင်း", "ကချင်", "ကရင်", "ရခိုင်", "ဗမာ", "ကယား",  "မွန်");
		Locale myanmar = new Locale("my", "MM", "");

		Collator coll = Collator.getInstance(myanmar);
		Collections.sort(myanmarWordList, coll);

		myanmarWordList.stream().forEach(word -> {
			System.out.print(word + "\t");
		});
	}
}
