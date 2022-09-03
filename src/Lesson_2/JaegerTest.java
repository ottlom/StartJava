package Lesson_2;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Coyote Tango",4,7,5);
        Jaeger jaeger2 = new Jaeger();
        jaeger2.setMark("Gipsy Danger");
        jaeger2.setArmor(6);
        jaeger2.setStrength(8);
        jaeger2.setSpeed(0);
        jaeger2.move();
        jaeger1.attack();
        jaeger2.setSpeed(2);
        jaeger2.move();
        jaeger2.attack();
        System.out.println("Характеристики робота " + jaeger1.getMark() + ": сила - " + jaeger1.getStrength() +
                " скорость - " + jaeger1.getSpeed() + " броня - " + jaeger1.getArmor());
    }
}
