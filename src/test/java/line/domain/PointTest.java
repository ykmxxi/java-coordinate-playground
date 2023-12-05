package line.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PointTest {

    @DisplayName("점은 x, y 좌표를 갖는다")
    @Test
    void 점_저장() {
        // given
        Point point = new Point(10, 10);

        // when & then
        assertThat(point).isEqualTo(new Point(10, 10));
    }

    @DisplayName("좌표 범위 0 ~ 24를 벗어난 경우 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest(name = "x좌표: {0}, y좌표: {1}")
    @CsvSource(value = {"-1:0", "25:0", "0:-1", "0:25"}, delimiter = ':')
    void 좌표_범위_예외_처리(int x, int y) {
        // when & then
        assertThatThrownBy(() -> new Point(x, y))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 좌표의 범위는 0 ~ 24 입니다.");
    }

    @DisplayName("좌표 범위를 만족한 경우 점이 생성된다.")
    @ParameterizedTest(name = "x좌표: {0}, y좌표: {1}")
    @CsvSource(value = {"0:0", "24:24"}, delimiter = ':')
    void 좌표_범위_예외_처리_통과(int x, int y) {
        // when & then
        assertThatCode(() -> new Point(x, y))
                .doesNotThrowAnyException();
    }

}
