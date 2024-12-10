package exercise;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int element) {

        List<Home> sortedHomes = new ArrayList<>(apartments);
        int index = element < apartments.size() || element == apartments.size() ? element : apartments.size();

        sortedHomes.sort(Comparator.comparing(Home::getArea));

        return sortedHomes.subList(0, index).stream()
                .map(home -> home.toString()).collect(Collectors.toList());
    }
}
// END
