package model;

import java.util.Objects;
import java.util.Random;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety;

    public static int count;

    public Kotik() {
        count++;
    }

    public Kotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
        count++;
    }

    public void setKotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getMeow() {
        return meow;
    }

    public static void getCount(){
        System.out.println("Quantity of object is " + count);
    }

    public boolean sleep() {
        if (satiety > 0) {
            satiety -= 5;
            System.out.println(this.name + " is sleeping. Satiety is " + this.satiety);
            return true;
        } else {
            return false;
        }
    }

    public boolean play() {
        if (satiety > 0) {
            satiety -= 20;
            System.out.println(this.name + " is playing. Satiety is " + this.satiety);
            return true;
        } else {
            return false;
        }
    }

    public boolean sayMeow() {
        if (satiety > 0) {
            satiety -= 10;
            System.out.println(this.name + " is saying " + this.meow + ". Satiety is " + this.satiety );
            return true;
        } else {
            return false;
        }
    }

    public boolean chaseMouse() {
        if (satiety > 0) {
            satiety -= 50;
            System.out.println(this.name + " is chasing a mouse. Satiety is " + this.satiety );
            return true;
        } else {
            return false;
        }
    }

    public boolean wash() {
        if (satiety > 0) {
            satiety -= 15;
            System.out.println(this.name + " is washing yourself. Satiety is " + this.satiety);
            return true;
        } else {
            return false;
        }
    }

    public void eat(int satiety) {
        this.satiety += satiety;
        System.out.println(this.name + " is eating. Satiety is " + this.satiety);
    }

    public void eat(int satiety, String nameFood) {
        this.satiety += satiety;
        System.out.println(this.name + " is eating " + nameFood + ". Satiety is " + this.satiety);
    }

    public void eat() {
        eat(100, "Whiskas");
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
           // System.out.println(i);
            if (this.satiety > 0) {
                Random random = new Random();
                int r = random.nextInt(5) + 1;
                switch (r) {
                    case 1:
                        sleep();
                        break;
                    case 2:
                        play();
                        break;
                    case 3:
                        sayMeow();
                        break;
                    case 4:
                        chaseMouse();
                        break;
                    case 5:
                        wash();
                        break;
                }
            } else {
                System.out.print("Котику пора покушать! ");
                eat();
            }
        }
    }

    @Override
    public boolean equals(Object object) {
        Kotik otherKotik = (Kotik)object;
        return this.meow.equals(otherKotik.meow);
    }

}
