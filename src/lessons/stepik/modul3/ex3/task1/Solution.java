package lessons.stepik.modul3.ex3.task1;

public class Solution {
    public static void main(String[] args) {
        moveRobot(new Robot(), 0, 3);
    }


    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() != toX || robot.getY()!=toY){
            if(robot.getX() < toX){
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnRight();
                }
                while (robot.getX() != toX){
                    robot.stepForward();
                }
            }
            if(robot.getX() > toX){
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnRight();
                }
                while (robot.getX() != toX){
                    robot.stepForward();
                }
            }
            if(robot.getY() < toY){
                while (robot.getDirection() != Direction.UP){
                    robot.turnRight();
                }
                while (robot.getY() != toY){
                    robot.stepForward();
                }
            }
            if(robot.getY() > toY){
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnRight();
                }
                while (robot.getY() != toY){
                    robot.stepForward();

                }
            }
        }
        System.out.println("позиция робота по X координте - " +robot.getX());
        System.out.println("позиция робота по Y координте - " + robot.getY());
    }

}
