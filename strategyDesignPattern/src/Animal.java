public class Animal {

    private String name ;
    private int weight;
    private String sound ;

    private Flys flyingType;

    public void setFlyingType(Flys newFlyingType) {
        flyingType = newFlyingType;
    }
    public String tryToFly(){
        return (flyingType.fly());
    }

    public void setName (String newName){
        name=newName;
    }
    public String getName (){
        return (name);
    }

    public void setWeight (int newWeight){
        weight=newWeight;
    }
    public int getWeight(){

        return weight;
    }

    public void setSound(String newSound){
        sound=newSound;
    }
    public String getSound(){
        return sound;
    }



}
