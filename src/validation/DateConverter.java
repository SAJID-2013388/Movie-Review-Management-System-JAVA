package validation;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateConverter {
  //covert local date to data object
  public static Date convertLocalDateToDate (LocalDate localDate){
    Instant instant =localDate.atStartOfDay(ZoneId.systemDefault()).toInstant();
    return Date.from(instant);
  }

  //convert date to local date
  public  static LocalDate convertDateToLocalDate(Date date){
    return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
  }

}
