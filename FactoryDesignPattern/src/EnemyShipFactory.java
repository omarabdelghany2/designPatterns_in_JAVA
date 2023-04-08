public class EnemyShipFactory {
    public EnemyShip makeEnemyShip(String shipType){

        EnemyShip newShip;

        switch (shipType){
            case "U": return (new UFOEnemyShip());
            case "R": return (new RocketEnemyDamage());
            case "B": return (new BigUFOEnemyShip());
            default: return null;
        }

    }
}
