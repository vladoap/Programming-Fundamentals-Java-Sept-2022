package ObjectsAndClasses.MoreExercise.P04TeamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Team> teamList = new ArrayList<>();

        int countTeamsToRegister = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= countTeamsToRegister ; i++) {
            String[] inputRegisterArr = scan.nextLine().split("-");
            String creator = inputRegisterArr[0];
            String nameTeam = inputRegisterArr[1];

            boolean isExist = false;
            for (Team team : teamList) {
                if (team.getName().equals(nameTeam)) {
                    System.out.printf("Team %s was already created!%n", team.getName());
                    isExist = true;
                    break;
                }
            }
            boolean isCreatedByUser = false;
            for (Team team : teamList) {
                if (team.getCreator().equals(creator)) {
                    System.out.printf("%s cannot create another team!%n", team.getCreator());
                    isCreatedByUser = true;
                    break;
                }
            }
            if (!isExist && !isCreatedByUser) {
                teamList.add(new Team(creator, nameTeam));
                System.out.printf("Team %s has been created by %s!%n", nameTeam, creator);
            }

        }

        String lineInput = scan.nextLine();

        while (!lineInput.equals("end of assignment")) {
            String[] lineInputArr = lineInput.split("->");
            String userToJoin = lineInputArr[0];
            String nameTeam = lineInputArr[1];
            Team teamToJoin = null;

            boolean isExist = false;
            for (Team team : teamList) {
                if (team.getName().equals(nameTeam)) {
                    isExist = true;
                    teamToJoin = team;
                    break;
                }
            }
            if (!isExist) {
                System.out.printf("Team %s does not exist!%n", nameTeam);
            }


            boolean isAlreadyMember = false;
            if (isExist) {

                for (Team team : teamList) {

                    for (String member : team.getMembers()) {
                        if (member.equals(userToJoin)) {
                            isAlreadyMember = true;
                            System.out.printf("Member %s cannot join team %s!%n", userToJoin, nameTeam);
                            break;
                        }
                    }
                    if (isAlreadyMember) {
                        break;
                    }
                    if (team.getCreator().equals(userToJoin)) {
                        System.out.printf("Member %s cannot join team %s!%n", userToJoin, nameTeam);
                        isAlreadyMember = true;
                        break;
                    }


                    }
                }


           boolean isTheUserACreator = false;
            for (Team team : teamList) {
                if (team.getCreator().equals(userToJoin)) {
                    isTheUserACreator = true;
                    break;
                }


            }
            if (isExist && !isTheUserACreator && !isAlreadyMember) {
                teamToJoin.setMember(userToJoin);
            }

            lineInput = scan.nextLine();
        }


        List<String> disbandList = new ArrayList<>();
        for (Team team : teamList) {
            if (!team.isContainMembers()) {
               disbandList.add(team.getName());
            }
        }

        // изтриване на тийм, ако не съдържа членове
        teamList.removeIf(e -> !e.isContainMembers());

        // соритране на disbandList по азбучен ред на имената на тиймовете
        Collections.sort(disbandList);

        // сортиране на всеки тийм по азбучен ред на имената на членовете
        for (Team team : teamList) {
            team.sortByNameOfMembers();
        }

        // сортиране на листа от тиймове по брой членове в низходящ ред
       // teamList.sort(Comparator.comparing(Team:: getCountMembers).reversed());
        teamList.sort(Comparator.comparing(Team::getName)
                .thenComparing(Comparator.comparingInt(Team::getCountMembers).reversed()));



        for (Team team : teamList) {
            System.out.print(team.toString());
        }
        System.out.println("Teams to disband:");

        for (String team : disbandList) {
            System.out.println(team);
        }


        }
    }


