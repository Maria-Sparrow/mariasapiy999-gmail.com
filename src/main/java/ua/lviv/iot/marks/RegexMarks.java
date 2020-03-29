package ua.lviv.iot.marks;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMarks {

    public static void changeMarksbyPattern(String markToChange) {

        List<String> stringList = new LinkedList<>();
        String patternString ="(\\d{1} \\d{2}";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(markToChange);
        System.out.println("*********Regex output*********");
        while (matcher.find()) {
            stringList.add(matcher.group());
        }
        System.out.println(stringList);
    }
}
