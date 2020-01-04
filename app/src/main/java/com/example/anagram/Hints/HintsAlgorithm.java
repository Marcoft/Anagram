package com.example.anagram.Hints;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.example.anagram.R;

import cn.pedant.SweetAlert.SweetAlertDialog;


public class HintsAlgorithm {

    public void OpenLetterAlgorithm(EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5,
                                    EditText edt6, EditText edt7, EditText edt8, EditText edt9, EditText edt10, EditText edt11,
                                    EditText edt12, EditText edt13, EditText edt14, String dictionary[],
                                    TextView Money_text){
        if (dictionary[0].length() == 2) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1))
                    && edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))){
            }
            else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 3) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 4) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))){
            } else {
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 5) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 6) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 7) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))){
            } else {
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 8) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))) {
            } else {
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 9) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))){
            } else {
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 10) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                } else if (!edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))) {
                    edt10.setText(dictionary[0].substring(9, 10));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 11) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                } else if (!edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))) {
                    edt10.setText(dictionary[0].substring(9, 10));
                } else if (!edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10, 11))) {
                    edt11.setText(dictionary[0].substring(10, 11));
                }
                minMoney(15,  Money_text);
            }
        } else if (dictionary[0].length() == 12) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11,12))){
            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                } else if (!edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))) {
                    edt10.setText(dictionary[0].substring(9, 10));
                } else if (!edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10, 11))) {
                    edt11.setText(dictionary[0].substring(10, 11));
                } else if (!edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11, 12))) {
                    edt12.setText(dictionary[0].substring(11, 12));
                }
                minMoney(15,Money_text);
            }
        } else if (dictionary[0].length() == 13) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11,12))
                    && edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12,13))){
            } else {
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                } else if (!edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))) {
                    edt10.setText(dictionary[0].substring(9, 10));
                } else if (!edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10, 11))) {
                    edt11.setText(dictionary[0].substring(10, 11));
                } else if (!edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11, 12))) {
                    edt12.setText(dictionary[0].substring(11, 12));
                } else if (!edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12, 13))) {
                    edt13.setText(dictionary[0].substring(12, 13));
                }
                minMoney(15,   Money_text);
            }
        } else if (dictionary[0].length() == 14) {
            if (edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10, 11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11, 12))
                    && edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12, 13))
                    && edt14.getText().toString().equalsIgnoreCase(dictionary[0].substring(13, 14))) {

            } else{
                if (!edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0, 1))) {
                    edt1.setText(dictionary[0].substring(0, 1));
                } else if (!edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1, 2))) {
                    edt2.setText(dictionary[0].substring(1, 2));
                } else if (!edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2, 3))) {
                    edt3.setText(dictionary[0].substring(2, 3));
                } else if (!edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3, 4))) {
                    edt4.setText(dictionary[0].substring(3, 4));
                } else if (!edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4, 5))) {
                    edt5.setText(dictionary[0].substring(4, 5));
                } else if (!edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5, 6))) {
                    edt6.setText(dictionary[0].substring(5, 6));
                } else if (!edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6, 7))) {
                    edt7.setText(dictionary[0].substring(6, 7));
                } else if (!edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7, 8))) {
                    edt8.setText(dictionary[0].substring(7, 8));
                } else if (!edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8, 9))) {
                    edt9.setText(dictionary[0].substring(8, 9));
                } else if (!edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9, 10))) {
                    edt10.setText(dictionary[0].substring(9, 10));
                } else if (!edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10, 11))) {
                    edt11.setText(dictionary[0].substring(10, 11));
                } else if (!edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11, 12))) {
                    edt12.setText(dictionary[0].substring(11, 12));
                } else if (!edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12, 13))) {
                    edt13.setText(dictionary[0].substring(12, 13));
                } else if (!edt14.getText().toString().equalsIgnoreCase(dictionary[0].substring(13, 14))) {
                    edt14.setText(dictionary[0].substring(13, 14));
                }
                minMoney(15, Money_text);
            }
        }


    }
    public void openLetter(TextView Money_text, Context contex,
                           EditText edt1, EditText edt2, EditText edt3,EditText edt4,EditText edt5,
                           EditText edt6,EditText edt7,EditText edt8,EditText edt9,EditText edt10,EditText edt11,
                           EditText edt12,EditText edt13,EditText edt14, String dictionary[]) {
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());

        if(money_for_open_word >= 15 ){     //((dictionary[0].length()*20* 30* 1.5)/100)) {

            AlertDialog.Builder builder = new AlertDialog.Builder(contex);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите использовать данную подсказку?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    OpenLetterAlgorithm(edt1, edt2,  edt3, edt4, edt5,
                                             edt6, edt7, edt8, edt9, edt10, edt11,
                                             edt12, edt13, edt14, dictionary,
                                             Money_text
                                     );
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
            Toast.makeText(contex, "Не хватает монет", Toast.LENGTH_SHORT).show();
        }
    }

    private void minMoney(int a, TextView Money_text ){
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
        money_for_open_word -= a;
        Money_text.setText(""+money_for_open_word);    }

    public void openWordAlgorithm(EditText edt1, EditText edt2, EditText edt3, EditText edt4, EditText edt5,
                                  EditText edt6, EditText edt7, EditText edt8, EditText edt9, EditText edt10, EditText edt11,
                                  EditText edt12, EditText edt13, EditText edt14, String dictionary[],
                                  TextView Money_text){

        if (dictionary[0].length() == 2) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1))
                    && edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 3) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 4) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 5) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 6) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 7) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 8) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 9) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 10) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                edt10.setText(dictionary[0].substring(9, 10));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 11) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                edt10.setText(dictionary[0].substring(9, 10));
                edt11.setText(dictionary[0].substring(10, 11));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 12) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11,12))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                edt10.setText(dictionary[0].substring(9, 10));
                edt11.setText(dictionary[0].substring(10, 11));
                edt12.setText(dictionary[0].substring(11, 12));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 13) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11,12))
                    && edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12,13))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                edt10.setText(dictionary[0].substring(9, 10));
                edt11.setText(dictionary[0].substring(10, 11));
                edt12.setText(dictionary[0].substring(11, 12));
                edt13.setText(dictionary[0].substring(12, 13));
                minMoney(75,Money_text);
            }
        } else if (dictionary[0].length() == 14) {
            if(edt1.getText().toString().equalsIgnoreCase(dictionary[0].substring(0,1)) &&
                    edt2.getText().toString().equalsIgnoreCase(dictionary[0].substring(1,2))
                    && edt3.getText().toString().equalsIgnoreCase(dictionary[0].substring(2,3))
                    && edt4.getText().toString().equalsIgnoreCase(dictionary[0].substring(3,4))
                    && edt5.getText().toString().equalsIgnoreCase(dictionary[0].substring(4,5))
                    && edt6.getText().toString().equalsIgnoreCase(dictionary[0].substring(5,6))
                    && edt7.getText().toString().equalsIgnoreCase(dictionary[0].substring(6,7))
                    && edt8.getText().toString().equalsIgnoreCase(dictionary[0].substring(7,8))
                    && edt9.getText().toString().equalsIgnoreCase(dictionary[0].substring(8,9))
                    && edt10.getText().toString().equalsIgnoreCase(dictionary[0].substring(9,10))
                    && edt11.getText().toString().equalsIgnoreCase(dictionary[0].substring(10,11))
                    && edt12.getText().toString().equalsIgnoreCase(dictionary[0].substring(11,12))
                    && edt13.getText().toString().equalsIgnoreCase(dictionary[0].substring(12,13))
                    && edt14.getText().toString().equalsIgnoreCase(dictionary[0].substring(13,14))){
            }else {
                edt1.setText(dictionary[0].substring(0, 1));
                edt2.setText(dictionary[0].substring(1, 2));
                edt3.setText(dictionary[0].substring(2, 3));
                edt4.setText(dictionary[0].substring(3, 4));
                edt5.setText(dictionary[0].substring(4, 5));
                edt6.setText(dictionary[0].substring(5, 6));
                edt7.setText(dictionary[0].substring(6, 7));
                edt8.setText(dictionary[0].substring(7, 8));
                edt9.setText(dictionary[0].substring(8, 9));
                edt10.setText(dictionary[0].substring(9, 10));
                edt11.setText(dictionary[0].substring(10, 11));
                edt12.setText(dictionary[0].substring(11, 12));
                edt13.setText(dictionary[0].substring(12, 13));
                edt14.setText(dictionary[0].substring(13, 14));
                minMoney(75,Money_text);
            }
        }
    }

    public void openWord(EditText edt1, EditText edt2, EditText edt3,EditText edt4,EditText edt5,
                         EditText edt6,EditText edt7,EditText edt8,EditText edt9,EditText edt10,EditText edt11,
                         EditText edt12,EditText edt13,EditText edt14, String dictionary[],
                         TextView Money_text,Context context) {
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
        if(money_for_open_word >= 75){   //((dictionary[0].length()*20*80)/100)){

            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите использовать данную подсказку?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    openWordAlgorithm( edt1,  edt2,  edt3, edt4, edt5,
                                             edt6, edt7, edt8, edt9, edt10, edt11,
                                             edt12, edt13, edt14,  dictionary, Money_text);
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
            Toast.makeText(context, "Не хватает монет", Toast.LENGTH_SHORT).show();
        }
    }


    public void showDefinition(Context context, TextView Money_text, String dictionary[]) {

        SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(context, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
        int money_for_open_word = Integer.parseInt(Money_text.getText().toString());
        if (money_for_open_word > 50) {

            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Подсказка!")
                    .setMessage("Вы уверенны, что хотите показать определение?")
                    .setCancelable(false)
                    .setNegativeButton("Да!",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {

                                    switch (dictionary[0]) {
                                        case "яр":
                                            sweetAlertDialog.setTitleText(" - высокий, обрывистый, вогнутый, обычно речной и не затопляемый в половодье берег!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);
                                            break;
                                        case "лес":
                                            sweetAlertDialog.setTitleText(" - большая площадь земли, заросшая деревьями!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "бал":
                                            sweetAlertDialog.setTitleText(" - собрание многочисленного общества лиц обоих полов для танцев!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "ель":
                                            sweetAlertDialog.setTitleText(" - род хвойных вечнозелёных деревьев семейства Сосновые; традиционный английский вид пива!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "ужас":
                                            sweetAlertDialog.setTitleText(" - состояние человека под влиянием сильного страха (испуга), отличительной чертой которого является подавленность (оцепенение)!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "факт":
                                            sweetAlertDialog.setTitleText(" - действительное, вполне реальное событие, явление; то, что действительно произошло!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "топь":
                                            sweetAlertDialog.setTitleText(" - топкое, болотистое место!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дочь":
                                            sweetAlertDialog.setTitleText(" - лицо женского пола по отношению к своим родителям!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "итог":
                                            sweetAlertDialog.setTitleText(" - вывод, результат; общая сумма!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "цинк":
                                            sweetAlertDialog.setTitleText(" - химический элемент, ковкий металл синевато-белого цвета с атомным номером 30!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "бокс":
                                            sweetAlertDialog.setTitleText(" - кулачный бой в специальных перчатках по определённым правилам между двумя спортсменами!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "блюз":
                                            sweetAlertDialog.setTitleText(" - джазовая музыка в духе медленных лирических песен американских негров, а также парный бальный танец типа медленного фокстрота!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "цель":
                                            sweetAlertDialog.setTitleText(" - место, в к-рое надо попасть при стрельбе или метании, мишень; то, к чему стремятся, что надо осуществить!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "схема":
                                            sweetAlertDialog.setTitleText(" - чертёж, изображающий устройство, взаимоотношение частей чего-н; изложение, описание, изображение чего-н. в главных чертах!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "пират":
                                            sweetAlertDialog.setTitleText(" - морской разбойник!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "диски":
                                            sweetAlertDialog.setTitleText(" - легкоатлетические снаряды для метания в виде плоского металлического круга, утолщенного в центре; детали машины или какого-либо устройства в виде плоского круга!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "ствол":
                                            sweetAlertDialog.setTitleText(" - основная часть дерева или кустарника от корней до вершины, несущая на себе ветви; часть огнестрельного оружия или орудия в виде трубы, через к-рую проходит, получая определённое направление полёта, пуля или снаряд!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "талия":
                                            sweetAlertDialog.setTitleText(" - наиболее узкая часть туловища между грудью и животом, а также часть платья на этом месте!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "кофта":
                                            sweetAlertDialog.setTitleText(" - короткая, обычно до пояса, женская одежда!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дробь":
                                            sweetAlertDialog.setTitleText(" - мелкие свинцовые шарики для стрельбы из охотничьего ружья!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "тиски":
                                            sweetAlertDialog.setTitleText(" - инструмент для зажимания обрабатываемого предмета!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дрожь":
                                            sweetAlertDialog.setTitleText(" - частое судорожное сокращение мышц (от холода, от нервного состояния)!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "сушка":
                                            sweetAlertDialog.setTitleText(" - это эффективная программа жиросжигания при подготовке к соревнованиям!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "гольф":
                                            sweetAlertDialog.setTitleText(" - игра в мяч с клюшками, цель которой прогнать мяч по дорожкам и лункам, попав в каждую из них меньшим числом ударов!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "берет":
                                            sweetAlertDialog.setTitleText(" - мягкий головной убор без козырька, мягкая круглая плоская шапка без тульи и околыша. Массово используется как элемент военной формы одежды в вооружённых силах многих государств мира, имея различные цвета!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);


                                            break;
                                        case "ларец":
                                            sweetAlertDialog.setTitleText(" - искусно сделанный, украшенный ящичек для хранения вещей, драгоценностей, шкатулка, сундучок!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "арена":
                                            sweetAlertDialog.setTitleText(" - большая круглая площадка посредине цирка, на к-рой даются представления; сооружение для проведения массовых мероприятий!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "вафля":
                                            sweetAlertDialog.setTitleText(" - тонкое сухое печенье с клетчатым оттиском по поверхности!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "купол":
                                            sweetAlertDialog.setTitleText(" - выпуклая крыша в виде полушария!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дверь":
                                            sweetAlertDialog.setTitleText(" - проём, отверстие в стене для входа и выхода, а также створ для закрытия этого отверстия!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "альянс":
                                            sweetAlertDialog.setTitleText(" - союз между государствами для достижения общих целей в определённое время!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "почерк":
                                            sweetAlertDialog.setTitleText(" - манера писать, характер начертаний букв в письме!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "офлайн":
                                            sweetAlertDialog.setTitleText(" - сленговый термин, обычно применяющийся к чему то, не относящемуся к Интернету в противоположность «онлайну»; в компьютерной технике даное слово означает, что устройство выключено!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);
                                            break;
                                        case "алтарь":
                                            sweetAlertDialog.setTitleText(" - жертвенник. Первоначально — сооружение для совершения ритуальных жертвоприношений!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);
                                            break;
                                        case "дранье":
                                            sweetAlertDialog.setTitleText(" - разорванные вещи!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дворник":
                                            sweetAlertDialog.setTitleText(" - работник, поддерживающий чистоту и порядок на дворе и на улице около дома; устройство для механического вытирания смотрового стекла автомашины от падающего снега, дождя!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "мозаика":
                                            sweetAlertDialog.setTitleText(" - рисунок или узор из скреплённых между собой разноцветных камешков, кусочков стекла, эмали!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();

                                            minMoney(50,Money_text);

                                            break;
                                        case "дуршлаг":
                                            sweetAlertDialog.setTitleText(" - кухонная посуда в виде металлического решета с ручкой для отцеживания чего-н., варившегося в воде!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "виртуоз":
                                            sweetAlertDialog.setTitleText(" -  тот, кто в совершенстве владеет техникой своего искусства преимущ. о музыкантах!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);
                                            break;
                                        case "продюсер":
                                            sweetAlertDialog.setTitleText(" - лицо, к-рое организует производство кинофильма, осуществляет финансовый и (совместно с режиссёром) идейно-художественный контроль за ходом съёмок!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "капучино":
                                            sweetAlertDialog.setTitleText(" - кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);
                                            break;
                                        case "кредитка":
                                            sweetAlertDialog.setTitleText(" - банковская платёжная карта, предназначенная для совершения операций, расчёты по которым осуществляются за счёт денежных средств, предоставленных банком клиенту в пределах установленного лимита в соответствии с условиями кредитного договора!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "бриллиант":
                                            sweetAlertDialog.setTitleText(" - алмаз, которому посредством обработки придана специальная форма, максимально выявляющая его естественный блеск!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "адреналин":
                                            sweetAlertDialog.setTitleText(" - гормон мозгового вещества надпочечников, повышающий обмен веществ в организме и жизненную энергию!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "грейпфрут":
                                            sweetAlertDialog.setTitleText(" - субтропическое вечнозелёное дерево внешне плоды которого схожи с апельсином, но их мякоть кислее и с привкусом горечи!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "чугуновоз":
                                            sweetAlertDialog.setTitleText(" - вид грузового вагона, распространённый по всему миру. Предназначен для перевозки жидкого чугуна как в составе поезда, так и на близких расстояниях, к миксеру и доменной печи!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "авитаминоз":
                                            sweetAlertDialog.setTitleText(" - заболевание, вызываемое недостатком витаминов в пище!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "бензопровод":
                                            sweetAlertDialog.setTitleText(" - устройство (трубка, шланг) в самолётах, автомобилях и пр., по к-рым жидкое топливо поступает из бака в двигатель; трубопровод для транспортировки бензина, керосина и др. топлива!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "автомобилист":
                                            sweetAlertDialog.setTitleText(" - специалист по автомобильному делу; водитель или владелец автомобиля, спортсмен, занимающийся автомобильным спортом, специалист по автомобильному делу!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
                                        case "свидетельница":
                                            sweetAlertDialog.setTitleText(" -  один из главнейших участников свадебного обряда; это первая помощница невесты на свадьбе, потому на ее хрупкие плечи ложится целый ряд свадебных обязательств!")
                                                    .setCustomImage(R.drawable.ic_question_answer)
                                                    .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                                                        @Override
                                                        public void onClick(SweetAlertDialog sweetAlertDialog) {
                                                            sweetAlertDialog.dismiss();
                                                        }
                                                    })
                                                    .show();
                                            minMoney(50,Money_text);

                                            break;
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

        } else {
            Toast.makeText(context, "Не хватает монет", Toast.LENGTH_SHORT).show();
        }
    }

}
