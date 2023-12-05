package line.domain;

import java.util.Objects;

public class Point {

    private static final int MIN_COORDINATE = 0;
    private static final int MAX_COORDINATE = 24;

    private final int x;
    private final int y;

    public Point(final int x, final int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void validate(final int x, final int y) {
        if (!isValidRange(x) || !isValidRange(y)) {
            throw new IllegalArgumentException("[ERROR] 좌표의 범위는 0 ~ 24 입니다.");
        }
    }

    private boolean isValidRange(final int coordinate) {
        return coordinate >= MIN_COORDINATE && coordinate <= MAX_COORDINATE;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
