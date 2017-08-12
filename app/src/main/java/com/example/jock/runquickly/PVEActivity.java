package com.example.jock.runquickly;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PVEActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pve);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        String cardsString = prefs.getString("cards", null);
    }

    public void deal_cards (){
        ArrayList <Cards> number = new ArrayList<Cards> ();
        player[0] = new Players ();
        player[1] = new Players ();
        player[2] = new Players ();
        player[3] = new Players ();
        for(int i=0 ;i<52 ;i++){
            number.add(list[i]);
        }
        Random random = new Random();
        int count = 1;
        while(number.size()>0){
            int j = random.nextInt(number.size());
            if(count == 1){
                player[0].player_cards.add(number.remove(j));
            }
            else if(count == 2){
                player[1].player_cards.add(number.remove(j));
            }
            else if(count == 3){
                player[2].player_cards.add(number.remove(j));
            }
            else if(count == 4){
                player[3].player_cards.add(number.remove(j));
                count = 0;
            }
            count++;
        }
    }
}
