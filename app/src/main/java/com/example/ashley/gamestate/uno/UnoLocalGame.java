package com.example.ashley.gamestate.uno;

import com.example.ashley.gamestate.game.GamePlayer;
import com.example.ashley.gamestate.game.LocalGame;
import com.example.ashley.gamestate.game.actionMsg.GameAction;

public class UnoLocalGame extends LocalGame{

    // the number of moves that have been played so far, used to
    // determine whether the game is over
    protected int moveCount;

    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {
        return false;
    }


    @Override
    public void sendAction(GameAction action) {

    }
}
