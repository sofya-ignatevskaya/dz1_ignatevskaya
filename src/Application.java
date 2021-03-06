import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kotik1 = new Kotik(1, 2, "Tom", "Meooow",100);
        Kotik kotik2 = new Kotik();
        kotik2.setKotik(2, 3, "Murka", "Mur-Mur", 80);
        kotik1.liveAnotherDay();
        System.out.println("\nName is " + kotik1.getName() + ". Weight is " + kotik1.getWeight() + "\n");
        System.out.println(kotik1.equals(kotik2));
        System.out.println();
        kotik2.eat(30);
        System.out.println();
        Kotik.getCount();
    }

}
