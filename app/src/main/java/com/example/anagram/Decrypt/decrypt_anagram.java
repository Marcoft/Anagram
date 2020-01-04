package com.example.anagram.Decrypt;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


import com.example.anagram.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;

public class decrypt_anagram extends AppCompatActivity {

    private String answr1[] = new String[]{
            "слово", "нитц", "тсок", "соль", "кама", "брмю", "илсо", "крар", "дасра", "кулак",
            "болко", "актер", "аакаб", "шиика", "планан", "ноолклкпи", "ортсицонр", "кресло", "кинтовт", "акеклат"
            ,"школа","спорк","бумомо","стадиом","ромашка","оист","флопамтер","родуга","щенок","каманда"
            ,"понарок","рыбап","меню","памятт","варионт","капетал","прием","паеет","колера","вокета"
            ,"живот","дофликто","уценик","нруфь","парень","дувушка","кредиг","выьхд","центр","ямбары"
    };
    private String answr2[] = new String[]{
            "олвса", "ицкт", "стол", "лсол", "ямам", "орбк", "сила", "ркса", "среда", "калуп",
            "бокок", "ратик", "накап", "аишки", "клапан", "овпоиклкп", "циостаоар", "сосекр", "оирквтк", "тарелка"
            ,"шпола","спорт","вамуга","стадиан","рамашка","аист","фломантор","вадуга","щенан","команда"
            ,"подарол","рывак","неню","память","вариавт","кокитал","ппием","пакет","комена","рокета"
            ,"жибот","конфликт","оченик","груды","пареен","девушка","крефиг","вьфод","ценгр","январь"
    };
    private String answr3[] = new String[]{
            "лосвс", "цинк", "лоск" ,"ьлас", "маяк", "ромп", "ипса", "рапс", "апдес", "алукп",
            "колба","екатп","кабан","ашшкы","аланкк","лкоинквок","стационар","еокрск","оовтркн","ратакла"
            ,"икола","скорт","бумага","спафион","ромамка","асст","фломастер","рамуга","щепок","комакда"
            ,"подарок","рибак","мепю","панять","вариант","копитал","приен","помег","колено","ракеса"
            ,"жывот","копфлипт","ученик","трудь","папены","дебушка","кредит","виход","цемтр","янбарь"
    };
    private String answr4[] = new String[]{
            "волок", "кыиц", "тска", "оьло","акам","бром","лисс","парк","аедск","ккаку",
            "лобаб","ратес","абнан","шашки","папакл","полковник","ноацистро","ослерп","вторник","аеткрка"
            ,"школо","спорп","бамага","стадион","рошашка","аиит","флопаптер","радуга","шенок","моманда"
            ,"подорок","рыбак","миню","мамять","варианп","капитал","преем","папет","калена","ракета"
            ,"живон","конфлипт","ученек","грудь","папень","девущка","гредиг","выход","чентр","январы"
    };
    private String word[] = new String[]{
            "Слово", "Цинк", "Стол", "Соль" , "Маяк","Бром","Сила","Парк","Среда","Кулак",
            "Колба","Актер","Кабан","Шашки","Клапан","Полковник","Стационар","Кресло","Вторник","Тарелка"
            ,"Школа","Спорт","Бумага","Стадион","Ромашка","Аист","Фломастер","Радуга","Щенок","Команда"
            ,"Подарок","Рыбак","Меню","Память","Вариант","Капитал","Прием","Пакет","Колено","Ракета"
            ,"Живот","Конфликт","Ученик","Грудь","Парень","Девушка","Кредит","Выход","Центр","Январь"
    };

    private String first;
    private String second;
    private String third;
    private String four;

    @BindView(R.id.firstAnswr) Button firstAnswr;
    @BindView(R.id.secondAnswe) Button secondAnswe;
    @BindView(R.id.thirdAnswr) Button thirdAnswr;
    @BindView(R.id.fourAnswr) Button fourAnswr;
    @BindView(R.id.checkDecrypt) Button checkDecrypt;
    @BindView(R.id.text) TextView text;
    @BindView(R.id.money) TextView money;
    @BindView(R.id.Time) TextView Time;



    int a = -1;
    int Count = 0;

