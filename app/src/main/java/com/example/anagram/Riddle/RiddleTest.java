package com.example.anagram.Riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.anagram.R;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class RiddleTest extends AppCompatActivity {

    Random r;



    String dictionary[] = {
            "1",
            "2",
            "3"
    };

    String word1 = "";
    String word2 = "";

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

    @BindView(R.id.check_riddle_test) Button check_riddle_test;
    @BindView(R.id.text_riddle_test) TextView text_riddle_test;
    @BindView(R.id.textLvls) TextView textLvls;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riddle_test);
        ButterKnife.bind(this);
        r = new Random();


        changeWord();
        newGame();
        enterWord();
        InsertWord();


    }

    public void checkAnswer(View v) {
        Answer();
        if ((word1.equalsIgnoreCase(dictionary[0]) || word1.equalsIgnoreCase(dictionary[1]))
                && (word2.equalsIgnoreCase(dictionary[0]) || word2.equalsIgnoreCase(dictionary[1]))) {
            check_riddle_test.setEnabled(false);
            Toast.makeText(RiddleTest.this, "Правильно!", Toast.LENGTH_SHORT).show();

            forResult();
        } else {
            Toast.makeText(RiddleTest.this, "     Неверно!" + "\n" + "Попробуй еще", Toast.LENGTH_LONG).show();

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
        }

    }

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

    }

    public void CleanEdt(View view) {
        switch (view.getId()) {
            case R.id.edt1:
                edt1.setText("");
                break;
            case R.id.edt2:
                edt2.setText("");
                break;
            case R.id.edt3:
                edt3.setText("");
                break;
            case R.id.edt4:
                edt4.setText("");
                break;
            case R.id.edt5:
                edt5.setText("");
                break;
            case R.id.edt6:
                edt6.setText("");
                break;
            case R.id.edt7:
                edt7.setText("");
                break;
            case R.id.edt8:
                edt8.setText("");
                break;
            case R.id.edt9:
                edt9.setText("");
                break;
            case R.id.edt10:
                edt10.setText("");
                break;
            case R.id.edt11:
                edt11.setText("");
                break;
            case R.id.edt12:
                edt12.setText("");
                break;
            case R.id.edt13:
                edt13.setText("");
                break;
            case R.id.edt14:
                edt14.setText("");
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
        }

    }

    public void forResult() {
        switch (dictionary[0]) {
            case "сосна":
                Intent intent_1 = new Intent();
                intent_1.putExtra("block", "1");
                setResult(RESULT_OK, intent_1);
                finish();
                break;
            case "нос":
                Intent intent_2 = new Intent();
                intent_2.putExtra("block", "2");
                setResult(RESULT_OK, intent_2);
                finish();
                break;
            case "лапоть":
                Intent intent_3 = new Intent();
                intent_3.putExtra("block", "3");
                setResult(RESULT_OK, intent_3);
                finish();
                break;
            case "куб":
                Intent intent_4 = new Intent();
                intent_4.putExtra("block", "4");
                setResult(RESULT_OK, intent_4);
                finish();
                break;
            case "фара":
                Intent intent_5 = new Intent();
                intent_5.putExtra("block", "5");
                setResult(RESULT_OK, intent_5);
                finish();
                break;
            case "атлас":
                Intent intent_6 = new Intent();
                intent_6.putExtra("block", "6");
                setResult(RESULT_OK, intent_6);
                finish();
                break;
            case "карп":
                Intent intent_7 = new Intent();
                intent_7.putExtra("block", "7");
                setResult(RESULT_OK, intent_7);
                finish();
                break;
            case "смола":
                Intent intent_8 = new Intent();
                intent_8.putExtra("block", "8");
                setResult(RESULT_OK, intent_8);
                finish();
                break;
        }
    }

    public void changeWord() {
        Intent intent = getIntent();
        dictionary[0] = intent.getStringExtra("dictionary");
        dictionary[1] = intent.getStringExtra("dictionary2");
        dictionary[2] = intent.getStringExtra("dictionary3");

        textLvls.setText("Загадка: " + intent.getIntExtra("lvl",0));

        if(intent.getIntExtra("lvl",0) == 1){
            text_riddle_test.setTextSize(27);
        } else  if(intent.getIntExtra("lvl",0) == 2){
            text_riddle_test.setTextSize(25);
        } else  if(intent.getIntExtra("lvl",0) == 3){
            text_riddle_test.setTextSize(26);
        } else  if(intent.getIntExtra("lvl",0) == 4){
            text_riddle_test.setTextSize(26);
        } else  if(intent.getIntExtra("lvl",0) == 5){
            text_riddle_test.setTextSize(25);
        } else  if(intent.getIntExtra("lvl",0) == 6){
            text_riddle_test.setTextSize(25);
        } else  if(intent.getIntExtra("lvl",0) == 7){
            text_riddle_test.setTextSize(22);
        } else  if(intent.getIntExtra("lvl",0) == 8){
            text_riddle_test.setTextSize(25);
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
        }

    }

    private void newGame() {
        //currentWord = dictionary[r.nextInt(dictionary.length)];

        text_riddle_test.setText(dictionary[2]);

        check_riddle_test.setEnabled(true);

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

    }




    @Override
    public void onBackPressed() {
        Intent i2 = new Intent();
        i2.putExtra("block", "0");
        setResult(RESULT_OK, i2);
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

    private void InsertWord(){
        if(dictionary[0].equalsIgnoreCase("сосна")) {
            InsetAlg("а","ш","н","с","и","у","т","ф","с","п","р","я","и","о");
        } else  if(dictionary[0].equalsIgnoreCase("нос")) {
            InsetAlg("с","н","р","и","ц","м","в","о","д","е","л","ш","к","ю");
        } else  if(dictionary[0].equalsIgnoreCase("лапоть")) {
            InsetAlg("т","п","и","н","а","ь","м","с","й","р","б","з","л","о");
        }else  if(dictionary[0].equalsIgnoreCase("куб")) {
            InsetAlg("ь","ч","п","а","у","о","л","ю","т","н","е","х","к","б");
        }else  if(dictionary[0].equalsIgnoreCase("фара")) {
            InsetAlg("а","ф","к","я","с","у","о","а","р","н","ц","т","б","э");
        }else  if(dictionary[0].equalsIgnoreCase("атлас")) {
            InsetAlg("с","м","ф","ж","о","а","х","т","ю","л","к","а","б","ч");
        }else  if(dictionary[0].equalsIgnoreCase("карп")) {
            InsetAlg("б","ч","п","а","в","о","е","к","р","й","з","т","м","ы");
        }else  if(dictionary[0].equalsIgnoreCase("смола")) {
            InsetAlg("а", "т", "й", "я", "а", "о", "в", "с", "д", "н", "м", "л", "ю", "у");
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


        public void HelpOnAplication(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(RiddleTest.this);
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
