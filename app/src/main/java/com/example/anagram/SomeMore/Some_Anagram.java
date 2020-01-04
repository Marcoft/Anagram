package com.example.anagram.SomeMore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import com.example.anagram.R;
import com.example.anagram.databas.DBHelpersPharmacy;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Some_Anagram extends AppCompatActivity {

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

    String block;
    int money = 0;
    String money_result = "" ;

    SharedPreferences sharedPreferences;
    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;
int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some__anagram);
        ButterKnife.bind(this);
        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();

        Intent intent = getIntent();
        money = intent.getIntExtra("moneyToMore", 0);

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

        View dialogView = inflater.inflate(R.layout.result_after_lvl_some_test, null);
        dialogBuilder.setView(dialogView);

        final TextView RightAnswer = (TextView) dialogView.findViewById(R.id.RightAnswer);

        if(numb.equals("1")){
            RightAnswer.setText("Шут , Туш");
        } else  if(numb.equals("2")){
            RightAnswer.setText("Вино , Воин");
        }else  if(numb.equals("3")){
            RightAnswer.setText("Фарш , Шарф");
        }else  if(numb.equals("4")){
            RightAnswer.setText("Полк , Клоп");
        }else  if(numb.equals("5")){
            RightAnswer.setText("Баян , Баня");
        }else  if(numb.equals("6")){
            RightAnswer.setText("Жало , Ложа");
        }else  if(numb.equals("7")){
            RightAnswer.setText("Выбор , Обрыв");
        }else  if(numb.equals("8")){
            RightAnswer.setText("Атлас , Салат");
        }else  if(numb.equals("9")){
            RightAnswer.setText("Бокал , Колба");
        }else  if(numb.equals("10")){
            RightAnswer.setText("Маска , Самка");
        }else  if(numb.equals("11")){
            RightAnswer.setText("Кабан , Банка");
        }else  if(numb.equals("12")){
            RightAnswer.setText("Мышка , Камыш");
        }else  if(numb.equals("13")){
            RightAnswer.setText("Кукла , Кулак");
        }else  if(numb.equals("14")){
            RightAnswer.setText("Лопата , Оплата");
        }else  if(numb.equals("15")){
            RightAnswer.setText("Гарант , Гранат");
        }else  if(numb.equals("16")){
            RightAnswer.setText("Каприз , Приказ");
        }else  if(numb.equals("17")){
            RightAnswer.setText("Плюшка , Шлюпка");
        }else  if(numb.equals("18")){
            RightAnswer.setText("Ромашка , Мошкара");
        }else  if(numb.equals("19")){
            RightAnswer.setText("Осколок , Колосок");
        }else  if(numb.equals("20")){
            RightAnswer.setText("Дорога , Города");
        }else  if(numb.equals("21")){
            RightAnswer.setText("Атлант , Талант");
        }else  if(numb.equals("22")){
            RightAnswer.setText("Петлица , Теплица");
        }else  if(numb.equals("23")){
            RightAnswer.setText("Актер , Терка , Катер");
        }else  if(numb.equals("24")){
            RightAnswer.setText("Шрам , Марш , Шарм");
        }else  if(numb.equals("25")){
            RightAnswer.setText("Карп , Парк , Крап");
        }else  if(numb.equals("26")){
            RightAnswer.setText("Уклон , Клоун , Кулон");
        }else  if(numb.equals("27")){
            RightAnswer.setText("Монета , Немота , Отмена");
        }else  if(numb.equals("28")){
            RightAnswer.setText("Листок , Столик , Слиток");
        }else  if(numb.equals("29")){
            RightAnswer.setText("Рост , Сорт , Торс , Трос");
        }else  if(numb.equals("30")){
            RightAnswer.setText("Автор , Отвар , Рвота , Товар");
        }

        dialogBuilder.create().show();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            return;
        }

        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();

        money_result = data.getStringExtra("money_result");
        money = Integer.parseInt(money_result);


        sharedPreferences = getPreferences(MODE_PRIVATE);
       block = data.getStringExtra("block");
        switch (block) {
            case "0":
                break;
            case "1":
                //btn.setBackgroundColor(Color.GREEN);
                progress = 3;
                btn.setClickable(false);

                btn2.setEnabled(true);
                btn2.setClickable(true);

                resultAfterTest("1");

                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("state", btn.isClickable());
                editor.putBoolean("nextstate", btn2.isClickable());
                editor.apply();
                break;
            case "2":
                //btn2.setBackgroundColor(Color.GREEN);
                progress = 6;
                btn2.setClickable(false);

                btn3.setEnabled(true);
                btn3.setClickable(true);

                resultAfterTest("2");

                SharedPreferences.Editor editor2 = sharedPreferences.edit();
                editor2.putBoolean("state2", btn2.isClickable());
                editor2.putBoolean("nextstate2", btn3.isClickable());
                editor2.apply();
                break;
            case "3":
               // btn3.setBackgroundColor(Color.GREEN);
                progress = 10;
                btn3.setClickable(false);

                btn4.setEnabled(true);
                btn4.setClickable(true);

                resultAfterTest("3");

                SharedPreferences.Editor editor3 = sharedPreferences.edit();
                editor3.putBoolean("state3", btn3.isClickable());
                editor3.putBoolean("nextstate3", btn4.isClickable());
                editor3.apply();
                break;
            case "4":
               // btn4.setBackgroundColor(Color.GREEN);
                progress = 13;
                btn4.setClickable(false);

                btn5.setEnabled(true);
                btn5.setClickable(true);

                resultAfterTest("4");

                SharedPreferences.Editor editor4 = sharedPreferences.edit();
                editor4.putBoolean("state4", btn4.isClickable());
                editor4.putBoolean("nextstate4", btn5.isClickable());
                editor4.apply();
                break;
            case "5":
               // btn5.setBackgroundColor(Color.GREEN);
                progress = 16;
                btn5.setClickable(false);

                btn6.setEnabled(true);
                btn6.setClickable(true);

                resultAfterTest("5");

                SharedPreferences.Editor editor5 = sharedPreferences.edit();
                editor5.putBoolean("state5", btn5.isClickable());
                editor5.putBoolean("nextstate5", btn6.isClickable());
                editor5.apply();
                break;
            case "6":
               // btn6.setBackgroundColor(Color.GREEN);
                progress = 20;
                btn6.setClickable(false);

                btn7.setEnabled(true);
                btn7.setClickable(true);

                resultAfterTest("6");

                SharedPreferences.Editor editor6 = sharedPreferences.edit();
                editor6.putBoolean("state6", btn6.isClickable());
                editor6.putBoolean("nextstate6", btn7.isClickable());
                editor6.apply();
                break;
            case "7":
                //btn7.setBackgroundColor(Color.GREEN);
                progress = 23;
                btn7.setClickable(false);

                btn8.setEnabled(true);
                btn8.setClickable(true);

                resultAfterTest("7");

                SharedPreferences.Editor editor7 = sharedPreferences.edit();
                editor7.putBoolean("state7", btn7.isClickable());
                editor7.putBoolean("nextstate7", btn8.isClickable());
                editor7.apply();
                break;
            case "8":
                //btn8.setBackgroundColor(Color.GREEN);
                progress = 26;
                btn8.setClickable(false);

                btn9.setEnabled(true);
                btn9.setClickable(true);

                resultAfterTest("8");

                SharedPreferences.Editor editor8 = sharedPreferences.edit();
                editor8.putBoolean("state8", btn8.isClickable());
                editor8.putBoolean("nextstate8", btn9.isClickable());
                editor8.apply();
                break;
            case "9":
               //btn9.setBackgroundColor(Color.GREEN);
                progress = 30;
                btn9.setClickable(false);

                btn10.setEnabled(true);
                btn10.setClickable(true);

                resultAfterTest("9");

                SharedPreferences.Editor editor9 = sharedPreferences.edit();
                editor9.putBoolean("state9", btn9.isClickable());
                editor9.putBoolean("nextstate9", btn10.isClickable());
                editor9.apply();
                break;
            case "10":
                //btn10.setBackgroundColor(Color.GREEN);
                progress = 33;
                btn10.setClickable(false);

                btn11.setEnabled(true);
                btn11.setClickable(true);

                resultAfterTest("10");

                SharedPreferences.Editor editor10 = sharedPreferences.edit();
                editor10.putBoolean("state10", btn10.isClickable());
                editor10.putBoolean("nextstate10", btn11.isClickable());
                editor10.apply();
                break;
            case "11":
               // btn11.setBackgroundColor(Color.GREEN);
                progress = 36;
                btn11.setClickable(false);

                btn12.setEnabled(true);
                btn12.setClickable(true);

                resultAfterTest("11");

                SharedPreferences.Editor editor11 = sharedPreferences.edit();
                editor11.putBoolean("state11", btn11.isClickable());
                editor11.putBoolean("nextstate11", btn12.isClickable());
                editor11.apply();
                break;
            case "12":
               // btn12.setBackgroundColor(Color.GREEN);
                progress = 40;
                btn12.setClickable(false);

                btn13.setEnabled(true);
                btn13.setClickable(true);

                resultAfterTest("12");

                SharedPreferences.Editor editor12 = sharedPreferences.edit();
                editor12.putBoolean("state12", btn12.isClickable());
                editor12.putBoolean("nextstate12", btn13.isClickable());
                editor12.apply();
                break;
            case "13":
               // btn13.setBackgroundColor(Color.GREEN);
                progress = 43;
                btn13.setClickable(false);

                btn14.setEnabled(true);
                btn14.setClickable(true);

                resultAfterTest("13");

                SharedPreferences.Editor editor13 = sharedPreferences.edit();
                editor13.putBoolean("state13", btn13.isClickable());
                editor13.putBoolean("nextstate13", btn14.isClickable());
                editor13.apply();
                break;
            case "14":
               // btn14.setBackgroundColor(Color.GREEN);
                progress = 46;
                btn14.setClickable(false);

                btn15.setEnabled(true);
                btn15.setClickable(true);

                resultAfterTest("14");

                SharedPreferences.Editor editor14 = sharedPreferences.edit();
                editor14.putBoolean("state14", btn14.isClickable());
                editor14.putBoolean("nextstate14", btn15.isClickable());
                editor14.apply();
                break;
            case "15":
               // btn15.setBackgroundColor(Color.GREEN);
                progress = 50;
                btn15.setClickable(false);

                btn16.setEnabled(true);
                btn16.setClickable(true);

                resultAfterTest("15");

                SharedPreferences.Editor editor15 = sharedPreferences.edit();
                editor15.putBoolean("state15", btn15.isClickable());
                editor15.putBoolean("nextstate15", btn16.isClickable());
                editor15.apply();
                break;
            case "16":
               // btn16.setBackgroundColor(Color.GREEN);
                progress = 53;
                btn16.setClickable(false);

                btn17.setEnabled(true);
                btn17.setClickable(true);

                resultAfterTest("16");

                SharedPreferences.Editor editor16 = sharedPreferences.edit();
                editor16.putBoolean("state16", btn16.isClickable());
                editor16.putBoolean("nextstate16", btn17.isClickable());
                editor16.apply();
                break;
            case "17":
               // btn17.setBackgroundColor(Color.GREEN);
                progress = 56;
                btn17.setClickable(false);

                btn18.setEnabled(true);
                btn18.setClickable(true);

                resultAfterTest("17");

                SharedPreferences.Editor editor17 = sharedPreferences.edit();
                editor17.putBoolean("state17", btn17.isClickable());
                editor17.putBoolean("nextstate17", btn18.isClickable());
                editor17.apply();
                break;
            case "18":
               // btn18.setBackgroundColor(Color.GREEN);
                progress = 60;
                btn18.setClickable(false);

                btn19.setEnabled(true);
                btn19.setClickable(true);

                resultAfterTest("18");

                SharedPreferences.Editor editor18 = sharedPreferences.edit();
                editor18.putBoolean("state18", btn18.isClickable());
                editor18.putBoolean("nextstate18", btn19.isClickable());
                editor18.apply();
                break;
            case "19":
               // btn19.setBackgroundColor(Color.GREEN);
                progress = 63;
                btn19.setClickable(false);

                btn20.setEnabled(true);
                btn20.setClickable(true);

                resultAfterTest("19");

                SharedPreferences.Editor editor19 = sharedPreferences.edit();
                editor19.putBoolean("state19", btn19.isClickable());
                editor19.putBoolean("nextstate19", btn20.isClickable());
                editor19.apply();
                break;
            case "20":
               // btn20.setBackgroundColor(Color.GREEN);
                progress = 66;
                btn20.setClickable(false);

                btn21.setEnabled(true);
                btn21.setClickable(true);

                resultAfterTest("20");

                SharedPreferences.Editor editor20 = sharedPreferences.edit();
                editor20.putBoolean("state20", btn20.isClickable());
                editor20.putBoolean("nextstate20", btn21.isClickable());
                editor20.apply();
                break;
            case "21":
               // btn21.setBackgroundColor(Color.GREEN);
                progress = 70;
                btn21.setClickable(false);

                btn22.setEnabled(true);
                btn22.setClickable(true);

                resultAfterTest("21");

                SharedPreferences.Editor editor21 = sharedPreferences.edit();
                editor21.putBoolean("state21", btn21.isClickable());
                editor21.putBoolean("nextstate21", btn22.isClickable());
                editor21.apply();
                break;
            case "22":
               // btn22.setBackgroundColor(Color.GREEN);
                progress = 73;
                btn22.setClickable(false);

                btn23.setEnabled(true);
                btn23.setClickable(true);

                resultAfterTest("22");

                SharedPreferences.Editor editor22 = sharedPreferences.edit();
                editor22.putBoolean("state22", btn22.isClickable());
                editor22.putBoolean("nextstate22", btn23.isClickable());
                editor22.apply();
                break;
            case "23":
                //btn23.setBackgroundColor(Color.GREEN);
                progress = 76;
                btn23.setClickable(false);

                btn24.setEnabled(true);
                btn24.setClickable(true);

                resultAfterTest("23");

                SharedPreferences.Editor editor23 = sharedPreferences.edit();
                editor23.putBoolean("state23", btn23.isClickable());
                editor23.putBoolean("nextstate23", btn24.isClickable());
                editor23.apply();
                break;
            case "24":
               // btn24.setBackgroundColor(Color.GREEN);
                progress = 80;
                btn24.setClickable(false);

                btn25.setEnabled(true);
                btn25.setClickable(true);

                resultAfterTest("24");

                SharedPreferences.Editor editor24 = sharedPreferences.edit();
                editor24.putBoolean("state24", btn24.isClickable());
                editor24.putBoolean("nextstate24", btn25.isClickable());
                editor24.apply();
                break;
            case "25":
               // btn25.setBackgroundColor(Color.GREEN);
                progress = 83;
                btn25.setClickable(false);

                btn26.setEnabled(true);
                btn26.setClickable(true);

                resultAfterTest("25");

                SharedPreferences.Editor editor25 = sharedPreferences.edit();
                editor25.putBoolean("state25", btn25.isClickable());
                editor25.putBoolean("nextstate25", btn26.isClickable());
                editor25.apply();
                break;
            case "26":
              //  btn26.setBackgroundColor(Color.GREEN);
                progress = 86;
                btn26.setClickable(false);

                btn27.setEnabled(true);
                btn27.setClickable(true);

                resultAfterTest("26");

                SharedPreferences.Editor editor26 = sharedPreferences.edit();
                editor26.putBoolean("state26", btn26.isClickable());
                editor26.putBoolean("nextstate26", btn27.isClickable());
                editor26.apply();
                break;
            case "27":
               // btn27.setBackgroundColor(Color.GREEN);
                progress = 90;
                btn27.setClickable(false);

                btn28.setEnabled(true);
                btn28.setClickable(true);
                resultAfterTest("27");

                SharedPreferences.Editor editor27 = sharedPreferences.edit();
                editor27.putBoolean("state27", btn27.isClickable());
                editor27.putBoolean("nextstate27", btn28.isClickable());
                editor27.apply();
                break;
            case "28":
               // btn28.setBackgroundColor(Color.GREEN);
                progress = 93;
                btn28.setClickable(false);

                btn29.setEnabled(true);
                btn29.setClickable(true);

                resultAfterTest("28");

                SharedPreferences.Editor editor28 = sharedPreferences.edit();
                editor28.putBoolean("state28", btn28.isClickable());
                editor28.putBoolean("nextstate28", btn29.isClickable());
                editor28.apply();
                break;
            case "29":
                //btn29.setBackgroundColor(Color.GREEN);
                progress = 96;
                btn29.setClickable(false);

                btn30.setEnabled(true);
                btn30.setClickable(true);

                resultAfterTest("29");

                SharedPreferences.Editor editor29 = sharedPreferences.edit();
                editor29.putBoolean("state29", btn29.isClickable());
                editor29.putBoolean("nextstate29", btn30.isClickable());
                editor29.apply();
                break;
            case "30":
               // btn30.setBackgroundColor(Color.GREEN);
                progress = 100;
                btn30.setClickable(false);

                resultAfterTest("30");

                SharedPreferences.Editor editor30 = sharedPreferences.edit();
                editor30.putBoolean("state30", btn30.isClickable());
                editor30.apply();
                break;
            default:
                break;
        }
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("three_someMore", data.getIntExtra("progress", 0));
        editor.apply();
    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.btn:
                Intent intent = new Intent(Some_Anagram.this, SomeMoreTest.class);
                intent.putExtra("dictionary","шут");
                intent.putExtra("dictionary2","туш");
                intent.putExtra("dictionary3","1");
                intent.putExtra("dictionary4","2");
                intent.putExtra("lvls",1);
                intent.putExtra("money_data",money);
                startActivityForResult(intent,1);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent2.putExtra("dictionary","вино");
                intent2.putExtra("dictionary2","воин");
                intent2.putExtra("dictionary3","1");
                intent2.putExtra("dictionary4","2");
                intent2.putExtra("lvls",2);
                intent2.putExtra("money_data",money);
                startActivityForResult(intent2,2);
                break;
            case R.id.btn3:
                Intent intent3 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent3.putExtra("dictionary","фарш");
                intent3.putExtra("dictionary2","шарф");
                intent3.putExtra("dictionary3","1");
                intent3.putExtra("dictionary4","2");
                intent3.putExtra("lvls",3);
                intent3.putExtra("money_data",money);
                startActivityForResult(intent3,3);
                break;
            case R.id.btn4:
                Intent intent4 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent4.putExtra("dictionary","полк");
                intent4.putExtra("dictionary2","клоп");
                intent4.putExtra("dictionary3","1");
                intent4.putExtra("dictionary4","2");
                intent4.putExtra("lvls",4);
                intent4.putExtra("money_data",money);
                startActivityForResult(intent4,4);
                break;
            case R.id.btn5:
                Intent intent5 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent5.putExtra("dictionary","баян");
                intent5.putExtra("dictionary2","баня");
                intent5.putExtra("dictionary3","1");
                intent5.putExtra("dictionary4","2");
                intent5.putExtra("lvls",5);
                intent5.putExtra("money_data",money);
                startActivityForResult(intent5,5);
                break;
            case R.id.btn6:
                Intent intent6 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent6.putExtra("dictionary","жало");
                intent6.putExtra("dictionary2","ложа");
                intent6.putExtra("dictionary3","1");
                intent6.putExtra("dictionary4","2");
                intent6.putExtra("lvls",6);
                intent6.putExtra("money_data",money);
                startActivityForResult(intent6,6);
                break;
            case R.id.btn7:
                Intent intent7 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent7.putExtra("dictionary","выбор");
                intent7.putExtra("dictionary2","обрыв");
                intent7.putExtra("dictionary3","1");
                intent7.putExtra("dictionary4","2");
                intent7.putExtra("lvls",7);
                intent7.putExtra("money_data",money);
                startActivityForResult(intent7,7);
                break;
            case R.id.btn8:
                Intent intent8 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent8.putExtra("dictionary","атлас");
                intent8.putExtra("dictionary2","салат");
                intent8.putExtra("dictionary3","1");
                intent8.putExtra("dictionary4","2");
                intent8.putExtra("lvls",8);
                intent8.putExtra("money_data",money);
                startActivityForResult(intent8,8);
                break;
            case R.id.btn9:
                Intent intent9 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent9.putExtra("dictionary","бокал");
                intent9.putExtra("dictionary2","колба");
                intent9.putExtra("dictionary3","1");
                intent9.putExtra("dictionary4","2");
                intent9.putExtra("lvls",9);
                intent9.putExtra("money_data",money);
                startActivityForResult(intent9,9);
                break;
            case R.id.btn10:
                Intent intent10 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent10.putExtra("dictionary","маска");
                intent10.putExtra("dictionary2","самка");
                intent10.putExtra("dictionary3","1");
                intent10.putExtra("dictionary4","2");
                intent10.putExtra("lvls",10);
                intent10.putExtra("money_data",money);
                startActivityForResult(intent10,10);
                break;
            case R.id.btn11:
                Intent intent11 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent11.putExtra("dictionary","кабан");
                intent11.putExtra("dictionary2","банка");
                intent11.putExtra("dictionary3","1");
                intent11.putExtra("dictionary4","2");
                intent11.putExtra("lvls",11);
                intent11.putExtra("money_data",money);
                startActivityForResult(intent11,11);
                break;
            case R.id.btn12:
                Intent intent12 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent12.putExtra("dictionary","мышка");
                intent12.putExtra("dictionary2","камыш");
                intent12.putExtra("dictionary3","1");
                intent12.putExtra("dictionary4","2");
                intent12.putExtra("lvls",12);
                intent12.putExtra("money_data",money);
                startActivityForResult(intent12,12);
                break;
            case R.id.btn13:
                Intent intent13 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent13.putExtra("dictionary","кукла");
                intent13.putExtra("dictionary2","кулак");
                intent13.putExtra("dictionary3","1");
                intent13.putExtra("dictionary4","2");
                intent13.putExtra("lvls",13);
                intent13.putExtra("money_data",money);
                startActivityForResult(intent13,13);
                break;
            case R.id.btn14:
                Intent intent14 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent14.putExtra("dictionary","лопата");
                intent14.putExtra("dictionary2","оплата");
                intent14.putExtra("dictionary3","1");
                intent14.putExtra("dictionary4","2");
                intent14.putExtra("lvls",14);
                intent14.putExtra("money_data",money);
                startActivityForResult(intent14,14);
                break;
            case R.id.btn15:
                Intent intent15 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent15.putExtra("dictionary","гарант");
                intent15.putExtra("dictionary2","гранат");
                intent15.putExtra("dictionary3","1");
                intent15.putExtra("dictionary4","2");
                intent15.putExtra("lvls",15);
                intent15.putExtra("money_data",money);
                startActivityForResult(intent15,15);
                break;
            case R.id.btn16:
                Intent intent16 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent16.putExtra("dictionary","каприз");
                intent16.putExtra("dictionary2","приказ");
                intent16.putExtra("dictionary3","1");
                intent16.putExtra("dictionary4","2");
                intent16.putExtra("lvls",16);
                intent16.putExtra("money_data",money);
                startActivityForResult(intent16,16);
                break;
            case R.id.btn17:
                Intent intent17 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent17.putExtra("dictionary","плюшка");
                intent17.putExtra("dictionary2","шлюпка");
                intent17.putExtra("dictionary3","1");
                intent17.putExtra("dictionary4","2");
                intent17.putExtra("lvls",17);
                intent17.putExtra("money_data",money);
                startActivityForResult(intent17,17);
                break;
            case R.id.btn18:
                Intent intent18 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent18.putExtra("dictionary","ромашка");
                intent18.putExtra("dictionary2","мошкара");
                intent18.putExtra("dictionary3","1");
                intent18.putExtra("dictionary4","2");
                intent18.putExtra("lvls",18);
                intent18.putExtra("money_data",money);
                startActivityForResult(intent18,18);
                break;
            case R.id.btn19:
                Intent intent19 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent19.putExtra("dictionary","осколок");
                intent19.putExtra("dictionary2","колосок");
                intent19.putExtra("dictionary3","1");
                intent19.putExtra("dictionary4","2");
                intent19.putExtra("lvls",19);
                intent19.putExtra("money_data",money);
                startActivityForResult(intent19,19);
                break;
            case R.id.btn20:
                Intent intent20 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent20.putExtra("dictionary","дорога");
                intent20.putExtra("dictionary2","города");
                intent20.putExtra("dictionary3","1");
                intent20.putExtra("dictionary4","2");
                intent20.putExtra("lvls",20);
                intent20.putExtra("money_data",money);
                startActivityForResult(intent20,20);
                break;
            case R.id.btn21:
                Intent intent21 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent21.putExtra("dictionary","атлант");
                intent21.putExtra("dictionary2","талант");
                intent21.putExtra("dictionary3","1");
                intent21.putExtra("dictionary4","2");
                intent21.putExtra("lvls",21);
                intent21.putExtra("money_data",money);
                startActivityForResult(intent21,21);
                break;
            case R.id.btn22:
                Intent intent22 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent22.putExtra("dictionary","петлица");
                intent22.putExtra("dictionary2","теплица");
                intent22.putExtra("dictionary3","1");
                intent22.putExtra("dictionary4","2");
                intent22.putExtra("lvls",22);
                intent22.putExtra("money_data",money);
                startActivityForResult(intent22,22);
                break;
            case R.id.btn23:
                Intent intent23 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent23.putExtra("dictionary","актер");
                intent23.putExtra("dictionary2","терка");
                intent23.putExtra("dictionary3","катер");
                intent23.putExtra("dictionary4","2");
                intent23.putExtra("lvls",23);
                intent23.putExtra("money_data",money);
                startActivityForResult(intent23,23);
                break;
            case R.id.btn24:
                Intent intent24 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent24.putExtra("dictionary","шрам");
                intent24.putExtra("dictionary2","марш");
                intent24.putExtra("dictionary3","шарм");
                intent24.putExtra("dictionary4","2");
                intent24.putExtra("lvls",24);
                intent24.putExtra("money_data",money);
                startActivityForResult(intent24,24);
                break;
            case R.id.btn25:
                Intent intent25 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent25.putExtra("dictionary","карп");
                intent25.putExtra("dictionary2","парк");
                intent25.putExtra("dictionary3","крап");
                intent25.putExtra("dictionary4","2");
                intent25.putExtra("lvls",25);
                intent25.putExtra("money_data",money);
                startActivityForResult(intent25,25);
                break;
            case R.id.btn26:
                Intent intent26 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent26.putExtra("dictionary","уклон");
                intent26.putExtra("dictionary2","клоун");
                intent26.putExtra("dictionary3","кулон");
                intent26.putExtra("dictionary4","2");
                intent26.putExtra("lvls",26);
                intent26.putExtra("money_data",money);
                startActivityForResult(intent26,26);
                break;
            case R.id.btn27:
                Intent intent27 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent27.putExtra("dictionary","монета");
                intent27.putExtra("dictionary2","немота");
                intent27.putExtra("dictionary3","отмена");
                intent27.putExtra("dictionary4","2");
                intent27.putExtra("lvls",27);
                intent27.putExtra("money_data",money);
                startActivityForResult(intent27,27);
                break;
            case R.id.btn28:
                Intent intent28 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent28.putExtra("dictionary","листок");
                intent28.putExtra("dictionary2","столик");
                intent28.putExtra("dictionary3","слиток");
                intent28.putExtra("dictionary4","2");
                intent28.putExtra("lvls",28);
                intent28.putExtra("money_data",money);
                startActivityForResult(intent28,28);
                break;
            case R.id.btn29:
                Intent intent29 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent29.putExtra("dictionary","рост");
                intent29.putExtra("dictionary2","сорт");
                intent29.putExtra("dictionary3","торс");
                intent29.putExtra("dictionary4","трос");
                intent29.putExtra("lvls",29);
                intent29.putExtra("money_data",money);
                startActivityForResult(intent29,29);
                break;
            case R.id.btn30:
                Intent intent30 = new Intent(Some_Anagram.this,SomeMoreTest.class);
                intent30.putExtra("dictionary","автор");
                intent30.putExtra("dictionary2","отвар");
                intent30.putExtra("dictionary3","рвота");
                intent30.putExtra("dictionary4","товар");
                intent30.putExtra("lvls",30);
                intent30.putExtra("money_data",money);
                startActivityForResult(intent30,30);
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
            btn.setEnabled(state);
            btn.setClickable(state);
            //btn.setBackgroundColor(Color.GREEN);
            btn2.setClickable(state_next);
            btn2.setEnabled(state_next);
        }

        boolean state2 = sharedPreferences.getBoolean("state2", true);
        boolean state_next2 = sharedPreferences.getBoolean("nextstate2", true);
        if(!state2) {
            btn2.setEnabled(state2);
            btn2.setClickable(state2);
            //btn2.setBackgroundColor(Color.GREEN);
            btn3.setClickable(state_next2);
            btn3.setEnabled(state_next2);
        }

        boolean state3 = sharedPreferences.getBoolean("state3", true);
        boolean state_next3 = sharedPreferences.getBoolean("nextstate3", true);
        if(!state3) {
            btn3.setEnabled(state3);
            btn3.setClickable(state3);
            //btn3.setBackgroundColor(Color.GREEN);
            btn4.setClickable(state_next3);
            btn4.setEnabled(state_next3);
        }

        boolean state4 = sharedPreferences.getBoolean("state4", true);
        boolean state_next4 = sharedPreferences.getBoolean("nextstate4", true);
        if(!state4) {
            btn4.setEnabled(state4);
            btn4.setClickable(state4);
            //btn4.setBackgroundColor(Color.GREEN);
            btn5.setClickable(state_next4);
            btn5.setEnabled(state_next4);
        }

        boolean state5 = sharedPreferences.getBoolean("state5", true);
        boolean state_next5 = sharedPreferences.getBoolean("nextstate5", true);
        if(!state5) {
            btn5.setEnabled(state5);
            btn5.setClickable(state5);
            //btn5.setBackgroundColor(Color.GREEN);
            btn6.setClickable(state_next5);
            btn6.setEnabled(state_next5);
        }

        boolean state6 = sharedPreferences.getBoolean("state6", true);
        boolean state_next6 = sharedPreferences.getBoolean("nextstate6", true);
        if(!state6) {
            btn6.setEnabled(state6);
            btn6.setClickable(state6);
           // btn6.setBackgroundColor(Color.GREEN);
            btn7.setClickable(state_next6);
            btn7.setEnabled(state_next6);
        }

        boolean state7 = sharedPreferences.getBoolean("state7", true);
        boolean state_next7 = sharedPreferences.getBoolean("nextstate7", true);
        if(!state7) {
            btn7.setEnabled(state7);
            btn7.setClickable(state7);
            //btn7.setBackgroundColor(Color.GREEN);
            btn8.setClickable(state_next7);
            btn8.setEnabled(state_next7);
        }

        boolean state8 = sharedPreferences.getBoolean("state8", true);
        boolean state_next8 = sharedPreferences.getBoolean("nextstate8", true);
        if(!state8) {
            btn8.setEnabled(state8);
            btn8.setClickable(state8);
           // btn8.setBackgroundColor(Color.GREEN);
            btn9.setClickable(state_next8);
            btn9.setEnabled(state_next8);
        }

        boolean state9 = sharedPreferences.getBoolean("state9", true);
        boolean state_next9 = sharedPreferences.getBoolean("nextstate9", true);
        if(!state9) {
            btn9.setEnabled(state9);
            btn9.setClickable(state9);
           // btn9.setBackgroundColor(Color.GREEN);
            btn10.setClickable(state_next9);
            btn10.setEnabled(state_next9);
        }

        boolean state10 = sharedPreferences.getBoolean("state10", true);
        boolean state_next10 = sharedPreferences.getBoolean("nextstate10", true);
        if(!state10) {
            btn10.setEnabled(state10);
            btn10.setClickable(state10);
           // btn10.setBackgroundColor(Color.GREEN);
            btn11.setClickable(state_next10);
            btn11.setEnabled(state_next10);
        }

        boolean state11 = sharedPreferences.getBoolean("state11", true);
        boolean state_next11 = sharedPreferences.getBoolean("nextstate11", true);
        if(!state11) {
            btn11.setEnabled(state11);
            btn11.setClickable(state11);
           // btn11.setBackgroundColor(Color.GREEN);
            btn12.setClickable(state_next11);
            btn12.setEnabled(state_next11);
        }

        boolean state12 = sharedPreferences.getBoolean("state12", true);
        boolean state_next12 = sharedPreferences.getBoolean("nextstate12", true);
        if(!state12) {
            btn12.setEnabled(state12);
            btn12.setClickable(state12);
           // btn12.setBackgroundColor(Color.GREEN);
            btn13.setClickable(state_next12);
            btn13.setEnabled(state_next12);
        }

        boolean state13 = sharedPreferences.getBoolean("state13", true);
        boolean state_next13 = sharedPreferences.getBoolean("nextstate13", true);
        if(!state13) {
            btn13.setEnabled(state13);
            btn13.setClickable(state13);
           // btn13.setBackgroundColor(Color.GREEN);
            btn14.setClickable(state_next13);
            btn14.setEnabled(state_next13);
        }

        boolean state14 = sharedPreferences.getBoolean("state14", true);
        boolean state_next14 = sharedPreferences.getBoolean("nextstate14", true);
        if(!state14) {
            btn14.setEnabled(state14);
            btn14.setClickable(state14);
           // btn14.setBackgroundColor(Color.GREEN);
            btn15.setClickable(state_next14);
            btn15.setEnabled(state_next14);
        }

        boolean state15 = sharedPreferences.getBoolean("state15", true);
        boolean state_next15 = sharedPreferences.getBoolean("nextstate15", true);
        if(!state15) {
            btn15.setEnabled(state15);
            btn15.setClickable(state15);
           // btn15.setBackgroundColor(Color.GREEN);
            btn16.setClickable(state_next15);
            btn16.setEnabled(state_next15);
        }

        boolean state16 = sharedPreferences.getBoolean("state16", true);
        boolean state_next16 = sharedPreferences.getBoolean("nextstate16", true);
        if(!state16) {
            btn16.setEnabled(state16);
            btn16.setClickable(state16);
           // btn16.setBackgroundColor(Color.GREEN);
            btn17.setClickable(state_next16);
            btn17.setEnabled(state_next16);
        }

        boolean state17 = sharedPreferences.getBoolean("state17", true);
        boolean state_next17 = sharedPreferences.getBoolean("nextstate17", true);
        if(!state17) {
            btn17.setEnabled(state17);
            btn17.setClickable(state17);
           // btn17.setBackgroundColor(Color.GREEN);
            btn18.setClickable(state_next17);
            btn18.setEnabled(state_next17);
        }

        boolean state18 = sharedPreferences.getBoolean("state18", true);
        boolean state_next18 = sharedPreferences.getBoolean("nextstate18", true);
        if(!state18) {
            btn18.setEnabled(state18);
            btn18.setClickable(state18);
           // btn18.setBackgroundColor(Color.GREEN);
            btn19.setClickable(state_next18);
            btn19.setEnabled(state_next18);
        }

        boolean state19 = sharedPreferences.getBoolean("state19", true);
        boolean state_next19 = sharedPreferences.getBoolean("nextstate19", true);
        if(!state19) {
            btn19.setEnabled(state19);
            btn19.setClickable(state19);
           // btn19.setBackgroundColor(Color.GREEN);
            btn20.setClickable(state_next19);
            btn20.setEnabled(state_next19);
        }

        boolean state20 = sharedPreferences.getBoolean("state20", true);
        boolean state_next20 = sharedPreferences.getBoolean("nextstate20", true);
        if(!state20) {
            btn20.setEnabled(state20);
            btn20.setClickable(state20);
           // btn20.setBackgroundColor(Color.GREEN);
            btn21.setClickable(state_next20);
            btn21.setEnabled(state_next20);
        }

        boolean state21 = sharedPreferences.getBoolean("state21", true);
        boolean state_next21 = sharedPreferences.getBoolean("nextstate21", true);
        if(!state21) {
            btn21.setEnabled(state21);
            btn21.setClickable(state21);
           // btn21.setBackgroundColor(Color.GREEN);
            btn22.setClickable(state_next21);
            btn22.setEnabled(state_next21);
        }

        boolean state22 = sharedPreferences.getBoolean("state22", true);
        boolean state_next22 = sharedPreferences.getBoolean("nextstate22", true);
        if(!state22) {
            btn22.setEnabled(state22);
            btn22.setClickable(state22);
           // btn22.setBackgroundColor(Color.GREEN);
            btn23.setClickable(state_next22);
            btn23.setEnabled(state_next22);
        }

        boolean state23 = sharedPreferences.getBoolean("state23", true);
        boolean state_next23 = sharedPreferences.getBoolean("nextstate23", true);
        if(!state23) {
            btn23.setEnabled(state23);
            btn23.setClickable(state23);
           // btn23.setBackgroundColor(Color.GREEN);
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
           // btn25.setBackgroundColor(Color.GREEN);
            btn26.setClickable(state_next25);
            btn26.setEnabled(state_next25);
        }

        boolean state26 = sharedPreferences.getBoolean("state26", true);
        boolean state_next26 = sharedPreferences.getBoolean("nextstate26", true);
        if(!state26) {
            btn26.setEnabled(state26);
            btn26.setClickable(state26);
           // btn26.setBackgroundColor(Color.GREEN);
            btn27.setClickable(state_next26);
            btn27.setEnabled(state_next26);
        }

        boolean state27 = sharedPreferences.getBoolean("state27", true);
        boolean state_next27 = sharedPreferences.getBoolean("nextstate27", true);
        if(!state27) {
            btn27.setEnabled(state27);
            btn27.setClickable(state27);
           // btn27.setBackgroundColor(Color.GREEN);
            btn28.setClickable(state_next27);
            btn28.setEnabled(state_next27);
        }

        boolean state28 = sharedPreferences.getBoolean("state28", true);
        boolean state_next28 = sharedPreferences.getBoolean("nextstate28", true);
        if(!state28) {
            btn28.setEnabled(state28);
            btn28.setClickable(state28);
           // btn28.setBackgroundColor(Color.GREEN);
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
        if(!state30) {
            btn30.setEnabled(state30);
            btn30.setClickable(state30);
           // btn30.setBackgroundColor(Color.GREEN);
        }

        sharedPreferences.edit().apply();
    }


    @Override
    public void onBackPressed() {
        UPDATE(0,money);
        Intent i2 = new Intent();
        i2.putExtra("money_result", money);
        i2.putExtra("progress", progress);
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
            Intent intent2 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent2.putExtra("dictionary","вино");
            intent2.putExtra("dictionary2","воин");
            intent2.putExtra("dictionary3","1");
            intent2.putExtra("dictionary4","2");
            intent2.putExtra("lvls",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent3.putExtra("dictionary","фарш");
            intent3.putExtra("dictionary2","шарф");
            intent3.putExtra("dictionary3","1");
            intent3.putExtra("dictionary4","2");
            intent3.putExtra("lvls",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent4.putExtra("dictionary","полк");
            intent4.putExtra("dictionary2","клоп");
            intent4.putExtra("dictionary3","1");
            intent4.putExtra("dictionary4","2");
            intent4.putExtra("lvls",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent5.putExtra("dictionary","баян");
            intent5.putExtra("dictionary2","баня");
            intent5.putExtra("dictionary3","1");
            intent5.putExtra("dictionary4","2");
            intent5.putExtra("lvls",5);
            intent5.putExtra("money_data",money);
            startActivityForResult(intent5,5);
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent6.putExtra("dictionary","жало");
            intent6.putExtra("dictionary2","ложа");
            intent6.putExtra("dictionary3","1");
            intent6.putExtra("dictionary4","2");
            intent6.putExtra("lvls",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent7.putExtra("dictionary","выбор");
            intent7.putExtra("dictionary2","обрыв");
            intent7.putExtra("dictionary3","1");
            intent7.putExtra("dictionary4","2");
            intent7.putExtra("lvls",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent8.putExtra("dictionary","атлас");
            intent8.putExtra("dictionary2","салат");
            intent8.putExtra("dictionary3","1");
            intent8.putExtra("dictionary4","2");
            intent8.putExtra("lvls",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent9.putExtra("dictionary","бокал");
            intent9.putExtra("dictionary2","колба");
            intent9.putExtra("dictionary3","1");
            intent9.putExtra("dictionary4","2");
            intent9.putExtra("lvls",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent10.putExtra("dictionary","маска");
            intent10.putExtra("dictionary2","самка");
            intent10.putExtra("dictionary3","1");
            intent10.putExtra("dictionary4","2");
            intent10.putExtra("lvls",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent11.putExtra("dictionary","кабан");
            intent11.putExtra("dictionary2","банка");
            intent11.putExtra("dictionary3","1");
            intent11.putExtra("dictionary4","2");
            intent11.putExtra("lvls",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent12.putExtra("dictionary","мышка");
            intent12.putExtra("dictionary2","камыш");
            intent12.putExtra("dictionary3","1");
            intent12.putExtra("dictionary4","2");
            intent12.putExtra("lvls",12);
            intent12.putExtra("money_data",money);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent13.putExtra("dictionary","кукла");
            intent13.putExtra("dictionary2","кулак");
            intent13.putExtra("dictionary3","1");
            intent13.putExtra("dictionary4","2");
            intent13.putExtra("lvls",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent14.putExtra("dictionary","лопата");
            intent14.putExtra("dictionary2","оплата");
            intent14.putExtra("dictionary3","1");
            intent14.putExtra("dictionary4","2");
            intent14.putExtra("lvls",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent15.putExtra("dictionary","гарант");
            intent15.putExtra("dictionary2","гранат");
            intent15.putExtra("dictionary3","1");
            intent15.putExtra("dictionary4","2");
            intent15.putExtra("lvls",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }else if(block.equalsIgnoreCase("15")){
            Intent intent16 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent16.putExtra("dictionary","каприз");
            intent16.putExtra("dictionary2","приказ");
            intent16.putExtra("dictionary3","1");
            intent16.putExtra("dictionary4","2");
            intent16.putExtra("lvls",16);
            intent16.putExtra("money_data",money);
            startActivityForResult(intent16,16);
        }else if(block.equalsIgnoreCase("16")){
            Intent intent17 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent17.putExtra("dictionary","плюшка");
            intent17.putExtra("dictionary2","шлюпка");
            intent17.putExtra("dictionary3","1");
            intent17.putExtra("dictionary4","2");
            intent17.putExtra("lvls",17);
            intent17.putExtra("money_data",money);
            startActivityForResult(intent17,17);
        }else if(block.equalsIgnoreCase("17")){
            Intent intent18 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent18.putExtra("dictionary","ромашка");
            intent18.putExtra("dictionary2","мошкара");
            intent18.putExtra("dictionary3","1");
            intent18.putExtra("dictionary4","2");
            intent18.putExtra("lvls",18);
            intent18.putExtra("money_data",money);
            startActivityForResult(intent18,18);
        }else if(block.equalsIgnoreCase("18")){
            Intent intent19 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent19.putExtra("dictionary","осколок");
            intent19.putExtra("dictionary2","колосок");
            intent19.putExtra("dictionary3","1");
            intent19.putExtra("dictionary4","2");
            intent19.putExtra("lvls",19);
            intent19.putExtra("money_data",money);
            startActivityForResult(intent19,19);
        }else if(block.equalsIgnoreCase("19")){
            Intent intent20 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent20.putExtra("dictionary","дорога");
            intent20.putExtra("dictionary2","города");
            intent20.putExtra("dictionary3","1");
            intent20.putExtra("dictionary4","2");
            intent20.putExtra("lvls",20);
            intent20.putExtra("money_data",money);
            startActivityForResult(intent20,20);
        }else if(block.equalsIgnoreCase("20")){
            Intent intent21 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent21.putExtra("dictionary","атлант");
            intent21.putExtra("dictionary2","талант");
            intent21.putExtra("dictionary3","1");
            intent21.putExtra("dictionary4","2");
            intent21.putExtra("lvls",21);
            intent21.putExtra("money_data",money);
            startActivityForResult(intent21,21);
        }else if(block.equalsIgnoreCase("21")){
            Intent intent22 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent22.putExtra("dictionary","петлица");
            intent22.putExtra("dictionary2","теплица");
            intent22.putExtra("dictionary3","1");
            intent22.putExtra("dictionary4","2");
            intent22.putExtra("lvls",22);
            intent22.putExtra("money_data",money);
            startActivityForResult(intent22,22);
        }else if(block.equalsIgnoreCase("22")){
            Intent intent23 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent23.putExtra("dictionary","актер");
            intent23.putExtra("dictionary2","терка");
            intent23.putExtra("dictionary3","катер");
            intent23.putExtra("dictionary4","2");
            intent23.putExtra("lvls",23);
            intent23.putExtra("money_data",money);
            startActivityForResult(intent23,23);
        }else if(block.equalsIgnoreCase("23")){
            Intent intent24 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent24.putExtra("dictionary","шрам");
            intent24.putExtra("dictionary2","марш");
            intent24.putExtra("dictionary3","шарм");
            intent24.putExtra("dictionary4","2");
            intent24.putExtra("lvls",24);
            intent24.putExtra("money_data",money);
            startActivityForResult(intent24,24);
        }else if(block.equalsIgnoreCase("24")){
            Intent intent25 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent25.putExtra("dictionary","карп");
            intent25.putExtra("dictionary2","парк");
            intent25.putExtra("dictionary3","крап");
            intent25.putExtra("dictionary4","2");
            intent25.putExtra("lvls",25);
            intent25.putExtra("money_data",money);
            startActivityForResult(intent25,25);
        }else if(block.equalsIgnoreCase("25")){
            Intent intent26 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent26.putExtra("dictionary","уклон");
            intent26.putExtra("dictionary2","клоун");
            intent26.putExtra("dictionary3","кулон");
            intent26.putExtra("dictionary4","2");
            intent26.putExtra("lvls",26);
            intent26.putExtra("money_data",money);
            startActivityForResult(intent26,26);
        }else if(block.equalsIgnoreCase("26")){
            Intent intent27 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent27.putExtra("dictionary","монета");
            intent27.putExtra("dictionary2","немота");
            intent27.putExtra("dictionary3","отмена");
            intent27.putExtra("dictionary4","2");
            intent27.putExtra("lvls",27);
            intent27.putExtra("money_data",money);
            startActivityForResult(intent27,27);
        }else if(block.equalsIgnoreCase("27")){
            Intent intent28 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent28.putExtra("dictionary","листок");
            intent28.putExtra("dictionary2","столик");
            intent28.putExtra("dictionary3","слиток");
            intent28.putExtra("dictionary4","2");
            intent28.putExtra("lvls",28);
            intent28.putExtra("money_data",money);
            startActivityForResult(intent28,28);
        }else if(block.equalsIgnoreCase("28")){
            Intent intent29 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent29.putExtra("dictionary","рост");
            intent29.putExtra("dictionary2","сорт");
            intent29.putExtra("dictionary3","торс");
            intent29.putExtra("dictionary4","трос");
            intent29.putExtra("lvls",29);
            intent29.putExtra("money_data",money);
            startActivityForResult(intent29,29);
        }else if(block.equalsIgnoreCase("29")){
            Intent intent30 = new Intent(Some_Anagram.this,SomeMoreTest.class);
            intent30.putExtra("dictionary","автор");
            intent30.putExtra("dictionary2","отвар");
            intent30.putExtra("dictionary3","рвота");
            intent30.putExtra("dictionary4","товар");
            intent30.putExtra("lvls",30);
            intent30.putExtra("money_data",money);
            startActivityForResult(intent30,30);
        }
    }
}
