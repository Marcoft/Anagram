// Generated code from Butter Knife. Do not modify!
package com.example.anagram.dop_lvl_fruits_vegetables;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.anagram.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class VegetablesActivity_ViewBinding implements Unbinder {
  private VegetablesActivity target;

  @UiThread
  public VegetablesActivity_ViewBinding(VegetablesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public VegetablesActivity_ViewBinding(VegetablesActivity target, View source) {
    this.target = target;

    target.btn = Utils.findRequiredViewAsType(source, R.id.btn, "field 'btn'", Button.class);
    target.btn2 = Utils.findRequiredViewAsType(source, R.id.btn2, "field 'btn2'", Button.class);
    target.btn3 = Utils.findRequiredViewAsType(source, R.id.btn3, "field 'btn3'", Button.class);
    target.btn4 = Utils.findRequiredViewAsType(source, R.id.btn4, "field 'btn4'", Button.class);
    target.btn5 = Utils.findRequiredViewAsType(source, R.id.btn5, "field 'btn5'", Button.class);
    target.btn6 = Utils.findRequiredViewAsType(source, R.id.btn6, "field 'btn6'", Button.class);
    target.btn7 = Utils.findRequiredViewAsType(source, R.id.btn7, "field 'btn7'", Button.class);
    target.btn8 = Utils.findRequiredViewAsType(source, R.id.btn8, "field 'btn8'", Button.class);
    target.btn9 = Utils.findRequiredViewAsType(source, R.id.btn9, "field 'btn9'", Button.class);
    target.btn10 = Utils.findRequiredViewAsType(source, R.id.btn10, "field 'btn10'", Button.class);
    target.btn11 = Utils.findRequiredViewAsType(source, R.id.btn11, "field 'btn11'", Button.class);
    target.btn12 = Utils.findRequiredViewAsType(source, R.id.btn12, "field 'btn12'", Button.class);
    target.btn13 = Utils.findRequiredViewAsType(source, R.id.btn13, "field 'btn13'", Button.class);
    target.btn14 = Utils.findRequiredViewAsType(source, R.id.btn14, "field 'btn14'", Button.class);
    target.btn15 = Utils.findRequiredViewAsType(source, R.id.btn15, "field 'btn15'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    VegetablesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn = null;
    target.btn2 = null;
    target.btn3 = null;
    target.btn4 = null;
    target.btn5 = null;
    target.btn6 = null;
    target.btn7 = null;
    target.btn8 = null;
    target.btn9 = null;
    target.btn10 = null;
    target.btn11 = null;
    target.btn12 = null;
    target.btn13 = null;
    target.btn14 = null;
    target.btn15 = null;
  }
}
