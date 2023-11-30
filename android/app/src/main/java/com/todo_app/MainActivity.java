package com.todo_app;
import android.os.Bundle; // Add this here

import com.facebook.react.ReactActivity;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import org.devio.rn.splashscreen.SplashScreen; // Add this here

public class MainActivity extends ReactActivity {
  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "Todo_App";
  }

  @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  // Add this here
        super.onCreate(savedInstanceState);
    }
}
