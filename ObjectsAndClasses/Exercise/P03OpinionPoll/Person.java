package ObjectsAndClasses.Exercise.P03OpinionPoll;

public class Person {
    private String name;
    private int age;

   public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

     public int getAge () {
        return this.age;
     }

     @Override
    public String toString () {
       return this.name + " - " + this.age;
     }
}
