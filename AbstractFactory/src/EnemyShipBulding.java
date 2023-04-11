public  abstract class EnemyShipBulding {

    protected abstract EnemShip makeEnemyShip(String shipType);

    public EnemShip orderTheShip(String shipType){

        EnemShip newEnemyShip =makeEnemyShip(shipType);

        newEnemyShip.followHeroShip();
        newEnemyShip.displayEnemyShip();
        newEnemyShip.enemyShipShoots();
        return newEnemyShip;
    }
}
