import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory=new EnemyShipFactory();
        System.out.println("enter the Type of enemyShip u want to make form factory");
        Scanner userInput = new Scanner(System.in);
        userInput.hasNextLine();
        String typOfShip= userInput.nextLine();
        EnemyShip enemyShip;
        enemyShip=shipFactory.makeEnemyShip(typOfShip);
        doStuffEnemy(enemyShip);


        }

        public static void doStuffEnemy(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShop();
        enemyShip.enemyShipShoots();
    }
}