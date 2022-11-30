package associativeArrays.exercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        Map<String, List<String>> teamsMap = new LinkedHashMap<>();
        while (!lineInput.equals("Lumpawaroo")) {
            if (lineInput.contains("|")) {
                String team = lineInput.split(" \\| ")[0];
                String user = lineInput.split(" \\| ")[1];
                boolean isContainCurrentUser = teamsMap.values().stream().anyMatch(e -> e.contains(user));
                if (!teamsMap.containsKey(team) && !isContainCurrentUser) {
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(user);
                } else if (!isContainCurrentUser) {
                    teamsMap.get(team).add(user);
                }

            } else if (lineInput.contains("->")) {
                String team = lineInput.split(" -> ")[1];
                String user = lineInput.split(" -> ")[0];
                boolean isContainCurrentUser = teamsMap.values().stream().anyMatch(e -> e.contains(user));
                if (!teamsMap.containsKey(team) && !isContainCurrentUser) {
                    teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(user);
                    System.out.printf("%s joins the %s side!%n", user, team);
                } else if (!isContainCurrentUser && teamsMap.containsKey(team)) {
                    teamsMap.get(team).add(user);
                    System.out.printf("%s joins the %s side!%n", user, team);
                } else if (isContainCurrentUser && teamsMap.containsKey(team)){
                   teamsMap.values().forEach(entry -> entry.remove(user));
                   teamsMap.put(team, new ArrayList<>());
                    teamsMap.get(team).add(user);
                    System.out.printf("%s joins the %s side!%n", user, team);
                }

            }
          lineInput = scan.nextLine();
        }

        teamsMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                        .forEach(entry -> {
                            System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                            entry.getValue().forEach(user -> System.out.println("! " + user));
                        });

    }
}
