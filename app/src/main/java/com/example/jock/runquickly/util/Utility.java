package com.example.jock.runquickly.util;

import com.example.jock.runquickly.db.Card;
import com.example.jock.runquickly.db.Player;

/**
 * Created by Jock on 2017/8/12.
 */

public class Utility {

    public static boolean initializeCards() {
        int[] cardsId = {3,4,5,6,7,8,9,10,11,12,13,1,2};
        String[] cardsColor = {"diamond","club","heart","spade"};
        for(int i=0 ;i<13 ;i++){
            for(int j=0 ;j<4 ;j++){
                Card card = new Card();
                card.setCardFigure(cardsId[i]);
                card.setCardColor(cardsColor[j]);
                card.setCardValue(4*i+j+1);
                card.save();
            }
        }
        return true;
    }

    public static boolean initializePvePlayers() {
        int[] playersId = {1,2,3,4};
        for (int i = 0; i < 4; i++) {
            Player player = new Player();
            player.setPlayerId(playersId[i]);
            player.setPlayerCards(null);
            player.setPlayerScore(0);
            player.save();
        }
        return true;
    }
}
