package com.kakao.ladder.core;

import com.kakao.ladder.model.Ladder;
import com.kakao.ladder.ui.LadderGameView;
import com.kakao.ladder.util.BridgeGenerators;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class LadderGameRunnerTest {
    @Mock
    private LadderGameView view;

    @Test
    public void test() {
        Ladder ladder = new Ladder.Builder(4, 3)
                .addRow(true, false, false)
                .addRow(false, true, false)
                .addRow(false, false, true)
                .build();

        LadderGameRunner runner = new LadderGameRunner(view, BridgeGenerators.wrap(ladder));
        when(view.inputPlayers()).thenReturn(4);
        when(view.inputHeight()).thenReturn(3);

        runner.run();

        verify(view, times(1)).printLadder(ladder);
    }

}
