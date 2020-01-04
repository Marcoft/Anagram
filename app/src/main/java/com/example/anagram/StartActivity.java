package com.example.anagram;

import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.example.anagram.Decrypt.decrypt_anagram;
import com.example.anagram.Riddle.anagram_riddle;
import com.example.anagram.SomeMore.Some_Anagram;
import com.example.anagram.databas.DBHelpersPharmacy;
import com.example.anagram.dop_lvl_fruits_vegetables.FruitsActivity;
import com.example.anagram.dop_lvl_fruits_vegetables.VegetablesActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import cn.pedant.SweetAlert.SweetAlertDialog;

public class StartActivity extends AppCompatActivity {

    @BindView(R.id.startAnagr) Button startAnagr;
    @BindView(R.id.startAnagrFruit) Button startAnagrFruit;
    @BindView(R.id.startAnagrVegetabl) Button startAnagrVegetabl;
    @BindView(R.id.startAnagrSomeMore) Button startAnagrSomeMore;
    @BindView(R.id.startAnagrRiddle) Button startAnagrRiddle;
    @BindView(R.id.startAnagrDecrypt) Button startAnagrDecrypt;

    @BindView(R.id.progressAnagram) ProgressBar progressAnagram;
    @BindView(R.id.progressAnagramFruit) ProgressBar progressAnagramFruit;
    @BindView(R.id.progressAnagramVegetable) ProgressBar progressAnagramVegetable;
    @BindView(R.id.progressAnagramSomeMore) ProgressBar progressAnagramSomeMore;


    @BindView(R.id.money_main) TextView money_main;
    @BindView(R.id.progressTextAnagramSomeMore) TextView progressTextAnagramSomeMore;
    @BindView(R.id.progressTextAnagramVegetable) TextView progressTextAnagramVegetable;
    @BindView(R.id.progressTextAnagramFruit) TextView progressTextAnagramFruit;
    @BindView(R.id.progressTextAnagram) TextView progressTextAnagram;

    SQLiteDatabase sb;
    DBHelpersPharmacy dbHelpers;

    SharedPreferences sharedPreferences;

    private long backPressedTime;
    private Toast backToast;

