package associativeArrays.exercise;

import java.util.*;
import java.util.Map;
public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
       Map<String, List<String>> companiesMap = new LinkedHashMap<>();

        while (!lineInput.equals("End")) {
        String company = lineInput.split(" -> ")[0];
        String id = lineInput.split(" -> ")[1];

        companiesMap.putIfAbsent(company, new ArrayList<>());
        if (!companiesMap.get(company).contains(id)) {
            companiesMap.get(company).add(id);
        }


            lineInput = scan.nextLine();
        }

       companiesMap.entrySet().forEach(entry -> {
           System.out.println(entry.getKey());
           for (String id : entry.getValue()) {
               System.out.println("-- " + id);
           }
       });
    }
}
