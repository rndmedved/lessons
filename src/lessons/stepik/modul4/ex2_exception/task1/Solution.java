package lessons.stepik.modul4.ex2_exception.task1;

public class Solution {
    public static void main(String[] args) {



    }
    public static void RobotMove(RobotConnectionManager rcm, int toX, int toY){
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = rcm.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 4; //Выйти из циела при успешном подключении и пермещении робота в заданную точку.
            } catch (RobotConnectionException e) {
                if (i == 2) throw e;
            } catch (Exception e) {
                       //тут непонятно, почему ругается intellige
            }
        }
    }
}
