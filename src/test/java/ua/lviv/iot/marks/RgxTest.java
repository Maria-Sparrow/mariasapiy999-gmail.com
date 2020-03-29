package ua.lviv.iot.marks;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class RgxTest {

    @Test
    public static void changeMarksbyPatternTest() {
        String marks = "Petrenko Petro 4,Kolodiy Anna 47, Shevchuk Olga 78 ";
        InputStream inputStreamForMarks = new ByteArrayInputStream(marks.getBytes());
        System.setIn(inputStreamForMarks);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        String myMarks = sc.nextLine();
        System.out.println(myMarks);
        RegexMarks.changeMarksbyPattern(sc.nextLine());
    }
    
}
