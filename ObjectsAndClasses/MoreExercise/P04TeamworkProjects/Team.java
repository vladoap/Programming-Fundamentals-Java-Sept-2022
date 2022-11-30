package ObjectsAndClasses.MoreExercise.P04TeamworkProjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
   private String creator;
   private String name;
   private List<String> members;

   public Team(String creator, String name) {
      this.creator = creator;
      this.name = name;
      this.members = new ArrayList<>();

   }

   public String getName() {
      return this.name;
   }
   public String getNameChar() {
      char currentSymbol = this.name.charAt(0);
      return Character.toString(currentSymbol);
   }

   public String getCreator() {
      return this.creator;
   }

   public List<String> getMembers() {
      return members;
   }

   public void setMember(String user) {
      members.add(user);
   }

   public boolean isContainMembers() {
      return members.size() > 0;
   }

   public void sortByNameOfMembers() {
      Collections.sort(this.members);
   }

   public int getCountMembers() {
      return this.members.size();
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append(this.name);
      sb.append(System.lineSeparator());
      sb.append("- " + this.creator);
      sb.append(System.lineSeparator());
      for (String name : members) {
         sb.append("-- " + name);
         sb.append(System.lineSeparator());
      }

       return sb.toString();
   }
}
