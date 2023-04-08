public  abstract class EnemyShip {

    private String name;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    private int damage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void followHeroShop(){
        System.out.println(getName()+"is following the hero");
    }

    public void displayEnemyShip(){
        System.out.println(getName()+"is on the screen");
    }
    public void enemyShipShoots(){
        System.out.println(getName()+"attacks and does "+damage+" damage to hero");
    }



}
