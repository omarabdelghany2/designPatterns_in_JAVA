public class oldRobotBuilder implements RobotBuilder{

    private Robot robot = new Robot();
    @Override
    public void buildRobotHead() {
        robot.setRobotHead("tin");
    }

    @Override
    public void buildRobotArms() {
    robot.setRobotArms("blowTorch");
    }

    @Override
    public void buildRobotLegs() {
    robot.setRobotLegs("rollar skates");
    }

    @Override
    public void buildRobotTorso() {
    robot.setRobotTorso("tin torso");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
