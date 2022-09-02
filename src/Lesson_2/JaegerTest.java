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
        System.out.println("броня робота " + jaeger1.getMark() + " равна " + jaeger1.getArmor() +
                " сила робота равна " + jaeger1.getStrength());
    }
}
