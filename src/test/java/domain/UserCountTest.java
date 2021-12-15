package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserCountTest {
    @Test
    @DisplayName("UserCount 생성자 테스트")
    void constructor() {
        assertThat(new UserCount(1)).isEqualTo(new UserCount(1));
    }
}
