package dataClass;

import validation.DateConverter;
import validation.Validation;


import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Objects;

public class MovieReviewData implements Serializable {
  private String ReviewerName;
  private String MovieAndTvSeriesName;
  private String StoryRating;
  private String ActingRating;
  private String DialogueRating;
  private String VisualRating;
  private LocalDate dateOfReview;
  private String shortReviewMassage;


  public MovieReviewData(String reviewerName, String movieAndTvSeriesName, String storyRating, String actingRating, String dialogueRating, String visualRating, String shortReviewMassage, LocalDate dateOfReview) throws Exception {
    this.setReviewerName(reviewerName);
    this.setMovieAndTvSeriesName(movieAndTvSeriesName);
    this.setStoryRating(storyRating);
    this.setActingRating(actingRating);
    this.setDialogueRating(dialogueRating);
    this.setVisualRating(visualRating);
    this.setDateOfReview(dateOfReview);
    this.setShortReviewMassage(shortReviewMassage);
  }

  public LocalDate getDateOfReview() {
    return dateOfReview;
  }


  public void setDateOfReview(LocalDate dateOfReview) throws Exception {
    if (Validation.isNullDate(dateOfReview)) {

      throw new Exception("Date must be selected");
    }
    this.dateOfReview = dateOfReview;
  }

  public String getShortReviewMassage() {
    return shortReviewMassage;

  }

  public void setShortReviewMassage(String shortReviewMassage) throws Exception {
    Validation.checkReviewerMassage(shortReviewMassage);
    shortReviewMassage = shortReviewMassage;
    this.shortReviewMassage = shortReviewMassage;
  }

  //For hash set:
  @Override
  public boolean equals(Object object) {
    if (object instanceof MovieReviewData) {
      MovieReviewData casted = (MovieReviewData) object;
      return this.ReviewerName.equals(casted.getReviewerName()) &&
        this.MovieAndTvSeriesName.equals(casted.getMovieAndTvSeriesName()) &&
        this.StoryRating.equals(casted.getStoryRating()) &&
        this.ActingRating.equals(casted.getActingRating()) &&
        this.DialogueRating.equals(casted.getDialogueRating()) &&
        this.VisualRating.equals(casted.getVisualRating());


    }
    return false;
  }

  //For hash set:
  @Override
  public int hashCode() {
//    int hashcodeOfCurrentObject=this.ReviewerName.hashCode()+
//    this.MovieAndTvSeriesName.hashCode()+this.StoryRating.hashCode()+
//    this.ActingRating.hashCode()+this.DialogueRating.hashCode()+this.VisualRating.hashCode();

//    System.out.println(hashcodeOfCurrentObject);
//    return hashcodeOfCurrentObject;

    return Objects.hash(this.ReviewerName, this.MovieAndTvSeriesName, this.StoryRating, this.ActingRating, this.DialogueRating, this.VisualRating, this.shortReviewMassage);
  }


  public String getReviewerName() {
    return ReviewerName;
  }

  public void setReviewerName(String reviewerName) throws Exception {
    Validation.checkReviewerName(reviewerName);
    ReviewerName = reviewerName;

  }

  public String getMovieAndTvSeriesName() {
    return MovieAndTvSeriesName;
  }

  public void setMovieAndTvSeriesName(String movieAndTvSeriesName) throws Exception {
    if (Validation.isNull(movieAndTvSeriesName)) {
      throw new Exception("Move or TV series name must be selected");
    }
    MovieAndTvSeriesName = movieAndTvSeriesName;
  }

  public String getStoryRating() {
    return StoryRating;
  }

  public void setStoryRating(String storyRating) throws Exception {
    if (Validation.isZeroOrNull(storyRating)) {

      throw new Exception("Story Rating must be selected");
    }
    StoryRating = storyRating;
  }

  public String getActingRating() {
    return ActingRating;
  }

  public void setActingRating(String actingRating) throws Exception {
    if (Validation.isZeroOrNull(actingRating)) {
      throw new Exception("Acting Rating must be selected");
    }
    ActingRating = actingRating;
  }

  public String getDialogueRating() {
    return DialogueRating;
  }

  public void setDialogueRating(String dialogueRating) throws Exception {
    if (Validation.isZeroOrNull(dialogueRating)) {
      throw new Exception("Dialogue Rating must be selected");
    }
    DialogueRating = dialogueRating;
  }

  public String getVisualRating() {
    return VisualRating;
  }

  public void setVisualRating(String visualRating) throws Exception {
    if (Validation.isZeroOrNull(visualRating)) {
      throw new Exception("Visual Rating must be selected");
    }
    VisualRating = visualRating;
  }


  @Override
  public String toString() {
//    return
//      "ReviewerName=" + ReviewerName +
//      " | MovieAndTvSeriesName= " + MovieAndTvSeriesName +
//      " | StoryRating= " + StoryRating +
//      " |ActingRating= " + ActingRating +
//      " | DialogueRating= " + DialogueRating +
//      " | VisualRating= " + VisualRating +
//      " | dateOfReview= " + dateOfReview +
//      " | shortReviewMassage= " + shortReviewMassage ;


    return

      "Movies/TV Series Name:" + MovieAndTvSeriesName +
        " | Reviewer Name:" + ReviewerName +
        " | Date Of Review: " + dateOfReview;
  }
}

