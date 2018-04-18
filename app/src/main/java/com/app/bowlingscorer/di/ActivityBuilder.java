package com.app.bowlingscorer.di;

import com.app.bowlingscorer.modules.main.MainActivity;
import com.app.bowlingscorer.modules.main.MainActivityModule;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by a.hegazy on 18/4/2018.
 */

@Module public abstract class ActivityBuilder {

  @ContributesAndroidInjector(modules = MainActivityModule.class)
  abstract MainActivity bindMainActivity();
}
