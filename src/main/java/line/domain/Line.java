package line.domain;

import java.util.Objects;

public class Line {

    private final Point startPoint;
    private final Point endPoint;

    public Line(final Point startPoint, final Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double calculateLength() {
        return Math.sqrt(
                calculateSquare(endPoint.getX(), startPoint.getX())
                        + calculateSquare(endPoint.getY(), startPoint.getY())
        );
    }

    private double calculateSquare(final int endCoordinate, final int startCoordinate) {
        return Math.pow(endCoordinate - startCoordinate, 2);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line line = (Line) o;
        return Objects.equals(startPoint, line.startPoint) && Objects.equals(endPoint, line.endPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startPoint, endPoint);
    }

}
