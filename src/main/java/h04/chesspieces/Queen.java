package h04.chesspieces;

import fopbot.Robot;
import h04.movement.MoveStrategy;
import h04.template.ChessUtils;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Queen extends Robot {
    private final Team team;

    public Queen(final int x, final int y, final Team team) {
        super(x, y, team == Team.WHITE ? Families.QUEEN_WHITE : Families.QUEEN_BLACK);
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void move(final int dx, final int dy, final MoveStrategy strategy){
        strategy.move(this, dx, dy);
    }

    public Point[] getPossibleMoveFields(){
        List<Point> possibleMoves = new ArrayList<>();
        for (Point move : getOrthogonalMoves()){
            possibleMoves.add(move);
        }
        for (Point move : getDiagonalMoves()){
            possibleMoves.add(move);
        }
        return possibleMoves.toArray(new Point[0]);
    }

    public Point[] getOrthogonalMoves() {
        // Implementation of getOrthogonalMoves
        return new Point[0];
    }

    public Point[] getDiagonalMoves() {
        // Implementation of getDiagonalMoves
        return new Point[0];
    }
}
