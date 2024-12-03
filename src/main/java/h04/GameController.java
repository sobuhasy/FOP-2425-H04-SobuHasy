package h04;

import h04.template.ChessUtils;
import h04.template.GameControllerTemplate;
import h04.chesspieces.King;

public class GameController extends GameControllerTemplate {
    public GameController() {
        super();
        setup();
    }

    @Override
    public boolean checkWinCondition() {
        //TODO H4.1
        // calls the king
        final King[] kings = ChessUtils.getKings();
        // checks if the king is in checkmate
        for (King king : kings){
            if(king.isTurnedOff()){
                return true;
            }
        }
        // returns false if the king is not in checkmate
        return false;
    }
}
