// Generated code from Butter Knife. Do not modify!
package com.example.anagram.Decrypt;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.example.anagram.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class decrypt_anagram_ViewBinding implements Unbinder {
  private decrypt_anagram target;

  @UiThread
  public decrypt_anagram_ViewBinding(decrypt_anagram target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public decrypt_anagram_ViewBinding(decrypt_anagram target, View source) {
    this.target = target;

    target.firstAnswr = Utils.findRequiredViewAsType(source, R.id.firstAnswr, "field 'firstAnswr'", Button.class);
    target.secondAnswe = Utils.findRequiredViewAsType(source, R.id.secondAnswe, "field 'secondAnswe'", Button.class);
    target.thirdAnswr = Utils.findRequiredViewAsType(source, R.id.thirdAnswr, "field 'thirdAnswr'", Button.class);
    target.fourAnswr = Utils.findRequiredViewAsType(source, R.id.fourAnswr, "field 'fourAnswr'", Button.class);
    target.checkDecrypt = Utils.findRequiredViewAsType(source, R.id.checkDecrypt, "field 'checkDecrypt'", Button.class);
    target.text = Utils.findRequiredViewAsType(source, R.id.text, "field 'text'", TextView.class);
    target.money = Utils.findRequiredViewAsType(source, R.id.money, "field 'money'", TextView.class);
    target.Time = Utils.findRequiredViewAsType(source, R.id.Time, "field 'Time'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    decrypt_anagram target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.firstAnswr = null;
    target.secondAnswe = null;
    target.thirdAnswr = null;
    target.fourAnswr = null;
    target.checkDecrypt = null;
    target.text = null;
    target.money = null;
    target.Time = null;
  }
}
