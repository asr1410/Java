import java.util.*;

class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> l : paths)
            set.add(l.get(1));
        for (List<String> l : paths)
            set.remove(l.get(0));
        return set.iterator().next();
    }

    public static void main(String[] args) {
        // List<List<String>> paths = new ArrayList<List<String>>();
        // paths = {{'B',"C"},{'D','B'},{'C','A'}};
    }
}