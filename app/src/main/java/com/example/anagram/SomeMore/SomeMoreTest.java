package com.example.anagram.SomeMore;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import com.example.anagram.R;
import com.example.anagram.databas.DBHelpersPharmacy;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class SomeMoreTest extends AppCompatActivity {

    @BindView(R.id.OpenWordMoreTest) Button OpenWordMoreTest;

    @BindView(R.id.text) TextView text;
    @BindView(R.id.money) TextView Money_text;
    @BindView(R.id.textLvls) TextView textLvls;

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
    @BindView(R.id.edt15) EditText edt15;
    @BindView(R.id.edt16) EditText edt16;
    @BindView(R.id.edt17) EditText edt17;
    @BindView(R.id.edt18) EditText edt18;
    @BindView(R.id.edt19) EditText edt19;
    @BindView(R.id.edt20) EditText edt20;
    @BindView(R.id.edt21) EditText edt21;
    @BindView(R.id.edt22) EditText edt22;
    @BindView(R.id.edt23) EditText edt23;
    @BindView(R.id.edt24) EditText edt24;
    @BindView(R.id.edt25) EditText edt25;


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

    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;

    String word1 = "";
    String word2 = "";
    String word3 = "";
    String word4 = "";

    Random r;

    String dictionary[] = {
            "1",
            "2",
            "3",
            "4"
    };

    int money_for_open_word;
    String thirdW = "";
    String fourW = "";

    HashMap<Integer,Button> hashMap = new HashMap<>();
    int j = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_some_more_test);
        ButterKnife.bind(this);
        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();

        r = new Random();


        changeWord();
        newGame();
        enterWord();
        InsertWord();

    }

    private void checkAnswer() {
        Answer();
        if (thirdW.equals("1")) {
            if ((word1.equalsIgnoreCase(dictionary[0]) || word1.equalsIgnoreCase(dictionary[1]))
                    && (word2.equalsIgnoreCase(dictionary[0]) || word2.equalsIgnoreCase(dictionary[1]))) {
                word3 = "1";
                word4 = "2";
                checkAnswerIf();
            }
        } else if (fourW.equals("2")) {
            if ((word1.equalsIgnoreCase(dictionary[0]) || word1.equalsIgnoreCase(dictionary[1]) || word1.equalsIgnoreCase(dictionary[2]) || word1.equalsIgnoreCase(dictionary[3]))
                    && (word2.equalsIgnoreCase(dictionary[0]) || word2.equalsIgnoreCase(dictionary[1]) || word2.equalsIgnoreCase(dictionary[2]))
                    && (word3.equalsIgnoreCase(dictionary[0]) || word3.equalsIgnoreCase(dictionary[1]) || word3.equalsIgnoreCase(dictionary[2]))) {
                word4 = "2";
                checkAnswerIf();
            }
        } else if ((word1.equalsIgnoreCase(dictionary[0]) || word1.equalsIgnoreCase(dictionary[1]) || word1.equalsIgnoreCase(dictionary[2]) || word1.equalsIgnoreCase(dictionary[3]))
                && (word2.equalsIgnoreCase(dictionary[0]) || word2.equalsIgnoreCase(dictionary[1]) || word2.equalsIgnoreCase(dictionary[2]) || word2.equalsIgnoreCase(dictionary[3]))
                && (word3.equalsIgnoreCase(dictionary[0]) || word3.equalsIgnoreCase(dictionary[1]) || word3.equalsIgnoreCase(dictionary[2]) || word3.equalsIgnoreCase(dictionary[3]))
                && (word4.equalsIgnoreCase(dictionary[0]) || word4.equalsIgnoreCase(dictionary[1]) || word4.equalsIgnoreCase(dictionary[2]) || word4.equalsIgnoreCase(dictionary[3]))) {
                checkAnswerIf();
            }
        }


    private void checkAnswerIf(){
            if (word1.equalsIgnoreCase(word2) ||
                    word1.equalsIgnoreCase(word3) ||
                    word1.equalsIgnoreCase(word4) ||
                    word2.equalsIgnoreCase(word3) ||
                    word2.equalsIgnoreCase(word4) ||
                    word3.equalsIgnoreCase(word4)) {
                Toast.makeText(SomeMoreTest.this, "Ответы не должны повторяться", Toast.LENGTH_SHORT).show();
            } else {
                if (thirdW.equalsIgnoreCase("1")) { // TODO 2 word
                    if ((word1.equalsIgnoreCase(dictionary[0]) ||
                            word1.equalsIgnoreCase(dictionary[1])) &&
                            (word2.equalsIgnoreCase(dictionary[0]) ||
                                    word2.equalsIgnoreCase(dictionary[1]))) {

                        OpenWordMoreTest.setEnabled(false);

                        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                        money_for_open_word += 30;
                        Money_text.setText("" + money_for_open_word);

                        forResult();
                    } else {
                        Toast.makeText(SomeMoreTest.this, "     Неверно!" + "\n" + "Попробуй еще", Toast.LENGTH_LONG).show();

                    }
                } else if (fourW.equalsIgnoreCase("2")) { // TODO 3 word
                    if ((word1.equalsIgnoreCase(dictionary[0]) ||
                            word1.equalsIgnoreCase(dictionary[1]) ||
                            word1.equalsIgnoreCase(dictionary[2])) &&
                            (word2.equalsIgnoreCase(dictionary[0]) ||
                                    word2.equalsIgnoreCase(dictionary[1]) ||
                                    word2.equalsIgnoreCase(dictionary[2])) &&
                            (word3.equalsIgnoreCase(dictionary[0]) ||
                                    word3.equalsIgnoreCase(dictionary[1]) ||
                                    word3.equalsIgnoreCase(dictionary[2]))) {

                        OpenWordMoreTest.setEnabled(false);

                        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                        money_for_open_word += 30;
                        Money_text.setText("" + money_for_open_word);

                        forResult();
                    } else {
                        Toast.makeText(SomeMoreTest.this, "     Неверно!" + "\n" + "Попробуй еще", Toast.LENGTH_LONG).show();

                    }
                } else { // TODO 4 word
                    if ((word1.equalsIgnoreCase(dictionary[0]) ||
                            word1.equalsIgnoreCase(dictionary[1]) ||
                            word1.equalsIgnoreCase(dictionary[2]) ||
                            word1.equalsIgnoreCase(dictionary[3])) &&
                            (word2.equalsIgnoreCase(dictionary[0]) ||
                                    word2.equalsIgnoreCase(dictionary[1]) ||
                                    word2.equalsIgnoreCase(dictionary[2]) ||
                                    word2.equalsIgnoreCase(dictionary[3])) &&
                            (word3.equalsIgnoreCase(dictionary[0]) ||
                                    word3.equalsIgnoreCase(dictionary[1]) ||
                                    word3.equalsIgnoreCase(dictionary[2]) ||
                                    word3.equalsIgnoreCase(dictionary[3])) &&
                            (word4.equalsIgnoreCase(dictionary[0]) ||
                                    word4.equalsIgnoreCase(dictionary[1]) ||
                                    word4.equalsIgnoreCase(dictionary[2]) ||
                                    word4.equalsIgnoreCase(dictionary[3]))) {

                        OpenWordMoreTest.setEnabled(false);

                        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
                        money_for_open_word += 30;
                        Money_text.setText("" + money_for_open_word);

                        forResult();
                    } else {
                        Toast.makeText(SomeMoreTest.this, "     Неверно!" + "\n" + "Попробуй еще", Toast.LENGTH_LONG).show();

                    }
                }
            }
    }

    private void insetrWord(Button Word1){
        //TODO 11111111111
        if(dictionary[0].length() == 3 && (edt1.getText().toString().equalsIgnoreCase("") ||
                edt2.getText().toString().equalsIgnoreCase("") || edt3.getText().toString().equalsIgnoreCase("") )){
            if(edt1.getText().toString().equalsIgnoreCase("")){
                edt1.setText(Word1.getText().toString());
            } else if(edt2.getText().toString().equalsIgnoreCase("")){
                edt2.setText(Word1.getText().toString());
            } else if(edt3.getText().toString().equalsIgnoreCase("")){
                edt3.setText(Word1.getText().toString());
            }
        } else if(dictionary[0].length() == 4 && (edt1.getText().toString().equalsIgnoreCase("") ||
                edt2.getText().toString().equalsIgnoreCase("") || edt3.getText().toString().equalsIgnoreCase("")
                || edt4.getText().toString().equalsIgnoreCase(""))){
            if(edt1.getText().toString().equalsIgnoreCase("")){
                edt1.setText(Word1.getText().toString());
            } else if(edt2.getText().toString().equalsIgnoreCase("")){
                edt2.setText(Word1.getText().toString());
            } else if(edt3.getText().toString().equalsIgnoreCase("")){
                edt3.setText(Word1.getText().toString());
            } else if(edt4.getText().toString().equalsIgnoreCase("")){
                edt4.setText(Word1.getText().toString());
            }
        } else if(dictionary[0].length() == 5 && (edt1.getText().toString().equalsIgnoreCase("") ||
                edt2.getText().toString().equalsIgnoreCase("") || edt3.getText().toString().equalsIgnoreCase("")
                || edt4.getText().toString().equalsIgnoreCase("") || edt5.getText().toString().equalsIgnoreCase(""))){
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
            }
        } else if(dictionary[0].length() == 6 && (edt1.getText().toString().equalsIgnoreCase("") ||
                edt2.getText().toString().equalsIgnoreCase("") || edt3.getText().toString().equalsIgnoreCase("")
                || edt4.getText().toString().equalsIgnoreCase("") || edt5.getText().toString().equalsIgnoreCase("")
                || edt6.getText().toString().equalsIgnoreCase(""))){
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
            }
        } else if(dictionary[0].length() == 7 && (edt1.getText().toString().equalsIgnoreCase("") ||
                edt2.getText().toString().equalsIgnoreCase("") || edt3.getText().toString().equalsIgnoreCase("")
                || edt4.getText().toString().equalsIgnoreCase("") || edt5.getText().toString().equalsIgnoreCase("")
                || edt6.getText().toString().equalsIgnoreCase("") || edt7.getText().toString().equalsIgnoreCase(""))){
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
            }
        }

        //TODO 222222222222222
       else if(dictionary[1].length() == 3 && (edt8.getText().toString().equalsIgnoreCase("") ||
                edt9.getText().toString().equalsIgnoreCase("") || edt10.getText().toString().equalsIgnoreCase("") )){
            if(edt8.getText().toString().equalsIgnoreCase("")){
                edt8.setText(Word1.getText().toString());
            } else if(edt9.getText().toString().equalsIgnoreCase("")){
                edt9.setText(Word1.getText().toString());
            } else if(edt10.getText().toString().equalsIgnoreCase("")){
                edt10.setText(Word1.getText().toString());
            }
        } else if(dictionary[1].length() == 4 && (edt9.getText().toString().equalsIgnoreCase("") ||
                edt9.getText().toString().equalsIgnoreCase("") || edt10.getText().toString().equalsIgnoreCase("")
                || edt11.getText().toString().equalsIgnoreCase(""))){
            if(edt8.getText().toString().equalsIgnoreCase("")){
                edt8.setText(Word1.getText().toString());
            } else if(edt9.getText().toString().equalsIgnoreCase("")){
                edt9.setText(Word1.getText().toString());
            } else if(edt10.getText().toString().equalsIgnoreCase("")){
                edt10.setText(Word1.getText().toString());
            } else if(edt11.getText().toString().equalsIgnoreCase("")){
                edt11.setText(Word1.getText().toString());
            }
        } else if(dictionary[1].length() == 5 && (edt8.getText().toString().equalsIgnoreCase("") ||
                edt9.getText().toString().equalsIgnoreCase("") || edt10.getText().toString().equalsIgnoreCase("")
                || edt11.getText().toString().equalsIgnoreCase("") || edt12.getText().toString().equalsIgnoreCase(""))){
            if(edt8.getText().toString().equalsIgnoreCase("")){
                edt8.setText(Word1.getText().toString());
            } else if(edt9.getText().toString().equalsIgnoreCase("")){
                edt9.setText(Word1.getText().toString());
            } else if(edt10.getText().toString().equalsIgnoreCase("")){
                edt10.setText(Word1.getText().toString());
            } else if(edt11.getText().toString().equalsIgnoreCase("")){
                edt11.setText(Word1.getText().toString());
            } else if(edt12.getText().toString().equalsIgnoreCase("")){
                edt12.setText(Word1.getText().toString());
            }
        } else if(dictionary[1].length() == 6 && (edt8.getText().toString().equalsIgnoreCase("") ||
                edt9.getText().toString().equalsIgnoreCase("") || edt10.getText().toString().equalsIgnoreCase("")
                || edt11.getText().toString().equalsIgnoreCase("") || edt12.getText().toString().equalsIgnoreCase("")
                || edt13.getText().toString().equalsIgnoreCase(""))){
            if(edt8.getText().toString().equalsIgnoreCase("")){
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
            }
        } else if(dictionary[1].length() == 7 && (edt8.getText().toString().equalsIgnoreCase("") ||
                edt9.getText().toString().equalsIgnoreCase("") || edt10.getText().toString().equalsIgnoreCase("")
                || edt11.getText().toString().equalsIgnoreCase("") || edt12.getText().toString().equalsIgnoreCase("")
                || edt13.getText().toString().equalsIgnoreCase("") || edt14.getText().toString().equalsIgnoreCase(""))){
            if(edt8.getText().toString().equalsIgnoreCase("")){
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


        //TODO 333333333333
        else if(dictionary[2].length() == 4 && (edt15.getText().toString().equalsIgnoreCase("") ||
                edt16.getText().toString().equalsIgnoreCase("") || edt17.getText().toString().equalsIgnoreCase("")
                || edt18.getText().toString().equalsIgnoreCase(""))){
            if(edt15.getText().toString().equalsIgnoreCase("")){
                edt15.setText(Word1.getText().toString());
            } else if(edt16.getText().toString().equalsIgnoreCase("")){
                edt16.setText(Word1.getText().toString());
            } else if(edt17.getText().toString().equalsIgnoreCase("")){
                edt17.setText(Word1.getText().toString());
            } else if(edt18.getText().toString().equalsIgnoreCase("")){
                edt18.setText(Word1.getText().toString());
            }
        } else if(dictionary[2].length() == 5 && (edt15.getText().toString().equalsIgnoreCase("") ||
                edt16.getText().toString().equalsIgnoreCase("") || edt17.getText().toString().equalsIgnoreCase("")
                || edt18.getText().toString().equalsIgnoreCase("") || edt19.getText().toString().equalsIgnoreCase(""))){
            if(edt15.getText().toString().equalsIgnoreCase("")){
                edt15.setText(Word1.getText().toString());
            } else if(edt16.getText().toString().equalsIgnoreCase("")){
                edt16.setText(Word1.getText().toString());
            } else if(edt17.getText().toString().equalsIgnoreCase("")){
                edt17.setText(Word1.getText().toString());
            } else if(edt18.getText().toString().equalsIgnoreCase("")){
                edt18.setText(Word1.getText().toString());
            } else if(edt19.getText().toString().equalsIgnoreCase("")){
                edt19.setText(Word1.getText().toString());
            }
        } else if(dictionary[2].length() == 6 && (edt15.getText().toString().equalsIgnoreCase("") ||
                edt16.getText().toString().equalsIgnoreCase("") || edt17.getText().toString().equalsIgnoreCase("")
                || edt18.getText().toString().equalsIgnoreCase("") || edt19.getText().toString().equalsIgnoreCase("")
                || edt20.getText().toString().equalsIgnoreCase(""))){
            if(edt15.getText().toString().equalsIgnoreCase("")){
                edt15.setText(Word1.getText().toString());
            } else if(edt16.getText().toString().equalsIgnoreCase("")){
                edt16.setText(Word1.getText().toString());
            } else if(edt17.getText().toString().equalsIgnoreCase("")){
                edt17.setText(Word1.getText().toString());
            } else if(edt18.getText().toString().equalsIgnoreCase("")){
                edt18.setText(Word1.getText().toString());
            } else if(edt19.getText().toString().equalsIgnoreCase("")){
                edt19.setText(Word1.getText().toString());
            } else if(edt20.getText().toString().equalsIgnoreCase("")){
                edt20.setText(Word1.getText().toString());
            }
        }


        //TODO 4444444444
       else if(dictionary[3].length() == 4 && (edt21.getText().toString().equalsIgnoreCase("") ||
                edt22.getText().toString().equalsIgnoreCase("") || edt23.getText().toString().equalsIgnoreCase("")
                || edt24.getText().toString().equalsIgnoreCase(""))){
            if(edt21.getText().toString().equalsIgnoreCase("")){
                edt21.setText(Word1.getText().toString());
            } else if(edt22.getText().toString().equalsIgnoreCase("")){
                edt22.setText(Word1.getText().toString());
            } else if(edt23.getText().toString().equalsIgnoreCase("")){
                edt23.setText(Word1.getText().toString());
            } else if(edt24.getText().toString().equalsIgnoreCase("")){
                edt24.setText(Word1.getText().toString());
            }
        } else if(dictionary[3].length() == 5 && (edt21.getText().toString().equalsIgnoreCase("") ||
                edt22.getText().toString().equalsIgnoreCase("") || edt23.getText().toString().equalsIgnoreCase("")
                || edt24.getText().toString().equalsIgnoreCase("") || edt25.getText().toString().equalsIgnoreCase(""))){
            if(edt21.getText().toString().equalsIgnoreCase("")){
                edt21.setText(Word1.getText().toString());
            } else if(edt22.getText().toString().equalsIgnoreCase("")){
                edt22.setText(Word1.getText().toString());
            } else if(edt23.getText().toString().equalsIgnoreCase("")){
                edt23.setText(Word1.getText().toString());
            } else if(edt24.getText().toString().equalsIgnoreCase("")){
                edt24.setText(Word1.getText().toString());
            } else if(edt25.getText().toString().equalsIgnoreCase("")){
                edt25.setText(Word1.getText().toString());
            }
        }

    }

    /*private void countButton(Button brn){
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
        else if(edt15.getText().toString().equalsIgnoreCase("")){
            j = 15;
            hashMap.put(j,brn);
        }
        else if(edt16.getText().toString().equalsIgnoreCase("")){
            j = 16;
            hashMap.put(j,brn);
        }
        else if(edt17.getText().toString().equalsIgnoreCase("")){
            j = 17;
            hashMap.put(j,brn);
        }
        else if(edt18.getText().toString().equalsIgnoreCase("")){
            j = 18;
            hashMap.put(j,brn);
        }
        else if(edt19.getText().toString().equalsIgnoreCase("")){
            j = 19;
            hashMap.put(j,brn);
        }
        else if(edt20.getText().toString().equalsIgnoreCase("")){
            j = 20;
            hashMap.put(j,brn);
        }
        else if(edt21.getText().toString().equalsIgnoreCase("")){
            j = 21;
            hashMap.put(j,brn);
        }
        else if(edt22.getText().toString().equalsIgnoreCase("")){
            j = 22;
            hashMap.put(j,brn);
        }
        else if(edt23.getText().toString().equalsIgnoreCase("")){
            j = 23;
            hashMap.put(j,brn);
        }
        else if(edt24.getText().toString().equalsIgnoreCase("")){
            j = 24;
            hashMap.put(j,brn);
        }
        else if(edt25.getText().toString().equalsIgnoreCase("")){
            j = 25;
            hashMap.put(j,brn);
        }
    }*/

    public void ClickButt(View view) {
        switch (view.getId()){
            case R.id.Word1:
                //countButton(Word1);
                insetrWord(Word1);
              //  Word1.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word2:
                //countButton(Word2);
                insetrWord(Word2);
               // Word2.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word3:
                //countButton(Word3);
                insetrWord(Word3);
               // Word3.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word4:
                //countButton(Word4);
                insetrWord(Word4);
               // Word4.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word5:
                //countButton(Word5);
                insetrWord(Word5);
               // Word5.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word6:
                //countButton(Word6);
                insetrWord(Word6);
               // Word6.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word7:
                //countButton(Word7);
                insetrWord(Word7);
               // Word7.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word8:
                //countButton(Word8);
                insetrWord(Word8);
               // Word8.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word9:
                //countButton(Word9);
                insetrWord(Word9);
               // Word9.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word10:
                //countButton(Word10);
                insetrWord(Word10);
               // Word10.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word11:
                //countButton(Word11);
                insetrWord(Word11);
                //Word11.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word12:
                //countButton(Word12);
                insetrWord(Word12);
                //Word12.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word13:
                //countButton(Word13);
                insetrWord(Word13);
                //Word13.setVisibility(View.INVISIBLE);
                break;
            case R.id.Word14:
                //countButton(Word14);
                insetrWord(Word14);
                //Word14.setVisibility(View.INVISIBLE);
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
                if(hashMap.get(3)!=null){
                    try {
                        hashMap.get(3).setVisibility(View.VISIBLE);
                        hashMap.remove(3);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt3.setText("");
                break;
            case R.id.edt4:
                if(hashMap.get(4)!=null){
                    try {
                        hashMap.get(4).setVisibility(View.VISIBLE);
                        hashMap.remove(4);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt4.setText("");
                break;
            case R.id.edt5:
                if(hashMap.get(5)!=null){
                    try {
                        hashMap.get(5).setVisibility(View.VISIBLE);
                        hashMap.remove(5);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt5.setText("");
                break;
            case R.id.edt6:
                if(hashMap.get(6)!=null){
                    try {
                        hashMap.get(6).setVisibility(View.VISIBLE);
                        hashMap.remove(6);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt6.setText("");
                break;
            case R.id.edt7:
                if(hashMap.get(7)!=null){
                    try {
                        hashMap.get(7).setVisibility(View.VISIBLE);
                        hashMap.remove(7);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt7.setText("");
                break;
            case R.id.edt8:
                if(hashMap.get(8)!=null){
                    try {
                        hashMap.get(8).setVisibility(View.VISIBLE);
                        hashMap.remove(8);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt8.setText("");
                break;
            case R.id.edt9:
                if(hashMap.get(9)!=null){
                    try {
                        hashMap.get(9).setVisibility(View.VISIBLE);
                        hashMap.remove(9);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt9.setText("");
                break;
            case R.id.edt10:
                if(hashMap.get(10)!=null){
                    try {
                        hashMap.get(10).setVisibility(View.VISIBLE);
                        hashMap.remove(10);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                edt10.setText("");
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
            case R.id.edt15:
                edt15.setText("");
                if(hashMap.get(15)!=null){
                    try {
                        hashMap.get(15).setVisibility(View.VISIBLE);
                        hashMap.remove(15);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt16:
                edt16.setText("");
                if(hashMap.get(16)!=null){
                    try {
                        hashMap.get(16).setVisibility(View.VISIBLE);
                        hashMap.remove(16);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt17:
                edt17.setText("");
                if(hashMap.get(17)!=null){
                    try {
                        hashMap.get(17).setVisibility(View.VISIBLE);
                        hashMap.remove(17);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt18:
                edt18.setText("");
                if(hashMap.get(18)!=null){
                    try {
                        hashMap.get(18).setVisibility(View.VISIBLE);
                        hashMap.remove(18);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt19:
                edt19.setText("");
                if(hashMap.get(19)!=null){
                    try {
                        hashMap.get(19).setVisibility(View.VISIBLE);
                        hashMap.remove(19);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt20:
                edt20.setText("");
                if(hashMap.get(20)!=null){
                    try {
                        hashMap.get(20).setVisibility(View.VISIBLE);
                        hashMap.remove(20);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt21:
                edt21.setText("");
                if(hashMap.get(21)!=null){
                    try {
                        hashMap.get(21).setVisibility(View.VISIBLE);
                        hashMap.remove(21);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt22:
                edt22.setText("");
                if(hashMap.get(22)!=null){
                    try {
                        hashMap.get(22).setVisibility(View.VISIBLE);
                        hashMap.remove(22);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt23:
                edt23.setText("");
                if(hashMap.get(23)!=null){
                    try {
                        hashMap.get(23).setVisibility(View.VISIBLE);
                        hashMap.remove(23);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt24:
                edt24.setText("");
                if(hashMap.get(24)!=null){
                    try {
                        hashMap.get(24).setVisibility(View.VISIBLE);
                        hashMap.remove(24);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
            case R.id.edt25:
                edt25.setText("");
                if(hashMap.get(25)!=null){
                    try {
                        hashMap.get(25).setVisibility(View.VISIBLE);
                        hashMap.remove(25);
                    }catch (NullPointerException ne){
                        ne.getMessage();
                    }
                    j = 1;
                }
                break;
        }
    }


    private void Answer() {
        if(dictionary[0].length() == 3){
            word1 = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString();
        } else if(dictionary[0].length() == 4) {
            word1 = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString();
        } else if(dictionary[0].length() == 5) {
            word1 = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString()
            + edt5.getText().toString();
        } else if(dictionary[0].length() == 6) {
            word1 = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString()
            + edt5.getText().toString() + edt6.getText().toString();
        } else if(dictionary[0].length() == 7) {
            word1 = edt1.getText().toString() + edt2.getText().toString() + edt3.getText().toString() + edt4.getText().toString()
            + edt5.getText().toString() + edt6.getText().toString() + edt7.getText().toString();
        }


        if(dictionary[1].length() == 3){
            word2 = edt8.getText().toString() + edt9.getText().toString() + edt10.getText().toString();
        } else if(dictionary[1].length() == 4) {
            word2 = edt8.getText().toString() + edt9.getText().toString() + edt10.getText().toString() + edt11.getText().toString();
        } else if(dictionary[1].length() == 5) {
            word2 = edt8.getText().toString() + edt9.getText().toString() + edt10.getText().toString() + edt11.getText().toString()
            + edt12.getText().toString();
        } else if(dictionary[1].length() == 6) {
            word2 = edt8.getText().toString() + edt9.getText().toString() + edt10.getText().toString() + edt11.getText().toString()
            + edt12.getText().toString() + edt13.getText().toString();
        } else if(dictionary[1].length() == 7) {
            word2 = edt8.getText().toString() + edt9.getText().toString() + edt10.getText().toString() + edt11.getText().toString()
            + edt12.getText().toString() + edt13.getText().toString() + edt14.getText().toString();
        }


        if (dictionary[2].length() != 1) {
            if(dictionary[2].length() == 4){
                word3 = edt15.getText().toString() + edt16.getText().toString() + edt17.getText().toString() + edt18.getText().toString();
            } else if(dictionary[2].length() == 5){
                word3 = edt15.getText().toString() + edt16.getText().toString() + edt17.getText().toString() + edt18.getText().toString()
                + edt19.getText().toString();
            } else if(dictionary[2].length() == 6){
                word3 = edt15.getText().toString() + edt16.getText().toString() + edt17.getText().toString() + edt18.getText().toString()
                + edt19.getText().toString() + edt20.getText().toString();
            }
        }else {
            word3 = "1";
        }
        if (dictionary[3].length() != 1) {
            if(dictionary[3].length() == 4){
                word4 = edt21.getText().toString() + edt22.getText().toString() + edt23.getText().toString() + edt24.getText().toString();
            } else if(dictionary[3].length() == 5){
                word4 = edt21.getText().toString() + edt22.getText().toString() + edt23.getText().toString() + edt24.getText().toString()
                + edt25.getText().toString();
            }
        } else {
            word4 = "2";
        }
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
            case "шут":
                Intent intent_1 = new Intent();
                intent_1.putExtra("money_result", Money_text.getText().toString());
                intent_1.putExtra("block", "1");
                setResult(RESULT_OK, intent_1);
                finish();
                break;
            case "вино":
                Intent intent_2 = new Intent();
                intent_2.putExtra("money_result", Money_text.getText().toString());
                intent_2.putExtra("block", "2");
                setResult(RESULT_OK, intent_2);
                finish();
                break;
            case "фарш":
                Intent intent_3 = new Intent();
                intent_3.putExtra("money_result", Money_text.getText().toString());
                intent_3.putExtra("block", "3");
                setResult(RESULT_OK, intent_3);
                finish();
                break;
            case "полк":
                Intent intent_4 = new Intent();
                intent_4.putExtra("money_result", Money_text.getText().toString());
                intent_4.putExtra("block", "4");
                setResult(RESULT_OK, intent_4);
                finish();
                break;
            case "баян":
                Intent intent_5 = new Intent();
                intent_5.putExtra("money_result", Money_text.getText().toString());
                intent_5.putExtra("block", "5");

                setResult(RESULT_OK, intent_5);
                finish();
                break;
            case "жало":
                Intent intent_6 = new Intent();
                intent_6.putExtra("money_result", Money_text.getText().toString());
                intent_6.putExtra("block", "6");
                setResult(RESULT_OK, intent_6);
                finish();
                break;
            case "выбор":
                Intent intent_7 = new Intent();
                intent_7.putExtra("money_result", Money_text.getText().toString());
                intent_7.putExtra("block", "7");
                setResult(RESULT_OK, intent_7);
                finish();
                break;
            case "атлас":
                Intent intent_8 = new Intent();
                intent_8.putExtra("money_result", Money_text.getText().toString());
                intent_8.putExtra("block", "8");
                setResult(RESULT_OK, intent_8);
                finish();
                break;
            case "бокал":
                Intent intent_9 = new Intent();
                intent_9.putExtra("money_result", Money_text.getText().toString());
                intent_9.putExtra("block", "9");
                setResult(RESULT_OK, intent_9);
                finish();
                break;
            case "маска":
                Intent intent_10 = new Intent();
                intent_10.putExtra("money_result", Money_text.getText().toString());
                intent_10.putExtra("block", "10");
                setResult(RESULT_OK, intent_10);
                finish();
                break;
            case "кабан":
                Intent intent_11 = new Intent();
                intent_11.putExtra("money_result", Money_text.getText().toString());
                intent_11.putExtra("block", "11");
                setResult(RESULT_OK, intent_11);
                finish();
                break;
            case "мышка":
                Intent intent_12 = new Intent();
                intent_12.putExtra("money_result", Money_text.getText().toString());
                intent_12.putExtra("block", "12");
                setResult(RESULT_OK, intent_12);
                finish();
                break;
            case "кукла":
                Intent intent_13 = new Intent();
                intent_13.putExtra("money_result", Money_text.getText().toString());
                intent_13.putExtra("block", "13");
                setResult(RESULT_OK, intent_13);
                finish();
                break;
            case "лопата":
                Intent intent_14 = new Intent();
                intent_14.putExtra("money_result", Money_text.getText().toString());
                intent_14.putExtra("block", "14");
                setResult(RESULT_OK, intent_14);
                finish();
                break;
            case "гарант":
                Intent intent_15 = new Intent();
                intent_15.putExtra("money_result", Money_text.getText().toString());
                intent_15.putExtra("block", "15");
                setResult(RESULT_OK, intent_15);
                finish();
                break;
            case "каприз":
                Intent intent_16 = new Intent();
                intent_16.putExtra("money_result", Money_text.getText().toString());
                intent_16.putExtra("block", "16");
                setResult(RESULT_OK, intent_16);
                finish();
                break;
            case "плюшка":
                Intent intent_17 = new Intent();
                intent_17.putExtra("money_result", Money_text.getText().toString());
                intent_17.putExtra("block", "17");
                setResult(RESULT_OK, intent_17);
                finish();
                break;
            case "ромашка":
                Intent intent_18 = new Intent();
                intent_18.putExtra("money_result", Money_text.getText().toString());
                intent_18.putExtra("block", "18");
                setResult(RESULT_OK, intent_18);
                finish();
                break;
            case "осколок":
                Intent intent_19 = new Intent();
                intent_19.putExtra("money_result", Money_text.getText().toString());
                intent_19.putExtra("block", "19");
                setResult(RESULT_OK, intent_19);
                finish();
                break;
            case "дорога":
                Intent intent_20 = new Intent();
                intent_20.putExtra("money_result", Money_text.getText().toString());
                intent_20.putExtra("block", "20");
                setResult(RESULT_OK, intent_20);
                finish();
                break;
            case "атлант":
                Intent intent_21 = new Intent();
                intent_21.putExtra("money_result", Money_text.getText().toString());
                intent_21.putExtra("block", "21");
                setResult(RESULT_OK, intent_21);
                finish();
                break;
            case "петлица":
                Intent intent_22 = new Intent();
                intent_22.putExtra("money_result", Money_text.getText().toString());
                intent_22.putExtra("block", "22");
                setResult(RESULT_OK, intent_22);
                finish();
                break;
            case "актер":
                Intent intent_23 = new Intent();
                intent_23.putExtra("money_result", Money_text.getText().toString());
                intent_23.putExtra("block", "23");
                setResult(RESULT_OK, intent_23);
                finish();
                break;
            case "шрам":
                Intent intent_24 = new Intent();
                intent_24.putExtra("money_result", Money_text.getText().toString());
                intent_24.putExtra("block", "24");
                setResult(RESULT_OK, intent_24);
                finish();
                break;
            case "карп":
                Intent intent_25 = new Intent();
                intent_25.putExtra("money_result", Money_text.getText().toString());
                intent_25.putExtra("block", "25");
                setResult(RESULT_OK, intent_25);
                finish();
                break;
            case "уклон":
                Intent intent_26 = new Intent();
                intent_26.putExtra("money_result", Money_text.getText().toString());
                intent_26.putExtra("block", "26");
                setResult(RESULT_OK, intent_26);
                finish();
                break;
            case "монета":
                Intent intent_27 = new Intent();
                intent_27.putExtra("money_result", Money_text.getText().toString());
                intent_27.putExtra("block", "27");
                setResult(RESULT_OK, intent_27);
                finish();
                break;
            case "листок":
                Intent intent_28 = new Intent();
                intent_28.putExtra("money_result", Money_text.getText().toString());
                intent_28.putExtra("block", "28");
                setResult(RESULT_OK, intent_28);
                finish();
                break;
            case "рост":
                Intent intent_29 = new Intent();
                intent_29.putExtra("money_result", Money_text.getText().toString());
                intent_29.putExtra("block", "29");
                setResult(RESULT_OK, intent_29);
                finish();
                break;
            case "автор":
                Intent intent_30 = new Intent();
                intent_30.putExtra("money_result", Money_text.getText().toString());
                intent_30.putExtra("block", "30");
                setResult(RESULT_OK, intent_30);
                finish();
                break;
        }
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[0] = intent.getStringExtra("dictionary");
        dictionary[1] = intent.getStringExtra("dictionary2");
        dictionary[2] = intent.getStringExtra("dictionary3");
        dictionary[3] = intent.getStringExtra("dictionary4");

        textLvls.setText("Уровень: " + intent.getIntExtra("lvls",0));

        if(dictionary[2].equals("1")) {
            thirdW = "1";
            edt15.setVisibility(View.GONE);
            edt16.setVisibility(View.GONE);
            edt17.setVisibility(View.GONE);
            edt18.setVisibility(View.GONE);
            edt19.setVisibility(View.GONE);
            edt20.setVisibility(View.GONE);
        }
        if(dictionary[3].equals("2")) {
            fourW = "2";
            edt21.setVisibility(View.GONE);
            edt22.setVisibility(View.GONE);
            edt23.setVisibility(View.GONE);
            edt24.setVisibility(View.GONE);
            edt25.setVisibility(View.GONE);
        }

        //TODO 1111
            if(dictionary[0].length() == 3){
                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.VISIBLE);
                edt3.setVisibility(View.VISIBLE);
                edt4.setVisibility(View.GONE);
                edt5.setVisibility(View.GONE);
                edt6.setVisibility(View.GONE);
                edt7.setVisibility(View.GONE);
            } else if(dictionary[0].length() == 4){
                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.VISIBLE);
                edt3.setVisibility(View.VISIBLE);
                edt4.setVisibility(View.VISIBLE);
                edt5.setVisibility(View.GONE);
                edt6.setVisibility(View.GONE);
                edt7.setVisibility(View.GONE);
            } else if(dictionary[0].length() == 5){
                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.VISIBLE);
                edt3.setVisibility(View.VISIBLE);
                edt4.setVisibility(View.VISIBLE);
                edt5.setVisibility(View.VISIBLE);
                edt6.setVisibility(View.GONE);
                edt7.setVisibility(View.GONE);
            } else if(dictionary[0].length() == 6){
                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.VISIBLE);
                edt3.setVisibility(View.VISIBLE);
                edt4.setVisibility(View.VISIBLE);
                edt5.setVisibility(View.VISIBLE);
                edt6.setVisibility(View.VISIBLE);
                edt7.setVisibility(View.GONE);
            } else if(dictionary[0].length() == 7){
                edt1.setVisibility(View.VISIBLE);
                edt2.setVisibility(View.VISIBLE);
                edt3.setVisibility(View.VISIBLE);
                edt4.setVisibility(View.VISIBLE);
                edt5.setVisibility(View.VISIBLE);
                edt6.setVisibility(View.VISIBLE);
                edt7.setVisibility(View.VISIBLE);
            }

        //TODO 2222
            if(dictionary[1].length() == 3){
                edt8.setVisibility(View.VISIBLE);
                edt9.setVisibility(View.VISIBLE);
                edt10.setVisibility(View.VISIBLE);
                edt11.setVisibility(View.GONE);
                edt12.setVisibility(View.GONE);
                edt13.setVisibility(View.GONE);
                edt14.setVisibility(View.GONE);
            } else if(dictionary[1].length() == 4){
                edt8.setVisibility(View.VISIBLE);
                edt9.setVisibility(View.VISIBLE);
                edt10.setVisibility(View.VISIBLE);
                edt11.setVisibility(View.VISIBLE);
                edt12.setVisibility(View.GONE);
                edt13.setVisibility(View.GONE);
                edt14.setVisibility(View.GONE);
            } else if(dictionary[1].length() == 5){
                edt8.setVisibility(View.VISIBLE);
                edt9.setVisibility(View.VISIBLE);
                edt10.setVisibility(View.VISIBLE);
                edt11.setVisibility(View.VISIBLE);
                edt12.setVisibility(View.VISIBLE);
                edt13.setVisibility(View.GONE);
                edt14.setVisibility(View.GONE);
            } else if(dictionary[1].length() == 6){
                edt8.setVisibility(View.VISIBLE);
                edt9.setVisibility(View.VISIBLE);
                edt10.setVisibility(View.VISIBLE);
                edt11.setVisibility(View.VISIBLE);
                edt12.setVisibility(View.VISIBLE);
                edt13.setVisibility(View.VISIBLE);
                edt14.setVisibility(View.GONE);
            } else if(dictionary[1].length() == 7){
                edt8.setVisibility(View.VISIBLE);
                edt9.setVisibility(View.VISIBLE);
                edt10.setVisibility(View.VISIBLE);
                edt11.setVisibility(View.VISIBLE);
                edt12.setVisibility(View.VISIBLE);
                edt13.setVisibility(View.VISIBLE);
                edt14.setVisibility(View.VISIBLE);
            }

        //TODO 33333
            if(dictionary[2].length() == 4){
                edt15.setVisibility(View.VISIBLE);
                edt16.setVisibility(View.VISIBLE);
                edt17.setVisibility(View.VISIBLE);
                edt18.setVisibility(View.VISIBLE);
                edt19.setVisibility(View.GONE);
                edt20.setVisibility(View.GONE);
            } else if(dictionary[2].length() == 5){
                edt15.setVisibility(View.VISIBLE);
                edt16.setVisibility(View.VISIBLE);
                edt17.setVisibility(View.VISIBLE);
                edt18.setVisibility(View.VISIBLE);
                edt19.setVisibility(View.VISIBLE);
                edt20.setVisibility(View.GONE);
            } else if(dictionary[2].length() == 6){
                edt15.setVisibility(View.VISIBLE);
                edt16.setVisibility(View.VISIBLE);
                edt17.setVisibility(View.VISIBLE);
                edt18.setVisibility(View.VISIBLE);
                edt19.setVisibility(View.VISIBLE);
                edt20.setVisibility(View.VISIBLE);
            }


        //TODO 4444
            if(dictionary[3].length() == 4){
                edt21.setVisibility(View.VISIBLE);
                edt22.setVisibility(View.VISIBLE);
                edt23.setVisibility(View.VISIBLE);
                edt24.setVisibility(View.VISIBLE);
                edt25.setVisibility(View.GONE);
            } else if(dictionary[3].length() == 5){
                edt21.setVisibility(View.VISIBLE);
                edt22.setVisibility(View.VISIBLE);
                edt23.setVisibility(View.VISIBLE);
                edt24.setVisibility(View.VISIBLE);
                edt25.setVisibility(View.VISIBLE);
            }

        int m = intent.getIntExtra("money_data",0);
        Money_text.setText(String.valueOf(m));
    }

    private void newGame() {
        //currentWord = dictionary[r.nextInt(dictionary.length)];

        text.setText(shuffleWord(dictionary[0]));

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
        edt15.setText("");
        edt16.setText("");
        edt17.setText("");
        edt18.setText("");
        edt19.setText("");
        edt20.setText("");
        edt21.setText("");
        edt22.setText("");
        edt23.setText("");
        edt24.setText("");
        edt25.setText("");

        OpenWordMoreTest.setEnabled(true);
    }



    private void SubstringLength_forOpenWord(String word, EditText ed1, EditText ed2, EditText ed3, EditText ed4, EditText ed5,
                                             EditText ed6, EditText ed7){
        if(word.length() == 2){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
        } else if(word.length() == 3){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
            ed3.setText(word.substring(2,3));
        } else if(word.length() == 4){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
            ed3.setText(word.substring(2,3));
            ed4.setText(word.substring(3,4));
        } else if(word.length() == 5){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
            ed3.setText(word.substring(2,3));
            ed4.setText(word.substring(3,4));
            ed5.setText(word.substring(4,5));
        } else if(word.length() == 6){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
            ed3.setText(word.substring(2,3));
            ed4.setText(word.substring(3,4));
            ed5.setText(word.substring(4,5));
            ed6.setText(word.substring(5,6));
        } else if(word.length() == 7){
            ed1.setText(word.substring(0,1));
            ed2.setText(word.substring(1,2));
            ed3.setText(word.substring(2,3));
            ed4.setText(word.substring(3,4));
            ed5.setText(word.substring(4,5));
            ed6.setText(word.substring(5,6));
            ed7.setText(word.substring(6,7));
        }
    }


    private void openWordAlgor(){
        Answer();
        // TODO 1111111111111111111111111111111111111
        if(!word1.equals(dictionary[0]) && !word2.equals(dictionary[0])
            && !word3.equals(dictionary[0]) && !word4.equals(dictionary[0])
        && !word1.equalsIgnoreCase(dictionary[1]) && !word1.equalsIgnoreCase(dictionary[2])
            && !word1.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);
            SubstringLength_forOpenWord(dictionary[0],edt1,edt2,edt3,edt4,edt5,edt6,edt7);

            }
        else if(!word1.equals(dictionary[1]) && !word2.equals(dictionary[1])
                && !word3.equals(dictionary[1]) && !word4.equals(dictionary[1])
            && !word1.equalsIgnoreCase(dictionary[0]) && !word1.equalsIgnoreCase(dictionary[2])
                    && !word1.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            SubstringLength_forOpenWord(dictionary[1],edt1,edt2,edt3,edt4,edt5,edt6,edt7);
        }
        else if(!word1.equals(dictionary[2]) && !word2.equals(dictionary[2])
                && !word3.equals(dictionary[2]) && !word4.equals(dictionary[2])
            && !word1.equalsIgnoreCase(dictionary[1]) && !word1.equalsIgnoreCase(dictionary[0])
                    && !word1.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            SubstringLength_forOpenWord(dictionary[2],edt1,edt2,edt3,edt4,edt5,edt6,edt7);
        }
        else if(!word1.equals(dictionary[3]) && !word2.equals(dictionary[3])
                && !word3.equals(dictionary[3]) && !word4.equals(dictionary[3]) &&
            !word1.equalsIgnoreCase(dictionary[1]) && !word1.equalsIgnoreCase(dictionary[2])
                    && !word1.equalsIgnoreCase(dictionary[0])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            SubstringLength_forOpenWord(dictionary[3],edt1,edt2,edt3,edt4,edt5,edt6,edt7);
        }


        // TODO 222222222222222222222222222222
        else if(!word1.equals(dictionary[0]) && !word2.equals(dictionary[0])
                && !word3.equals(dictionary[0]) && !word4.equals(dictionary[0])
            && !word2.equalsIgnoreCase(dictionary[1]) && !word2.equalsIgnoreCase(dictionary[2])
                    && !word2.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);
            SubstringLength_forOpenWord(dictionary[0],edt8,edt9,edt10,edt11,edt12,edt13,edt14);
        }
        else if(!word1.equals(dictionary[1]) && !word2.equals(dictionary[1])
                && !word3.equals(dictionary[1]) && !word4.equals(dictionary[1]) &&
            !word2.equalsIgnoreCase(dictionary[0]) && !word2.equalsIgnoreCase(dictionary[2])
                    && !word2.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);
            SubstringLength_forOpenWord(dictionary[1],edt8,edt9,edt10,edt11,edt12,edt13,edt14);
        }
        else if(!word1.equals(dictionary[2]) && !word2.equals(dictionary[2])
                && !word3.equals(dictionary[2]) && !word4.equals(dictionary[2])
            && !word2.equalsIgnoreCase(dictionary[1]) && !word2.equalsIgnoreCase(dictionary[0])
                    && !word2.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);
            SubstringLength_forOpenWord(dictionary[2],edt8,edt9,edt10,edt11,edt12,edt13,edt14);
        }
        else if(!word1.equals(dictionary[3]) && !word2.equals(dictionary[3])
                && !word3.equals(dictionary[3]) && !word4.equals(dictionary[3]) &&
            !word2.equalsIgnoreCase(dictionary[1]) && !word2.equalsIgnoreCase(dictionary[2])
                    && !word2.equalsIgnoreCase(dictionary[0])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);
            SubstringLength_forOpenWord(dictionary[3],edt8,edt9,edt10,edt11,edt12,edt13,edt14);

        }

        // TODO 33333333333333333333333333333333
        else if(!word1.equals(dictionary[0]) && !word2.equals(dictionary[0])
                && !word3.equals(dictionary[0]) && !word4.equals(dictionary[0]) &&
            !word3.equalsIgnoreCase(dictionary[1]) && !word3.equalsIgnoreCase(dictionary[2])
                    && !word3.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

             if(dictionary[0].length() == 4){
                edt15.setText(dictionary[0].substring(0,1));
                edt16.setText(dictionary[0].substring(1,2));
                edt17.setText(dictionary[0].substring(2,3));
                edt18.setText(dictionary[0].substring(3,4));
            } else if(dictionary[0].length() == 5){
                 edt15.setText(dictionary[0].substring(0,1));
                 edt16.setText(dictionary[0].substring(1,2));
                 edt17.setText(dictionary[0].substring(2,3));
                 edt18.setText(dictionary[0].substring(3,4));
                 edt19.setText(dictionary[0].substring(4,5));
            } else if(dictionary[0].length() == 6){
                 edt15.setText(dictionary[0].substring(0,1));
                 edt16.setText(dictionary[0].substring(1,2));
                 edt17.setText(dictionary[0].substring(2,3));
                 edt18.setText(dictionary[0].substring(3,4));
                 edt19.setText(dictionary[0].substring(4,5));
                 edt20.setText(dictionary[0].substring(5,6));
            }
        }
        else if(!word1.equals(dictionary[1]) && !word2.equals(dictionary[1])
                && !word3.equals(dictionary[1]) && !word4.equals(dictionary[1])
            && !word3.equalsIgnoreCase(dictionary[0]) && !word3.equalsIgnoreCase(dictionary[2])
                    && !word3.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[1].length() == 4){
                edt15.setText(dictionary[1].substring(0,1));
                edt16.setText(dictionary[1].substring(1,2));
                edt17.setText(dictionary[1].substring(2,3));
                edt18.setText(dictionary[1].substring(3,4));
            } else if(dictionary[1].length() == 5){
                edt15.setText(dictionary[1].substring(0,1));
                edt16.setText(dictionary[1].substring(1,2));
                edt17.setText(dictionary[1].substring(2,3));
                edt18.setText(dictionary[1].substring(3,4));
                edt19.setText(dictionary[1].substring(4,5));
            } else if(dictionary[1].length() == 6){
                edt15.setText(dictionary[1].substring(0,1));
                edt16.setText(dictionary[1].substring(1,2));
                edt17.setText(dictionary[1].substring(2,3));
                edt18.setText(dictionary[1].substring(3,4));
                edt19.setText(dictionary[1].substring(4,5));
                edt20.setText(dictionary[1].substring(5,6));
            }
        }
        else if(!word1.equals(dictionary[2]) && !word2.equals(dictionary[2])
                && !word3.equals(dictionary[2]) && !word4.equals(dictionary[2]) &&
            !word3.equalsIgnoreCase(dictionary[1]) && !word3.equalsIgnoreCase(dictionary[0])
                    && !word3.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[2].length() == 4){
                edt15.setText(dictionary[2].substring(0,1));
                edt16.setText(dictionary[2].substring(1,2));
                edt17.setText(dictionary[2].substring(2,3));
                edt18.setText(dictionary[2].substring(3,4));
            } else if(dictionary[2].length() == 5){
                edt15.setText(dictionary[2].substring(0,1));
                edt16.setText(dictionary[2].substring(1,2));
                edt17.setText(dictionary[2].substring(2,3));
                edt18.setText(dictionary[2].substring(3,4));
                edt19.setText(dictionary[2].substring(4,5));
            } else if(dictionary[2].length() == 6){
                edt15.setText(dictionary[2].substring(0,1));
                edt16.setText(dictionary[2].substring(1,2));
                edt17.setText(dictionary[2].substring(2,3));
                edt18.setText(dictionary[2].substring(3,4));
                edt19.setText(dictionary[2].substring(4,5));
                edt20.setText(dictionary[2].substring(5,6));
            }
        }
        else if(!word1.equals(dictionary[3]) && !word2.equals(dictionary[3])
                && !word3.equals(dictionary[3]) && !word4.equals(dictionary[3]) &&
            !word3.equalsIgnoreCase(dictionary[1]) && !word3.equalsIgnoreCase(dictionary[2])
                    && !word3.equalsIgnoreCase(dictionary[0])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[3].length() == 4){
                edt15.setText(dictionary[3].substring(0,1));
                edt16.setText(dictionary[3].substring(1,2));
                edt17.setText(dictionary[3].substring(2,3));
                edt18.setText(dictionary[3].substring(3,4));
            } else if(dictionary[3].length() == 5){
                edt15.setText(dictionary[3].substring(0,1));
                edt16.setText(dictionary[3].substring(1,2));
                edt17.setText(dictionary[3].substring(2,3));
                edt18.setText(dictionary[3].substring(3,4));
                edt19.setText(dictionary[3].substring(4,5));
            } else if(dictionary[3].length() == 6){
                edt15.setText(dictionary[3].substring(0,1));
                edt16.setText(dictionary[3].substring(1,2));
                edt17.setText(dictionary[3].substring(2,3));
                edt18.setText(dictionary[3].substring(3,4));
                edt19.setText(dictionary[3].substring(4,5));
                edt20.setText(dictionary[3].substring(5,6));
            }

        }

        // TODO 4444444444444444444444444444444444444
        else if(!word1.equals(dictionary[0]) && !word2.equals(dictionary[0])
                && !word3.equals(dictionary[0]) && !word4.equals(dictionary[0]) &&
            !word4.equalsIgnoreCase(dictionary[1]) && !word4.equalsIgnoreCase(dictionary[2])
                    && !word4.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[0].length() == 4){
                edt21.setText(dictionary[0].substring(0,1));
                edt22.setText(dictionary[0].substring(1,2));
                edt23.setText(dictionary[0].substring(2,3));
                edt24.setText(dictionary[0].substring(3,4));
            } else if(dictionary[0].length() == 5){
                edt21.setText(dictionary[0].substring(0,1));
                edt22.setText(dictionary[0].substring(1,2));
                edt23.setText(dictionary[0].substring(2,3));
                edt24.setText(dictionary[0].substring(3,4));
                edt25.setText(dictionary[0].substring(4,5));
            }
        }
        else if(!word1.equals(dictionary[1]) && !word2.equals(dictionary[1])
                && !word3.equals(dictionary[1]) && !word4.equals(dictionary[1]) &&
            !word4.equalsIgnoreCase(dictionary[0]) && !word4.equalsIgnoreCase(dictionary[2])
                    && !word4.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[1].length() == 4){
                edt21.setText(dictionary[1].substring(0,1));
                edt22.setText(dictionary[1].substring(1,2));
                edt23.setText(dictionary[1].substring(2,3));
                edt24.setText(dictionary[1].substring(3,4));
            } else if(dictionary[1].length() == 5){
                edt21.setText(dictionary[1].substring(0,1));
                edt22.setText(dictionary[1].substring(1,2));
                edt23.setText(dictionary[1].substring(2,3));
                edt24.setText(dictionary[1].substring(3,4));
                edt25.setText(dictionary[1].substring(4,5));
            }
        }
        else if(!word1.equals(dictionary[2]) && !word2.equals(dictionary[2])
                && !word3.equals(dictionary[2]) && !word4.equals(dictionary[2]) &&
            !word4.equalsIgnoreCase(dictionary[1]) && !word4.equalsIgnoreCase(dictionary[0])
                    && !word4.equalsIgnoreCase(dictionary[3])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[2].length() == 4){
                edt21.setText(dictionary[2].substring(0,1));
                edt22.setText(dictionary[2].substring(1,2));
                edt23.setText(dictionary[2].substring(2,3));
                edt24.setText(dictionary[2].substring(3,4));
            } else if(dictionary[2].length() == 5){
                edt21.setText(dictionary[2].substring(0,1));
                edt22.setText(dictionary[2].substring(1,2));
                edt23.setText(dictionary[2].substring(2,3));
                edt24.setText(dictionary[2].substring(3,4));
                edt25.setText(dictionary[2].substring(4,5));
            }
        }
        else if(!word1.equals(dictionary[3]) && !word2.equals(dictionary[3])
                && !word3.equals(dictionary[3]) && !word4.equals(dictionary[3]) &&
            !word4.equalsIgnoreCase(dictionary[1]) && !word4.equalsIgnoreCase(dictionary[2])
                    && !word4.equalsIgnoreCase(dictionary[0])){
                money_for_open_word -= 60;
                Money_text.setText(""+money_for_open_word);

            if(dictionary[3].length() == 4){
                edt21.setText(dictionary[3].substring(0,1));
                edt22.setText(dictionary[3].substring(1,2));
                edt23.setText(dictionary[3].substring(2,3));
                edt24.setText(dictionary[3].substring(3,4));
            } else if(dictionary[3].length() == 5){
                edt21.setText(dictionary[3].substring(0,1));
                edt22.setText(dictionary[3].substring(1,2));
                edt23.setText(dictionary[3].substring(2,3));
                edt24.setText(dictionary[3].substring(3,4));
                edt25.setText(dictionary[3].substring(4,5));
            }
        }

    }

    public void openWord(View view) {
        money_for_open_word = Integer.parseInt(Money_text.getText().toString());
        if(money_for_open_word >= 60){

            AlertDialog.Builder builder = new AlertDialog.Builder(SomeMoreTest.this);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите использовать данную подсказку?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    openWordAlgor();
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

    private void Edt(EditText edt1){
        edt1.setCursorVisible(false);
        edt1.setLongClickable(false);
        edt1.setClickable(false);
        edt1.setFocusable(false);
        edt1.setSelected(false);
        edt1.setKeyListener(null);
        //edt1.setBackgroundResource(android.R.color.transparent);
    }

    private void enterWord() {
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
        Edt(edt15);
        Edt(edt16);
        Edt(edt17);
        Edt(edt18);
        Edt(edt19);
        Edt(edt20);
        Edt(edt21);
        Edt(edt22);
        Edt(edt23);
        Edt(edt24);
        Edt(edt25);
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

    private void InsertWord(){
        if(dictionary[0].equalsIgnoreCase("шут")) {
            InsetAlg("a","ш","н","в","и","у","т","ф","х","п","р","я","и","о");
        } else  if(dictionary[0].equalsIgnoreCase("вино")) {
            InsetAlg("с","н","р","и","ц","м","в","о","д","е","л","ш","к","ю");
        } else  if(dictionary[0].equalsIgnoreCase("фарш")) {
            InsetAlg("ф","ш","и","н","а","б","м","с","й","р","б","з","л","о");
        }else  if(dictionary[0].equalsIgnoreCase("полк")) {
            InsetAlg("ь","ч","п","а","й","о","л","ю","т","н","е","х","к","б");
        }else  if(dictionary[0].equalsIgnoreCase("баян")) {
            InsetAlg("а","ш","к","я","с","у","о","а","р","н","ц","т","б","э");
        }else  if(dictionary[0].equalsIgnoreCase("жало")) {
            InsetAlg("р","м","ф","ж","о","а","х","т","ю","л","к","т","б","ч");
        }else  if(dictionary[0].equalsIgnoreCase("выбор")) {
            InsetAlg("б","ч","п","а","в","о","е","к","р","й","з","т","м","ы");
        }else  if(dictionary[0].equalsIgnoreCase("атлас")) {
            InsetAlg("а","т","й","я","а","о","в","с","д","н","ц","л","ю","у");
        }else  if(dictionary[0].equalsIgnoreCase("бокал")) {
            InsetAlg("а","и","к","г","я","ь","ф","о","в","р","л","т","б","ш");
        }else  if(dictionary[0].equalsIgnoreCase("маска")) {
            InsetAlg("к","а","э","ц","ч","ш","а","щ","м","н","п","ы","б","с");
        }else  if(dictionary[0].equalsIgnoreCase("кабан")) {
            InsetAlg("у","с","к","е","р","ф","а","а","к","о","г","б","н","ж");
        }else  if(dictionary[0].equalsIgnoreCase("мышка")) {
            InsetAlg("ы","я","л","ю","х","к","ш","м","т","э","л","б","в","а");
        }else  if(dictionary[0].equalsIgnoreCase("кукла")) {
            InsetAlg("у","ц","к","ш","л","ь","ч","й","и","п","н","к","а","е");
        }else  if(dictionary[0].equalsIgnoreCase("лопата")) {
            InsetAlg("а","п","е","а","ь","х","т","й","н","л","о","в","р","ы");
        }else  if(dictionary[0].equalsIgnoreCase("гарант")) {
            InsetAlg("ч","р","щ","т","а","у","б","о","п","н","ы","к","г","а");
        }else  if(dictionary[0].equalsIgnoreCase("каприз")) {
            InsetAlg("и","б","р","й","а","и","д","п","н","о","к","щ","ч","з");
        }else  if(dictionary[0].equalsIgnoreCase("плюшка")) {
            InsetAlg("с","ю","о","п","л","ф","б","к","н","ш","а","ц","в","э");
        }else  if(dictionary[0].equalsIgnoreCase("ромашка")) {
            InsetAlg("а","п","о","и","т","р","к","л","ю","в","а","м","ш","п");
        }else  if(dictionary[0].equalsIgnoreCase("осколок")) {
            InsetAlg("о","ы","к","я","о","л","о","и","ю","к","ч","и","х","с");
        }else  if(dictionary[0].equalsIgnoreCase("дорога")) {
            InsetAlg("ь","ы","г","п","б","в","д","й","р","щ","а","о","т","о");
        }else  if(dictionary[0].equalsIgnoreCase("атлант")) {
            InsetAlg("и","т","й","л","ш","и","к","г","н","а","п","а","у","в");
        }else  if(dictionary[0].equalsIgnoreCase("петлица")) {
            InsetAlg("д","л","и","м","а","п","р","ж","е","о","б","т","ч","ц");
        }else  if(dictionary[0].equalsIgnoreCase("актер")) {
            InsetAlg("е","т","ж","д","ы","ш","у","х","я","к","п","а","р","а");
        }else  if(dictionary[0].equalsIgnoreCase("шрам")) {
            InsetAlg("ф","о","р","й","д","г","л","м","и","ш","а","б","ч","к");
        }else  if(dictionary[0].equalsIgnoreCase("карп")) {
            InsetAlg("р","е","в","е","ь","а","к","у","б","т","ю","п","ф","б");
        }else  if(dictionary[0].equalsIgnoreCase("уклон")) {
            InsetAlg("л","у","а","о","к","п","е","д","н","х","ю","ч","в","й");
        }else  if(dictionary[0].equalsIgnoreCase("монета")) {
            InsetAlg("ц","н","ш","е","м","л","а","о","р","а","т","щ","у","е");
        }else  if(dictionary[0].equalsIgnoreCase("листок")) {
            InsetAlg("ф","в","ю","б","о","к","т","ч","с","д","и","р","л","м");
        }else  if(dictionary[0].equalsIgnoreCase("рост")) {
            InsetAlg("к","р","а","т","щ","у","п","ы","ь","с","л","о","д","я");
        }else  if(dictionary[0].equalsIgnoreCase("автор")) {
            InsetAlg("а", "д", "в", "к", "с", "э", "т", "ж", "р", "б", "ь", "о", "н", "е");
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
        AlertDialog.Builder builder = new AlertDialog.Builder(SomeMoreTest.this);
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
