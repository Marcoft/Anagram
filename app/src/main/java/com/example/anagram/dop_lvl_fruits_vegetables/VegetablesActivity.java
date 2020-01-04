package com.example.anagram.dop_lvl_fruits_vegetables;

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
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.anagram.R;
import com.example.anagram.databas.DBHelpersPharmacy;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VegetablesActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;
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


    String block = "";
    int money = 0;
    String money_result = "" ;

    SharedPreferences sharedPreferences;
    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;

    int progress = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);


        ButterKnife.bind(this);
        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();
        Intent intent = getIntent();
        money = intent.getIntExtra("moneyToMore", 0);


        LoadPreferences();

    }

    private void nextLevel(){
        if(block.equalsIgnoreCase("1")){
            Intent intent2 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent2.putExtra("dictionary","горох");
            intent2.putExtra("lvl",2);
            intent2.putExtra("money_data",money);
            startActivityForResult(intent2,2);
        }else if(block.equalsIgnoreCase("2")){
            Intent intent3 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent3.putExtra("dictionary","тыква");
            intent3.putExtra("lvl",3);
            intent3.putExtra("money_data",money);
            startActivityForResult(intent3,3);
        }else if(block.equalsIgnoreCase("3")){
            Intent intent4 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent4.putExtra("dictionary","перец");
            intent4.putExtra("lvl",4);
            intent4.putExtra("money_data",money);
            startActivityForResult(intent4,4);
        }else if(block.equalsIgnoreCase("4")){
            Intent intent5 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent5.putExtra("dictionary","чеснок");
            intent5.putExtra("money_data",money);
            intent5.putExtra("lvl",5);
            startActivityForResult(intent5,5);
        }else if(block.equalsIgnoreCase("5")){
            Intent intent6 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent6.putExtra("dictionary","свекла");
            intent6.putExtra("lvl",6);
            intent6.putExtra("money_data",money);
            startActivityForResult(intent6,6);
        }else if(block.equalsIgnoreCase("6")){
            Intent intent7 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent7.putExtra("dictionary","огурец");
            intent7.putExtra("lvl",7);
            intent7.putExtra("money_data",money);
            startActivityForResult(intent7,7);
        }else if(block.equalsIgnoreCase("7")){
            Intent intent8 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent8.putExtra("dictionary","спаржа");
            intent8.putExtra("lvl",8);
            intent8.putExtra("money_data",money);
            startActivityForResult(intent8,8);
        }else if(block.equalsIgnoreCase("8")){
            Intent intent9 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent9.putExtra("dictionary","морковь");
            intent9.putExtra("lvl",9);
            intent9.putExtra("money_data",money);
            startActivityForResult(intent9,9);
        }else if(block.equalsIgnoreCase("9")){
            Intent intent10 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent10.putExtra("dictionary","базилик");
            intent10.putExtra("lvl",10);
            intent10.putExtra("money_data",money);
            startActivityForResult(intent10,10);
        }else if(block.equalsIgnoreCase("10")){
            Intent intent11 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent11.putExtra("dictionary","помидор");
            intent11.putExtra("lvl",11);
            intent11.putExtra("money_data",money);
            startActivityForResult(intent11,11);
        }else if(block.equalsIgnoreCase("11")){
            Intent intent12 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent12.putExtra("dictionary","кукуруза");
            intent12.putExtra("money_data",money);
            intent12.putExtra("lvl",12);
            startActivityForResult(intent12,12);
        }else if(block.equalsIgnoreCase("12")){
            Intent intent13 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent13.putExtra("dictionary","брокколи");
            intent13.putExtra("lvl",13);
            intent13.putExtra("money_data",money);
            startActivityForResult(intent13,13);
        }else if(block.equalsIgnoreCase("13")){
            Intent intent14 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent14.putExtra("dictionary","баклажан");
            intent14.putExtra("lvl",14);
            intent14.putExtra("money_data",money);
            startActivityForResult(intent14,14);
        }else if(block.equalsIgnoreCase("14")){
            Intent intent15 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
            intent15.putExtra("dictionary","картофель");
            intent15.putExtra("lvl",15);
            intent15.putExtra("money_data",money);
            startActivityForResult(intent15,15);
        }
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

        View dialogView = inflater.inflate(R.layout.result_after_lvl_photo, null);
        dialogBuilder.setView(dialogView);

        final ImageButton imgPicture = (ImageButton) dialogView.findViewById(R.id.imgPicture);
        final TextView RightAnswer = (TextView) dialogView.findViewById(R.id.RightAnswer);

        if(numb.equals("1")){
            imgPicture.setImageResource(R.drawable.luk_orig);
            RightAnswer.setText("Лук");
        } else  if(numb.equals("2")){
            imgPicture.setImageResource(R.drawable.goroh_orig);
            RightAnswer.setText("Горох");
        }else  if(numb.equals("3")){
            imgPicture.setImageResource(R.drawable.tikva_orig);
            RightAnswer.setText("Тыква");
        }else  if(numb.equals("4")){
            imgPicture.setImageResource(R.drawable.perec_orig);
            RightAnswer.setText("Перец");
        }else  if(numb.equals("5")){
            imgPicture.setImageResource(R.drawable.chesnok_orig);
            RightAnswer.setText("Чеснок");
        }else  if(numb.equals("6")){
            imgPicture.setImageResource(R.drawable.svekla_orig);
            RightAnswer.setText("Свекла");
        }else  if(numb.equals("7")){
            imgPicture.setImageResource(R.drawable.ogurci_orig);
            RightAnswer.setText("Огурец");
        }else  if(numb.equals("8")){
            imgPicture.setImageResource(R.drawable.sparsha_orig);
            RightAnswer.setText("Спаржа");
        }else  if(numb.equals("9")){
            imgPicture.setImageResource(R.drawable.morkov_orig);
            RightAnswer.setText("Морковь");
        }else  if(numb.equals("10")){
            imgPicture.setImageResource(R.drawable.bazilir_orig);
            RightAnswer.setText("Базилик");
        }else  if(numb.equals("11")){
            imgPicture.setImageResource(R.drawable.pomidor_orig);
            RightAnswer.setText("помидор");
        }else  if(numb.equals("12")){
            imgPicture.setImageResource(R.drawable.kukuruza_orig);
            RightAnswer.setText("Кукуруза");
        }else  if(numb.equals("13")){
            imgPicture.setImageResource(R.drawable.brokkoli_orig);
            RightAnswer.setText("Брокколи");
        }else  if(numb.equals("14")){
            imgPicture.setImageResource(R.drawable.baklashan_orig);
            RightAnswer.setText("Баклажан");
        }else  if(numb.equals("15")){
            imgPicture.setImageResource(R.drawable.kartoshka_orig);
            RightAnswer.setText("Картофель");
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
                progress = 7;
                //btn.setBackgroundColor(Color.GREEN);
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
                progress = 14;
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
                progress = 20;
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
                progress = 27;
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
                progress = 34;
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
                progress = 40;
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
                progress = 47;
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
                progress = 54;
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
                progress = 60;
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
                progress = 67;
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
                progress = 74;
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
                progress = 80;
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
                progress = 87;
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
                progress = 94;
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
                progress = 100;
                btn15.setClickable(false);
                btn15.setEnabled(false);;


                resultAfterTest("15");

                SharedPreferences.Editor editor15 = sharedPreferences.edit();
                editor15.putBoolean("state15", btn15.isClickable());
                editor15.putBoolean("state_15", btn15.isEnabled());
                editor15.apply();
                break;

            default:
                break;
        }
        sharedPreferences = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("three_vegetable", data.getIntExtra("progress", 0));
        editor.apply();
    }

    public void onClick(View v){

        switch (v.getId()){
            case R.id.btn:
                Intent intent = new Intent(VegetablesActivity.this, VegetablesActivityTest.class);
                intent.putExtra("dictionary","лук");
                intent.putExtra("lvl",1);
                intent.putExtra("money_data",money);
                startActivityForResult(intent,1);
                break;
            case R.id.btn2:
                Intent intent2 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent2.putExtra("dictionary","горох");
                intent2.putExtra("lvl",2);
                intent2.putExtra("money_data",money);
                startActivityForResult(intent2,2);
                break;
            case R.id.btn3:
                Intent intent3 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent3.putExtra("dictionary","тыква");
                intent3.putExtra("lvl",3);
                intent3.putExtra("money_data",money);
                startActivityForResult(intent3,3);
                break;
            case R.id.btn4:
                Intent intent4 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent4.putExtra("dictionary","перец");
                intent4.putExtra("lvl",4);
                intent4.putExtra("money_data",money);
                startActivityForResult(intent4,4);
                break;
            case R.id.btn5:
                Intent intent5 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent5.putExtra("dictionary","чеснок");
                intent5.putExtra("money_data",money);
                intent5.putExtra("lvl",5);
                startActivityForResult(intent5,5);
                break;
            case R.id.btn6:
                Intent intent6 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent6.putExtra("dictionary","свекла");
                intent6.putExtra("lvl",6);
                intent6.putExtra("money_data",money);
                startActivityForResult(intent6,6);
                break;
            case R.id.btn7:
                Intent intent7 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent7.putExtra("dictionary","огурец");
                intent7.putExtra("lvl",7);
                intent7.putExtra("money_data",money);
                startActivityForResult(intent7,7);
                break;
            case R.id.btn8:
                Intent intent8 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent8.putExtra("dictionary","спаржа");
                intent8.putExtra("lvl",8);
                intent8.putExtra("money_data",money);
                startActivityForResult(intent8,8);
                break;
            case R.id.btn9:
                Intent intent9 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent9.putExtra("dictionary","морковь");
                intent9.putExtra("lvl",9);
                intent9.putExtra("money_data",money);
                startActivityForResult(intent9,9);
                break;
            case R.id.btn10:
                Intent intent10 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent10.putExtra("dictionary","базилик");
                intent10.putExtra("lvl",10);
                intent10.putExtra("money_data",money);
                startActivityForResult(intent10,10);
                break;
            case R.id.btn11:
                Intent intent11 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent11.putExtra("dictionary","помидор");
                intent11.putExtra("lvl",11);
                intent11.putExtra("money_data",money);
                startActivityForResult(intent11,11);
                break;
            case R.id.btn12:
                Intent intent12 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent12.putExtra("dictionary","кукуруза");
                intent12.putExtra("money_data",money);
                intent12.putExtra("lvl",12);
                startActivityForResult(intent12,12);
                break;
            case R.id.btn13:
                Intent intent13 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent13.putExtra("dictionary","брокколи");
                intent13.putExtra("lvl",13);
                intent13.putExtra("money_data",money);
                startActivityForResult(intent13,13);
                break;
            case R.id.btn14:
                Intent intent14 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent14.putExtra("dictionary","баклажан");
                intent14.putExtra("lvl",14);
                intent14.putExtra("money_data",money);
                startActivityForResult(intent14,14);
                break;
            case R.id.btn15:
                Intent intent15 = new Intent(VegetablesActivity.this,VegetablesActivityTest.class);
                intent15.putExtra("dictionary","картофель");
                intent15.putExtra("lvl",15);
                intent15.putExtra("money_data",money);
                startActivityForResult(intent15,15);
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
        if(!state15) {
            btn15.setEnabled(state15);
            btn15.setClickable(state15);
            //btn14.setBackgroundColor(Color.GREEN);

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

}
