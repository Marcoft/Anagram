package com.example.anagram;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.anagram.databas.DBHelpersPharmacy;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Main extends AppCompatActivity {

    @BindView(R.id.btn) Button btn;
    @BindView(R.id.btn2) Button btn2;
    @BindView(R.id.btn3) Button btn3;
    @BindView(R.id.btn4) Button btn4;
    @BindView(R.id.btn5) Button btn5;
    @BindView(R.id.btn6) Button btn6;
    @BindView(R.id.btn7) Button btn7;
    @BindView(R.id.btn8) Button btn8;
    @BindView(R.id.btn9) Button btn9;
    @BindView(R.id.btn10) Button btn10;
    @BindView(R.id.btn11) Button btn11;
    @BindView(R.id.btn12) Button btn12;
    @BindView(R.id.btn13) Button btn13;
    @BindView(R.id.btn14) Button btn14;
    @BindView(R.id.btn15) Button btn15;
    @BindView(R.id.btn16) Button btn16;
    @BindView(R.id.btn17) Button btn17;
    @BindView(R.id.btn18) Button btn18;
    @BindView(R.id.btn19) Button btn19;
    @BindView(R.id.btn20) Button btn20;
    @BindView(R.id.btn21) Button btn21;
    @BindView(R.id.btn22) Button btn22;
    @BindView(R.id.btn23) Button btn23;
    @BindView(R.id.btn24) Button btn24;
    @BindView(R.id.btn25) Button btn25;
    @BindView(R.id.btn26) Button btn26;
    @BindView(R.id.btn27) Button btn27;
    @BindView(R.id.btn28) Button btn28;
    @BindView(R.id.btn29) Button btn29;
    @BindView(R.id.btn30) Button btn30;
    @BindView(R.id.btn31) Button btn31;
    @BindView(R.id.btn32) Button btn32;
    @BindView(R.id.btn33) Button btn33;
    @BindView(R.id.btn34) Button btn34;
    @BindView(R.id.btn35) Button btn35;
    @BindView(R.id.btn36) Button btn36;
    @BindView(R.id.btn37) Button btn37;
    @BindView(R.id.btn38) Button btn38;
    @BindView(R.id.btn39) Button btn39;
    @BindView(R.id.btn40) Button btn40;
    @BindView(R.id.btn41) Button btn41;
    @BindView(R.id.btn42) Button btn42;
    @BindView(R.id.btn43) Button btn43;
    @BindView(R.id.btn44) Button btn44;
    @BindView(R.id.btn45) Button btn45;
    @BindView(R.id.btn46) Button btn46;
    @BindView(R.id.btn47) Button btn47;
    @BindView(R.id.btn48) Button btn48;
    @BindView(R.id.btn49) Button btn49;
    @BindView(R.id.btn50) Button btn50;


    String block = "";
    int money = 0;
    int progress = 0;
    String money_result = "" ;

    SharedPreferences sharedPreferences;
    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;

    boolean isClicked = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();
        Intent intent = getIntent();
        money = intent.getIntExtra("moneyToRiddle", 0);
        //fillDbDate();

        LoadPreferences();

    }


    private void resultAfterTest(String numb){

        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder
                .setCancelable(false)
                .setPositiveButton("Следующий уровень",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                nextLevel();
                                dialog.cancel();
                            }
                        })
                .setNeutralButton("Закрыть",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

        LayoutInflater inflater = this.getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.activity_result_after_lvl_test, null);
        dialogBuilder.setView(dialogView);

        final TextView RightAnswer = (TextView) dialogView.findViewById(R.id.RightAnswer);

        if(numb.equals("1")){
            RightAnswer.setText("Яр");
        } else  if(numb.equals("2")){
            RightAnswer.setText("Лес");
        }else  if(numb.equals("3")){
            RightAnswer.setText("Бал");
        }else  if(numb.equals("4")){
            RightAnswer.setText("Ель");
        }else  if(numb.equals("5")){
            RightAnswer.setText("Ужас");
        }else  if(numb.equals("6")){
            RightAnswer.setText("Факт");
        }else  if(numb.equals("7")){
            RightAnswer.setText("Топь");
        }else  if(numb.equals("8")){
            RightAnswer.setText("Дочь");
        }else  if(numb.equals("9")){
            RightAnswer.setText("Итог");
        }else  if(numb.equals("10")){
            RightAnswer.setText("Цинк");
        }else  if(numb.equals("11")){
            RightAnswer.setText("Бокс");
        }else  if(numb.equals("12")){
            RightAnswer.setText("Блюз");
        }else  if(numb.equals("13")){
            RightAnswer.setText("Цель");
        }else  if(numb.equals("14")){
            RightAnswer.setText("Схема");
        }else  if(numb.equals("15")){
            RightAnswer.setText("Пират");
        }else  if(numb.equals("16")){
            RightAnswer.setText("Экран");
        }else  if(numb.equals("17")){
            RightAnswer.setText("Ствол");
        }else  if(numb.equals("18")){
            RightAnswer.setText("Талия");
        }else  if(numb.equals("19")){
            RightAnswer.setText("Мячик");
        }else  if(numb.equals("20")){
            RightAnswer.setText("Дробь");
        }else  if(numb.equals("21")){
            RightAnswer.setText("Тиски");
        }else  if(numb.equals("22")){
            RightAnswer.setText("Дрожь");
        }else  if(numb.equals("23")){
            RightAnswer.setText("Сушка");
        }else  if(numb.equals("24")){
            RightAnswer.setText("Гольф");
        }else  if(numb.equals("25")){
            RightAnswer.setText("Берет");
        }else  if(numb.equals("26")){
            RightAnswer.setText("Ларец");
        }else  if(numb.equals("27")){
            RightAnswer.setText("Арена");
        }else  if(numb.equals("28")){
            RightAnswer.setText("Вафля");
        }else  if(numb.equals("29")){
            RightAnswer.setText("Купол");
        }else  if(numb.equals("30")){
            RightAnswer.setText("Дверь");
        }else  if(numb.equals("31")){
            RightAnswer.setText("Альянс");
        }else  if(numb.equals("32")){
            RightAnswer.setText("Почерк");
        }else  if(numb.equals("33")){
            RightAnswer.setText("Офлайн");
        }else  if(numb.equals("34")){
            RightAnswer.setText("Алтарь");
        }else  if(numb.equals("35")){
            RightAnswer.setText("Дранье");
        }else  if(numb.equals("36")){
            RightAnswer.setText("Дворник");
        }else  if(numb.equals("37")){
            RightAnswer.setText("Мозаика");
        }else  if(numb.equals("38")){
            RightAnswer.setText("Дуршлаг");
        }else  if(numb.equals("39")){
            RightAnswer.setText("Виртуоз");
        }else  if(numb.equals("40")){
            RightAnswer.setText("Продюсер");
        }else  if(numb.equals("41")){
            RightAnswer.setText("Капучино");
        }else  if(numb.equals("42")){
            RightAnswer.setText("Кредитка");
        }else  if(numb.equals("43")){
            RightAnswer.setText("Бриллиант");
        }else  if(numb.equals("44")){
            RightAnswer.setText("Адреналин");
        }else  if(numb.equals("45")){
            RightAnswer.setText("Грейпфрут");
        }else  if(numb.equals("46")){
            RightAnswer.setText("Чугуновоз");
        }else  if(numb.equals("47")){
            RightAnswer.setText("Авитаминоз");
        }else  if(numb.equals("48")){
            RightAnswer.setText("Бензопровод");
        }else  if(numb.equals("49")){
            RightAnswer.setText("Автомобилист");
        }else  if(numb.equals("50")){
            RightAnswer.setText("Свидетельница");
        }

        dialogBuilder.create().show();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            return;
        }

            money_result = data.getStringExtra("money_result");
            money = Integer.parseInt(money_result);


            sharedPreferences = getPreferences(MODE_PRIVATE);
            block = data.getStringExtra("block");
            switch (block) {
                case "0":
                    break;
                case "1":
                    //btn.setBackgroundColor(Color.GREEN);
                    progress = 2;
                    btn.setClickable(false);
                    btn.setEnabled(false);

                    btn2.setEnabled(true);
                    btn2.setClickable(true);

                    resultAfterTest("1");

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean("state", btn.isClickable());
                    editor.putBoolean("state_1", btn.isEnabled());
                    editor.putBoolean("Next", btn2.isClickable());
                    editor.commit();
                    break;
                case "2":
                    //btn2.setBackgroundColor(Color.GREEN);
                    progress = 4;
                    btn2.setClickable(false);
                    btn2.setEnabled(false);

                    btn3.setEnabled(true);
                    btn3.setClickable(true);

                    resultAfterTest("2");

                    SharedPreferences.Editor editor2 = sharedPreferences.edit();
                    editor2.putBoolean("state2", btn2.isClickable());
                    editor2.putBoolean("state_2", btn2.isEnabled());
                    editor2.putBoolean("Next2", btn3.isClickable());
                    editor2.apply();
                    break;
                case "3":
                   // btn3.setBackgroundColor(Color.GREEN);
                    progress = 6;
                    btn3.setClickable(false);
                    btn3.setEnabled(false);

                    btn4.setEnabled(true);
                    btn4.setClickable(true);

                    resultAfterTest("3");

                    SharedPreferences.Editor editor3 = sharedPreferences.edit();
                    editor3.putBoolean("state3", btn3.isClickable());
                    editor3.putBoolean("state_3", btn3.isEnabled());
                    editor3.putBoolean("Next3", btn4.isClickable());
                    editor3.apply();
                    break;
                case "4":
                    //btn4.setBackgroundColor(Color.GREEN);
                    progress = 8;
                    btn4.setClickable(false);
                    btn4.setEnabled(false);

                    btn5.setEnabled(true);
                    btn5.setClickable(true);

                    resultAfterTest("4");

                    SharedPreferences.Editor editor4 = sharedPreferences.edit();
                    editor4.putBoolean("state4", btn4.isClickable());
                    editor4.putBoolean("state_4", btn4.isEnabled());
                    editor4.putBoolean("Next4", btn5.isClickable());
                    editor4.apply();
                    break;
                case "5":
                    //btn5.setBackgroundColor(Color.GREEN);
                    progress = 10;
                    btn5.setClickable(false);
                    btn5.setEnabled(false);

                    btn6.setEnabled(true);
                    btn6.setClickable(true);

                    resultAfterTest("5");

                    SharedPreferences.Editor editor5 = sharedPreferences.edit();
                    editor5.putBoolean("state5", btn5.isClickable());
                    editor5.putBoolean("state_5", btn5.isEnabled());
                    editor5.putBoolean("Next5", btn6.isClickable());
                    editor5.apply();
                    break;
                case "6":
                    //btn6.setBackgroundColor(Color.GREEN);
                    progress = 12;
                    btn6.setClickable(false);
                    btn6.setEnabled(false);

                    btn7.setEnabled(true);
                    btn7.setClickable(true);

                    resultAfterTest("6");

                    SharedPreferences.Editor editor6 = sharedPreferences.edit();
                    editor6.putBoolean("state6", btn6.isClickable());
                    editor6.putBoolean("state_6", btn6.isEnabled());
                    editor6.putBoolean("nextstate6", btn7.isClickable());
                    editor6.apply();
                    break;
                case "7":
                    //btn7.setBackgroundColor(Color.GREEN);
                    progress = 14;
                    btn7.setClickable(false);
                    btn7.setEnabled(false);


                    btn8.setEnabled(true);
                    btn8.setClickable(true);

                    resultAfterTest("7");

                    SharedPreferences.Editor editor7 = sharedPreferences.edit();
                    editor7.putBoolean("state7", btn7.isClickable());
                    editor7.putBoolean("state_7", btn7.isEnabled());
                    editor7.putBoolean("nextstate7", btn8.isClickable());
                    editor7.apply();
                    break;
                case "8":
                    //btn8.setBackgroundColor(Color.GREEN);
                    progress = 16;
                    btn8.setClickable(false);
                    btn8.setEnabled(false);

                    btn9.setEnabled(true);
                    btn9.setClickable(true);

                    resultAfterTest("8");

                    SharedPreferences.Editor editor8 = sharedPreferences.edit();
                    editor8.putBoolean("state8", btn8.isClickable());
                    editor8.putBoolean("state_8", btn8.isEnabled());
                    editor8.putBoolean("nextstate8", btn9.isClickable());
                    editor8.apply();
                    break;
                case "9":
                    //btn9.setBackgroundColor(Color.GREEN);
                    progress = 18;
                    btn9.setClickable(false);
                    btn9.setEnabled(false);

                    btn10.setEnabled(true);
                    btn10.setClickable(true);

                    resultAfterTest("9");

                    SharedPreferences.Editor editor9 = sharedPreferences.edit();
                    editor9.putBoolean("state9", btn9.isClickable());
                    editor9.putBoolean("state_9", btn9.isEnabled());
                    editor9.putBoolean("nextstate9", btn10.isClickable());
                    editor9.apply();
                    break;
                case "10":
                    //btn10.setBackgroundColor(Color.GREEN);
                    progress = 20;
                    btn10.setClickable(false);
                    btn10.setEnabled(false);

                    btn11.setEnabled(true);
                    btn11.setClickable(true);

                    resultAfterTest("10");

                    SharedPreferences.Editor editor10 = sharedPreferences.edit();
                    editor10.putBoolean("state10", btn10.isClickable());
                    editor10.putBoolean("state_10", btn10.isEnabled());
                    editor10.putBoolean("nextstate10", btn11.isClickable());
                    editor10.apply();
                    break;
                case "11":
                   // btn11.setBackgroundColor(Color.GREEN);
                    progress = 22;
                    btn11.setClickable(false);
                    btn11.setEnabled(false);

                    btn12.setEnabled(true);
                    btn12.setClickable(true);

                    resultAfterTest("11");

                    SharedPreferences.Editor editor11 = sharedPreferences.edit();
                    editor11.putBoolean("state11", btn11.isClickable());
                    editor11.putBoolean("state_11", btn11.isEnabled());
                    editor11.putBoolean("nextstate11", btn12.isClickable());
                    editor11.apply();
                    break;
                case "12":
                   // btn12.setBackgroundColor(Color.GREEN);
                    progress = 24;
                    btn12.setClickable(false);
                    btn12.setEnabled(false);

                    btn13.setEnabled(true);
                    btn13.setClickable(true);

                    resultAfterTest("12");

                    SharedPreferences.Editor editor12 = sharedPreferences.edit();
                    editor12.putBoolean("state12", btn12.isClickable());
                    editor12.putBoolean("state_12", btn12.isEnabled());
                    editor12.putBoolean("nextstate12", btn13.isClickable());
                    editor12.apply();
                    break;
                case "13":
                   // btn13.setBackgroundColor(Color.GREEN);
                    progress = 26;
                    btn13.setClickable(false);
                    btn13.setEnabled(false);

                    btn14.setEnabled(true);
                    btn14.setClickable(true);

                    resultAfterTest("13");

                    SharedPreferences.Editor editor13 = sharedPreferences.edit();
                    editor13.putBoolean("state13", btn13.isClickable());
                    editor13.putBoolean("state_13", btn13.isEnabled());
                    editor13.putBoolean("nextstate13", btn14.isClickable());
                    editor13.apply();
                    break;
                case "14":
                   // btn14.setBackgroundColor(Color.GREEN);
                    progress = 28;
                    btn14.setClickable(false);
                    btn14.setEnabled(false);

                    btn15.setEnabled(true);
                    btn15.setClickable(true);

                    resultAfterTest("14");

                    SharedPreferences.Editor editor14 = sharedPreferences.edit();
                    editor14.putBoolean("state14", btn14.isClickable());
                    editor14.putBoolean("state_14", btn14.isEnabled());
                    editor14.putBoolean("nextstate14", btn15.isClickable());
                    editor14.apply();
                    break;
                case "15":
                   // btn15.setBackgroundColor(Color.GREEN);
                    progress = 30;
                    btn15.setClickable(false);
                    btn15.setEnabled(false);

                    btn16.setEnabled(true);
                    btn16.setClickable(true);

                    resultAfterTest("15");

                    SharedPreferences.Editor editor15 = sharedPreferences.edit();
                    editor15.putBoolean("state15", btn15.isClickable());
                    editor15.putBoolean("state_15", btn15.isEnabled());
                    editor15.putBoolean("nextstate15", btn16.isClickable());
                    editor15.apply();
                    break;
                case "16":
                   // btn16.setBackgroundColor(Color.GREEN);
                    progress = 32;
                    btn16.setClickable(false);
                    btn16.setEnabled(false);

                    btn17.setEnabled(true);
                    btn17.setClickable(true);

                    resultAfterTest("16");

                    SharedPreferences.Editor editor16 = sharedPreferences.edit();
                    editor16.putBoolean("state16", btn16.isClickable());
                    editor16.putBoolean("state_16", btn16.isEnabled());
                    editor16.putBoolean("nextstate16", btn17.isClickable());
                    editor16.apply();
                    break;
                case "17":
                   // btn17.setBackgroundColor(Color.GREEN);
                    progress = 34;
                    btn17.setClickable(false);
                    btn17.setEnabled(false);

                    btn18.setEnabled(true);
                    btn18.setClickable(true);

                    resultAfterTest("17");

                    SharedPreferences.Editor editor17 = sharedPreferences.edit();
                    editor17.putBoolean("state17", btn17.isClickable());
                    editor17.putBoolean("state_17", btn17.isEnabled());
                    editor17.putBoolean("nextstate17", btn18.isClickable());
                    editor17.apply();
                    break;
                case "18":
                   // btn18.setBackgroundColor(Color.GREEN);
                    progress = 36;
                    btn18.setClickable(false);
                    btn18.setEnabled(false);

                    btn19.setEnabled(true);
                    btn19.setClickable(true);

                    resultAfterTest("18");

                    SharedPreferences.Editor editor18 = sharedPreferences.edit();
                    editor18.putBoolean("state18", btn18.isClickable());
                    editor18.putBoolean("state_18", btn18.isEnabled());
                    editor18.putBoolean("nextstate18", btn19.isClickable());
                    editor18.apply();
                    break;
                case "19":
                    //btn19.setBackgroundColor(Color.GREEN);
                    progress = 38;
                    btn19.setClickable(false);
                    btn19.setEnabled(false);

                    btn20.setEnabled(true);
                    btn20.setClickable(true);

                    resultAfterTest("19");

                    SharedPreferences.Editor editor19 = sharedPreferences.edit();
                    editor19.putBoolean("state19", btn19.isClickable());
                    editor19.putBoolean("state_19", btn19.isEnabled());
                    editor19.putBoolean("nextstate19", btn20.isClickable());
                    editor19.apply();
                    break;
                case "20":
                  //  btn20.setBackgroundColor(Color.GREEN);
                    progress = 40;
                    btn20.setClickable(false);
                    btn20.setEnabled(false);

                    btn21.setEnabled(true);
                    btn21.setClickable(true);

                    resultAfterTest("20");

                    SharedPreferences.Editor editor20 = sharedPreferences.edit();
                    editor20.putBoolean("state20", btn20.isClickable());
                    editor20.putBoolean("state_20", btn20.isEnabled());
                    editor20.putBoolean("nextstate20", btn21.isClickable());
                    editor20.apply();
                    break;
                case "21":
                   // btn21.setBackgroundColor(Color.GREEN);
                    progress = 42;
                    btn21.setClickable(false);
                    btn21.setEnabled(false);

                    btn22.setEnabled(true);
                    btn22.setClickable(true);

                    resultAfterTest("21");

                    SharedPreferences.Editor editor21 = sharedPreferences.edit();
                    editor21.putBoolean("state21", btn21.isClickable());
                    editor21.putBoolean("state_21", btn21.isEnabled());
                    editor21.putBoolean("nextstate21", btn22.isClickable());
                    editor21.apply();
                    break;
                case "22":
                    //btn22.setBackgroundColor(Color.GREEN);
                    progress = 44;
                    btn22.setClickable(false);
                    btn22.setEnabled(false);

                    btn23.setEnabled(true);
                    btn23.setClickable(true);

                    resultAfterTest("22");

                    SharedPreferences.Editor editor22 = sharedPreferences.edit();
                    editor22.putBoolean("state22", btn22.isClickable());
                    editor22.putBoolean("state_22", btn22.isEnabled());
                    editor22.putBoolean("nextstate22", btn23.isClickable());
                    editor22.apply();
                    break;
                case "23":
                    //btn23.setBackgroundColor(Color.GREEN);
                    progress = 46;
                    btn23.setClickable(false);
                    btn23.setEnabled(false);

                    btn24.setEnabled(true);
                    btn24.setClickable(true);

                    resultAfterTest("23");

                    SharedPreferences.Editor editor23 = sharedPreferences.edit();
                    editor23.putBoolean("state23", btn23.isClickable());
                    editor23.putBoolean("state_23", btn23.isEnabled());
                    editor23.putBoolean("nextstate23", btn24.isClickable());
                    editor23.apply();
                    break;
                case "24":
                    //btn24.setBackgroundColor(Color.GREEN);
                    progress = 48;
                    btn24.setClickable(false);
                    btn24.setEnabled(false);

                    btn25.setEnabled(true);
                    btn25.setClickable(true);

                    resultAfterTest("24");

                    SharedPreferences.Editor editor24 = sharedPreferences.edit();
                    editor24.putBoolean("state24", btn24.isClickable());
                    editor24.putBoolean("state_24", btn24.isEnabled());
                    editor24.putBoolean("nextstate24", btn25.isClickable());
                    editor24.apply();
                    break;
                case "25":
                    //btn25.setBackgroundColor(Color.GREEN);
                    progress = 50;
                    btn25.setClickable(false);
                    btn25.setEnabled(false);

                    btn26.setEnabled(true);
                    btn26.setClickable(true);

                    resultAfterTest("25");

                    SharedPreferences.Editor editor25 = sharedPreferences.edit();
                    editor25.putBoolean("state25", btn25.isClickable());
                    editor25.putBoolean("state_25", btn25.isEnabled());
                    editor25.putBoolean("nextstate25", btn26.isClickable());
                    editor25.apply();
                    break;
                case "26":
                    //btn26.setBackgroundColor(Color.GREEN);
                    progress = 52;
                    btn26.setClickable(false);
                    btn26.setEnabled(false);

                    btn27.setEnabled(true);
                    btn27.setClickable(true);

                    resultAfterTest("26");

                    SharedPreferences.Editor editor26 = sharedPreferences.edit();
                    editor26.putBoolean("state26", btn26.isClickable());
                    editor26.putBoolean("state_26", btn26.isEnabled());
                    editor26.putBoolean("nextstate26", btn27.isClickable());
                    editor26.apply();
                    break;
                case "27":
                    //btn27.setBackgroundColor(Color.GREEN);
                    progress = 54;
                    btn27.setClickable(false);
                    btn27.setEnabled(false);

                    btn28.setEnabled(true);
                    btn28.setClickable(true);

                    resultAfterTest("27");

                    SharedPreferences.Editor editor27 = sharedPreferences.edit();
                    editor27.putBoolean("state27", btn27.isClickable());
                    editor27.putBoolean("state_27", btn27.isEnabled());
                    editor27.putBoolean("nextstate27", btn28.isClickable());
                    editor27.apply();
                    break;
                case "28":
                    //btn28.setBackgroundColor(Color.GREEN);
                    progress = 56;
                    btn28.setClickable(false);
                    btn28.setEnabled(false);

                    btn29.setEnabled(true);
                    btn29.setClickable(true);

                    resultAfterTest("28");

                    SharedPreferences.Editor editor28 = sharedPreferences.edit();
                    editor28.putBoolean("state28", btn28.isClickable());
                    editor28.putBoolean("state_28", btn28.isEnabled());
                    editor28.putBoolean("nextstate28", btn29.isClickable());
                    editor28.apply();
                    break;
                case "29":
                    //btn29.setBackgroundColor(Color.GREEN);
                    progress = 58;
                    btn29.setClickable(false);
                    btn29.setEnabled(false);

                    btn30.setEnabled(true);
                    btn30.setClickable(true);

                    resultAfterTest("29");

                    SharedPreferences.Editor editor29 = sharedPreferences.edit();
                    editor29.putBoolean("state29", btn29.isClickable());
                    editor29.putBoolean("state_29", btn29.isEnabled());
                    editor29.putBoolean("nextstate29", btn30.isClickable());
                    editor29.apply();
                    break;
                case "30":
                   // btn30.setBackgroundColor(Color.GREEN);
                    progress = 60;
                    btn30.setClickable(false);
                    btn30.setEnabled(false);

                    btn31.setEnabled(true);
                    btn31.setClickable(true);

                    resultAfterTest("30");

                    SharedPreferences.Editor editor30 = sharedPreferences.edit();
                    editor30.putBoolean("state30", btn30.isClickable());
                    editor30.putBoolean("state_30", btn30.isEnabled());
                    editor30.putBoolean("nextstate30", btn31.isClickable());
                    editor30.apply();
                    break;
                case "31":
                    //btn31.setBackgroundColor(Color.GREEN);
                    progress = 62;
                    btn31.setClickable(false);
                    btn31.setEnabled(false);

                    btn32.setEnabled(true);
                    btn32.setClickable(true);

                    resultAfterTest("31");

                    SharedPreferences.Editor editor31 = sharedPreferences.edit();
                    editor31.putBoolean("state31", btn31.isClickable());
                    editor31.putBoolean("state_31", btn31.isEnabled());
                    editor31.putBoolean("nextstate31", btn32.isClickable());
                    editor31.apply();
                    break;
                case "32":
                    //btn32.setBackgroundColor(Color.GREEN);
                    progress = 64;
                    btn32.setClickable(false);
                    btn32.setEnabled(false);

                    btn33.setEnabled(true);
                    btn33.setClickable(true);

                    resultAfterTest("32");

                    SharedPreferences.Editor editor32 = sharedPreferences.edit();
                    editor32.putBoolean("state32", btn32.isClickable());
                    editor32.putBoolean("state_32", btn32.isEnabled());
                    editor32.putBoolean("nextstate32", btn33.isClickable());
                    editor32.apply();
                    break;
                case "33":
                    //btn33.setBackgroundColor(Color.GREEN);
                    progress = 66;
                    btn33.setClickable(false);
                    btn33.setEnabled(false);

                    btn34.setEnabled(true);
                    btn34.setClickable(true);

                    resultAfterTest("33");

                    SharedPreferences.Editor editor33 = sharedPreferences.edit();
                    editor33.putBoolean("state33", btn33.isClickable());
                    editor33.putBoolean("state_33", btn33.isEnabled());
                    editor33.putBoolean("nextstate33", btn34.isClickable());
                    editor33.apply();
                    break;
                case "34":
                    //btn34.setBackgroundColor(Color.GREEN);
                    progress = 68;
                    btn34.setClickable(false);
                    btn34.setEnabled(false);

                    btn35.setEnabled(true);
                    btn35.setClickable(true);

                    resultAfterTest("34");

                    SharedPreferences.Editor editor34 = sharedPreferences.edit();
                    editor34.putBoolean("state34", btn34.isClickable());
                    editor34.putBoolean("state_34", btn34.isEnabled());
                    editor34.putBoolean("nextstate34", btn35.isClickable());
                    editor34.apply();
                    break;
                case "35":
                   // btn35.setBackgroundColor(Color.GREEN);
                    progress = 70;
                    btn35.setClickable(false);
                    btn35.setEnabled(false);

                    btn36.setEnabled(true);
                    btn36.setClickable(true);

                    resultAfterTest("35");

                    SharedPreferences.Editor editor35 = sharedPreferences.edit();
                    editor35.putBoolean("state35", btn35.isClickable());
                    editor35.putBoolean("state_35", btn35.isEnabled());
                    editor35.putBoolean("nextstate35", btn36.isClickable());
                    editor35.apply();
                    break;
                case "36":
                    //btn36.setBackgroundColor(Color.GREEN);
                    progress = 72;
                    btn36.setClickable(false);
                    btn36.setEnabled(false);

                    btn37.setEnabled(true);
                    btn37.setClickable(true);

                    resultAfterTest("36");

                    SharedPreferences.Editor editor36 = sharedPreferences.edit();
                    editor36.putBoolean("state36", btn36.isClickable());
                    editor36.putBoolean("state_36", btn36.isEnabled());
                    editor36.putBoolean("nextstate36", btn37.isClickable());
                    editor36.apply();
                    break;
                case "37":
                    //btn37.setBackgroundColor(Color.GREEN);
                    progress = 74;
                    btn37.setClickable(false);
                    btn37.setEnabled(false);

                    btn38.setEnabled(true);
                    btn38.setClickable(true);

                    resultAfterTest("37");

                    SharedPreferences.Editor editor37 = sharedPreferences.edit();
                    editor37.putBoolean("state37", btn37.isClickable());
                    editor37.putBoolean("state_37", btn37.isEnabled());
                    editor37.putBoolean("nextstate37", btn38.isClickable());
                    editor37.apply();
                    break;
                case "38":
                    //btn38.setBackgroundColor(Color.GREEN);
                    progress = 76;
                    btn38.setClickable(false);
                    btn38.setEnabled(false);

                    btn39.setEnabled(true);
                    btn39.setClickable(true);

                    resultAfterTest("38");

                    SharedPreferences.Editor editor38 = sharedPreferences.edit();
                    editor38.putBoolean("state38", btn38.isClickable());
                    editor38.putBoolean("state_38", btn38.isEnabled());
                    editor38.putBoolean("nextstate38", btn39.isClickable());
                    editor38.apply();
                    break;
                case "39":
                    //btn39.setBackgroundColor(Color.GREEN);
                    progress = 78;
                    btn39.setClickable(false);
                    btn39.setEnabled(false);

                    btn40.setEnabled(true);
                    btn40.setClickable(true);

                    resultAfterTest("39");

                    SharedPreferences.Editor editor39 = sharedPreferences.edit();
                    editor39.putBoolean("state39", btn39.isClickable());
                    editor39.putBoolean("state_39", btn39.isEnabled());
                    editor39.putBoolean("nextstate39", btn40.isClickable());
                    editor39.apply();
                    break;
                case "40":
                    //btn40.setBackgroundColor(Color.GREEN);
                    progress = 80;
                    btn40.setClickable(false);
                    btn40.setEnabled(false);

                    btn41.setEnabled(true);
                    btn41.setClickable(true);

                    resultAfterTest("40");

                    SharedPreferences.Editor editor40 = sharedPreferences.edit();
                    editor40.putBoolean("state40", btn40.isClickable());
                    editor40.putBoolean("state_40", btn40.isEnabled());
                    editor40.putBoolean("nextstate40", btn41.isClickable());
                    editor40.apply();
                    break;
                case "41":
                    //btn41.setBackgroundColor(Color.GREEN);
                    progress = 82;
                    btn41.setClickable(false);
                    btn41.setEnabled(false);

                    btn42.setEnabled(true);
                    btn42.setClickable(true);

                    resultAfterTest("41");

                    SharedPreferences.Editor editor41 = sharedPreferences.edit();
                    editor41.putBoolean("state41", btn41.isClickable());
                    editor41.putBoolean("state_41", btn41.isEnabled());
                    editor41.putBoolean("nextstate41", btn42.isClickable());
                    editor41.apply();
                    break;
                case "42":
                   // btn42.setBackgroundColor(Color.GREEN);
                    progress = 84;
                    btn42.setClickable(false);
                    btn42.setEnabled(false);

                    btn43.setEnabled(true);
                    btn43.setClickable(true);

                    resultAfterTest("42");

                    SharedPreferences.Editor editor42 = sharedPreferences.edit();
                    editor42.putBoolean("state42", btn42.isClickable());
                    editor42.putBoolean("state_42", btn42.isEnabled());
                    editor42.putBoolean("nextstate42", btn43.isClickable());
                    editor42.apply();
                    break;
                case "43":
                    //btn43.setBackgroundColor(Color.GREEN);
                    progress = 86;
                    btn43.setClickable(false);
                    btn43.setEnabled(false);

                    btn44.setEnabled(true);
                    btn44.setClickable(true);

                    resultAfterTest("43");

                    SharedPreferences.Editor editor43 = sharedPreferences.edit();
                    editor43.putBoolean("state43", btn43.isClickable());
                    editor43.putBoolean("state_43", btn43.isEnabled());
                    editor43.putBoolean("nextstate43", btn44.isClickable());
                    editor43.apply();
                    break;
                case "44":
                   // btn44.setBackgroundColor(Color.GREEN);
                    progress = 88;
                    btn44.setClickable(false);
                    btn44.setEnabled(false);

                    btn45.setEnabled(true);
                    btn45.setClickable(true);

                    resultAfterTest("44");

                    SharedPreferences.Editor editor44 = sharedPreferences.edit();
                    editor44.putBoolean("state44", btn44.isClickable());
                    editor44.putBoolean("state_44", btn44.isEnabled());
                    editor44.putBoolean("nextstate44", btn45.isClickable());
                    editor44.apply();
                    break;
                case "45":
                   // btn45.setBackgroundColor(Color.GREEN);
                    progress = 90;
                    btn45.setClickable(false);
                    btn45.setEnabled(false);

                    btn46.setEnabled(true);
                    btn46.setClickable(true);

                    resultAfterTest("45");

                    SharedPreferences.Editor editor45 = sharedPreferences.edit();
                    editor45.putBoolean("state45", btn45.isClickable());
                    editor45.putBoolean("state_45", btn45.isEnabled());
                    editor45.putBoolean("nextstate45", btn46.isClickable());
                    editor45.apply();
                    break;
                case "46":
                   // btn46.setBackgroundColor(Color.GREEN);
                    progress = 92;
                    btn46.setClickable(false);
                    btn46.setEnabled(false);

                    btn47.setEnabled(true);
                    btn47.setClickable(true);

                    resultAfterTest("46");

                    SharedPreferences.Editor editor46 = sharedPreferences.edit();
                    editor46.putBoolean("state46", btn46.isClickable());
                    editor46.putBoolean("state_46", btn46.isEnabled());
                    editor46.putBoolean("nextstate46", btn47.isClickable());
                    editor46.apply();
                    break;
                case "47":
                   // btn47.setBackgroundColor(Color.GREEN);
                    progress = 94;
                    btn47.setClickable(false);
                    btn47.setEnabled(false);

                    btn48.setEnabled(true);
                    btn48.setClickable(true);

                    resultAfterTest("47");

                    SharedPreferences.Editor editor47 = sharedPreferences.edit();
                    editor47.putBoolean("state47", btn47.isClickable());
                    editor47.putBoolean("state_47", btn47.isEnabled());
                    editor47.putBoolean("nextstate47", btn48.isClickable());
                    editor47.apply();
                    break;
                case "48":
                   // btn48.setBackgroundColor(Color.GREEN);
                    progress = 96;
                    btn48.setClickable(false);
                    btn48.setEnabled(false);

                    btn49.setEnabled(true);
                    btn49.setClickable(true);

                    resultAfterTest("48");

                    SharedPreferences.Editor editor48 = sharedPreferences.edit();
                    editor48.putBoolean("state48", btn48.isClickable());
                    editor48.putBoolean("state_48", btn48.isEnabled());
                    editor48.putBoolean("nextstate48", btn49.isClickable());
                    editor48.apply();
                    break;
                case "49":
                   // btn49.setBackgroundColor(Color.GREEN);
                    progress = 98;
                    btn49.setClickable(false);
                    btn49.setEnabled(false);

                    btn50.setEnabled(true);
                    btn50.setClickable(true);

                    resultAfterTest("49");

                    SharedPreferences.Editor editor49 = sharedPreferences.edit();
                    editor49.putBoolean("state49", btn49.isClickable());
                    editor49.putBoolean("state_49", btn49.isEnabled());
                    editor49.putBoolean("nextstate49", btn50.isClickable());
                    editor49.apply();
                    break;
                case "50":
                   // btn50.setBackgroundColor(Color.GREEN);
                    progress = 100;
                    btn50.setClickable(false);
                    btn50.setEnabled(false);

                    resultAfterTest("50");

                    SharedPreferences.Editor editor50 = sharedPreferences.edit();
                    editor50.putBoolean("state50", btn50.isClickable());
                    editor50.putBoolean("state_50", btn50.isEnabled());
                    editor50.apply();
                    break;
                default:
                    break;
            }
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("three", progress);
        editor.apply();
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn:
                if(!isClicked) {
                    Intent intent = new Intent(Main.this, Test.class);
                    intent.putExtra("dictionary", "яр");
                    intent.putExtra("progress", 2);
                    intent.putExtra("lvl", 1);
                    intent.putExtra("money_data", money);
                    startActivityForResult(intent, 1);
                    isClicked = true;
                }
                break;
            case R.id.btn2:
                if(!isClicked) {
                Intent intent2 = new Intent(Main.this,Test.class);
                intent2.putExtra("dictionary","лес");
                intent2.putExtra("progress",4);
                intent2.putExtra("lvl",2);
                intent2.putExtra("money_data",money);
                startActivityForResult(intent2,2);
                    isClicked = true;
                }
                break;
            case R.id.btn3:
                if(!isClicked) {
                Intent intent3 = new Intent(Main.this,Test.class);
                intent3.putExtra("dictionary","бал");
                intent3.putExtra("progress",6);
                intent3.putExtra("lvl",3);
                intent3.putExtra("money_data",money);
                startActivityForResult(intent3,3);
                    isClicked = true;
                }
                break;
            case R.id.btn4:
                if(!isClicked) {
                Intent intent4 = new Intent(Main.this,Test.class);
                intent4.putExtra("dictionary","ель");
                intent4.putExtra("progress",8);
                intent4.putExtra("lvl",4);
                intent4.putExtra("money_data",money);
                startActivityForResult(intent4,4);
                    isClicked = true;
                }
                break;
            case R.id.btn5:
                if(!isClicked) {
                Intent intent5 = new Intent(Main.this,Test.class);
                intent5.putExtra("dictionary","ужас");
                intent5.putExtra("progress",10);
                intent5.putExtra("money_data",money);
                intent5.putExtra("lvl",5);
                startActivityForResult(intent5,5);
                    isClicked = true;
                }
                break;
            case R.id.btn6:
                if(!isClicked) {
                Intent intent6 = new Intent(Main.this,Test.class);
                intent6.putExtra("dictionary","факт");
                intent6.putExtra("progress",12);
                intent6.putExtra("lvl",6);
                intent6.putExtra("money_data",money);
                startActivityForResult(intent6,6);
                    isClicked = true;
                }
                break;
            case R.id.btn7:
                if(!isClicked) {
                Intent intent7 = new Intent(Main.this,Test.class);
                intent7.putExtra("dictionary","топь");
                intent7.putExtra("progress",14);
                intent7.putExtra("lvl",7);
                intent7.putExtra("money_data",money);
                startActivityForResult(intent7,7);
                    isClicked = true;
                }
                break;
            case R.id.btn8:
                if(!isClicked) {
                Intent intent8 = new Intent(Main.this,Test.class);
                intent8.putExtra("dictionary","дочь");
                intent8.putExtra("progress",16);
                intent8.putExtra("lvl",8);
                intent8.putExtra("money_data",money);
                startActivityForResult(intent8,8);
                    isClicked = true;
                }
                break;
            case R.id.btn9:
                if(!isClicked) {
                Intent intent9 = new Intent(Main.this,Test.class);
                intent9.putExtra("dictionary","итог");
                intent9.putExtra("progress",18);
                intent9.putExtra("lvl",9);
                intent9.putExtra("money_data",money);
                startActivityForResult(intent9,9);
                    isClicked = true;
                }
                break;
            case R.id.btn10:
                if(!isClicked) {
                Intent intent10 = new Intent(Main.this,Test.class);
                intent10.putExtra("dictionary","цинк");
                intent10.putExtra("progress",20);
                intent10.putExtra("lvl",10);
                intent10.putExtra("money_data",money);
                startActivityForResult(intent10,10);
                    isClicked = true;
                }
                break;
            case R.id.btn11:
                if(!isClicked) {
                Intent intent11 = new Intent(Main.this,Test.class);
                intent11.putExtra("dictionary","бокс");
                intent11.putExtra("progress",22);
                intent11.putExtra("lvl",11);
                intent11.putExtra("money_data",money);
                startActivityForResult(intent11,11);
                    isClicked = true;
                }
                break;
            case R.id.btn12:
                if(!isClicked) {
                Intent intent12 = new Intent(Main.this,Test.class);
                intent12.putExtra("dictionary","блюз");
                intent12.putExtra("progress",24);
                intent12.putExtra("money_data",money);
                intent12.putExtra("lvl",12);
                startActivityForResult(intent12,12);
                    isClicked = true;
                }
                break;
            case R.id.btn13:
                if(!isClicked) {
                Intent intent13 = new Intent(Main.this,Test.class);
                intent13.putExtra("dictionary","цель");
                intent13.putExtra("progress",26);
                intent13.putExtra("lvl",13);
                intent13.putExtra("money_data",money);
                startActivityForResult(intent13,13);
                    isClicked = true;
                }
                break;
            case R.id.btn14:
                if(!isClicked) {
                Intent intent14 = new Intent(Main.this,Test.class);
                intent14.putExtra("dictionary","схема");
                intent14.putExtra("progress",28);
                intent14.putExtra("lvl",14);
                intent14.putExtra("money_data",money);
                startActivityForResult(intent14,14);
                    isClicked = true;
                }
                break;
            case R.id.btn15:
                if(!isClicked) {
                Intent intent15 = new Intent(Main.this,Test.class);
                intent15.putExtra("dictionary","пират");
                intent15.putExtra("progress",30);
                intent15.putExtra("lvl",15);
                intent15.putExtra("money_data",money);
                startActivityForResult(intent15,15);
                    isClicked = true;
                }
                break;
            case R.id.btn16:
                if(!isClicked) {
                Intent intent16 = new Intent(Main.this,Test.class);
                intent16.putExtra("dictionary","экран");
                intent16.putExtra("progress",32);
                intent16.putExtra("money_data",money);
                intent16.putExtra("lvl",16);
                startActivityForResult(intent16,16);
                    isClicked = true;
                }
                break;
            case R.id.btn17:
                if(!isClicked) {
                Intent intent17 = new Intent(Main.this,Test.class);
                intent17.putExtra("dictionary","ствол");
                intent17.putExtra("progress",34);
                intent17.putExtra("money_data",money);
                intent17.putExtra("lvl",17);
                startActivityForResult(intent17,17);
                    isClicked = true;
                }
                break;
            case R.id.btn18:
                if(!isClicked) {
                Intent intent18 = new Intent(Main.this,Test.class);
                intent18.putExtra("dictionary","талия");
                intent18.putExtra("progress",36);
                intent18.putExtra("money_data",money);
                intent18.putExtra("lvl",18);
                startActivityForResult(intent18,18);
                    isClicked = true;
                }
                break;
            case R.id.btn19:
                if(!isClicked) {
                Intent intent19 = new Intent(Main.this,Test.class);
                intent19.putExtra("dictionary","мячик");
                intent19.putExtra("progress",38);
                intent19.putExtra("money_data",money);
                intent19.putExtra("lvl",19);
                startActivityForResult(intent19,19);
                    isClicked = true;
                }
                break;
            case R.id.btn20:
                if(!isClicked) {
                Intent intent20 = new Intent(Main.this,Test.class);
                intent20.putExtra("dictionary","дробь");
                intent20.putExtra("progress",40);
                intent20.putExtra("money_data",money);
                intent20.putExtra("lvl",20);
                startActivityForResult(intent20,20);
                    isClicked = true;
                }
                break;
            case R.id.btn21:
                if(!isClicked) {
                Intent intent21 = new Intent(Main.this,Test.class);
                intent21.putExtra("dictionary","тиски");
                intent21.putExtra("progress",42);
                intent21.putExtra("lvl",21);
                intent21.putExtra("money_data",money);
                startActivityForResult(intent21,21);
                    isClicked = true;
                }
                break;
            case R.id.btn22:
                if(!isClicked) {
                Intent intent22 = new Intent(Main.this,Test.class);
                intent22.putExtra("dictionary","дрожь");
                intent22.putExtra("progress",44);
                intent22.putExtra("lvl",22);
                intent22.putExtra("money_data",money);
                startActivityForResult(intent22,22);
                    isClicked = true;
                }
                break;
            case R.id.btn23:
                if(!isClicked) {
                Intent intent23 = new Intent(Main.this,Test.class);
                intent23.putExtra("dictionary","сушка");
                intent23.putExtra("progress",46);
                intent23.putExtra("lvl",23);
                intent23.putExtra("money_data",money);
                startActivityForResult(intent23,23);
                    isClicked = true;
                }
                break;
            case R.id.btn24:
                if(!isClicked) {
                Intent intent24 = new Intent(Main.this,Test.class);
                intent24.putExtra("dictionary","гольф");
                intent24.putExtra("progress",48);
                intent24.putExtra("lvl",24);
                intent24.putExtra("money_data",money);
                startActivityForResult(intent24,24);
                    isClicked = true;
                }
                break;
            case R.id.btn25:
                if(!isClicked) {
                Intent intent25 = new Intent(Main.this,Test.class);
                intent25.putExtra("dictionary","берет");
                intent25.putExtra("progress",50);
                intent25.putExtra("lvl",25);
                intent25.putExtra("money_data",money);
                startActivityForResult(intent25,25);
                    isClicked = true;
                }
                break;
            case R.id.btn26:
                if(!isClicked) {
                Intent intent26 = new Intent(Main.this,Test.class);
                intent26.putExtra("dictionary","ларец");
                intent26.putExtra("progress",52);
                intent26.putExtra("lvl",26);
                intent26.putExtra("money_data",money);
                startActivityForResult(intent26,26);
                    isClicked = true;
                }
                break;
            case R.id.btn27:
                if(!isClicked) {
                Intent intent27 = new Intent(Main.this,Test.class);
                intent27.putExtra("dictionary","арена");
                intent27.putExtra("progress",54);
                intent27.putExtra("lvl",27);
                intent27.putExtra("money_data",money);
                startActivityForResult(intent27,27);
                    isClicked = true;
                }
                break;
            case R.id.btn28:
                if(!isClicked) {
                Intent intent28 = new Intent(Main.this,Test.class);
                intent28.putExtra("dictionary","вафля");
                intent28.putExtra("progress",56);
                intent28.putExtra("lvl",28);
                intent28.putExtra("money_data",money);
                startActivityForResult(intent28,28);
                    isClicked = true;
                }
                break;
            case R.id.btn29:
                if(!isClicked) {
                Intent intent29 = new Intent(Main.this,Test.class);
                intent29.putExtra("dictionary","купол");
                intent29.putExtra("progress",58);
                intent29.putExtra("lvl",29);
                intent29.putExtra("money_data",money);
                startActivityForResult(intent29,29);
                    isClicked = true;
                }
                break;
            case R.id.btn30:
                if(!isClicked) {
                Intent intent30 = new Intent(Main.this,Test.class);
                intent30.putExtra("dictionary","дверь");
                intent30.putExtra("progress",60);
                intent30.putExtra("lvl",30);
                intent30.putExtra("money_data",money);
                startActivityForResult(intent30,30);
                    isClicked = true;
                }
                break;
            case R.id.btn31:
                if(!isClicked) {
                Intent intent31 = new Intent(Main.this,Test.class);
                intent31.putExtra("dictionary","альянс");
                intent31.putExtra("progress",62);
                intent31.putExtra("lvl",31);
                intent31.putExtra("money_data",money);
                startActivityForResult(intent31,31);
                    isClicked = true;
                }
                break;
            case R.id.btn32:
                if(!isClicked) {
                Intent intent32 = new Intent(Main.this,Test.class);
                intent32.putExtra("dictionary","почерк");
                intent32.putExtra("progress",64);
                intent32.putExtra("lvl",32);
                intent32.putExtra("money_data",money);
                startActivityForResult(intent32,32);
                    isClicked = true;
                }
                break;
            case R.id.btn33:
                if(!isClicked) {
                Intent intent33 = new Intent(Main.this,Test.class);
                intent33.putExtra("dictionary","офлайн");
                intent33.putExtra("progress",66);
                intent33.putExtra("lvl",33);
                intent33.putExtra("money_data",money);
                startActivityForResult(intent33,33);
                    isClicked = true;
                }
                break;
            case R.id.btn34:
                if(!isClicked) {
                Intent intent34 = new Intent(Main.this,Test.class);
                intent34.putExtra("dictionary","алтарь");
                intent34.putExtra("progress",68);
                intent34.putExtra("lvl",34);
                intent34.putExtra("money_data",money);
                startActivityForResult(intent34,34);
                    isClicked = true;
                }
                break;
            case R.id.btn35:
                if(!isClicked) {
                Intent intent35 = new Intent(Main.this,Test.class);
                intent35.putExtra("dictionary","дранье");
                intent35.putExtra("progress",70);
                intent35.putExtra("lvl",35);
                intent35.putExtra("money_data",money);
                startActivityForResult(intent35,35);
                    isClicked = true;
                }
                break;
            case R.id.btn36:
                if(!isClicked) {
                Intent intent36 = new Intent(Main.this,Test.class);
                intent36.putExtra("dictionary","дворник");
                intent36.putExtra("progress",72);
                intent36.putExtra("lvl",36);
                intent36.putExtra("money_data",money);
                startActivityForResult(intent36,36);
                    isClicked = true;
                }
                break;
            case R.id.btn37:
                if(!isClicked) {
                Intent intent37 = new Intent(Main.this,Test.class);
                intent37.putExtra("dictionary","мозаика");
                intent37.putExtra("progress",74);
                intent37.putExtra("lvl",37);
                intent37.putExtra("money_data",money);
                startActivityForResult(intent37,37);
                    isClicked = true;
                }
                break;
            case R.id.btn38:
                if(!isClicked) {
                Intent intent38 = new Intent(Main.this,Test.class);
                intent38.putExtra("dictionary","дуршлаг");
                intent38.putExtra("progress",76);
                intent38.putExtra("lvl",38);
                intent38.putExtra("money_data",money);
                startActivityForResult(intent38,38);
                    isClicked = true;
                }
                break;
            case R.id.btn39:
                if(!isClicked) {
                Intent intent39 = new Intent(Main.this,Test.class);
                intent39.putExtra("dictionary","виртуоз");
                intent39.putExtra("progress",78);
                intent39.putExtra("lvl",39);
                intent39.putExtra("money_data",money);
                startActivityForResult(intent39,39);
                    isClicked = true;
                }
                break;
            case R.id.btn40:
                if(!isClicked) {
                Intent intent40 = new Intent(Main.this,Test.class);
                intent40.putExtra("dictionary","продюсер");
                intent40.putExtra("progress",80);
                intent40.putExtra("lvl",40);
                intent40.putExtra("money_data",money);
                startActivityForResult(intent40,40);
                    isClicked = true;
                }
                break;
            case R.id.btn41:
                if(!isClicked) {
                Intent intent41 = new Intent(Main.this,Test.class);
                intent41.putExtra("dictionary","капучино");
                intent41.putExtra("progress",82);
                intent41.putExtra("lvl",41);
                intent41.putExtra("money_data",money);
                startActivityForResult(intent41,41);
                    isClicked = true;
                }
                break;
            case R.id.btn42:
                if(!isClicked) {
                Intent intent42 = new Intent(Main.this,Test.class);
                intent42.putExtra("dictionary","кредитка");
                intent42.putExtra("progress",84);
                intent42.putExtra("lvl",42);
                intent42.putExtra("money_data",money);
                startActivityForResult(intent42,42);
                    isClicked = true;
                }
                break;
            case R.id.btn43:
                if(!isClicked) {
                Intent intent43 = new Intent(Main.this,Test.class);
                intent43.putExtra("dictionary","бриллиант");
                intent43.putExtra("progress",86);
                intent43.putExtra("lvl",43);
                intent43.putExtra("money_data",money);
                startActivityForResult(intent43,43);
                    isClicked = true;
                }
                break;
            case R.id.btn44:
                if(!isClicked) {
                Intent intent44 = new Intent(Main.this,Test.class);
                intent44.putExtra("dictionary","адреналин");
                intent44.putExtra("progress",88);
                intent44.putExtra("lvl",44);
                intent44.putExtra("money_data",money);
                startActivityForResult(intent44,44);
                    isClicked = true;
                }
                break;
            case R.id.btn45:
                if(!isClicked) {
                Intent intent45 = new Intent(Main.this,Test.class);
                intent45.putExtra("dictionary","грейпфрут");
                intent45.putExtra("progress",90);
                intent45.putExtra("lvl",45);
                intent45.putExtra("money_data",money);
                startActivityForResult(intent45,45);
                    isClicked = true;
                }
                break;
            case R.id.btn46:
                if(!isClicked) {
                Intent intent46 = new Intent(Main.this,Test.class);
                intent46.putExtra("dictionary","чугуновоз");
                intent46.putExtra("progress",92);
                intent46.putExtra("lvl",46);
                intent46.putExtra("money_data",money);
                startActivityForResult(intent46,46);
                    isClicked = true;
                }
                break;
            case R.id.btn47:
                if(!isClicked) {
                Intent intent47 = new Intent(Main.this,Test.class);
                intent47.putExtra("dictionary","авитаминоз");
                intent47.putExtra("progress",94);
                intent47.putExtra("lvl",47);
                intent47.putExtra("money_data",money);
                startActivityForResult(intent47,47);
                    isClicked = true;
                }
                break;
            case R.id.btn48:
                if(!isClicked) {
                Intent intent48 = new Intent(Main.this,Test.class);
                intent48.putExtra("dictionary","бензопровод");
                intent48.putExtra("progress",96);
                intent48.putExtra("lvl",48);
                intent48.putExtra("money_data",money);
                startActivityForResult(intent48,48);
                    isClicked = true;
                }
                break;
            case R.id.btn49:
                if(!isClicked) {
                Intent intent49 = new Intent(Main.this,Test.class);
                intent49.putExtra("dictionary","автомобилист");
                intent49.putExtra("progress",98);
                intent49.putExtra("lvl",49);
                intent49.putExtra("money_data",money);
                startActivityForResult(intent49,49);
                    isClicked = true;
                }
                break;
            case R.id.btn50:
                if(!isClicked) {
                Intent intent50 = new Intent(Main.this,Test.class);
                intent50.putExtra("dictionary","свидетельница");
                intent50.putExtra("progress",100);
                intent50.putExtra("lvl",50);
                intent50.putExtra("money_data",money);
                startActivityForResult(intent50,50);
                    isClicked = true;
                }
                break;
            default:
                break;
        }

    }


    private void LoadPreferences(){
        sharedPreferences = getPreferences(MODE_PRIVATE);
        boolean state = sharedPreferences.getBoolean("state", true);
        boolean state_next = sharedPreferences.getBoolean("Next", true);
        if(!state) {
            btn.setEnabled(state);
            btn.setClickable(state);
            //btn.setBackgroundColor(Color.GREEN);
            btn2.setClickable(state_next);
            btn2.setEnabled(state_next);
        }

        boolean state2 = sharedPreferences.getBoolean("state2", true);
        boolean state_next2 = sharedPreferences.getBoolean("Next2", true);
        if(!state2) {
            btn2.setEnabled(state2);
            btn2.setClickable(state2);
            //btn2.setBackgroundColor(Color.GREEN);
            btn3.setClickable(state_next2);
            btn3.setEnabled(state_next2);
        }

        boolean state3 = sharedPreferences.getBoolean("state3", true);
        boolean state_next3 = sharedPreferences.getBoolean("Next3", true);
        if(!state3) {
            btn3.setEnabled(state3);
            btn3.setClickable(state3);
            //btn3.setBackgroundColor(Color.GREEN);
            btn4.setClickable(state_next3);
            btn4.setEnabled(state_next3);
        }

        boolean state4 = sharedPreferences.getBoolean("state4", true);
        boolean state_next4 = sharedPreferences.getBoolean("Next4", true);
        if(!state4) {
            btn4.setEnabled(state4);
            btn4.setClickable(state4);
            //btn4.setBackgroundColor(Color.GREEN);
            btn5.setClickable(state_next4);
            btn5.setEnabled(state_next4);
        }

        boolean state5 = sharedPreferences.getBoolean("state5", true);
        boolean state_next5 = sharedPreferences.getBoolean("Next5", true);
        if(!state5) {
            btn5.setEnabled(state5);
            btn5.setClickable(state5);
           // btn5.setBackgroundColor(Color.GREEN);
            btn6.setClickable(state_next5);
            btn6.setEnabled(state_next5);
        }

        boolean state6 = sharedPreferences.getBoolean("state6", true);
        boolean state_next6 = sharedPreferences.getBoolean("nextstate6", true);
        if(!state6) {
            btn6.setEnabled(state6);
            btn6.setClickable(state6);
            //btn6.setBackgroundColor(Color.GREEN);
            btn7.setClickable(state_next6);
            btn7.setEnabled(state_next6);
        }

        boolean state7 = sharedPreferences.getBoolean("state7", true);
        boolean state_next7 = sharedPreferences.getBoolean("nextstate7", true);
        if(!state7) {
            btn7.setEnabled(state7);
            btn7.setClickable(state7);
           // btn7.setBackgroundColor(Color.GREEN);
            btn8.setClickable(state_next7);
            btn8.setEnabled(state_next7);
        }

        boolean state8 = sharedPreferences.getBoolean("state8", true);
        boolean state_next8 = sharedPreferences.getBoolean("nextstate8", true);
        if(!state8) {
            btn8.setEnabled(state8);
            btn8.setClickable(state8);
            //btn8.setBackgroundColor(Color.GREEN);
            btn9.setClickable(state_next8);
            btn9.setEnabled(state_next8);
        }

        boolean state9 = sharedPreferences.getBoolean("state9", true);
        boolean state_next9 = sharedPreferences.getBoolean("nextstate9", true);
        if(!state9) {
            btn9.setEnabled(state9);
            btn9.setClickable(state9);
            //btn9.setBackgroundColor(Color.GREEN);
            btn10.setClickable(state_next9);
            btn10.setEnabled(state_next9);
        }

        boolean state10 = sharedPreferences.getBoolean("state10", true);
        boolean state_next10 = sharedPreferences.getBoolean("nextstate10", true);
        if(!state10) {
            btn10.setEnabled(state10);
            btn10.setClickable(state10);
            //btn10.setBackgroundColor(Color.GREEN);
            btn11.setClickable(state_next10);
            btn11.setEnabled(state_next10);
        }

        boolean state11 = sharedPreferences.getBoolean("state11", true);
        boolean state_next11 = sharedPreferences.getBoolean("nextstate11", true);
        if(!state11) {
            btn11.setEnabled(state11);
            btn11.setClickable(state11);
            //btn11.setBackgroundColor(Color.GREEN);
            btn12.setClickable(state_next11);
            btn12.setEnabled(state_next11);
        }

        boolean state12 = sharedPreferences.getBoolean("state12", true);
        boolean state_next12 = sharedPreferences.getBoolean("nextstate12", true);
        if(!state12) {
            btn12.setEnabled(state12);
            btn12.setClickable(state12);
            //btn12.setBackgroundColor(Color.GREEN);
            btn13.setClickable(state_next12);
            btn13.setEnabled(state_next12);
        }

        boolean state13 = sharedPreferences.getBoolean("state13", true);
        boolean state_next13 = sharedPreferences.getBoolean("nextstate13", true);
        if(!state13) {
            btn13.setEnabled(state13);
            btn13.setClickable(state13);
            //btn13.setBackgroundColor(Color.GREEN);
            btn14.setClickable(state_next13);
            btn14.setEnabled(state_next13);
        }

        boolean state14 = sharedPreferences.getBoolean("state14", true);
        boolean state_next14 = sharedPreferences.getBoolean("nextstate14", true);
        if(!state14) {
            btn14.setEnabled(state14);
            btn14.setClickable(state14);
            //btn14.setBackgroundColor(Color.GREEN);
            btn15.setClickable(state_next14);
            btn15.setEnabled(state_next14);
        }

        boolean state15 = sharedPreferences.getBoolean("state15", true);
        boolean state_next15 = sharedPreferences.getBoolean("nextstate15", true);
        if(!state15) {
            btn15.setEnabled(state15);
            btn15.setClickable(state15);
            //btn15.setBackgroundColor(Color.GREEN);
            btn16.setClickable(state_next15);
            btn16.setEnabled(state_next15);
        }

        boolean state16 = sharedPreferences.getBoolean("state16", true);
        boolean state_next16 = sharedPreferences.getBoolean("nextstate16", true);
        if(!state16) {
            btn16.setEnabled(state16);
            btn16.setClickable(state16);
            //btn16.setBackgroundColor(Color.GREEN);
            btn17.setClickable(state_next16);
            btn17.setEnabled(state_next16);
        }

        boolean state17 = sharedPreferences.getBoolean("state17", true);
        boolean state_next17 = sharedPreferences.getBoolean("nextstate17", true);
        if(!state17) {
            btn17.setEnabled(state17);
            btn17.setClickable(state17);
            //btn17.setBackgroundColor(Color.GREEN);
            btn18.setClickable(state_next17);
            btn18.setEnabled(state_next17);
        }

        boolean state18 = sharedPreferences.getBoolean("state18", true);
        boolean state_next18 = sharedPreferences.getBoolean("nextstate18", true);
        if(!state18) {
            btn18.setEnabled(state18);
            btn18.setClickable(state18);
            //btn18.setBackgroundColor(Color.GREEN);
            btn19.setClickable(state_next18);
            btn19.setEnabled(state_next18);
        }

        boolean state19 = sharedPreferences.getBoolean("state19", true);
        boolean state_next19 = sharedPreferences.getBoolean("nextstate19", true);
        if(!state19) {
            btn19.setEnabled(state19);
            btn19.setClickable(state19);
            //btn19.setBackgroundColor(Color.GREEN);
            btn20.setClickable(state_next19);
            btn20.setEnabled(state_next19);
        }

        boolean state20 = sharedPreferences.getBoolean("state20", true);
        boolean state_next20 = sharedPreferences.getBoolean("nextstate20", true);
        if(!state20) {
            btn20.setEnabled(state20);
            btn20.setClickable(state20);
            //btn20.setBackgroundColor(Color.GREEN);
            btn21.setClickable(state_next20);
            btn21.setEnabled(state_next20);
        }

        boolean state21 = sharedPreferences.getBoolean("state21", true);
        boolean state_next21 = sharedPreferences.getBoolean("nextstate21", true);
        if(!state21) {
            btn21.setEnabled(state21);
            btn21.setClickable(state21);
            //btn21.setBackgroundColor(Color.GREEN);
            btn22.setClickable(state_next21);
            btn22.setEnabled(state_next21);
        }

        boolean state22 = sharedPreferences.getBoolean("state22", true);
        boolean state_next22 = sharedPreferences.getBoolean("nextstate22", true);
        if(!state22) {
            btn22.setEnabled(state22);
            btn22.setClickable(state22);
            //btn22.setBackgroundColor(Color.GREEN);
            btn23.setClickable(state_next22);
            btn23.setEnabled(state_next22);
        }

        boolean state23 = sharedPreferences.getBoolean("state23", true);
        boolean state_next23 = sharedPreferences.getBoolean("nextstate23", true);
        if(!state23) {
            btn23.setEnabled(state23);
            btn23.setClickable(state23);
            //btn23.setBackgroundColor(Color.GREEN);
            btn24.setClickable(state_next23);
            btn24.setEnabled(state_next23);
        }


        boolean state24 = sharedPreferences.getBoolean("state24", true);
        boolean state_next24 = sharedPreferences.getBoolean("nextstate24", true);
        if(!state24) {
            btn24.setEnabled(state24);
            btn24.setClickable(state24);
           // btn24.setBackgroundColor(Color.GREEN);
            btn25.setClickable(state_next24);
            btn25.setEnabled(state_next24);
        }

        boolean state25 = sharedPreferences.getBoolean("state25", true);
        boolean state_next25 = sharedPreferences.getBoolean("nextstate25", true);
        if(!state25) {
            btn25.setEnabled(state25);
            btn25.setClickable(state25);
            //btn25.setBackgroundColor(Color.GREEN);
            btn26.setClickable(state_next25);
            btn26.setEnabled(state_next25);
        }

        boolean state26 = sharedPreferences.getBoolean("state26", true);
        boolean state_next26 = sharedPreferences.getBoolean("nextstate26", true);
        if(!state26) {
            btn26.setEnabled(state26);
            btn26.setClickable(state26);
            //btn26.setBackgroundColor(Color.GREEN);
            btn27.setClickable(state_next26);
            btn27.setEnabled(state_next26);
        }

        boolean state27 = sharedPreferences.getBoolean("state27", true);
        boolean state_next27 = sharedPreferences.getBoolean("nextstate27", true);
        if(!state27) {
            btn27.setEnabled(state27);
            btn27.setClickable(state27);
            //btn27.setBackgroundColor(Color.GREEN);
            btn28.setClickable(state_next27);
            btn28.setEnabled(state_next27);
        }

        boolean state28 = sharedPreferences.getBoolean("state28", true);
        boolean state_next28 = sharedPreferences.getBoolean("nextstate28", true);
        if(!state28) {
            btn28.setEnabled(state28);
            btn28.setClickable(state28);
            //btn28.setBackgroundColor(Color.GREEN);
            btn29.setClickable(state_next28);
            btn29.setEnabled(state_next28);
        }

        boolean state29 = sharedPreferences.getBoolean("state29", true);
        boolean state_next29 = sharedPreferences.getBoolean("nextstate29", true);
        if(!state29) {
            btn29.setEnabled(state29);
            btn29.setClickable(state29);
            //btn29.setBackgroundColor(Color.GREEN);
            btn30.setClickable(state_next29);
            btn30.setEnabled(state_next29);
        }

        boolean state30 = sharedPreferences.getBoolean("state30", true);
        boolean state_next30 = sharedPreferences.getBoolean("nextstate30", true);
        if(!state30) {
            btn30.setEnabled(state30);
            btn30.setClickable(state30);
            //btn30.setBackgroundColor(Color.GREEN);
            btn31.setClickable(state_next30);
            btn31.setEnabled(state_next30);
        }

        boolean state31 = sharedPreferences.getBoolean("state31", true);
        boolean state_next31 = sharedPreferences.getBoolean("nextstate31", true);
        if(!state31) {
            btn31.setEnabled(state31);
            btn31.setClickable(state31);
           // btn31.setBackgroundColor(Color.GREEN);
            btn32.setClickable(state_next31);
            btn32.setEnabled(state_next31);
        }

        boolean state32 = sharedPreferences.getBoolean("state32", true);
        boolean state_next32 = sharedPreferences.getBoolean("nextstate32", true);
        if(!state32) {
            btn32.setEnabled(state32);
            btn32.setClickable(state32);
            //btn32.setBackgroundColor(Color.GREEN);
            btn33.setClickable(state_next32);
            btn33.setEnabled(state_next32);
        }

        boolean state33 = sharedPreferences.getBoolean("state33", true);
        boolean state_next33 = sharedPreferences.getBoolean("nextstate33", true);
        if(!state33) {
            btn33.setEnabled(state33);
            btn33.setClickable(state33);
           // btn33.setBackgroundColor(Color.GREEN);
            btn34.setClickable(state_next33);
            btn34.setEnabled(state_next33);
        }

        boolean state34 = sharedPreferences.getBoolean("state34", true);
        boolean state_next34 = sharedPreferences.getBoolean("nextstate34", true);
        if(!state34) {
            btn34.setEnabled(state34);
            btn34.setClickable(state34);
            //btn34.setBackgroundColor(Color.GREEN);
            btn35.setClickable(state_next34);
            btn35.setEnabled(state_next34);
        }

        boolean state35 = sharedPreferences.getBoolean("state35", true);
        boolean state_next35 = sharedPreferences.getBoolean("nextstate35", true);
        if(!state35) {
            btn35.setEnabled(state35);
            btn35.setClickable(state35);
            //btn35.setBackgroundColor(Color.GREEN);
            btn36.setClickable(state_next35);
            btn36.setEnabled(state_next35);
        }

        boolean state36 = sharedPreferences.getBoolean("state36", true);
        boolean state_next36 = sharedPreferences.getBoolean("nextstate36", true);
        if(!state36) {
            btn36.setEnabled(state36);
            btn36.setClickable(state36);
            //btn36.setBackgroundColor(Color.GREEN);
            btn37.setClickable(state_next36);
            btn37.setEnabled(state_next36);
        }

        boolean state37 = sharedPreferences.getBoolean("state37", true);
        boolean state_next37 = sharedPreferences.getBoolean("nextstate37", true);
        if(!state37) {
            btn37.setEnabled(state37);
            btn37.setClickable(state37);
            //btn37.setBackgroundColor(Color.GREEN);
            btn38.setClickable(state_next37);
            btn38.setEnabled(state_next37);
        }

        boolean state38 = sharedPreferences.getBoolean("state38", true);
        boolean state_next38 = sharedPreferences.getBoolean("nextstate38", true);
        if(!state38) {
            btn38.setEnabled(state38);
            btn38.setClickable(state38);
            //btn38.setBackgroundColor(Color.GREEN);
            btn39.setClickable(state_next38);
            btn39.setEnabled(state_next38);
        }


        boolean state39 = sharedPreferences.getBoolean("state39", true);
        boolean state_next39 = sharedPreferences.getBoolean("nextstate39", true);
        if(!state39) {
            btn39.setEnabled(state39);
            btn39.setClickable(state39);
           // btn39.setBackgroundColor(Color.GREEN);
            btn40.setClickable(state_next39);
            btn40.setEnabled(state_next39);
        }

        boolean state40 = sharedPreferences.getBoolean("state40", true);
        boolean state_next40 = sharedPreferences.getBoolean("nextstate40", true);
        if(!state40) {
            btn40.setEnabled(state40);
            btn40.setClickable(state40);
            //btn40.setBackgroundColor(Color.GREEN);
            btn41.setClickable(state_next40);
            btn41.setEnabled(state_next40);
        }

        boolean state41 = sharedPreferences.getBoolean("state41", true);
        boolean state_next41 = sharedPreferences.getBoolean("nextstate41", true);
        if(!state41) {
            btn41.setEnabled(state41);
            btn41.setClickable(state41);
           // btn41.setBackgroundColor(Color.GREEN);
            btn42.setClickable(state_next41);
            btn42.setEnabled(state_next41);
        }

        boolean state42 = sharedPreferences.getBoolean("state42", true);
        boolean state_next42 = sharedPreferences.getBoolean("nextstate42", true);
        if(!state42) {
            btn42.setEnabled(state42);
            btn42.setClickable(state42);
           // btn42.setBackgroundColor(Color.GREEN);
            btn43.setClickable(state_next42);
            btn43.setEnabled(state_next42);
        }

        boolean state43 = sharedPreferences.getBoolean("state43", true);
        boolean state_next43 = sharedPreferences.getBoolean("nextstate43", true);
        if(!state43) {
            btn43.setEnabled(state43);
            btn43.setClickable(state43);
            //btn43.setBackgroundColor(Color.GREEN);
            btn44.setClickable(state_next43);
            btn44.setEnabled(state_next43);
        }

        boolean state44 = sharedPreferences.getBoolean("state44", true);
        boolean state_next44 = sharedPreferences.getBoolean("nextstate44", true);
        if(!state44) {
            btn44.setEnabled(state44);
            btn44.setClickable(state44);
           // btn44.setBackgroundColor(Color.GREEN);
            btn45.setClickable(state_next44);
            btn45.setEnabled(state_next44);
        }

        boolean state45 = sharedPreferences.getBoolean("state45", true);
        boolean state_next45 = sharedPreferences.getBoolean("nextstate45", true);
        if(!state45) {
            btn45.setEnabled(state45);
            btn45.setClickable(state45);
           // btn45.setBackgroundColor(Color.GREEN);
            btn46.setClickable(state_next45);
            btn46.setEnabled(state_next45);
        }

        boolean state46 = sharedPreferences.getBoolean("state46", true);
        boolean state_next46 = sharedPreferences.getBoolean("nextstate46", true);
        if(!state46) {
            btn46.setEnabled(state46);
            btn46.setClickable(state46);
           // btn46.setBackgroundColor(Color.GREEN);
            btn47.setClickable(state_next46);
            btn47.setEnabled(state_next46);
        }

        boolean state47 = sharedPreferences.getBoolean("state47", true);
        boolean state_next47 = sharedPreferences.getBoolean("nextstate47", true);
        if(!state47) {
            btn47.setEnabled(state47);
            btn47.setClickable(state47);
           // btn47.setBackgroundColor(Color.GREEN);
            btn48.setClickable(state_next47);
            btn48.setEnabled(state_next47);
        }

        boolean state48 = sharedPreferences.getBoolean("state48", true);
        boolean state_next48 = sharedPreferences.getBoolean("nextstate48", true);
        if(!state48) {
            btn48.setEnabled(state48);
            btn48.setClickable(state48);
           // btn48.setBackgroundColor(Color.GREEN);
            btn49.setClickable(state_next48);
            btn49.setEnabled(state_next48);
        }

        boolean stat49 = sharedPreferences.getBoolean("state49", true);
        boolean state_next49 = sharedPreferences.getBoolean("nextstate49", true);
        if(!stat49) {
            btn49.setEnabled(stat49);
            btn49.setClickable(stat49);
           // btn49.setBackgroundColor(Color.GREEN);
            btn50.setClickable(state_next49);
            btn50.setEnabled(state_next49);
        }

        boolean state50 = sharedPreferences.getBoolean("state50", true);
        if(!state50) {
            btn50.setEnabled(state50);
            btn50.setClickable(state50);
           // btn50.setBackgroundColor(Color.GREEN);
        }

        sharedPreferences.edit().apply();
    }


    @Override
    public void onBackPressed() {
        UPDATE(0,money);
        Intent i2 = new Intent();
        i2.putExtra("money_result", money);
        i2.putExtra("progress",progress);
        setResult(RESULT_OK, i2);
        finish();
        super.onBackPressed();

    }

    public boolean UPDATE(int Id , int money){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id",Id);
        contentValues.put("countMoney",money);

        //long result = sb.insert("Money",null,contentValues);
        long result = sb.update("Money", contentValues, "id=" + Id, null);
        if (result == -1) {
            //Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            //Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            return true;
        }
    }

    @Override
    protected void onDestroy() {
        SharedPreferences sharedPreferences2 = getSharedPreferences(
                "Saved", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.remove("flags");
        editor.clear();
        editor.apply();
        UPDATE(0,money);
        super.onDestroy();
    }

    private void nextLevel(){
        if(block.equalsIgnoreCase("1")){
            Intent intent2 = new Intent(Main.this,Test.class);
            intent2.putExtra("dictionary","лес");
            intent2.putExtra("lvl",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(Main.this,Test.class);
            intent3.putExtra("dictionary","бал");
            intent3.putExtra("lvl",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(Main.this,Test.class);
            intent4.putExtra("dictionary","ель");
            intent4.putExtra("lvl",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(Main.this,Test.class);
            intent5.putExtra("dictionary","ужас");
            intent5.putExtra("money_data",money);
            intent5.putExtra("lvl",5);
            startActivityForResult(intent5,5);
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(Main.this,Test.class);
            intent6.putExtra("dictionary","факт");
            intent6.putExtra("lvl",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(Main.this,Test.class);
            intent7.putExtra("dictionary","топь");
            intent7.putExtra("lvl",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(Main.this,Test.class);
            intent8.putExtra("dictionary","дочь");
            intent8.putExtra("lvl",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(Main.this,Test.class);
            intent9.putExtra("dictionary","итог");
            intent9.putExtra("lvl",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(Main.this,Test.class);
            intent10.putExtra("dictionary","цинк");
            intent10.putExtra("lvl",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(Main.this,Test.class);
            intent11.putExtra("dictionary","бокс");
            intent11.putExtra("lvl",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(Main.this,Test.class);
            intent12.putExtra("dictionary","блюз");
            intent12.putExtra("money_data",money);
            intent12.putExtra("lvl",12);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(Main.this,Test.class);
            intent13.putExtra("dictionary","цель");
            intent13.putExtra("lvl",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(Main.this,Test.class);
            intent14.putExtra("dictionary","схема");
            intent14.putExtra("lvl",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(Main.this,Test.class);
            intent15.putExtra("dictionary","пират");
            intent15.putExtra("lvl",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }else if(block.equalsIgnoreCase("15")){
            Intent intent16 = new Intent(Main.this,Test.class);
            intent16.putExtra("dictionary","экран");
            intent16.putExtra("money_data",money);
            intent16.putExtra("lvl",16);
            startActivityForResult(intent16,16);
        }else if(block.equalsIgnoreCase("16")){
            Intent intent17 = new Intent(Main.this,Test.class);
            intent17.putExtra("dictionary","ствол");
            intent17.putExtra("money_data",money);
            intent17.putExtra("lvl",17);
            startActivityForResult(intent17,17);
        }else if(block.equalsIgnoreCase("17")){
            Intent intent18 = new Intent(Main.this,Test.class);
            intent18.putExtra("dictionary","талия");
            intent18.putExtra("money_data",money);
            intent18.putExtra("lvl",18);
            startActivityForResult(intent18,18);
        }else if(block.equalsIgnoreCase("18")){
            Intent intent19 = new Intent(Main.this,Test.class);
            intent19.putExtra("dictionary","мячик");
            intent19.putExtra("money_data",money);
            intent19.putExtra("lvl",19);
            startActivityForResult(intent19,19);
        }else if(block.equalsIgnoreCase("19")){
            Intent intent20 = new Intent(Main.this,Test.class);
            intent20.putExtra("dictionary","дробь");
            intent20.putExtra("money_data",money);
            intent20.putExtra("lvl",20);
            startActivityForResult(intent20,20);
        }else if(block.equalsIgnoreCase("20")){
            Intent intent21 = new Intent(Main.this,Test.class);
            intent21.putExtra("dictionary","тиски");
            intent21.putExtra("lvl",21);
            intent21.putExtra("money_data",money);
            startActivityForResult(intent21,21);
        }else if(block.equalsIgnoreCase("21")){
            Intent intent22 = new Intent(Main.this,Test.class);
            intent22.putExtra("dictionary","дрожь");
            intent22.putExtra("lvl",22);
            intent22.putExtra("money_data",money);
            startActivityForResult(intent22,22);
        }else if(block.equalsIgnoreCase("22")){
            Intent intent23 = new Intent(Main.this,Test.class);
            intent23.putExtra("dictionary","сушка");
            intent23.putExtra("lvl",23);
            intent23.putExtra("money_data",money);
            startActivityForResult(intent23,23);
        }else if(block.equalsIgnoreCase("23")){
            Intent intent24 = new Intent(Main.this,Test.class);
            intent24.putExtra("dictionary","гольф");
            intent24.putExtra("lvl",24);
            intent24.putExtra("money_data",money);
            startActivityForResult(intent24,24);
        }else if(block.equalsIgnoreCase("24")){
            Intent intent25 = new Intent(Main.this,Test.class);
            intent25.putExtra("dictionary","берет");
            intent25.putExtra("lvl",25);
            intent25.putExtra("money_data",money);
            startActivityForResult(intent25,25);
        }else if(block.equalsIgnoreCase("25")){
            Intent intent26 = new Intent(Main.this,Test.class);
            intent26.putExtra("dictionary","ларец");
            intent26.putExtra("lvl",26);
            intent26.putExtra("money_data",money);
            startActivityForResult(intent26,26);
        }else if(block.equalsIgnoreCase("26")){
            Intent intent27 = new Intent(Main.this,Test.class);
            intent27.putExtra("dictionary","арена");
            intent27.putExtra("lvl",27);
            intent27.putExtra("money_data",money);
            startActivityForResult(intent27,27);
        }else if(block.equalsIgnoreCase("27")){
            Intent intent28 = new Intent(Main.this,Test.class);
            intent28.putExtra("dictionary","вафля");
            intent28.putExtra("lvl",28);
            intent28.putExtra("money_data",money);
            startActivityForResult(intent28,28);
        }else if(block.equalsIgnoreCase("28")){
            Intent intent29 = new Intent(Main.this,Test.class);
            intent29.putExtra("dictionary","купол");
            intent29.putExtra("lvl",29);
            intent29.putExtra("money_data",money);
            startActivityForResult(intent29,29);
        }else if(block.equalsIgnoreCase("29")){
            Intent intent30 = new Intent(Main.this,Test.class);
            intent30.putExtra("dictionary","дверь");
            intent30.putExtra("lvl",30);
            intent30.putExtra("money_data",money);
            startActivityForResult(intent30,30);
        }else if(block.equalsIgnoreCase("30")){
            Intent intent31 = new Intent(Main.this,Test.class);
            intent31.putExtra("dictionary","альянс");
            intent31.putExtra("lvl",31);
            intent31.putExtra("money_data",money);
            startActivityForResult(intent31,31);
        }else if(block.equalsIgnoreCase("31")){
            Intent intent32 = new Intent(Main.this,Test.class);
            intent32.putExtra("dictionary","почерк");
            intent32.putExtra("lvl",32);
            intent32.putExtra("money_data",money);
            startActivityForResult(intent32,32);
        }else if(block.equalsIgnoreCase("32")){
            Intent intent33 = new Intent(Main.this,Test.class);
            intent33.putExtra("dictionary","офлайн");
            intent33.putExtra("lvl",33);
            intent33.putExtra("money_data",money);
            startActivityForResult(intent33,33);
        }else if(block.equalsIgnoreCase("33")){
            Intent intent34 = new Intent(Main.this,Test.class);
            intent34.putExtra("dictionary","алтарь");
            intent34.putExtra("lvl",34);
            intent34.putExtra("money_data",money);
            startActivityForResult(intent34,34);
        }else if(block.equalsIgnoreCase("34")){
            Intent intent35 = new Intent(Main.this,Test.class);
            intent35.putExtra("dictionary","дранье");
            intent35.putExtra("lvl",35);
            intent35.putExtra("money_data",money);
            startActivityForResult(intent35,35);
        }else if(block.equalsIgnoreCase("35")){
            Intent intent36 = new Intent(Main.this,Test.class);
            intent36.putExtra("dictionary","дворник");
            intent36.putExtra("lvl",36);
            intent36.putExtra("money_data",money);
            startActivityForResult(intent36,36);
        }else if(block.equalsIgnoreCase("36")){
            Intent intent37 = new Intent(Main.this,Test.class);
            intent37.putExtra("dictionary","мозаика");
            intent37.putExtra("lvl",37);
            intent37.putExtra("money_data",money);
            startActivityForResult(intent37,37);
        }else if(block.equalsIgnoreCase("37")){
            Intent intent38 = new Intent(Main.this,Test.class);
            intent38.putExtra("dictionary","дуршлаг");
            intent38.putExtra("lvl",38);
            intent38.putExtra("money_data",money);
            startActivityForResult(intent38,38);
        }else if(block.equalsIgnoreCase("38")){
            Intent intent39 = new Intent(Main.this,Test.class);
            intent39.putExtra("dictionary","виртуоз");
            intent39.putExtra("lvl",39);
            intent39.putExtra("money_data",money);
            startActivityForResult(intent39,39);
        }else if(block.equalsIgnoreCase("39")){
            Intent intent40 = new Intent(Main.this,Test.class);
            intent40.putExtra("dictionary","продюсер");
            intent40.putExtra("lvl",40);
            intent40.putExtra("money_data",money);
            startActivityForResult(intent40,40);
        }else if(block.equalsIgnoreCase("40")){
            Intent intent41 = new Intent(Main.this,Test.class);
            intent41.putExtra("dictionary","капучино");
            intent41.putExtra("lvl",41);
            intent41.putExtra("money_data",money);
            startActivityForResult(intent41,41);
        }else if(block.equalsIgnoreCase("41")){
            Intent intent42 = new Intent(Main.this,Test.class);
            intent42.putExtra("dictionary","кредитка");
            intent42.putExtra("lvl",42);
            intent42.putExtra("money_data",money);
            startActivityForResult(intent42,42);
        }else if(block.equalsIgnoreCase("42")){
            Intent intent43 = new Intent(Main.this,Test.class);
            intent43.putExtra("dictionary","бриллиант");
            intent43.putExtra("lvl",43);
            intent43.putExtra("money_data",money);
            startActivityForResult(intent43,43);
        }else if(block.equalsIgnoreCase("43")){
            Intent intent44 = new Intent(Main.this,Test.class);
            intent44.putExtra("dictionary","адреналин");
            intent44.putExtra("lvl",44);
            intent44.putExtra("money_data",money);
            startActivityForResult(intent44,44);
        }else if(block.equalsIgnoreCase("44")){
            Intent intent45 = new Intent(Main.this,Test.class);
            intent45.putExtra("dictionary","грейпфрут");
            intent45.putExtra("lvl",45);
            intent45.putExtra("money_data",money);
            startActivityForResult(intent45,45);
        }else if(block.equalsIgnoreCase("45")){
            Intent intent46 = new Intent(Main.this,Test.class);
            intent46.putExtra("dictionary","чугуновоз");
            intent46.putExtra("progress",92);
            intent46.putExtra("lvl",46);
            intent46.putExtra("money_data",money);
            startActivityForResult(intent46,46);
        }else if(block.equalsIgnoreCase("46")){
            Intent intent47 = new Intent(Main.this,Test.class);
            intent47.putExtra("dictionary","авитаминоз");
            intent47.putExtra("lvl",47);
            intent47.putExtra("money_data",money);
            startActivityForResult(intent47,47);
        }else if(block.equalsIgnoreCase("47")){
            Intent intent48 = new Intent(Main.this,Test.class);
            intent48.putExtra("dictionary","бензопровод");
            intent48.putExtra("lvl",48);
            intent48.putExtra("money_data",money);
            startActivityForResult(intent48,48);
        }else if(block.equalsIgnoreCase("48")){
            Intent intent49 = new Intent(Main.this,Test.class);
            intent49.putExtra("dictionary","автомобилист");
            intent49.putExtra("lvl",49);
            intent49.putExtra("money_data",money);
            startActivityForResult(intent49,49);
        }else if(block.equalsIgnoreCase("49")){
            Intent intent50 = new Intent(Main.this,Test.class);
            intent50.putExtra("dictionary","свидетельница");
            intent50.putExtra("lvl",50);
            intent50.putExtra("money_data",money);
            startActivityForResult(intent50,50);
        }
    }


}

