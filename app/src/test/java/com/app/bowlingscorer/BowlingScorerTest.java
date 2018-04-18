package com.app.bowlingscorer;

import android.app.Application;
import com.app.bowlingscorer.modules.main.BowlingScorer;
import com.app.bowlingscorer.modules.main.BowlingScorerInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by a.hegazy on 18/4/2018.
 */

@RunWith(MockitoJUnitRunner.class) public class BowlingScorerTest {

  @MockitoAnnotations.Mock Application mMockContext;

  @Test public void GetFrameNumberToBeRolled_ReturnsTrue() {
    BowlingScorerInterface mBowlingScorer = new BowlingScorer();
    assertThat(mBowlingScorer.gameIsOver(), is(false));
  }
}
