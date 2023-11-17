import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void test() {
        assertThat("hi").isEqualTo("hi");
    }

}
