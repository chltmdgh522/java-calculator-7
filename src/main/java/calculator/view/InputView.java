package calculator.view;

import camp.nextstep.edu.missionutils.Console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

public class InputView {

    public String input() throws IOException {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        return number;
    }
}