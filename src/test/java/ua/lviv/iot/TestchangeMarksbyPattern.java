package ua.lviv.iot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestchangeMarksbyPattern {
   
  @Test
    public void changeMarksbyPatternTest() {
        String marks = "Petrenko Petro 100 Ivanenko 50";
        InputStream inputStreamForMarks = new ByteArrayInputStream(marks.getBytes());
        System.setIn(inputStreamForMarks);
        Scanner sc = new Scanner(System.in);
        String myMarks = sc.nextLine();
        System.out.println(myMarks);
        String result = RegexMarks.replaceTextUsingPatterns(myMarks);
      
       assertEquals("Petrenko Petro EXELLENT Ivanenko SATISFACTORY", result);
    }
}
