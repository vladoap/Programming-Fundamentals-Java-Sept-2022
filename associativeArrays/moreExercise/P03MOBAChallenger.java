package associativeArrays.moreExercise;

import javax.swing.text.Position;
import java.util.*;

public class P03MOBAChallenger {
    static class Position {
        private String position;
        private int skill;

        Position (String position, int skill) {
            this.position = position;
            this.skill = skill;

        }

        String getPosition() {
            return this.position;
        }

        int getSkill() {
            return this.skill;
        }

        void setSkill(int skill) {
            this.skill = skill;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineInput = scan.nextLine();
        Map<String, List<Position>> playersMap = new HashMap<>();
        Map<String, Integer> totalPointsMap = new HashMap<>();
        while (!lineInput.equals("Season end")) {
            if (lineInput.contains("->")) {
                String playerName = lineInput.split(" -> ")[0];
                String position = lineInput.split(" -> ")[1];
                int skill = Integer.parseInt(lineInput.split(" -> ")[2]);



                if (!playersMap.containsKey(playerName)) {
                    playersMap.put(playerName, new ArrayList<>());
                    playersMap.get(playerName).add(new Position(position, skill));
                    totalPointsMap.put(playerName, skill);
                } else if (playersMap.get(playerName).stream().anyMatch(e -> e.getPosition().equals(position))) {
                    Position existingPosition = null;
                    for (Position pos : playersMap.get(playerName)) {
                        if (pos.getPosition().equals(position)) {
                            existingPosition = pos;
                            break;
                        }
                    }
                    if (existingPosition != null) {
                        if (existingPosition.getSkill() < skill) {
                            int oldSkillPoints = existingPosition.getSkill();
                            existingPosition.setSkill(skill);
                            int oldTotalSkillPoints = totalPointsMap.get(playerName);
                            totalPointsMap.put(playerName, oldTotalSkillPoints + (skill - oldSkillPoints));
                        }
                    }
                } else {
                    playersMap.get(playerName).add(new Position(position, skill));
                    int oldSkillPoints = totalPointsMap.get(playerName);
                    totalPointsMap.put(playerName, oldSkillPoints + skill);
                }


            } else if (lineInput.contains("vs")) {
                String player1 = lineInput.split(" vs ")[0];
                String player2 = lineInput.split(" vs ")[1];
                if (playersMap.containsKey(player1) && playersMap.containsKey(player2)) {
                    boolean isMatchPosition = false;

                    for (Position posPlayer1 : playersMap.get(player1)) {
                        String positionName1 = posPlayer1.getPosition();
                        for (Position posPlayer2 : playersMap.get(player2)) {
                            String positionName2 = posPlayer2.getPosition();
                            if (positionName1.equals(positionName2)) {
                                isMatchPosition = true;
                                break;
                            }
                        }
                        if (isMatchPosition) {
                            break;
                        }
                    }

                    if (isMatchPosition) {
                        if (totalPointsMap.get(player1) > totalPointsMap.get(player2)) {
                            playersMap.remove(player2);
                            totalPointsMap.remove(player2);
                        } else if (totalPointsMap.get(player1) < totalPointsMap.get(player2)) {
                            playersMap.remove(player1);
                            totalPointsMap.remove(player1);
                        }

                    }

                }

            }

            lineInput = scan.nextLine();
        }

        playersMap.entrySet().forEach(entry -> {
                    entry.getValue().sort(Comparator.comparingInt(Position::getSkill).reversed()
                            .thenComparing(Comparator.comparing(Position::getPosition)));
        });


        totalPointsMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.printf("%s: %d skill%n", entry.getKey(), entry.getValue());
                  playersMap.get(entry.getKey())
                          .forEach(position -> {
                              System.out.printf("- %s <::> %d%n", position.getPosition(), position.getSkill());
                          });


                });

    }
    }

