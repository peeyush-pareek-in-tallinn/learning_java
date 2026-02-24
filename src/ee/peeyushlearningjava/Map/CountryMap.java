package ee.peeyushlearningjava.Map;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class CountryMap {

    public static void main(String[] args) {

        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("Bharat", "Nayi Dilli");
        countryMap.put("Eesti", "Tallinn");
        countryMap.put("Bhutan", "Timphu");
        countryMap.put("Nepal", "Kathmandu");
        countryMap.put("Sri Lanka", "Columbo");

        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the Country: ");
        String userCountry = input.next();

        System.out.printf("Capital of %s is: %s", userCountry, countryMap.get(userCountry));
    }
}
