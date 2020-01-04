// Generated code from Butter Knife. Do not modify!
package com.example.anagram;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Test_ViewBinding implements Unbinder {
  private Test target;

  @UiThread
  public Test_ViewBinding(Test target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Test_ViewBinding(Test target, View source) {
    this.target = target;

    target.Word1 = Utils.findRequiredViewAsType(source, R.id.Word1, "field 'Word1'", Button.class);
    target.Word2 = Utils.findRequiredViewAsType(source, R.id.Word2, "field 'Word2'", Button.class);
    target.Word3 = Utils.findRequiredViewAsType(source, R.id.Word3, "field 'Word3'", Button.class);
    target.Word4 = Utils.findRequiredViewAsType(source, R.id.Word4, "field 'Word4'", Button.class);
    target.Word5 = Utils.findRequiredViewAsType(source, R.id.Word5, "field 'Word5'", Button.class);
    target.Word6 = Utils.findRequiredViewAsType(source, R.id.Word6, "field 'Word6'", Button.class);
    target.Word7 = Utils.findRequiredViewAsType(source, R.id.Word7, "field 'Word7'", Button.class);
    target.Word8 = Utils.findRequiredViewAsType(source, R.id.Word8, "field 'Word8'", Button.class);
    target.Word9 = Utils.findRequiredViewAsType(source, R.id.Word9, "field 'Word9'", Button.class);
    target.Word10 = Utils.findRequiredViewAsType(source, R.id.Word10, "field 'Word10'", Button.class);
    target.Word11 = Utils.findRequiredViewAsType(source, R.id.Word11, "field 'Word11'", Button.class);
    target.Word12 = Utils.findRequiredViewAsType(source, R.id.Word12, "field 'Word12'", Button.class);
    target.Word13 = Utils.findRequiredViewAsType(source, R.id.Word13, "field 'Word13'", Button.class);
    target.Word14 = Utils.findRequiredViewAsType(source, R.id.Word14, "field 'Word14'", Button.class);
    target.Helpfull = Utils.findRequiredViewAsType(source, R.id.Helpfull, "field 'Helpfull'", ImageButton.class);
    target.hints = Utils.findRequiredViewAsType(source, R.id.hints, "field 'hints'", Button.class);
    target.edt1 = Utils.findRequiredViewAsType(source, R.id.edt1, "field 'edt1'", EditText.class);
    target.edt2 = Utils.findRequiredViewAsType(source, R.id.edt2, "field 'edt2'", EditText.class);
    target.edt3 = Utils.findRequiredViewAsType(source, R.id.edt3, "field 'edt3'", EditText.class);
    target.edt4 = Utils.findRequiredViewAsType(source, R.id.edt4, "field 'edt4'", EditText.class);
    target.edt5 = Utils.findRequiredViewAsType(source, R.id.edt5, "field 'edt5'", EditText.class);
    target.edt6 = Utils.findRequiredViewAsType(source, R.id.edt6, "field 'edt6'", EditText.class);
    target.edt7 = Utils.findRequiredViewAsType(source, R.id.edt7, "field 'edt7'", EditText.class);
    target.edt8 = Utils.findRequiredViewAsType(source, R.id.edt8, "field 'edt8'", EditText.class);
    target.edt9 = Utils.findRequiredViewAsType(source, R.id.edt9, "field 'edt9'", EditText.class);
    target.edt10 = Utils.findRequiredViewAsType(source, R.id.edt10, "field 'edt10'", EditText.class);
    target.edt11 = Utils.findRequiredViewAsType(source, R.id.edt11, "field 'edt11'", EditText.class);
    target.edt12 = Utils.findRequiredViewAsType(source, R.id.edt12, "field 'edt12'", EditText.class);
    target.edt13 = Utils.findRequiredViewAsType(source, R.id.edt13, "field 'edt13'", EditText.class);
    target.edt14 = Utils.findRequiredViewAsType(source, R.id.edt14, "field 'edt14'", EditText.class);
    target.text = Utils.findRequiredViewAsType(source, R.id.text, "field 'text'", TextView.class);
    target.Money_text = Utils.findRequiredViewAsType(source, R.id.money, "field 'Money_text'", TextView.class);
    target.textLvls = Utils.findRequiredViewAsType(source, R.id.textLvls, "field 'textLvls'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Test target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.Word1 = null;
    target.Word2 = null;
    target.Word3 = null;
    target.Word4 = null;
    target.Word5 = null;
    target.Word6 = null;
    target.Word7 = null;
    target.Word8 = null;
    target.Word9 = null;
    target.Word10 = null;
    target.Word11 = null;
    target.Word12 = null;
    target.Word13 = null;
    target.Word14 = null;
    target.Helpfull = null;
    target.hints = null;
    target.edt1 = null;
    target.edt2 = null;
    target.edt3 = null;
    target.edt4 = null;
    target.edt5 = null;
    target.edt6 = null;
    target.edt7 = null;
    target.edt8 = null;
    target.edt9 = null;
    target.edt10 = null;
    target.edt11 = null;
    target.edt12 = null;
    target.edt13 = null;
    target.edt14 = null;
    target.text = null;
    target.Money_text = null;
    target.textLvls = null;
  }
}
