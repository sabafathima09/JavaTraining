package com.lumen.map;
 	
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StateCities {
	public static void main(String[] args) {

		List<String> karnatakaCity = new ArrayList<>();
		karnatakaCity.add("Banglore");
		karnatakaCity.add("Mysore");
		List<String> rajasthanCity = new ArrayList<String>();
		rajasthanCity.add("Jaipur");
		rajasthanCity.add("Udaipur");
		List<String> madhyaPradeshCity = new ArrayList<String>();
		madhyaPradeshCity.add("Jhabalpur");
		madhyaPradeshCity.add("Bhopal");
		Map<String, List<String>> hasMap = new HashMap<String, List<String>>();

		hasMap.put("Karnataka", karnatakaCity);

		hasMap.put("rajasthan", rajasthanCity);

		hasMap.put("MadhyaPradesh", madhyaPradeshCity);

		hasMap.forEach((state, cities) -> {
			System.out.println("Cities in " + state + ":");
			cities.forEach(city -> System.out.println(city));
		});
	}
}
