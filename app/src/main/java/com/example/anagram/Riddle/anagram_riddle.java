package com.example.anagram.Riddle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.anagram.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class anagram_riddle extends AppCompatActivity {

    @BindView(R.id.btnRiddle1) Button btnRiddle1;
    @BindView(R.id.btnRiddle2) Button btnRiddle2;
    @BindView(R.id.btnRiddle3) Button btnRiddle3;
    @BindView(R.id.btnRiddle4) Button btnRiddle4;
    @BindView(R.id.btnRiddle5) Button btnRiddle5;
    @BindView(R.id.btnRiddle6) Button btnRiddle6;
    @BindView(R.id.btnRiddle7) Button btnRiddle7;
    @BindView(R.id.btnRiddle8) Button btnRiddle8;


    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anagram_riddle);
        ButterKnife.bind(this);

        //LoadPreferences();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            return;
        }

       /* sharedPreferences = getPreferences(MODE_PRIVATE);
        String name = data.getStringExtra("block");
        switch (name) {
            case "0":
                break;
            case "1":
                //btnRiddle1.setBackgroundColor(Color.GREEN);
                //btnRiddle1.setClickable(false);

                btnRiddle2.setEnabled(true);
                btnRiddle2.setClickable(true);

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("state", btnRiddle1.isClickable());
                editor.putBoolean("nextstate", btnRiddle2.isClickable());
                editor.apply();
                break;
            case "2":
               // btnRiddle2.setBackgroundColor(Color.GREEN);
                //btnRiddle2.setClickable(false);

                btnRiddle3.setEnabled(true);
                btnRiddle3.setClickable(true);

                SharedPreferences.Editor editor2 = sharedPreferences.edit();
                editor2.putBoolean("state2", btnRiddle2.isClickable());
                editor2.putBoolean("nextstate2", btnRiddle3.isClickable());
                editor2.apply();
                break;
            case "3":
                //btnRiddle3.setBackgroundColor(Color.GREEN);
                //btnRiddle3.setClickable(false);

                btnRiddle4.setEnabled(true);
                btnRiddle4.setClickable(true);

                SharedPreferences.Editor editor3 = sharedPreferences.edit();
                editor3.putBoolean("state3", btnRiddle3.isClickable());
                editor3.putBoolean("nextstate3", btnRiddle4.isClickable());
                editor3.apply();
                break;
            case "4":
                //btnRiddle4.setBackgroundColor(Color.GREEN);
                btnRiddle4.setClickable(false);

                btnRiddle5.setEnabled(true);
                btnRiddle5.setClickable(true);

                SharedPreferences.Editor editor4 = sharedPreferences.edit();
                editor4.putBoolean("state4", btnRiddle4.isClickable());
                editor4.putBoolean("nextstate4", btnRiddle5.isClickable());
                editor4.apply();
                break;
            case "5":
                //btnRiddle5.setBackgroundColor(Color.GREEN);
                btnRiddle5.setClickable(false);

                btnRiddle6.setEnabled(true);
                btnRiddle6.setClickable(true);

                SharedPreferences.Editor editor5 = sharedPreferences.edit();
                editor5.putBoolean("state5", btnRiddle5.isClickable());
                editor5.putBoolean("nextstate5", btnRiddle6.isClickable());
                editor5.apply();
                break;
            case "6":
                //btnRiddle6.setBackgroundColor(Color.GREEN);
                btnRiddle6.setClickable(false);

                btnRiddle7.setEnabled(true);
                btnRiddle7.setClickable(true);

                SharedPreferences.Editor editor6 = sharedPreferences.edit();
                editor6.putBoolean("state6", btnRiddle6.isClickable());
                editor6.putBoolean("nextstate6", btnRiddle7.isClickable());
                editor6.apply();
                break;
            case "7":
                //btnRiddle7.setBackgroundColor(Color.GREEN);
                btnRiddle7.setClickable(false);

                btnRiddle8.setEnabled(true);
                btnRiddle8.setClickable(true);

                SharedPreferences.Editor editor7 = sharedPreferences.edit();
                editor7.putBoolean("state7", btnRiddle7.isClickable());
                editor7.putBoolean("nextstate7", btnRiddle8.isClickable());
                editor7.apply();
                break;
            case "8":
               // btnRiddle8.setBackgroundColor(Color.GREEN);
                btnRiddle8.setClickable(false);

                SharedPreferences.Editor editor8 = sharedPreferences.edit();
                editor8.putBoolean("state8", btnRiddle8.isClickable());
                editor8.apply();
                break;
            default:
                break;
        }*/
    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.btnRiddle1:
                Intent intent = new Intent(anagram_riddle.this, RiddleTest.class);
                intent.putExtra("dictionary","сосна");
                intent.putExtra("dictionary2","насос");
                intent.putExtra("lvl",1);
                intent.putExtra("dictionary3","Я - дерево в родной стране, найдешь в лесах меня ты всюду, но слоги переставь во мне -и воду подавать я буду?");
                startActivityForResult(intent,1);
                break;
            case R.id.btnRiddle2:
                Intent intent2 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent2.putExtra("dictionary","нос");
                intent2.putExtra("dictionary2","сон");
                intent2.putExtra("lvl",2);
                intent2.putExtra("dictionary3","Задачу ты решишь свободно, я - небольшая часть лица, но если ты прочтешь меня с конца, во мне увидеть можно, что угодно?");
                startActivityForResult(intent2,2);
                break;
            case R.id.btnRiddle3:
                Intent intent3 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent3.putExtra("dictionary","лапоть");
                intent3.putExtra("dictionary2","пальто");
                intent3.putExtra("lvl",3);
                intent3.putExtra("dictionary3","Я прежде обувью служил,\n" +
                        "Крестьянин мною дорожил.\n" +
                        "Но если буквы переставишь,\n" +
                        "Меня одеждой быть заставишь.");
                startActivityForResult(intent3,3);
                break;
            case R.id.btnRiddle4:
                Intent intent4 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent4.putExtra("dictionary","куб");
                intent4.putExtra("dictionary2","бук");
                intent4.putExtra("lvl",4);
                intent4.putExtra("dictionary3","Читаем мы направо смело -\n" +
                        "Геометрическое тело.\n" +
                        "Прочтем же справа мы налево -\n" +
                        "Увидим разновидность древа.");
                startActivityForResult(intent4,4);
                break;
            case R.id.btnRiddle5:
                Intent intent5 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent5.putExtra("dictionary","фара");
                intent5.putExtra("dictionary2","арфа");
                intent5.putExtra("lvl",5);
                intent5.putExtra("dictionary3","Не раз в оркестре я звучала,\n" +
                        "Мой голос струнный так певуч!\n" +
                        "Но «Ф» моё поставь с начала,\n" +
                        "И я во тьму направлю луч.\n");
                startActivityForResult(intent5,5);
                break;
            case R.id.btnRiddle6:
                Intent intent6 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent6.putExtra("dictionary","атлас");
                intent6.putExtra("dictionary2","салат");
                intent6.putExtra("lvl",6);
                intent6.putExtra("dictionary3","Географию со мной\n" +
                        "Изучают в школе дети,\n" +
                        "Дай порядок букв иной –\n" +
                        "И найдёшь меня в буфете");
                startActivityForResult(intent6,6);
                break;
            case R.id.btnRiddle7:
                Intent intent7 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent7.putExtra("dictionary","карп");
                intent7.putExtra("dictionary2","парк");
                intent7.putExtra("lvl",7);
                intent7.putExtra("dictionary3","Я – рыба пресноводная,\n" +
                        "Для кушанья пригодная.\n" +
                        "Но если буквы переставить\n" +
                        "И слово новое составить\n" +
                        "Я превращаться буду рад\n" +
                        "В огромный живописный сад.\n");
                startActivityForResult(intent7,7);
                break;
            case R.id.btnRiddle8:
                Intent intent8 = new Intent(anagram_riddle.this,RiddleTest.class);
                intent8.putExtra("dictionary","смола");
                intent8.putExtra("dictionary2","масло");
                intent8.putExtra("lvl",8);
                intent8.putExtra("dictionary3","Я застываю на сосне,\n" +
                        "Бываю и на ели.\n" +
                        "Смените буквы так во мне,\n" +
                        "Чтоб вы меня с картошкой съели.");
                startActivityForResult(intent8,8);
                break;
            default:
                break;
        }

    }


    private void LoadPreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        boolean state = sharedPreferences.getBoolean("state", true);
        boolean state_next = sharedPreferences.getBoolean("nextstate", true);
        if(!state) {
            btnRiddle1.setEnabled(state);
            btnRiddle1.setClickable(state);
            //btnRiddle1.setBackgroundColor(Color.GREEN);
            btnRiddle2.setClickable(state_next);
            btnRiddle2.setEnabled(state_next);
        }

        boolean state2 = sharedPreferences.getBoolean("state2", true);
        boolean state_next2 = sharedPreferences.getBoolean("nextstate2", true);
        if(!state2) {
            //btnRiddle2.setEnabled(state2);
            btnRiddle2.setClickable(state2);
           // btnRiddle2.setBackgroundColor(Color.GREEN);
            btnRiddle3.setClickable(state_next2);
            btnRiddle3.setEnabled(state_next2);
        }

        boolean state3 = sharedPreferences.getBoolean("state3", true);
        boolean state_next3 = sharedPreferences.getBoolean("nextstate3", true);
        if(!state3) {
           //btnRiddle3.setEnabled(state3);
            btnRiddle3.setClickable(state3);
            //btnRiddle3.setBackgroundColor(Color.GREEN);
            btnRiddle4.setClickable(state_next3);
            btnRiddle4.setEnabled(state_next3);
        }

        boolean state4 = sharedPreferences.getBoolean("state4", true);
        boolean state_next4 = sharedPreferences.getBoolean("nextstate4", true);
        if(!state4) {
           // btnRiddle4.setEnabled(state4);
            btnRiddle4.setClickable(state4);
            //btnRiddle4.setBackgroundColor(Color.GREEN);
            btnRiddle5.setClickable(state_next4);
            btnRiddle5.setEnabled(state_next4);
        }

        boolean state5 = sharedPreferences.getBoolean("state5", true);
        boolean state_next5 = sharedPreferences.getBoolean("nextstate5", true);
        if(!state5) {
           // btnRiddle5.setEnabled(state5);
            btnRiddle5.setClickable(state5);
            //btnRiddle5.setBackgroundColor(Color.GREEN);
            btnRiddle6.setClickable(state_next5);
            btnRiddle6.setEnabled(state_next5);
        }

        boolean state6 = sharedPreferences.getBoolean("state6", true);
        boolean state_next6 = sharedPreferences.getBoolean("nextstate6", true);
        if(!state6) {
            //btnRiddle6.setEnabled(state6);
            btnRiddle6.setClickable(state6);
            //btnRiddle6.setBackgroundColor(Color.GREEN);
            btnRiddle7.setClickable(state_next6);
            btnRiddle7.setEnabled(state_next6);
        }

        boolean state7 = sharedPreferences.getBoolean("state7", true);
        boolean state_next7 = sharedPreferences.getBoolean("nextstate7", true);
        if(!state7) {
            //btnRiddle7.setEnabled(state7);
            btnRiddle7.setClickable(state7);
            //btnRiddle7.setBackgroundColor(Color.GREEN);
            btnRiddle8.setClickable(state_next7);
            btnRiddle8.setEnabled(state_next7);
        }

        boolean state8 = sharedPreferences.getBoolean("state8", true);
        boolean state_next8 = sharedPreferences.getBoolean("nextstate8", true);
        if(!state8) {
            //btnRiddle8.setEnabled(state8);
            btnRiddle8.setClickable(state8);
            //btnRiddle8.setBackgroundColor(Color.GREEN);

        }


        sharedPreferences.edit().apply();
    }

    @Override
    protected void onDestroy() {
        SharedPreferences sharedPreferences2 = getSharedPreferences(
                "Saved", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.remove("flags");
        editor.clear();
        editor.apply();
        super.onDestroy();
    }
}
