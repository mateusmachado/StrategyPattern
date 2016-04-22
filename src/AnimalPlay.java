public class AnimalPlay {
    public static void main(String[] args){
        Animal spark = new Dog();
        Animal pidgeot = new Bird();

        System.out.println("Dog: " + spark.tryToFly());
        System.out.println("Bird " + pidgeot.tryToFly());

        spark.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + spark.tryToFly());
    }
}
