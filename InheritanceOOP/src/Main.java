// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Dog fido =new Dog();

        fido .setName("fido");
        fido .setWeight(15);
        System.out.println(fido.getWeight());
        System.out.println(fido.getSound());
        fido.setSound("kark");
        System.out.println(fido.getSound());


    }
}