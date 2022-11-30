package associativeArrays.moreExercise;



import java.util.*;


public class P02Judge {
      static class Person {
        private String name;
        private int points;

        Person(String name, int points) {
            this.name = name;
            this.points = points;

        }

        String getName() {
            return this.name;
        }

        int getPoints() {
            return this.points;
        }

        void setPoints(int points) {
            this.points = points;
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        Map<String, Integer> standingMap = new HashMap<>();
        Map<String, List<Person>> contestMap = new LinkedHashMap<>();
        while (!lineInput.equals("no more time")) {
              String username = lineInput.split(" -> ")[0];
              String contest = lineInput.split(" -> ")[1];
              int points = Integer.parseInt(lineInput.split(" -> ")[2]);

              if (!contestMap.containsKey(contest)) {
                  contestMap.put(contest, new ArrayList<>());
                  contestMap.get(contest).add(new Person(username, points));
              } else {
                  Person existingPerson = null;
                  for (Person person : contestMap.get(contest)) {
                      if (person.getName().equals(username)) {
                          existingPerson = person;
                          int currentPoints = person.getPoints();
                          if (currentPoints < points) {
                              existingPerson.setPoints(points);
                          }
                          break;
                      }
                  }
                  if (existingPerson == null) {
                      contestMap.get(contest).add(new Person(username, points));
                  }
              }



            lineInput = scan.nextLine();
        }

        for (Map.Entry<String, List<Person>> entry : contestMap.entrySet()) {
            for (Person person : entry.getValue()) {
                if (!standingMap.containsKey(person.getName())) {
                    standingMap.put(person.getName(), person.getPoints());
                } else {
                    int currentPoints = standingMap.get(person.getName());
                    standingMap.put(person.getName(), person.getPoints() + currentPoints);
                }
            }

        }
        contestMap.entrySet().forEach(entry ->
                entry.getValue().sort(Comparator.comparingInt(Person::getPoints).reversed()
                        .thenComparing(Comparator.comparing(Person::getName))));

        contestMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());
            entry.getValue().forEach(person -> {
                System.out.printf("%d. %s <::> %d%n",entry.getValue().indexOf(person) + 1, person.getName(), person.getPoints());
            });
        });

        System.out.println("Individual standings:");
//               standingMap.entrySet().stream()
//                        .sorted(Collections.reverseOrder(Map.Entry.<String,Integer>comparingByValue())
//                                .thenComparing(Map.Entry.comparingByKey()))
//                                .forEach(entry -> {
//                                   int i = 0;
//                                    System.out.printf("%d. %s -> %d%n", i, entry.getKey(), entry.getValue());
//
//                                }
//                                );


        List<Map.Entry<String,Integer>> standingList = new ArrayList<>(standingMap.entrySet());
        standingList.sort(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));

        for (Map.Entry<String,Integer> element : standingList) {
            System.out.printf("%d. %s -> %d%n", standingList.indexOf(element) + 1, element.getKey(), element.getValue());
        }


    }
}
