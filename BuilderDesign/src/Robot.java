public class Robot implements RobotPlan{


    private String head;
    private String arms;
    private String legs;
    private String torso;
    public String getHead() {
        return head;
    }

    public String getArms() {
        return arms;
    }

    public String getLegs() {
        return legs;
    }

    public String getTorso() {
        return torso;
    }


    @Override
    public void setRobotHead(String head) {
        this.head=head;
    }

    @Override
    public void setRobotTorso(String torso) {
            this.torso=torso;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs=legs;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms=arms;
    }
}
