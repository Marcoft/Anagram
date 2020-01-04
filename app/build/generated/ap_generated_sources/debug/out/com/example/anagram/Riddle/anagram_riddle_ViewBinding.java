// Generated code from Butter Knife. Do not modify!
package com.example.anagram.Riddle;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.anagram.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class anagram_riddle_ViewBinding implements Unbinder {
  private anagram_riddle target;

  @UiThread
  public anagram_riddle_ViewBinding(anagram_riddle target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public anagram_riddle_ViewBinding(anagram_riddle target, View source) {
    this.target = target;

    target.btnRiddle1 = Utils.findRequiredViewAsType(source, R.id.btnRiddle1, "field 'btnRiddle1'", Button.class);
    target.btnRiddle2 = Utils.findRequiredViewAsType(source, R.id.btnRiddle2, "field 'btnRiddle2'", Button.class);
    target.btnRiddle3 = Utils.findRequiredViewAsType(source, R.id.btnRiddle3, "field 'btnRiddle3'", Button.class);
    target.btnRiddle4 = Utils.findRequiredViewAsType(source, R.id.btnRiddle4, "field 'btnRiddle4'", Button.class);
    target.btnRiddle5 = Utils.findRequiredViewAsType(source, R.id.btnRiddle5, "field 'btnRiddle5'", Button.class);
    target.btnRiddle6 = Utils.findRequiredViewAsType(source, R.id.btnRiddle6, "field 'btnRiddle6'", Button.class);
    target.btnRiddle7 = Utils.findRequiredViewAsType(source, R.id.btnRiddle7, "field 'btnRiddle7'", Button.class);
    target.btnRiddle8 = Utils.findRequiredViewAsType(source, R.id.btnRiddle8, "field 'btnRiddle8'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    anagram_riddle target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnRiddle1 = null;
    target.btnRiddle2 = null;
    target.btnRiddle3 = null;
    target.btnRiddle4 = null;
    target.btnRiddle5 = null;
    target.btnRiddle6 = null;
    target.btnRiddle7 = null;
    target.btnRiddle8 = null;
  }
}
