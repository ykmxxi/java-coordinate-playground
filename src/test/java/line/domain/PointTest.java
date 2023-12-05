package line.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PointTest {

    @DisplayName("점은 x, y 좌표를 갖는다")
    @Test
    void 점_저장() {
        // given
        Point point = new Point(10, 10);

        // when & then
        assertThat(point).isEqualTo(new Point(10, 10));
    }

}
