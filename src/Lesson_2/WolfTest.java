package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender('M');
        wolf.setName("Fenrir");
        wolf.setWeight(25.7f);
        wolf.setAge(6);
        wolf.setColor("Gray");
        System.out.println("wolf name is " + wolf.getName() + " his parameters: " + "gender = " + wolf.getGender() +
                ", weight = " + wolf.getWeight() + ", age = " + wolf.getAge() + ", color = " + wolf.getColor());
        wolf.walk();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}