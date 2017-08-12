package com.example.jock.runquickly.db;

import android.widget.ImageView;

import org.litepal.crud.DataSupport;

/**
 * Created by Jock on 2017/8/11.
 */

public class Card extends DataSupport {

    private int cardFigure;
    private String cardColor;
    private int cardValue;
    private ImageView cardImage;

    public int getCardFigure() {
        return cardFigure;
    }

    public void setCardFigure(int cardFigure) {
        this.cardFigure = cardFigure;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(String cardColor) {
        this.cardColor = cardColor;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public ImageView getCardImage() {
        return cardImage;
    }

    public void setCardImage(ImageView cardImage) {
        this.cardImage = cardImage;
    }

}
