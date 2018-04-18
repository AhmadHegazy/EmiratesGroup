package com.app.bowlingscorer.modules.main;

import com.app.bowlingscorer.data.model.entity.Scores;
import com.app.bowlingscorer.data.model.remote.ApiService;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import javax.inject.Inject;

/**
 * Created by a.hegazy on 18/4/2018.
 */

public class MainPresenter implements MainContract.Presenter {

  MainContract.View mainView;
  ApiService apiService;
  BowlingScorer bowlingScorer;
  //private BehaviorSubject<ArrayList<Scores>> postSubject =
  //    BehaviorSubject.createDefault(new ArrayList<Scores>());
  //private BehaviorSubject<Boolean> isLoadingSubject = BehaviorSubject.createDefault(false);

  @Inject public MainPresenter(MainContract.View mainView, ApiService apiService,
      BowlingScorer bowlingScorer) {
    this.mainView = mainView;
    this.apiService = apiService;
    this.bowlingScorer = bowlingScorer;
  }

  @Override public void loadMain() {
    apiService.loadData();
    this.mainView.onMainLoaded();
  }
}
