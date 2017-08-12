package com.example.jock.runquickly.db;

import org.litepal.crud.DataSupport;

import java.util.List;

/**
 * Created by Jock on 2017/8/11.
 */

public class Player extends DataSupport {

    private int playerId;
    private List<Card> playerCards;
    private int playerScore;

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public List<Card> getPlayerCards() {
        return playerCards;
    }

    public void setPlayerCards(List<Card> playerCards) {
        this.playerCards = playerCards;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
}
