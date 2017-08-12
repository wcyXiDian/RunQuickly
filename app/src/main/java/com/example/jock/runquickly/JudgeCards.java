package com.example.jock.runquickly;

/**
 * Created by Jock on 2017/8/12.
 */

public class JudgeCards {

    public boolean is_one_card (ArrayList<Cards> latter){
        boolean flag = false;
        if(latter != null && latter.size() == 1) {
            flag = true;
        }
        return flag;
    }

    public boolean is_two_card (ArrayList<Cards> latter){
        boolean flag = false;
        if(latter != null && latter.size() == 2){
            if(latter.get(0).get_figure()==latter.get(1).get_figure()){
                flag = true;
            }
        }
        return flag;
    }

    public boolean is_three_card (ArrayList<Cards> latter){
        boolean flag = false;
        if(latter != null && latter.size() == 3) {
            boolean figure1_2 = latter.get(0).get_figure()==latter.get(1).get_figure() ? true:false;
            boolean figure1_3 = latter.get(0).get_figure()==latter.get(2).get_figure() ? true:false;
            if(figure1_2 && figure1_3)
                flag = true;
        }
        return flag;
    }

    public boolean is_four_card (ArrayList<Cards> latter) {
        boolean flag = false;
        if(latter != null && latter.size() == 4) {
            boolean figure1_2 = latter.get(0).get_figure()==latter.get(1).get_figure() ? true:false;
            boolean figure1_3 = latter.get(0).get_figure()==latter.get(2).get_figure() ? true:false;
            boolean figure1_4 = latter.get(0).get_figure()==latter.get(3).get_figure() ? true:false;
            if(figure1_2 && figure1_3 && figure1_4)
                flag = true;
        }
        return flag;
    }

    public boolean valueof_five_card (ArrayList<Cards> latter) {
        boolean flag = false;
        if(latter != null && latter.size() == 5) {
            flag = true;
        }
        return flag;
    }
    public int kind_of_five (ArrayList<Cards> latter) {
        int[] same = {0,0};
        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                if(latter.get(i).get_figure()==latter.get(j).get_figure()){
                    same[i]++;
                }
            }
        }
        if((same[1] == 2 && same[2] == 3) || (same[1] == 3 && same[2] == 2))
            return 3;
        else if((same[1] == 1 && same[2] == 4) || (same[1] == 4 && same[2] == 1)) {
            return 4;
        }
        else {
            boolean colour_flag = false;
            boolean colour_flag1 = latter.get(0).get_colour().equals(latter.get(1).get_colour());
            boolean colour_flag2 = latter.get(0).get_colour().equals(latter.get(2).get_colour());
            boolean colour_flag3 = latter.get(0).get_colour().equals(latter.get(3).get_colour());
            boolean colour_flag4 = latter.get(0).get_colour().equals(latter.get(4).get_colour());
            if(colour_flag1 && colour_flag2 && colour_flag3 && colour_flag4)
                colour_flag = true;
            for(int i=1; i<5; i++){
                int difference = latter.get(0).get_figure()-latter.get(i).get_figure();
                Math.abs(difference);
                if(difference == 0 || difference > 4) {
                    if(colour_flag)
                        return 2;
                    else return 0;
                }
            }
            if(colour_flag)
                return 5;
            else return 1;
        }
    }

    public int get_value (ArrayList<Cards> latter) {
        int max_value = 0;
        int i = 0;
        while(latter!=null && latter.get(i) != null) {
            if(latter.get(i).get_value() > max_value)
                max_value = latter.get(i).get_value();
            i++;
        }
        return max_value;
    }
    public int get_value_of_5 (ArrayList<Cards> latter, int kind) {
        int max_value = 0;
        if(kind == 3 || kind == 4){
            ArrayList<Cards> flag_1 = new ArrayList<Cards> ();
            ArrayList<Cards> flag_2 = new ArrayList<Cards> ();
            flag_1.add(latter.get(0));
            for(int i=1; i<5; i++) {
                if(latter.get(0).equals(latter.get(i)))
                    flag_1.add(latter.get(i));
                else flag_2.add(latter.get(i));
            }
            if(flag_1.size() > flag_2.size())
                max_value = get_value(flag_1) + kind * 52;
            else max_value = get_value(flag_2) + kind * 52;
        }
        else {
            max_value = get_value(latter) + kind*52;
        }
        return max_value;
    }
}
