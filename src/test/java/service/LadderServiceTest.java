package service;

import domain.LadderHeight;
import domain.UserCount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LadderServiceTest {
    @Test
    @DisplayName("LadderService 생성자 테스트")
    void constructor() {
        assertThat(new LadderService(new UserCount(3), new LadderHeight(3)))
                .isEqualTo(new LadderService(new UserCount(3), new LadderHeight(3)));
    }
}
