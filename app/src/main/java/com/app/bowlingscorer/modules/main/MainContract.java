package com.app.bowlingscorer.modules.main;

/**
 * Created by a.hegazy on 18/4/2018.
 */

public interface MainContract {

  interface View {
    void onMainLoaded();
  }

  interface Presenter{
    void loadMain();
  }

  interface Model{

  }

}
