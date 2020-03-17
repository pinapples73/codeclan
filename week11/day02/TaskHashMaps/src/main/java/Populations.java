import java.util.HashMap;

public class Populations {

    public static void main(String[] args) {
        HashMap<String, Integer> countryPopulations = new HashMap<String, Integer>();

        countryPopulations.put("UK", 64100000);
        countryPopulations.put("Germany", 80620000);
        countryPopulations.put("France", 66030000);
        countryPopulations.put("Japan", 127300000);

        System.out.println("Japan has a population of: " + countryPopulations.get("Japan"));
        System.out.println("Germany has a population of: " + countryPopulations.get("Germany"));

        System.out.println("The values of the HashMap are :" + countryPopulations.values());

        System.out.println("The keys of the HashMap are: " + countryPopulations.keySet());
    }
}
