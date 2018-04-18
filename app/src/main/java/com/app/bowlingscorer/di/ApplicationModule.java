package com.app.bowlingscorer.di;

import android.app.Application;
import android.content.Context;
import dagger.Binds;
import dagger.Module;

/**
 * Created by a.hegazy on 18/4/2018.
 */

@Module
public abstract class ApplicationModule {

  @Binds
  abstract Context provideContext(Application application);
}
