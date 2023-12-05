package line.view;

import java.util.Objects;
import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String readTwoPoints() {
        System.out.println("좌표를 입력하세요. e.g. \"(10,10)-(14,15)\"");
        String input = scanner.nextLine();
        validate(input);
        return input;
    }

    private static void validate(final String input) {
        if (Objects.isNull(input) || input.isBlank()) {
            throw new IllegalArgumentException("[ERROR] 값을 입력하세요.");
        }
    }

}
