// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /* i have created first instance and give it name ahmed
        * then i have gone to print secondinstance name i found it also ahmed so they are the insatnce so its asingleton design*/
        Singelton firstInstance = Singelton.getInstance();
        firstInstance.setName("ahmed");

        Singelton secondInstance = Singelton.getInstance();

        System.out.println(firstInstance.getName());
        System.out.println(secondInstance.getName());

    }
}