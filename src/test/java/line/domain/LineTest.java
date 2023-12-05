package line.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LineTest {

    @DisplayName("직선은 두 개의 좌표인 시작 좌표와 끝 좌표를 갖는다.")
    @Test
    void 직선_생성() {
        // given
        Point startPoint = new Point(10, 10);
        Point endPoint = new Point(15, 15);

        // when
        Line line = new Line(startPoint, endPoint);

        // then
        assertThat(line).isEqualTo(new Line(new Point(10, 10), new Point(15, 15)));
    }

}
