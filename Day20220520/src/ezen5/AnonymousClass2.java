package ezen5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AnonymousClass2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("robot");
		list.add("apple");
		list.add("toy");
		
		Comparator<String> cmp = new Comparator<String>() {
			
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		};
		Collections.sort(list, cmp);
		System.out.println(list);
	}

}
