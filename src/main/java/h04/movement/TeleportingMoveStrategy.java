package h04.movement;

import fopbot.Robot;

public class TeleportMoveStrategy implements MoveStrategy{

    @Override
    public void move(Robot robot, int dx, int dy) {
        robot.setField(robot.getX() + dx, robot.getY() + dy);
    }
}
