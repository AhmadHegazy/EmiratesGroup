package com.app.bowlingscorer.modules.main;

import java.util.Map;

/**
 * Created by a.hegazy on 18/4/2018.
 */

public interface BowlingScorerInterface {
  int getFrameNumberToBeRolled();
  int getScoreSoFar();
  boolean gameIsOver();
  Map<Integer, int[]> roll();
}
