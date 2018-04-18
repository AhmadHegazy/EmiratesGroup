package com.app.bowlingscorer.di;

import android.app.Application;
import com.app.bowlingscorer.BowlingApplication;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

/**
 * Created by a.hegazy on 18/4/2018.
 */

@Singleton @Component(modules = {
    AndroidSupportInjectionModule.class, ApplicationModule.class, ActivityBuilder.class
}) public interface ApplicationComponent extends AndroidInjector<DaggerApplication> {

  void inject(BowlingApplication app);

  @Override void inject(DaggerApplication instance);

  @Component.Builder interface Builder {
    @BindsInstance Builder application(Application application);

    ApplicationComponent build();
  }
}
