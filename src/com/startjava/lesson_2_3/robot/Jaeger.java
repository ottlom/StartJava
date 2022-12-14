package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String mark;
    private int armor;
    private int strength;
    private int speed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setArmor(int armor) {
        if (armor < 0) {
            System.out.println("броня не может быть меньше 0");
        } else {
            this.armor = armor;
        }
    }

    public Jaeger() {}

    public Jaeger(String mark, int armor, int strength, int speed) {
        this.mark = mark;
        this.armor = armor;
        this.strength = strength;
        this.speed = speed;
    }

    public int getArmor() {
        return armor;
    }

    public void setStrength(int strength) {
        if (strength < 0) {
            System.out.println("сила не может быть меньше 0");
        } else {
            this.strength = strength;
        }
    }

    public int getStrength() {
        return strength;
    }

    public void setSpeed(int speed) {
        if (speed < 1) {
            System.out.println("скорость не может быть отрицательной или равна нулю");
        } else {
            this.speed = speed;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        if (speed < 1) {
            System.out.println("робот не может передвигаться");
        }else {
            System.out.println("робот " + mark + " двигается со скоростью " + speed);
        }
    }

    public void attack() {
        System.out.println("робот " + mark + " атакует противника");
    }
}
