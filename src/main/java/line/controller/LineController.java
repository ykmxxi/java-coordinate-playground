package line.controller;

import java.util.ArrayList;
import java.util.List;

import line.domain.Line;
import line.domain.Point;
import line.view.InputView;

public class LineController {

    public void run() {
        List<Point> points = new ArrayList<>();

        try {
            getTwoPoints(points);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getTwoPoints(points);
        }

        Line line = new Line(points.get(0), points.get(1));
        System.out.println("두 점 사이 거리는 " + line.calculateLength());
    }

    private void getTwoPoints(final List<Point> points) {
        String twoPoints = InputView.readTwoPoints();
        String[] tokens = twoPoints.split("-");
        for (String token : tokens) {
            String removeBracket = token.replaceAll("[()]", "");
            String[] coordinates = removeBracket.split(",");
            points.add(new Point(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1])));
        }
    }

}
