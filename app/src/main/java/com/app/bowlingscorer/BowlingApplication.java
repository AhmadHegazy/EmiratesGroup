package com.app.bowlingscorer;

import android.support.multidex.MultiDex;
import com.app.bowlingscorer.di.ApplicationComponent;
import com.app.bowlingscorer.di.DaggerApplicationComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by a.hegazy on 18/4/2018.
 */

public class BowlingApplication extends DaggerApplication {

  @Override public void onCreate() {
    super.onCreate();
    MultiDex.install(this);
  }

  @Override protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
    ApplicationComponent mApplicationComponent =
        DaggerApplicationComponent.builder().application(this).build();
    mApplicationComponent.inject(this);
    return mApplicationComponent;
  }
}
