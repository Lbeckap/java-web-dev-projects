public class Main {
    public static void main(String[] args) {
        HouseCat houseCat = new HouseCat("Claire", 4.5);
        System.out.println(houseCat.isHungry());
        System.out.println(houseCat.isTired());
        houseCat.eat();
        System.out.println(houseCat.noise());
        System.out.println(houseCat.isHungry());
        System.out.println(houseCat.isTired());



    }
}
