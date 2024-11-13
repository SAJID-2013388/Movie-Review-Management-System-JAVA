package validation;

import java.time.LocalDate;
import java.util.Date;

public class Validation {

  public static boolean checkReviewerName(String ReviewerName) throws Exception {
    if (ReviewerName == null) {
      throw new Exception("Reviewer name cannot be empty,Please fill up your name");
    }
    if (ReviewerName.length() < 3) {
      throw new Exception("Reviewers name must be at least 3 character long");
    }
    return true;
  }

  public static boolean checkReviewerMassage(String ReviewerName) throws Exception {
    if (ReviewerName == null) {
      throw new Exception("Short Review Massage cannot be empty,Please fill up your name");
    }
    if (ReviewerName.length() < 3) {
      throw new Exception("Short review Massage  must be at least 3 character long");
    }
    return true;
  }


  public static boolean isNull(String value) {
    return value == null;
  }

  public static boolean isZeroOrNull(String value) {
    return value == null;
  }

  public static boolean isNullDate(LocalDate value) {
    return value == null;
  }


}

