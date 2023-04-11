// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        oldRobotBuilder robotBuilder = new oldRobotBuilder();

        RobotEngineer Engineer = new RobotEngineer(robotBuilder);
        Engineer.makeRobot();

        Robot myrobot= Engineer.getRobot();

        System.out.println(myrobot.getArms());

    }
}