    int money = 0;
    int x = 0;
    boolean one,two;
    int three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);

        dbHelpers = new DBHelpersPharmacy(this);
        sb = dbHelpers.getWritableDatabase();
        money_main = (TextView) findViewById(R.id.money_main);
        ReadMoneyData();

        sharedPreferences = getPreferences(MODE_PRIVATE);
        three = sharedPreferences.getInt("three", 0);
        int three_fruit = sharedPreferences.getInt("three_fruit", 0);
        int three_vegetable = sharedPreferences.getInt("three_vegetable", 0);
        int three_someMore = sharedPreferences.getInt("three_someMore", 0);
        progressAnagram.setProgress(three);
        progressTextAnagram.setText(three + "/100%");
        progressAnagramFruit.setProgress(three_fruit);
        progressTextAnagramFruit.setText(three_fruit + "/100%");
        progressAnagramVegetable.setProgress(three_vegetable);
        progressTextAnagramVegetable.setText(three_vegetable + "/100%");
        progressAnagramSomeMore.setProgress(three_someMore);
        progressTextAnagramSomeMore.setText(three_someMore + "/100%");

    }

    public void GoAnagram(View view) {
        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
        Intent intent = new Intent(StartActivity.this, Main.class);
        intent.putExtra("moneyToRiddle", money);
        startActivityForResult(intent,100);
    }

    public void GoAnagramFruit(View view) {
        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
        Intent intent5 = new Intent(StartActivity.this, FruitsActivity.class);
        intent5.putExtra("moneyToMore", money);
        startActivityForResult(intent5, 400);
    }

    public void GoAnagramVegetables(View view) {
        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
        Intent intent6 = new Intent(StartActivity.this, VegetablesActivity.class);
        intent6.putExtra("moneyToMore", money);
        startActivityForResult(intent6, 500);
    }

    public void GoAnagramSomeMore(View view) {
        if (three != 100) {
            startAnagrSomeMore.setText("Закрыто");
            Toast.makeText(StartActivity.this, "Уровень откроется, когда пройдете 100% 'Анаграммы'", Toast.LENGTH_LONG).show();
        } else if (three == 100) {
            UPDATE(0, Integer.parseInt(money_main.getText().toString()));
            Intent intent4 = new Intent(StartActivity.this, Some_Anagram.class);
            intent4.putExtra("moneyToMore", money);
            startActivityForResult(intent4, 300);
        }
    }


    public void GoAnagramDecrypt(View view) {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        one = sharedPreferences.getBoolean("one", false);

            if(!one && startAnagrDecrypt.getText().toString().equalsIgnoreCase("Купить")) {
                if (money >= 50 && startAnagrDecrypt.getText().toString().equalsIgnoreCase("Купить")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
                    builder.setTitle("Покупка!")
                            .setMessage("Вы уверенны, что хотите купить данный уровень за 50 монет?")
                            .setCancelable(false)
                            .setNegativeButton("Да!",
                                    new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    money = Integer.parseInt(money_main.getText().toString());
                                    money -= 50;
                                    money_main.setText("" + money);
                                    startAnagrDecrypt.setText("Играть");
                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                    editor.putBoolean("one", true);
                                    editor.commit();
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
                        } else if(startAnagrDecrypt.getText().toString().equalsIgnoreCase("Играть")){
                                    UPDATE(0,Integer.parseInt(money_main.getText().toString()));
                                    Intent intent2 = new Intent(StartActivity.this, decrypt_anagram.class);
                                    startActivityForResult(intent2,200);

                        } else if( money < 50 && startAnagrDecrypt.getText().toString().equalsIgnoreCase("Купить")) {
                            Toast.makeText(StartActivity.this, "Нужно 50 монет на покупку этого уровня!", Toast.LENGTH_SHORT).show();
                        }

                    }
            else if(one || startAnagrDecrypt.getText().toString().equalsIgnoreCase("Играть")){
                         startAnagrDecrypt.setText("Играть");
                        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
                        Intent intent2 = new Intent(StartActivity.this, decrypt_anagram.class);
                        startActivityForResult(intent2,200);

            }


        }

    public void GoAnagramRiddle(View view) {
        sharedPreferences = getPreferences(MODE_PRIVATE);
        two = sharedPreferences.getBoolean("two", false);

        if(!two && startAnagrRiddle.getText().toString().equalsIgnoreCase("Купить")) {
            startAnagrRiddle.setText("Купить");
                    if (money >= 100 && startAnagrRiddle.getText().toString().equalsIgnoreCase("Купить")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
                        builder.setTitle("Покупка!")
                                .setMessage("Вы уверенны, что хотите купить данный уровень за 100 монет?")
                                .setCancelable(false)
                                .setNegativeButton("Да!",
                                        new DialogInterface.OnClickListener() {
                                            public void onClick(DialogInterface dialog, int id) {
                                                money = Integer.parseInt(money_main.getText().toString());
                                                money -= 100;
                                                money_main.setText("" + money);
                                                startAnagrRiddle.setText("Играть");

                                                SharedPreferences.Editor editor = sharedPreferences.edit();
                                                editor.putBoolean("two", true);
                                                editor.commit();
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

                    } else if(startAnagrRiddle.getText().toString().equalsIgnoreCase("Играть")) {
                                UPDATE(0,Integer.parseInt(money_main.getText().toString()));
                                Intent intent3 = new Intent(StartActivity.this, anagram_riddle.class);
                                startActivity(intent3);
                    } else if(money < 100 && startAnagrRiddle.getText().toString().equalsIgnoreCase("Купить")) {
                        Toast.makeText(StartActivity.this, "Нужно 100 монет на покупку этого уровня!", Toast.LENGTH_SHORT).show();
                    }

        } else if(two || startAnagrRiddle.getText().toString().equalsIgnoreCase("Играть")) {
                    startAnagrRiddle.setText("Играть");
                    UPDATE(0,Integer.parseInt(money_main.getText().toString()));
                    Intent intent3 = new Intent(StartActivity.this, anagram_riddle.class);
                    startActivity(intent3);
        }

    }

    public boolean ADDDATA(int Id , int money){
        ContentValues contentValues = new ContentValues();
        contentValues.put("id",Id);
        contentValues.put("countMoney",money);

        long result = sb.insert("Money",null,contentValues);
        if (result == -1) {
            //Toast.makeText(this, "false", Toast.LENGTH_SHORT).show();
            return false;
        }
        else{
            //Toast.makeText(this, "true", Toast.LENGTH_SHORT).show();
            return true;
        }
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

    public void ReadMoneyData(){
        SQLiteDatabase database = dbHelpers.getWritableDatabase();
        Cursor cursor3 = database.query("Money",null,null,null,null,null,null);
        if(cursor3.moveToFirst()){
            int idIndex = cursor3.getColumnIndex("id");
            int idIndex_product = cursor3.getColumnIndex("countMoney");
            do{
                int ID = cursor3.getInt(idIndex);
                int moneyC = cursor3.getInt(idIndex_product);
                money = moneyC;
                money_main.setText(money + "");
                //Toast.makeText(this, "" + moneyC, Toast.LENGTH_SHORT).show();
            } while(cursor3.moveToNext());
        } else{
            //Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
            ADDDATA(0,0);
        }
        cursor3.close();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(data == null){
            return;
        }

        if(requestCode == 100) {
            money = data.getIntExtra("money_result", 0);
            x = (data.getIntExtra("progress", 0));
            if(x!= 0) {
                progressAnagram.setProgress(x);
                progressTextAnagram.setText(x + "/100%");
            }

        }
        if(requestCode == 200) {
            money += data.getIntExtra("money_result", 0);
            int money2 = data.getIntExtra("money_result", 0);
            SweetAlertDialog sweetAlertDialog = new SweetAlertDialog(this, SweetAlertDialog.CUSTOM_IMAGE_TYPE);
            if(money2 == 1){
                sweetAlertDialog.setTitleText(" Вы заработали - " + money2 + " монету!");
            } else if(money2 == 2 || money2 == 3 || money2 == 4){
                sweetAlertDialog.setTitleText(" Вы заработали - " + money2 + " монеты!");
            } else{
                sweetAlertDialog.setTitleText(" Вы заработали - " + money2 + " монет!");
            }
        sweetAlertDialog
                .setCustomImage(R.drawable.ic_question_answer)
                .setConfirmClickListener(new SweetAlertDialog.OnSweetClickListener() {
                    @Override
                    public void onClick(SweetAlertDialog sweetAlertDialog) {
                        sweetAlertDialog.dismiss();
                    }
                })
                    .show();
        }
        if(requestCode == 300) {
            money = data.getIntExtra("money_result", 0);

            if(data.getIntExtra("progress", 0)!=0) {
                progressAnagramSomeMore.setProgress(data.getIntExtra("progress", 0));
                progressTextAnagramSomeMore.setText(data.getIntExtra("progress", 0) + "/100%");
            }

        }
        if(requestCode == 400) {
            money = data.getIntExtra("money_result", 0);
            if(data.getIntExtra("progress", 0)!=0) {
                progressAnagramFruit.setProgress(data.getIntExtra("progress", 0));
                progressTextAnagramFruit.setText(data.getIntExtra("progress", 0) + "/100%");
            }

        }
        if(requestCode == 500) {
            money = data.getIntExtra("money_result", 0);
            if(data.getIntExtra("progress", 0)!=0) {
                progressAnagramVegetable.setProgress(data.getIntExtra("progress", 0));
                progressTextAnagramVegetable.setText(data.getIntExtra("progress", 0) + "/100%");
            }

        }
        money_main.setText(String.valueOf(money));

    }




    @Override
    public void onBackPressed() {
        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        } else{
            backToast = Toast.makeText(this, "Нажмите еще раз, чтобы выйти", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();

    }

    @Override
    protected void onDestroy() {
        SharedPreferences sharedPreferences2 = getSharedPreferences(
                "Saved", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences2.edit();
        editor.remove("flags");
        editor.clear();
        editor.apply();
        UPDATE(0,Integer.parseInt(money_main.getText().toString()));
        super.onDestroy();
    }

    public void HelpOnAplication(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(StartActivity.this);
        builder
                .setView(R.layout.help_application_onstart)
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
