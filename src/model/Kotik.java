package model;

public class Kotik {
    private int prettiness;
    private int weight;
    private String name;
    private String meow;
    private int satiety;

    public Kotik() {
    }

    public Kotik(int prettiness, int weight, String name, String meow, int satiety) {
        this.prettiness = prettiness;
        this.weight = weight;
        this.name = name;
        this.meow = meow;
        this.satiety = satiety;
    }
    public void setKotik(int prettiness, int weight, String name, String meow, int satiety){
        this.prettiness = prettiness;
        this.weight = weight;
        this.name=name;
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

    public boolean sleep(){
        if (satiety > 0){
            System.out.println(this.getName() + " is sleeping");
            satiety += 30;
            return true;
        }else{
            return false;
        }
    }

    public boolean play(){
        if (satiety > 0){
            System.out.println(this.getName()+ " is playing");
            satiety -= 20;
            return true;
        }else{
            return false;
        }
    }

    public boolean sayMeow(){
        if (satiety > 0){
            System.out.println(this.getName()+ " is sleeping");
            satiety -= 10;
            return true;
        }else{
            return false;
        }
    }

}
