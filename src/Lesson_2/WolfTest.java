package Lesson_2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = 'M';
        wolf.name = "Fenrir";
        wolf.weight = 25.7f;
        wolf.age = 10;
        wolf.color = "Gray";
        System.out.println("wolf name is " + wolf.name + " his parameters: " + "gender = " + wolf.gender +
                ", weight = " + wolf.weight + ", age = " + wolf.age + ", color = " + wolf.color);
        wolf.walk();
        wolf.howl();
        wolf.hunt();
        wolf.run();
        wolf.sit();
    }
}