    private CountDownTimer countDownTimer;
    private long timemilliseconds = 31000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decrypt_anagram);
        ButterKnife.bind(this);

        a = new Random().nextInt(word.length);

        firstAnswr.setEnabled(false);
        secondAnswe.setEnabled(false);
        thirdAnswr.setEnabled(false);
        fourAnswr.setEnabled(false);
        checkDecrypt.setEnabled(true);
    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.firstAnswr:
                if(first.equalsIgnoreCase(word[a])){
                    Count ++;
                    money.setText("" + Count);

                    a = new Random().nextInt(word.length);
                    NewGame();
                } else {
                    if(Count != 0){
                        Count --;
                        money.setText("" + Count);

                        a = new Random().nextInt(word.length);
                        NewGame();
                    } else {
                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                }
                break;
            case R.id.secondAnswe:
                if(second.equalsIgnoreCase(word[a])){
                    Count ++;
                    money.setText("" + Count);

                    a = new Random().nextInt(word.length);
                    NewGame();
                } else {
                    if(Count != 0){
                    Count --;
                    money.setText("" + Count);

                    a = new Random().nextInt(word.length);
                    NewGame();
                    }
                    else{
                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                }
                break;

            case R.id.thirdAnswr:
                if(third.equalsIgnoreCase(word[a])){
                    Count ++;
                    money.setText("" + Count);

                    a = new Random().nextInt(word.length);
                    NewGame();
                } else {
                    if(Count != 0){
                        Count --;
                        money.setText("" + Count);

                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                    else{
                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                }
                break;

            case R.id.fourAnswr:
                if(four.equalsIgnoreCase(word[a])){
                    Count ++;
                    money.setText("" + Count);

                    a = new Random().nextInt(word.length);
                    NewGame();
                } else {
                    if(Count != 0){
                        Count --;
                        money.setText("" + Count);

                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                    else{
                        a = new Random().nextInt(word.length);
                        NewGame();
                    }
                }
                break;
        }

    }

    public void PlayGame(View v){
        checkDecrypt.setVisibility(View.GONE);
        checkDecrypt.setText("Проверить");
        Count = 0;
        StartTime();
        NewGame();
    }

    private void StartTime(){
        countDownTimer = new CountDownTimer(timemilliseconds,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timemilliseconds = millisUntilFinished;
                update();
            }

            @Override
            public void onFinish() {
                firstAnswr.setEnabled(false);
                secondAnswe.setEnabled(false);
                thirdAnswr.setEnabled(false);
                fourAnswr.setEnabled(false);
                checkDecrypt.setEnabled(false);


                Intent intent = new Intent();
                if(Count>0)
                    intent.putExtra("money_result",Count);
                else {
                    intent.putExtra("money_result",0);
                }
                setResult(RESULT_OK, intent);
                finish();


            }
        }.start();
    }

    public void update(){
        int seconds = (int)timemilliseconds/1000;
        Time.setText("Time: "+seconds);
    }

    public void NewGame(){
        first = answr1[a];
        second = answr2[a];
        third = answr3[a];
        four = answr4[a];
        firstAnswr.setText(shuffleWord(first));
        secondAnswe.setText(shuffleWord(second));
        thirdAnswr.setText(shuffleWord(third));
        fourAnswr.setText(shuffleWord(four));
        text.setText(word[a]);

        firstAnswr.setEnabled(true);
        secondAnswe.setEnabled(true);
        thirdAnswr.setEnabled(true);
        fourAnswr.setEnabled(true);
        checkDecrypt.setEnabled(true);
    }

    private String shuffleWord(String word) {
        List<String> letters = Arrays.asList(word.split(""));
        Collections.shuffle(letters);

        String shuffled = "";
        for (String letter : letters) {
            shuffled += letter;
        }
        return shuffled;
    }



    @Override
    public void onBackPressed() {
        //StartTime();
        Intent intent = new Intent();
        intent.putExtra("money_result",0);
        setResult(RESULT_OK, intent);
        finish();
        super.onBackPressed();
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

    public void HelpOnAplication(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(decrypt_anagram.this);
        builder
                .setView(R.layout.help_to_application)
                .setCancelable(false)
                .setPositiveButton("Закрыть",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
