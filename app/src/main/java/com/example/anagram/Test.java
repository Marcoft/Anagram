package com.example.anagram;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


import com.example.anagram.Hints.HintsAlgorithm;
import com.example.anagram.databas.DBHelpersPharmacy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Test extends AppCompatActivity {

    ProgressBar progressBar;

    Random r;
    String word = "";



    HintsAlgorithm hintsAlgorithm;

    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;

    HashMap<Integer,Button> hashMap = new HashMap<>();

    int j = 1;


    int i = 0;
    int x = 0;

    String dictionary[] = {
            "1"
    };


    @BindView(R.id.Word1) Button Word1;
    @BindView(R.id.Word2) Button Word2;
    @BindView(R.id.Word3) Button Word3;
    @BindView(R.id.Word4) Button Word4;
    @BindView(R.id.Word5) Button Word5;
    @BindView(R.id.Word6) Button Word6;
    @BindView(R.id.Word7) Button Word7;
    @BindView(R.id.Word8) Button Word8;
    @BindView(R.id.Word9) Button Word9;
    @BindView(R.id.Word10) Button Word10;
    @BindView(R.id.Word11) Button Word11;
    @BindView(R.id.Word12) Button Word12;
    @BindView(R.id.Word13) Button Word13;
    @BindView(R.id.Word14) Button Word14;

    @BindView(R.id.Helpfull) ImageButton Helpfull;


    @BindView(R.id.hints) Button hints;
    @BindView(R.id.edt1) EditText edt1;
    @BindView(R.id.edt2) EditText edt2;
    @BindView(R.id.edt3) EditText edt3;
    @BindView(R.id.edt4) EditText edt4;
    @BindView(R.id.edt5) EditText edt5;
    @BindView(R.id.edt6) EditText edt6;
    @BindView(R.id.edt7) EditText edt7;
    @BindView(R.id.edt8) EditText edt8;
    @BindView(R.id.edt9) EditText edt9;
    @BindView(R.id.edt10) EditText edt10;
    @BindView(R.id.edt11) EditText edt11;
    @BindView(R.id.edt12) EditText edt12;
    @BindView(R.id.edt13) EditText edt13;
    @BindView(R.id.edt14) EditText edt14;
    @BindView(R.id.text) TextView text;
    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textLvls) TextView textLvls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);

        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();
        r = new Random();

        progressBar = (ProgressBar) findViewById(R.id.progress);

        changeWord();
        newGame();
        enterWord();
        progressBar1();
        removeEDT();
        InsertWord();


    }

    private void checkAnswer(){
        Answer();
        if (word.equalsIgnoreCase(dictionary[0])) {
            //Toast.makeText(Test.this, "Правильно!", Toast.LENGTH_SHORT).show();

            int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
            money_for_open_word += 20;
            Money_text.setText(""+money_for_open_word);
            forResult();
        } else {
           // Toast.makeText(Test.this, "     Неверно!" + "\n" + "Попробуй еще", Toast.LENGTH_LONG).show();

        }
    }

    private void insetrWord(Button Word1){
        if(edt1.getText().toString().equalsIgnoreCase("")){
            edt1.setText(Word1.getText().toString());
        } else if(edt2.getText().toString().equalsIgnoreCase("")){
            edt2.setText(Word1.getText().toString());
        } else if(edt3.getText().toString().equalsIgnoreCase("")){
            edt3.setText(Word1.getText().toString());
        } else if(edt4.getText().toString().equalsIgnoreCase("")){
            edt4.setText(Word1.getText().toString());
        } else if(edt5.getText().toString().equalsIgnoreCase("")){
            edt5.setText(Word1.getText().toString());
        } else if(edt6.getText().toString().equalsIgnoreCase("")){
            edt6.setText(Word1.getText().toString());
        } else if(edt7.getText().toString().equalsIgnoreCase("")){
            edt7.setText(Word1.getText().toString());
        } else if(edt8.getText().toString().equalsIgnoreCase("")){
            edt8.setText(Word1.getText().toString());
        } else if(edt9.getText().toString().equalsIgnoreCase("")){
            edt9.setText(Word1.getText().toString());
        } else if(edt10.getText().toString().equalsIgnoreCase("")){
            edt10.setText(Word1.getText().toString());
        } else if(edt11.getText().toString().equalsIgnoreCase("")){
            edt11.setText(Word1.getText().toString());
        } else if(edt12.getText().toString().equalsIgnoreCase("")){
            edt12.setText(Word1.getText().toString());
        } else if(edt13.getText().toString().equalsIgnoreCase("")){
            edt13.setText(Word1.getText().toString());
        } else if(edt14.getText().toString().equalsIgnoreCase("")){
            edt14.setText(Word1.getText().toString());
        }
    }

    private void InsetAlg(String a,String a2,String a3,String a4,String a5,String a6,String a7,String a8,String a9,String a10,
                          String a11,String a12,String a13,String a14){
        Word1.setText(a);
        Word2.setText(a2);
        Word3.setText(a3);
        Word4.setText(a4);
        Word5.setText(a5);
        Word6.setText(a6);
        Word7.setText(a7);
        Word8.setText(a8);
        Word9.setText(a9);
        Word10.setText(a10);
        Word11.setText(a11);
        Word12.setText(a12);
        Word13.setText(a13);
        Word14.setText(a14);
    }

    private void countButton(Button brn){
        if(edt1.getText().toString().equalsIgnoreCase("")){
            j = 1;
            hashMap.put(j,brn);
        }else if(edt2.getText().toString().equalsIgnoreCase("")){
            j = 2;
            hashMap.put(j,brn);
        }
        else if(edt3.getText().toString().equalsIgnoreCase("")){
            j = 3;
            hashMap.put(j,brn);
        }
        else if(edt4.getText().toString().equalsIgnoreCase("")){
            j = 4;
            hashMap.put(j,brn);
        }
        else if(edt5.getText().toString().equalsIgnoreCase("")){
            j = 5;
            hashMap.put(j,brn);
        }
        else if(edt6.getText().toString().equalsIgnoreCase("")){
            j = 6;
            hashMap.put(j,brn);
        }
        else if(edt7.getText().toString().equalsIgnoreCase("")){
            j = 7;
            hashMap.put(j,brn);
        }
        else if(edt8.getText().toString().equalsIgnoreCase("")){
            j = 8;
            hashMap.put(j,brn);
        }
        else if(edt9.getText().toString().equalsIgnoreCase("")){
            j = 9;
            hashMap.put(j,brn);
        }
        else if(edt10.getText().toString().equalsIgnoreCase("")){
            j = 10;
            hashMap.put(j,brn);
        }
        else if(edt11.getText().toString().equalsIgnoreCase("")){
            j = 11;
            hashMap.put(j,brn);
        }
        else if(edt12.getText().toString().equalsIgnoreCase("")){
            j = 12;
            hashMap.put(j,brn);
        }
        else if(edt13.getText().toString().equalsIgnoreCase("")){
            j = 13;
            hashMap.put(j,brn);
        }
        else if(edt14.getText().toString().equalsIgnoreCase("")){
            j = 14;
            hashMap.put(j,brn);
        }
    }

    public void ClickButt(View view) {
        switch (view.getId()){
            case R.id.Word1:
                countButton(Word1);
                    insetrWord(Word1);
                    Word1.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word2:
                countButton(Word2);
                    insetrWord(Word2);
                    Word2.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word3:
                countButton(Word3);
                    insetrWord(Word3);
                    Word3.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word4:
                countButton(Word4);
                    insetrWord(Word4);
                    Word4.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word5:
                countButton(Word5);
                    insetrWord(Word5);
                    Word5.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word6:
                countButton(Word6);
                    insetrWord(Word6);
                    Word6.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word7:
                countButton(Word7);
                    insetrWord(Word7);
                    Word7.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word8:
                countButton(Word8);
                    insetrWord(Word8);
                    Word8.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word9:
                countButton(Word9);
                    insetrWord(Word9);
                    Word9.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word10:
                countButton(Word10);
                    insetrWord(Word10);
                    Word10.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word11:
                countButton(Word11);
                    insetrWord(Word11);
                    Word11.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word12:
                countButton(Word12);
                    insetrWord(Word12);
                    Word12.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word13:
                countButton(Word13);
                    insetrWord(Word13);
                    Word13.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word14:
                countButton(Word14);
                    insetrWord(Word14);
                    Word14.setVisibility(View.INVISIBLE);
                break;

        }

        checkAnswer();
    }

    public void CleanEdt(View view) {
        switch (view.getId()){
            case R.id.edt1:
                Button value = hashMap.get(1);
                if (value != null) {
                    try {
                        hashMap.get(1).setVisibility(View.VISIBLE);
                        hashMap.remove(1);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt1.setText("");
                break;
            case R.id.edt2:
                if(hashMap.get(2)!=null){
                    try {
                        hashMap.get(2).setVisibility(View.VISIBLE);
                        hashMap.remove(2);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt2.setText("");
                break;
            case R.id.edt3:
                edt3.setText("");
                if(hashMap.get(3)!=null){
                    try {
                        hashMap.get(3).setVisibility(View.VISIBLE);
                        hashMap.remove(3);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt4:
                edt4.setText("");
                if(hashMap.get(4)!=null){
                    try {
                        hashMap.get(4).setVisibility(View.VISIBLE);
                        hashMap.remove(4);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt5:
                edt5.setText("");
                if(hashMap.get(5)!=null){
                    try {
                        hashMap.get(5).setVisibility(View.VISIBLE);
                        hashMap.remove(5);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt6:
                edt6.setText("");
                if(hashMap.get(6)!=null){
                    try {
                        hashMap.get(6).setVisibility(View.VISIBLE);
                        hashMap.remove(6);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt7:
                edt7.setText("");
                if(hashMap.get(7)!=null){
                    try {
                        hashMap.get(7).setVisibility(View.VISIBLE);
                        hashMap.remove(7);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt8:
                edt8.setText("");
                if(hashMap.get(8)!=null){
                    try {
                        hashMap.get(8).setVisibility(View.VISIBLE);
                        hashMap.remove(8);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt9:
                edt9.setText("");
                if(hashMap.get(9)!=null){
                    try {
                        hashMap.get(9).setVisibility(View.VISIBLE);
                        hashMap.remove(9);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt10:
                edt10.setText("");
                if(hashMap.get(10)!=null){
                    try {
                        hashMap.get(10).setVisibility(View.VISIBLE);
                        hashMap.remove(10);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt11:
                edt11.setText("");
                if(hashMap.get(11)!=null){
                    try {
                        hashMap.get(11).setVisibility(View.VISIBLE);
                        hashMap.remove(11);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt12:
                edt12.setText("");
                if(hashMap.get(12)!=null){
                    try {
                        hashMap.get(12).setVisibility(View.VISIBLE);
                        hashMap.remove(12);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt13:
                edt13.setText("");
                if(hashMap.get(13)!=null){
                    try {
                        hashMap.get(13).setVisibility(View.VISIBLE);
                        hashMap.remove(13);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt14:
                edt14.setText("");
                if(hashMap.get(14)!=null){
                    try {
                        hashMap.get(14).setVisibility(View.VISIBLE);
                        hashMap.remove(14);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;

        }
    }


    public void progressBar1() {
        Intent intent = getIntent();
        x = intent.getIntExtra("progress", 0);
        progressBar.setProgress(x);
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


    public void forResult() {
        switch (dictionary[0]) {
            case "яр":
                Intent intent_1 = new Intent();
                intent_1.putExtra("money_result", Money_text.getText().toString());
                intent_1.putExtra("block", "1");
                setResult(RESULT_OK, intent_1);
                finish();
                break;
            case "лес":
                Intent intent_2 = new Intent();
                intent_2.putExtra("money_result", Money_text.getText().toString());
                intent_2.putExtra("block", "2");
                setResult(RESULT_OK, intent_2);
                finish();
                break;
            case "бал":
                Intent intent_3 = new Intent();
                intent_3.putExtra("money_result", Money_text.getText().toString());
                intent_3.putExtra("block", "3");
                setResult(RESULT_OK, intent_3);
                finish();
                break;
            case "ель":
                Intent intent_4 = new Intent();
                intent_4.putExtra("money_result", Money_text.getText().toString());
                intent_4.putExtra("block", "4");
                setResult(RESULT_OK, intent_4);
                finish();
                break;
            case "ужас":
                Intent intent_5 = new Intent();
                intent_5.putExtra("money_result", Money_text.getText().toString());
                intent_5.putExtra("block", "5");

                setResult(RESULT_OK, intent_5);
                finish();
                break;
            case "факт":
                Intent intent_6 = new Intent();
                intent_6.putExtra("money_result", Money_text.getText().toString());
                intent_6.putExtra("block", "6");
                setResult(RESULT_OK, intent_6);
                finish();
                break;
            case "топь":
                Intent intent_7 = new Intent();
                intent_7.putExtra("money_result", Money_text.getText().toString());
                intent_7.putExtra("block", "7");
                setResult(RESULT_OK, intent_7);
                finish();
                break;
            case "дочь":
                Intent intent_8 = new Intent();
                intent_8.putExtra("money_result", Money_text.getText().toString());
                intent_8.putExtra("block", "8");
                setResult(RESULT_OK, intent_8);
                finish();
                break;
            case "итог":
                Intent intent_9 = new Intent();
                intent_9.putExtra("money_result", Money_text.getText().toString());
                intent_9.putExtra("block", "9");
                setResult(RESULT_OK, intent_9);
                finish();
                break;
            case "цинк":
                Intent intent_10 = new Intent();
                intent_10.putExtra("money_result", Money_text.getText().toString());
                intent_10.putExtra("block", "10");
                setResult(RESULT_OK, intent_10);
                finish();
                break;
            case "бокс":
                Intent intent_11 = new Intent();
                intent_11.putExtra("money_result", Money_text.getText().toString());
                intent_11.putExtra("block", "11");
                setResult(RESULT_OK, intent_11);
                finish();
                break;
            case "блюз":
                Intent intent_12 = new Intent();
                intent_12.putExtra("money_result", Money_text.getText().toString());
                intent_12.putExtra("block", "12");
                setResult(RESULT_OK, intent_12);
                finish();
                break;
            case "цель":
                Intent intent_13 = new Intent();
                intent_13.putExtra("money_result", Money_text.getText().toString());
                intent_13.putExtra("block", "13");
                setResult(RESULT_OK, intent_13);
                finish();
                break;
            case "схема":
                Intent intent_14 = new Intent();
                intent_14.putExtra("money_result", Money_text.getText().toString());
                intent_14.putExtra("block", "14");
                setResult(RESULT_OK, intent_14);
                finish();
                break;
            case "пират":
                Intent intent_15 = new Intent();
                intent_15.putExtra("money_result", Money_text.getText().toString());
                intent_15.putExtra("block", "15");
                setResult(RESULT_OK, intent_15);
                finish();
                break;
            case "экран":
                Intent intent_16 = new Intent();
                intent_16.putExtra("money_result", Money_text.getText().toString());
                intent_16.putExtra("block", "16");
                setResult(RESULT_OK, intent_16);
                finish();
                break;
            case "ствол":
                Intent intent_17 = new Intent();
                intent_17.putExtra("money_result", Money_text.getText().toString());
                intent_17.putExtra("block", "17");
                setResult(RESULT_OK, intent_17);
                finish();
                break;
            case "талия":
                Intent intent_18 = new Intent();
                intent_18.putExtra("money_result", Money_text.getText().toString());
                intent_18.putExtra("block", "18");
                setResult(RESULT_OK, intent_18);
                finish();
                break;
            case "мячик":
                Intent intent_19 = new Intent();
                intent_19.putExtra("money_result", Money_text.getText().toString());
                intent_19.putExtra("block", "19");
                setResult(RESULT_OK, intent_19);
                finish();
                break;
            case "дробь":
                Intent intent_20 = new Intent();
                intent_20.putExtra("money_result", Money_text.getText().toString());
                intent_20.putExtra("block", "20");
                setResult(RESULT_OK, intent_20);
                finish();
                break;
            case "тиски":
                Intent intent_21 = new Intent();
                intent_21.putExtra("money_result", Money_text.getText().toString());
                intent_21.putExtra("block", "21");
                setResult(RESULT_OK, intent_21);
                finish();
                break;
            case "дрожь":
                Intent intent_22 = new Intent();
                intent_22.putExtra("money_result", Money_text.getText().toString());
                intent_22.putExtra("block", "22");
                setResult(RESULT_OK, intent_22);
                finish();
                break;
            case "сушка":
                Intent intent_23 = new Intent();
                intent_23.putExtra("money_result", Money_text.getText().toString());
                intent_23.putExtra("block", "23");
                setResult(RESULT_OK, intent_23);
                finish();
                break;
            case "гольф":
                Intent intent_24 = new Intent();
                intent_24.putExtra("money_result", Money_text.getText().toString());
                intent_24.putExtra("block", "24");
                setResult(RESULT_OK, intent_24);
                finish();
                break;
            case "берет":
                Intent intent_25 = new Intent();
                intent_25.putExtra("money_result", Money_text.getText().toString());
                intent_25.putExtra("block", "25");
                setResult(RESULT_OK, intent_25);
                finish();
                break;
            case "ларец":
                Intent intent_26 = new Intent();
                intent_26.putExtra("money_result", Money_text.getText().toString());
                intent_26.putExtra("block", "26");
                setResult(RESULT_OK, intent_26);
                finish();
                break;
            case "арена":
                Intent intent_27 = new Intent();
                intent_27.putExtra("money_result", Money_text.getText().toString());
                intent_27.putExtra("block", "27");
                setResult(RESULT_OK, intent_27);
                finish();
                break;
            case "вафля":
                Intent intent_28 = new Intent();
                intent_28.putExtra("money_result", Money_text.getText().toString());
                intent_28.putExtra("block", "28");
                setResult(RESULT_OK, intent_28);
                finish();
                break;
            case "купол":
                Intent intent_29 = new Intent();
                intent_29.putExtra("money_result", Money_text.getText().toString());
                intent_29.putExtra("block", "29");
                setResult(RESULT_OK, intent_29);
                finish();
                break;
            case "дверь":
                Intent intent_30 = new Intent();
                intent_30.putExtra("money_result", Money_text.getText().toString());
                intent_30.putExtra("block", "30");
                setResult(RESULT_OK, intent_30);
                finish();
                break;
            case "альянс":
                Intent intent_31 = new Intent();
                intent_31.putExtra("money_result", Money_text.getText().toString());
                intent_31.putExtra("block", "31");
                setResult(RESULT_OK, intent_31);
                finish();
                break;
            case "почерк":
                Intent intent_32 = new Intent();
                intent_32.putExtra("money_result", Money_text.getText().toString());
                intent_32.putExtra("block", "32");
                setResult(RESULT_OK, intent_32);
                finish();
                break;
            case "офлайн":
                Intent intent_33 = new Intent();
                intent_33.putExtra("money_result", Money_text.getText().toString());
                intent_33.putExtra("block", "33");
                setResult(RESULT_OK, intent_33);
                finish();
                break;
            case "алтарь":
                Intent intent_34 = new Intent();
                intent_34.putExtra("money_result", Money_text.getText().toString());
                intent_34.putExtra("block", "34");
                setResult(RESULT_OK, intent_34);
                finish();
                break;
            case "дранье":
                Intent intent_35 = new Intent();
                intent_35.putExtra("money_result", Money_text.getText().toString());
                intent_35.putExtra("block", "35");
                setResult(RESULT_OK, intent_35);
                finish();
                break;
            case "дворник":
                Intent intent_36 = new Intent();
                intent_36.putExtra("money_result", Money_text.getText().toString());
                intent_36.putExtra("block", "36");
                setResult(RESULT_OK, intent_36);
                finish();
                break;
            case "мозаика":
                Intent intent_37 = new Intent();
                intent_37.putExtra("money_result", Money_text.getText().toString());
                intent_37.putExtra("block", "37");
                setResult(RESULT_OK, intent_37);
                finish();
                break;
            case "дуршлаг":
                Intent intent_38 = new Intent();
                intent_38.putExtra("money_result", Money_text.getText().toString());
                intent_38.putExtra("block", "38");
                setResult(RESULT_OK, intent_38);
                finish();
                break;
            case "виртуоз":
                Intent intent_39 = new Intent();
                intent_39.putExtra("money_result", Money_text.getText().toString());
                intent_39.putExtra("block", "39");
                setResult(RESULT_OK, intent_39);
                finish();
                break;
            case "продюсер":
                Intent intent_40 = new Intent();
                intent_40.putExtra("money_result", Money_text.getText().toString());
                intent_40.putExtra("block", "40");
                setResult(RESULT_OK, intent_40);
                finish();
                break;
            case "капучино":
                Intent intent_41 = new Intent();
                intent_41.putExtra("money_result", Money_text.getText().toString());
                intent_41.putExtra("block", "41");
                setResult(RESULT_OK, intent_41);
                finish();
                break;
            case "кредитка":
                Intent intent_42 = new Intent();
                intent_42.putExtra("money_result", Money_text.getText().toString());
                intent_42.putExtra("block", "42");
                setResult(RESULT_OK, intent_42);
                finish();
                break;
            case "бриллиант":
                Intent intent_43 = new Intent();
                intent_43.putExtra("money_result", Money_text.getText().toString());
                intent_43.putExtra("block", "43");
                setResult(RESULT_OK, intent_43);
                finish();
                break;
            case "адреналин":
                Intent intent_44 = new Intent();
                intent_44.putExtra("money_result", Money_text.getText().toString());
                intent_44.putExtra("block", "44");
                setResult(RESULT_OK, intent_44);
                finish();
                break;
            case "грейпфрут":
                Intent intent_45 = new Intent();
                intent_45.putExtra("money_result", Money_text.getText().toString());
                intent_45.putExtra("block", "45");
                setResult(RESULT_OK, intent_45);
                finish();
                break;
            case "чугуновоз":
                Intent intent_46 = new Intent();
                intent_46.putExtra("money_result", Money_text.getText().toString());
                intent_46.putExtra("block", "46");
                setResult(RESULT_OK, intent_46);
                finish();
                break;
            case "авитаминоз":
                Intent intent_47 = new Intent();
                intent_47.putExtra("money_result", Money_text.getText().toString());
                intent_47.putExtra("block", "47");
                setResult(RESULT_OK, intent_47);
                finish();
                break;
            case "бензопровод":
                Intent intent_48 = new Intent();
                intent_48.putExtra("money_result", Money_text.getText().toString());
                intent_48.putExtra("block", "48");
                setResult(RESULT_OK, intent_48);
                finish();
                break;
            case "автомобилист":
                Intent intent_49 = new Intent();
                intent_49.putExtra("money_result", Money_text.getText().toString());
                intent_49.putExtra("block", "49");
                setResult(RESULT_OK, intent_49);
                finish();
                break;
            case "свидетельница":
                Intent intent_50 = new Intent();
                intent_50.putExtra("money_result", Money_text.getText().toString());
                intent_50.putExtra("block", "50");
                setResult(RESULT_OK, intent_50);
                finish();
                break;
        }
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[i] = intent.getStringExtra("dictionary");
        int m = intent.getIntExtra("money_data",0);
        Money_text.setText(String.valueOf(m));
        textLvls.setText("Уровень: " + intent.getIntExtra("lvl",0));
    }

    private void newGame() {
        text.setText(shuffleWord(dictionary[0]));
        while(text.getText().toString().equalsIgnoreCase(dictionary[0])) {
            text.setText(shuffleWord(dictionary[0]));
        }

        edt1.setText("");
        edt2.setText("");
        edt3.setText("");
        edt4.setText("");
        edt5.setText("");
        edt6.setText("");
        edt7.setText("");
        edt8.setText("");
        edt9.setText("");
        edt10.setText("");
        edt11.setText("");
        edt12.setText("");
        edt13.setText("");
        edt14.setText("");

        edt1.setEnabled(true);edt2.setEnabled(true);edt3.setEnabled(true);edt4.setEnabled(true);edt5.setEnabled(true);
        edt6.setEnabled(true);edt7.setEnabled(true);edt8.setEnabled(true);edt9.setEnabled(true);edt10.setEnabled(true);
        edt11.setEnabled(true);edt12.setEnabled(true);edt13.setEnabled(true);edt14.setEnabled(true);

    }


    private void Edt(EditText edt1){
        edt1.setCursorVisible(false);
        edt1.setLongClickable(false);
        edt1.setClickable(false);
        edt1.setFocusable(false);
        edt1.setSelected(false);
        edt1.setKeyListener(null);
        //edt1.setBackgroundResource(android.R.color.transparent);
    }

    private void enterWord() { // Количество вводимых слов в строку
        Edt(edt1);
        Edt(edt2);
        Edt(edt3);
        Edt(edt4);
        Edt(edt5);
        Edt(edt6);
        Edt(edt7);
        Edt(edt8);
        Edt(edt9);
        Edt(edt10);
        Edt(edt11);
        Edt(edt12);
        Edt(edt13);
        Edt(edt14);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("save_count", Money_text.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Money_text.setText(savedInstanceState.getString("save_count"));
    }

    @Override
    public void onBackPressed() {
        UPDATE(0,Integer.parseInt(Money_text.getText().toString()));
            Intent i2 = new Intent();
            i2.putExtra("money_result", Money_text.getText().toString());
            i2.putExtra("block", "0");
            setResult(RESULT_OK, i2);
            finish();
        super.onBackPressed();
    }

    private void removeEDT (){
        if(dictionary[0].length() == 2){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.GONE);edt3.setEnabled(false);
            edt4.setVisibility(View.GONE);edt4.setEnabled(false);
            edt5.setVisibility(View.GONE);edt5.setEnabled(false);
            edt6.setVisibility(View.GONE);edt6.setEnabled(false);
            edt7.setVisibility(View.GONE);edt7.setEnabled(false);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 3){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.GONE);edt4.setEnabled(false);
            edt5.setVisibility(View.GONE);edt5.setEnabled(false);
            edt6.setVisibility(View.GONE);edt6.setEnabled(false);
            edt7.setVisibility(View.GONE);edt7.setEnabled(false);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 4){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.GONE);edt5.setEnabled(false);
            edt6.setVisibility(View.GONE);edt6.setEnabled(false);
            edt7.setVisibility(View.GONE);edt7.setEnabled(false);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 5){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.GONE);edt6.setEnabled(false);
            edt7.setVisibility(View.GONE);edt7.setEnabled(false);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 6){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.GONE);edt7.setEnabled(false);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 7){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.GONE);edt8.setEnabled(false);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 8){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.GONE);edt9.setEnabled(false);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 9){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.GONE);edt10.setEnabled(false);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 10){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.VISIBLE);edt10.setEnabled(true);
            edt11.setVisibility(View.GONE);edt11.setEnabled(false);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 11){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.VISIBLE);edt10.setEnabled(true);
            edt11.setVisibility(View.VISIBLE);edt11.setEnabled(true);
            edt12.setVisibility(View.GONE);edt12.setEnabled(false);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 12){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.VISIBLE);edt10.setEnabled(true);
            edt11.setVisibility(View.VISIBLE);edt11.setEnabled(true);
            edt12.setVisibility(View.VISIBLE);edt12.setEnabled(true);
            edt13.setVisibility(View.GONE);edt13.setEnabled(false);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 13){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.VISIBLE);edt10.setEnabled(true);
            edt11.setVisibility(View.VISIBLE);edt11.setEnabled(true);
            edt12.setVisibility(View.VISIBLE);edt12.setEnabled(true);
            edt13.setVisibility(View.VISIBLE);edt13.setEnabled(true);
            edt14.setVisibility(View.GONE);edt14.setEnabled(false);
        } else if(dictionary[0].length() == 14){
            edt1.setVisibility(View.VISIBLE);edt1.setEnabled(true);
            edt2.setVisibility(View.VISIBLE);edt2.setEnabled(true);
            edt3.setVisibility(View.VISIBLE);edt3.setEnabled(true);
            edt4.setVisibility(View.VISIBLE);edt4.setEnabled(true);
            edt5.setVisibility(View.VISIBLE);edt5.setEnabled(true);
            edt6.setVisibility(View.VISIBLE);edt6.setEnabled(true);
            edt7.setVisibility(View.VISIBLE);edt7.setEnabled(true);
            edt8.setVisibility(View.VISIBLE);edt8.setEnabled(true);
            edt9.setVisibility(View.VISIBLE);edt9.setEnabled(true);
            edt10.setVisibility(View.VISIBLE);edt10.setEnabled(true);
            edt11.setVisibility(View.VISIBLE);edt11.setEnabled(true);
            edt12.setVisibility(View.VISIBLE);edt12.setEnabled(true);
            edt13.setVisibility(View.VISIBLE);edt13.setEnabled(true);
            edt14.setVisibility(View.VISIBLE);edt14.setEnabled(false);
        }
    }

    private void Answer(){
        if(dictionary[0].length() == 2) {
            word = edt1.getText().toString() + edt2.getText().toString();
        } else if(dictionary[0].length() == 3) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString();
        } else if(dictionary[0].length() == 4) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString();
        } else if(dictionary[0].length() == 5) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString();
        } else if(dictionary[0].length() == 6) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString();
        } else if(dictionary[0].length() == 7) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString();
        } else if(dictionary[0].length() == 8) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString();
        } else if(dictionary[0].length() == 9) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString();
        } else if(dictionary[0].length() == 10) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString() +
                    edt10.getText().toString();
        } else if(dictionary[0].length() == 11) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString() +
                    edt10.getText().toString() + edt11.getText().toString();
        } else if(dictionary[0].length() == 12) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString() +
                    edt10.getText().toString() + edt11.getText().toString() + edt12.getText().toString();
        } else if(dictionary[0].length() == 13) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString() +
                    edt10.getText().toString() + edt11.getText().toString() + edt12.getText().toString() + edt13.getText().toString();
        } else if(dictionary[0].length() == 14) {
             word = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString() + edt5.getText().toString()
                    + edt6.getText().toString() + edt7.getText().toString() + edt8.getText().toString() + edt9.getText().toString() +
                    edt10.getText().toString() + edt11.getText().toString() + edt12.getText().toString() + edt13.getText().toString() + edt14.getText().toString();
        }
    }

    private void InsertWord(){
        if(dictionary[0].equalsIgnoreCase("яр")) {
            InsetAlg("a","р","н","в","и","ц","й","ф","х","п","р","я","и","о");
        } else  if(dictionary[0].equalsIgnoreCase("лес")) {
            InsetAlg("с","н","р","и","ц","м","в","с","д","е","л","ш","к","ю");
        } else  if(dictionary[0].equalsIgnoreCase("бал")) {
            InsetAlg("к","е","и","н","а","б","м","с","й","г","б","з","л","о");
        }else  if(dictionary[0].equalsIgnoreCase("ель")) {
            InsetAlg("ь","ч","п","а","й","о","л","ю","т","н","е","х","к","б");
        }else  if(dictionary[0].equalsIgnoreCase("ужас")) {
            InsetAlg("ж","ш","к","й","с","у","о","а","р","п","ц","т","ф","э");
        }else  if(dictionary[0].equalsIgnoreCase("факт")) {
            InsetAlg("р","м","ф","в","о","а","х","т","ю","л","к","т","б","ч");
        }else  if(dictionary[0].equalsIgnoreCase("топь")) {
            InsetAlg("ь","ч","п","а","в","о","е","к","р","й","з","т","м","ы");
        }else  if(dictionary[0].equalsIgnoreCase("дочь")) {
            InsetAlg("ы","ь","й","я","а","о","в","р","д","н","ц","ч","ю","у");
        }else  if(dictionary[0].equalsIgnoreCase("итог")) {
            InsetAlg("ы","и","н","г","я","ь","ф","о","в","р","л","т","б","ш");
        }else  if(dictionary[0].equalsIgnoreCase("цинк")) {
            InsetAlg("к","и","э","ц","ч","ш","а","щ","р","н","п","ы","б","о");
        }else  if(dictionary[0].equalsIgnoreCase("бокс")) {
            InsetAlg("у","с","п","е","р","ф","ь","я","к","о","г","б","н","ж");
        }else  if(dictionary[0].equalsIgnoreCase("блюз")) {
            InsetAlg("ы","я","л","ю","х","о","ц","м","т","э","л","б","в","з");
        }else  if(dictionary[0].equalsIgnoreCase("цель")) {
            InsetAlg("ж","ц","в","ш","л","ь","ч","й","и","п","н","а","р","е");
        }else  if(dictionary[0].equalsIgnoreCase("схема")) {
            InsetAlg("м","щ","е","а","ь","х","с","й","н","у","о","в","р","ы");
        }else  if(dictionary[0].equalsIgnoreCase("пират")) {
            InsetAlg("ч","р","щ","т","а","у","б","о","п","х","ы","к","и","ю");
        }else  if(dictionary[0].equalsIgnoreCase("экран")) {
            InsetAlg("и","б","р","й","а","и","д","п","н","о","к","щ","ч","э");
        }else  if(dictionary[0].equalsIgnoreCase("ствол")) {
            InsetAlg("с","й","о","ы","л","ф","б","ь","н","т","з","ц","в","э");
        }else  if(dictionary[0].equalsIgnoreCase("талия")) {
            InsetAlg("а","п","о","и","т","б","й","л","ю","в","ь","я","щ","п");
        }else  if(dictionary[0].equalsIgnoreCase("мячик")) {
            InsetAlg("м","ы","к","я","о","л","а","и","ю","т","ч","и","х","у");
        }else  if(dictionary[0].equalsIgnoreCase("дробь")) {
            InsetAlg("ь","ы","и","п","б","в","д","й","р","щ","з","с","т","о");
        }else  if(dictionary[0].equalsIgnoreCase("тиски")) {
            InsetAlg("и","т","й","ы","ш","и","к","г","н","о","п","с","у","в");
        }else  if(dictionary[0].equalsIgnoreCase("дрожь")) {
            InsetAlg("д","ф","и","м","ь","ш","р","ж","у","о","б","я","ч","ц");
        }else  if(dictionary[0].equalsIgnoreCase("сушка")) {
            InsetAlg("с","ц","ж","д","ы","ш","у","х","я","к","п","а","р","о");
        }else  if(dictionary[0].equalsIgnoreCase("гольф")) {
            InsetAlg("ф","о","ь","й","д","г","л","м","и","д","н","б","ч","к");
        }else  if(dictionary[0].equalsIgnoreCase("берет")) {
            InsetAlg("р","е","в","е","ь","а","щ","у","б","т","ю","п","ф","б");
        }else  if(dictionary[0].equalsIgnoreCase("ларец")) {
            InsetAlg("л","у","а","о","р","п","е","д","ц","х","ю","ч","в","й");
        }else  if(dictionary[0].equalsIgnoreCase("арена")) {
            InsetAlg("ц","н","ш","е","м","л","а","и","р","а","ф","щ","у","ю");
        }else  if(dictionary[0].equalsIgnoreCase("вафля")) {
            InsetAlg("ф","в","ю","б","а","к","я","ч","ы","д","й","р","л","м");
        }else  if(dictionary[0].equalsIgnoreCase("купол")) {
            InsetAlg("к","р","а","т","щ","у","п","ы","ь","е","л","о","д","я");
        }else  if(dictionary[0].equalsIgnoreCase("дверь")) {
            InsetAlg("ы","д","в","к","с","э","т","ж","р","б","ь","у","н","е");
        }else  if(dictionary[0].equalsIgnoreCase("альянс")) {
            InsetAlg("щ","м","л","с","г","ю","ь","а","а","я","д","в","н","ч");
        }else  if(dictionary[0].equalsIgnoreCase("почерк")) {
            InsetAlg("о","е","к","ю","н","м","у","з","э","ы","й","р","ч","п");
        }else  if(dictionary[0].equalsIgnoreCase("офлайн")) {
            InsetAlg("н","м","ы","л","а","д","о","ф","ч","щ","з","ц","й","и");
        }else  if(dictionary[0].equalsIgnoreCase("алтарь")) {
            InsetAlg("р","п","ь","м","а","в","а","ч","г","э","л","к","т","н");
        }else  if(dictionary[0].equalsIgnoreCase("дранье")) {
            InsetAlg("у","ь","е","н","щ","ы","ф","а","и","й","р","ю","т","д");
        }else  if(dictionary[0].equalsIgnoreCase("дворник")) {
            InsetAlg("х","к","т","в","г","щ","э","д","и","у","б","н","р","о");
        }else  if(dictionary[0].equalsIgnoreCase("мозаика")) {
            InsetAlg("с","ш","р","м","о","ц","з","а","у","и","к","а","в","п");
        }else  if(dictionary[0].equalsIgnoreCase("дуршлаг")) {
            InsetAlg("ф","ш","д","ы","и","щ","л","а","г","у","ч","х","р","б");
        }else  if(dictionary[0].equalsIgnoreCase("виртуоз")) {
            InsetAlg("у","о","т","щ","а","я","и","ь","в","п","ы","р","ц","з");
        }else  if(dictionary[0].equalsIgnoreCase("продюсер")) {
            InsetAlg("и","е","р","с","о","г","п","б","ы","ц","р","д","щ","ю");
        } else  if(dictionary[0].equalsIgnoreCase("капучино")) {
            InsetAlg("ы","ч","и","ь","о","н","е","р","м","з","у","п","а","к");
        }else  if(dictionary[0].equalsIgnoreCase("кредитка")) {
            InsetAlg("к","р","у","в","п","щ","й","к","а","е","т","ф","д","и");
        }else  if(dictionary[0].equalsIgnoreCase("бриллиант")) {
            InsetAlg("л","и","л","у","о","р","а","в","б","и","п","н","ь","т");
        }else  if(dictionary[0].equalsIgnoreCase("адреналин")) {
            InsetAlg("а","н","н","щ","е","и","з","р","л","д","п","в","ь","а");
        }else  if(dictionary[0].equalsIgnoreCase("грейпфрут")) {
            InsetAlg("п","й","ф","т","р","я","г","к","ю","ь","б","е","р","у");
        }else  if(dictionary[0].equalsIgnoreCase("чугуновоз")) {
            InsetAlg("ч","у","г","щ","о","р","м","о","н","ы","у","ф","в","з");
        }else  if(dictionary[0].equalsIgnoreCase("авитаминоз")) {
            InsetAlg("ф","э","а","н","м","ь","и","з","в","и","т","а","о","ч");
        }else  if(dictionary[0].equalsIgnoreCase("бензопровод")) {
            InsetAlg("е","в","р","о","о","н","й","л","з","п","к","д","о","б");
        }else  if(dictionary[0].equalsIgnoreCase("автомобилист")) {
            InsetAlg("в","м","т","о","а","с","и","л","н","т","и","о","б","ю");
        }else  if(dictionary[0].equalsIgnoreCase("свидетельница")) {
            InsetAlg("р","ц","и","и","т","ь","с","е","е","н","в","л","д","а");
        }

    }

    public void HintsAnag(View view) {
        showAlertDialogButtonClicked();
        UPDATE(0,Integer.parseInt(Money_text.getText().toString()));
    }

    public void showAlertDialogButtonClicked() {
        hintsAlgorithm = new HintsAlgorithm();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Выберите подсказку");


        String[] words = {"Открыть букву(15)", "Открыть слово(75)", "Показать определение(50)"};
        builder.setItems(words, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        openLetter();
                        break;
                    case 1:
                        openWord();
                        break;
                    case 2:
                        hintsAlgorithm.showDefinition(Test.this,Money_text,dictionary);
                        break;
                }
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();



      /*  AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);

        dialogBuilder.setPositiveButton("Закрыть",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        LayoutInflater inflater = this.getLayoutInflater();

        View dialogView = inflater.inflate(R.layout.activity_hints_anagram, null);
        dialogBuilder.setView(dialogView);

        final Button b_open_letter = (Button) dialogView.findViewById(R.id.b_open_letter);
        final Button b_open_word = (Button) dialogView.findViewById(R.id.b_open_word);
        final Button b_show_definition = (Button) dialogView.findViewById(R.id.b_show_definition);


        b_open_letter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLetter();
            }
        });
        b_open_word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWord();
            }
        });
        b_show_definition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hintsAlgorithm.showDefinition(Test.this,Money_text,dictionary);
            }
        });


        dialogBuilder.create().show();*/
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
        UPDATE(0,Integer.parseInt(Money_text.getText().toString()));
        super.onDestroy();
    }


    public void openLetter() {
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());

        if(money_for_open_word >= 15 ){     //((dictionary[0].length()*20* 30* 1.5)/100)) {

            AlertDialog.Builder builder = new AlertDialog.Builder(Test.this);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите открыть букву?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    hintsAlgorithm.OpenLetterAlgorithm(edt1, edt2,  edt3, edt4, edt5,
                                            edt6, edt7, edt8, edt9, edt10, edt11,
                                            edt12, edt13, edt14, dictionary,
                                            Money_text
                                    );
                                    checkAnswer();
                                    if(!edt13.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt13);
                                    }  else if(!edt12.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt12);
                                    }  else if(!edt11.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt11);
                                    }  else if(!edt10.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt10);
                                    }  else if(!edt9.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt9);
                                    }  else if(!edt8.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt8);
                                    }  else if(!edt7.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt7);
                                    }  else if(!edt6.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt6);
                                    }  else if(!edt5.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt5);
                                    }  else if(!edt4.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt4);
                                    }  else if(!edt3.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt3);
                                    } else if(!edt2.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt2);
                                    } else if(!edt1.getText().toString().equalsIgnoreCase("")){
                                        LetterWordVisibility(edt1);
                                    }
                                }
                            })
                    .setPositiveButton("Нет",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();

        }else {
            Toast.makeText(this, "Не хватает монет", Toast.LENGTH_SHORT).show();
        }
    }

    private void LetterWordVisibility(EditText edt13){
        if(edt13.getText().toString().equalsIgnoreCase(Word1.getText().toString())){
            Word1.setVisibility(View.INVISIBLE);
            countButton(Word1);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word2.getText().toString())){
            Word2.setVisibility(View.INVISIBLE);
            countButton(Word2);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word3.getText().toString())){
            Word3.setVisibility(View.INVISIBLE);
            countButton(Word3);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word4.getText().toString())){
            Word4.setVisibility(View.INVISIBLE);
            countButton(Word4);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word5.getText().toString())){
            Word5.setVisibility(View.INVISIBLE);
            countButton(Word5);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word6.getText().toString())){
            Word6.setVisibility(View.INVISIBLE);
            countButton(Word6);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word7.getText().toString())){
            Word7.setVisibility(View.INVISIBLE);
            countButton(Word7);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word8.getText().toString())){
            Word8.setVisibility(View.INVISIBLE);
            countButton(Word8);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word9.getText().toString())){
            Word9.setVisibility(View.INVISIBLE);
            countButton(Word9);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word10.getText().toString())){
            Word10.setVisibility(View.INVISIBLE);
            countButton(Word10);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word11.getText().toString())){
            Word11.setVisibility(View.INVISIBLE);
            countButton(Word11);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word12.getText().toString())){
            Word12.setVisibility(View.INVISIBLE);
            countButton(Word12);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word13.getText().toString())){
            Word13.setVisibility(View.INVISIBLE);
            countButton(Word13);
        }
        else if (edt13.getText().toString().equalsIgnoreCase(Word14.getText().toString())){
            Word14.setVisibility(View.INVISIBLE);
            countButton(Word14);
        }
    }

    public void openWord() {
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
        if(money_for_open_word >= 75){   //((dictionary[0].length()*20*80)/100)){

            AlertDialog.Builder builder = new AlertDialog.Builder(Test.this);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите открыть слово?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    hintsAlgorithm.openWordAlgorithm( edt1,  edt2,  edt3, edt4, edt5,
                                            edt6, edt7, edt8, edt9, edt10, edt11,
                                            edt12, edt13, edt14,  dictionary, Money_text);
                                    checkAnswer();
                                }
                            })
                    .setPositiveButton("Нет",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();

        } else {
            Toast.makeText(this, "Не хватает монет", Toast.LENGTH_SHORT).show();
        }
    }

    public void Back(View view) {
        UPDATE(0,Integer.parseInt(Money_text.getText().toString()));
        Intent i2 = new Intent();
        i2.putExtra("money_result", Money_text.getText().toString());
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
        finish();
    }


    public void HelpOnAplication(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(Test.this);
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