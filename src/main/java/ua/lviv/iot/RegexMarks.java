package ua.lviv.iot;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMarks {
  static List<String> stringList = new LinkedList<String>();

  protected static String replaceTextUsingPatterns(String textToCheck) {

    final String EXPEL_MARK_PATERN = "0|1[0-9]|2[0-5]";
    final String COMISSION_MARK_PATTERN = "2[6-9]|3[0-9]|4[0-9]";
    final String SATTISFACTORY_MARK_PATTERN = "5[0-9]|6[0-9]|70";
    final String GOOD_MARK_PATTERN = "7[1-9]|8[0-7]";
    final String EXELLENT_MARK_PATTERN = "8[8-9]|9[0-9]|100";

    System.out.println("********* Regex output *********");

    String result =(textToCheck.replaceAll(EXELLENT_MARK_PATTERN, "EXELLENT")
        .replaceAll(GOOD_MARK_PATTERN, "GOOD")
        .replaceAll(SATTISFACTORY_MARK_PATTERN, "SATISFACTORY")
        .replaceAll(COMISSION_MARK_PATTERN, "COMISSION").replaceAll(EXPEL_MARK_PATERN, "EXPEL"));
    System.out.println(result);
    return result;

  }

  public static void main(String... args) {
    replaceTextUsingPatterns("Petrenko Petro 100 Ivanenko 50");

  }
}
