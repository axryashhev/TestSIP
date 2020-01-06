package com.testsip;

import com.facebook.react.ReactActivity;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;

public class MainActivity extends ReactActivity {

  @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window w = getWindow();
        w.setFlags(
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED,
            WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED
        );
   }

  @Override
  protected String getMainComponentName() {
    return "TestSIP";
  }
}
