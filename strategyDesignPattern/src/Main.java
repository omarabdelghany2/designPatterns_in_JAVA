// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       /* Dog fido =new Dog();

        fido .setName("fido");
        fido .setWeight(15);
        System.out.println(fido.getWeight());
        System.out.println(fido.getSound());
        fido.setSound("kark");
        System.out.println(fido.getSound());
*/

        Animal SPARKY = new Dog();
        Animal Tweety = new Bird();
        System.out.println("bird :"+Tweety.tryToFly());
        Tweety.setFlyingType(new CantFly());
        System.out.println("bird :"+Tweety.tryToFly());
        System.out.println("Dog:"+SPARKY.tryToFly());

        Animal x = new Animal();

    }
}