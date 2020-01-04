// Generated code from Butter Knife. Do not modify!
package com.example.anagram;

import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class StartActivity_ViewBinding implements Unbinder {
  private StartActivity target;

  @UiThread
  public StartActivity_ViewBinding(StartActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public StartActivity_ViewBinding(StartActivity target, View source) {
    this.target = target;

    target.startAnagr = Utils.findRequiredViewAsType(source, R.id.startAnagr, "field 'startAnagr'", Button.class);
    target.startAnagrFruit = Utils.findRequiredViewAsType(source, R.id.startAnagrFruit, "field 'startAnagrFruit'", Button.class);
    target.startAnagrVegetabl = Utils.findRequiredViewAsType(source, R.id.startAnagrVegetabl, "field 'startAnagrVegetabl'", Button.class);
    target.startAnagrSomeMore = Utils.findRequiredViewAsType(source, R.id.startAnagrSomeMore, "field 'startAnagrSomeMore'", Button.class);
    target.startAnagrRiddle = Utils.findRequiredViewAsType(source, R.id.startAnagrRiddle, "field 'startAnagrRiddle'", Button.class);
    target.startAnagrDecrypt = Utils.findRequiredViewAsType(source, R.id.startAnagrDecrypt, "field 'startAnagrDecrypt'", Button.class);
    target.progressAnagram = Utils.findRequiredViewAsType(source, R.id.progressAnagram, "field 'progressAnagram'", ProgressBar.class);
    target.progressAnagramFruit = Utils.findRequiredViewAsType(source, R.id.progressAnagramFruit, "field 'progressAnagramFruit'", ProgressBar.class);
    target.progressAnagramVegetable = Utils.findRequiredViewAsType(source, R.id.progressAnagramVegetable, "field 'progressAnagramVegetable'", ProgressBar.class);
    target.progressAnagramSomeMore = Utils.findRequiredViewAsType(source, R.id.progressAnagramSomeMore, "field 'progressAnagramSomeMore'", ProgressBar.class);
    target.money_main = Utils.findRequiredViewAsType(source, R.id.money_main, "field 'money_main'", TextView.class);
    target.progressTextAnagramSomeMore = Utils.findRequiredViewAsType(source, R.id.progressTextAnagramSomeMore, "field 'progressTextAnagramSomeMore'", TextView.class);
    target.progressTextAnagramVegetable = Utils.findRequiredViewAsType(source, R.id.progressTextAnagramVegetable, "field 'progressTextAnagramVegetable'", TextView.class);
    target.progressTextAnagramFruit = Utils.findRequiredViewAsType(source, R.id.progressTextAnagramFruit, "field 'progressTextAnagramFruit'", TextView.class);
    target.progressTextAnagram = Utils.findRequiredViewAsType(source, R.id.progressTextAnagram, "field 'progressTextAnagram'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    StartActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.startAnagr = null;
    target.startAnagrFruit = null;
    target.startAnagrVegetabl = null;
    target.startAnagrSomeMore = null;
    target.startAnagrRiddle = null;
    target.startAnagrDecrypt = null;
    target.progressAnagram = null;
    target.progressAnagramFruit = null;
    target.progressAnagramVegetable = null;
    target.progressAnagramSomeMore = null;
    target.money_main = null;
    target.progressTextAnagramSomeMore = null;
    target.progressTextAnagramVegetable = null;
    target.progressTextAnagramFruit = null;
    target.progressTextAnagram = null;
  }
}
