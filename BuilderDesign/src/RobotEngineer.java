public class RobotEngineer {

    private oldRobotBuilder robotBuilder = null;

    public RobotEngineer(oldRobotBuilder robotBuilder){

        this.robotBuilder=robotBuilder;
    }
    public void makeRobot(){
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotLegs();
    }

    public Robot getRobot(){
        return (robotBuilder.getRobot());
    }

}
