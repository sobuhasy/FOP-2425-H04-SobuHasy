package h04.chesspieces;

import fopbot.Robot;
import h04.movement.MoveStrategy;
import h04.template.ChessUtils;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class King extends Robot implements ChessPiece {

    private final Team team;

    public King(final int x, final int y, final Team team) {
        super(x, y, team == Team.WHITE ? Families.KING_WHITE : Families.KING_BLACK);
        this.team = team;
    }

    @Override
    public Team getTeam() {
        return team;
    }

    //TODO H4.4
    public void move(final int dx, final int dy, final MoveStrategy strategy) {
        strategy.move(this, dx, dy);
    }

    @Override
    public Point[] getPossibleMoveFields() {
        List<Point> possibleMoves = new ArrayList<>();
        int[][] directions = {
            {1, 0},
            {1, 1},
            {0, 1},
            {-1, 1},
            {-1, 0},
            {-1, -1},
            {0, -1},
            {1, -1}
        };

        for (int[] direction : directions) {
            int newX = getX() + direction[0];
            int newY = getY() + direction[1];
            if (ChessUtils.getTeamAt(newX, newY) == null || ChessUtils.getTeamAt(newX, newY) != getTeam()) {
                possibleMoves.add(new Point(newX, newY));
            }
        }
        return possibleMoves.toArray(new Point[0]);
    }
}

