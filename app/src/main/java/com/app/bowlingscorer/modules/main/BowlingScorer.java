package com.app.bowlingscorer.modules.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/**
 * Created by a.hegazy on 18/4/2018.
 */

public class BowlingScorer implements BowlingScorerInterface {

  private int frameNumberToBeRolled;
  private int scoreSoFar;
  private List<Integer> frameScored = new ArrayList<>();
  private Map<Integer, int[]> scoresForFrame = new HashMap<>();

  @Inject public BowlingScorer() {

  }

  @Override public int getFrameNumberToBeRolled() {
    return frameNumberToBeRolled;
  }

  @Override public int getScoreSoFar() {
    return scoreSoFar;
  }

  @Override public boolean gameIsOver() {
    return frameScored.size() == 10;
  }

  @Override public Map<Integer, int[]> roll() {
    Map<Integer, int[]> map = new HashMap<>();
    for (int i = 0; i < frameScored.size(); i++) {
      map.put(frameScored.get(i), scoresForFrame.get(i));
    }
    return map;
  }
}
