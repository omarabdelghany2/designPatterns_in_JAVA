public class Singelton {

    private String name;
    private static Singelton firstInstance = null;
    public Singelton (){

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static Singelton getInstance(){
     if(firstInstance==null)
         firstInstance = new Singelton();

     return firstInstance;
    }
}
