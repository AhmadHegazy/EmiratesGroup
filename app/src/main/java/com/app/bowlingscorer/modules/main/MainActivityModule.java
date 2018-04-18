package com.app.bowlingscorer.modules.main;

import com.app.bowlingscorer.data.model.remote.ApiService;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by a.hegazy on 18/4/2018.
 */

@Module public abstract class MainActivityModule {

  @Provides static MainPresenter provideMainPresenter(MainContract.View mainView,  ApiService
      apiService, BowlingScorer bowlingScorer) {
    return new MainPresenter(mainView, apiService, bowlingScorer);
  }

  @Binds abstract MainContract.View provideMainView(MainActivity mainActivity);
}
