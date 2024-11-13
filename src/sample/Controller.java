package sample;


import dataClass.MovieReviewData;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;


public class Controller {

  //  private HashSet<MovieReviewData> MovieReviewList;
//private ArrayList<MovieReviewData> MovieReviewList;
  private ArrayList<MovieReviewData> MovieReviewList = null;
  private ObservableList<MovieReviewData> ObservableMovieReviewList = null;
  // data field to keep track of the selected Reviewer


  private int indexOfSelectedReviewerFromListView = -1;

  @FXML
  void handleTextViewClicked(MouseEvent event) {

  }

  @FXML
  private Button ViewLatestReviewButton;
  @FXML
  private TextField ReviewerNameTextField;

  @FXML
  private ComboBox<String> MovieNameComboBox;
  @FXML
  private ComboBox<String> StoryRatingComboBox;
  @FXML
  private ComboBox<String> ActingRatingComboBox;

  @FXML
  private ComboBox<String> DialogueRatingComboBox;

  @FXML
  private ComboBox<String> VisualRatingComboBox;

  @FXML
  private DatePicker dateOfReviewPicker;

  @FXML
  public void dateOfReviewPicker(ActionEvent actionEvent) {
  }

  @FXML
  private TextField ShortReviewMassageTextField;

  @FXML
  private Button TakeInput;

  @FXML
  private ListView<MovieReviewData> MovieListView;

  @FXML
  private Button EditSelectedMovieReviewButton;

  @FXML
  private Button ViewDetailButton;

  @FXML
  void HandleClearFormButtonClicked(ActionEvent event) {
    this.resetUI();
  }

  @FXML
  void HandleEditSelectedMovieReviewButtonClicked(ActionEvent event) {
    this.indexOfSelectedReviewerFromListView = this.MovieListView.getSelectionModel().getSelectedIndex();
    if (this.indexOfSelectedReviewerFromListView != -1) {
      MovieReviewData savedReview = this.MovieListView.getItems().get(this.indexOfSelectedReviewerFromListView);
      String ReviewerName = savedReview.getReviewerName();
      String ShortMessageReview = savedReview.getShortReviewMassage();
      String MovieAndSeriesName = savedReview.getMovieAndTvSeriesName();
      String StoryRating = savedReview.getStoryRating();
      String ActingRating = savedReview.getActingRating();
      String DialogueRating = savedReview.getDialogueRating();
      String VisualRating = savedReview.getVisualRating();
      LocalDate DateOfReview = (savedReview.getDateOfReview());
      this.UpdateUiWithSavedMovieReviewData(ReviewerName, MovieAndSeriesName, StoryRating, ActingRating, DialogueRating, VisualRating, ShortMessageReview, DateOfReview);

    }


  }

  private void UpdateUiWithSavedMovieReviewData(String reviewerName, String movieAndSeriesName, String StoryRating, String ActingRating, String DialogueRating, String VisualRating, String ShortMassage, LocalDate DateOfReview) {
    this.ReviewerNameTextField.setText(reviewerName);
    this.MovieNameComboBox.setValue(movieAndSeriesName);
    this.StoryRatingComboBox.setValue(StoryRating);
    this.ActingRatingComboBox.setValue(ActingRating);
    this.DialogueRatingComboBox.setValue(DialogueRating);
    this.VisualRatingComboBox.setValue(VisualRating);
    this.ShortReviewMassageTextField.setText(ShortMassage);
    this.dateOfReviewPicker.setValue(DateOfReview);


  }


  @FXML
  public void HandleViewDetailButtonClicked(ActionEvent event) {
    this.indexOfSelectedReviewerFromListView = this.MovieListView.getSelectionModel().getSelectedIndex();
    if (this.indexOfSelectedReviewerFromListView != -1) {
      MovieReviewData movieReviewData = this.MovieListView.getItems().get(indexOfSelectedReviewerFromListView);
      try {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SelectedView.fxml"));
        Pane root = (Pane) fxmlLoader.load();
        SelectedViewController SelectedViewController = fxmlLoader.getController();
        SelectedViewController.setMovieReviewDataObject(movieReviewData);

        Scene detailViewScene = new Scene(root);
        Stage primaryStage = (Stage) this.ViewDetailButton.getScene().getWindow();
        primaryStage.setScene(detailViewScene);
        primaryStage.setTitle("Selected Reviewer: " + movieReviewData.getReviewerName() + " Detail Review ");
        primaryStage.show();
      } catch (Exception exception) {
        Stage primaryStage = (Stage) this.ViewDetailButton.getScene().getWindow();
        ViewUtilities.showErrorMessageDialogueBox(exception.getMessage(), primaryStage);
      }
    }

  }


  @FXML
  void handleTakeInputButtonNext(ActionEvent event) {
//    System.out.println("You are Clicking 'Take Input' button,It Is inside handleTakeInputButtonNext method , which is handler of next button");
    String ReviewerName = this.ReviewerNameTextField.getText();
    String MovieOrTvSeriesName = this.MovieNameComboBox.getSelectionModel().getSelectedItem();
    String ShortReview = this.ShortReviewMassageTextField.getText();
    LocalDate chooseDate = (this.dateOfReviewPicker.getValue());
    String StoryRatingCombo = this.StoryRatingComboBox.getSelectionModel().getSelectedItem();
    String ActingRatingCombo = this.ActingRatingComboBox.getSelectionModel().getSelectedItem();
    String DialogueRatingCombo = this.DialogueRatingComboBox.getSelectionModel().getSelectedItem();
    String VisualRatingCombo = this.VisualRatingComboBox.getSelectionModel().getSelectedItem();

    System.out.println("Information:");
    System.out.println(ReviewerName);
    System.out.println(MovieOrTvSeriesName);
    System.out.println("Story Rating:" + StoryRatingCombo);
    System.out.println("Acting Rating:" + ActingRatingCombo);
    System.out.println("Dialogue Rating:" + DialogueRatingCombo);
    System.out.println("Visual Rating:" + VisualRatingCombo);

    try {

      MovieReviewData MovieReviewObject = new MovieReviewData(ReviewerName, MovieOrTvSeriesName, StoryRatingCombo, ActingRatingCombo, DialogueRatingCombo, VisualRatingCombo, ShortReview, chooseDate);
      System.out.println(MovieReviewObject);

//--------------------------------------------------------------------

      if (this.indexOfSelectedReviewerFromListView != -1) {
        this.MovieReviewList.set(this.indexOfSelectedReviewerFromListView, MovieReviewObject);
        this.ObservableMovieReviewList.set(this.indexOfSelectedReviewerFromListView, MovieReviewObject);
        this.MovieListView.refresh();

      } else {
        this.MovieReviewList.add((MovieReviewData) MovieReviewObject);
        this.ObservableMovieReviewList.add(MovieReviewObject);
      }

//-----------------------------------------------------------------------

      boolean serializationValidity = Serialization.serialize("./dataBase.bin",MovieReviewList);
      if (!(serializationValidity)) {
        throw new Exception("Failed To save");
      }
      this.resetUI();
    } catch (Exception exception) {
      System.err.println(exception.getMessage());
      Stage primaryStage = (Stage) this.TakeInput.getScene().getWindow();
      ViewUtilities.showErrorMessageDialogueBox(exception.getMessage(), primaryStage);

    }
//    this.resetUI();

  }

  //This method will help us to clear out the form in the display
  public void resetUI() {
    this.ReviewerNameTextField.setText("");
    this.MovieNameComboBox.setValue(null);
    this.StoryRatingComboBox.setValue(null);
    this.ActingRatingComboBox.setValue(null);
    this.DialogueRatingComboBox.setValue(null);
    this.VisualRatingComboBox.setValue(null);
    this.ShortReviewMassageTextField.setText("");
    this.dateOfReviewPicker.setValue(null);
  }

  @FXML
  public void handleViewLatestReviewButtonClick(ActionEvent event) throws IOException {
    //got the latest object
    MovieReviewData latest = this.MovieReviewList.get(this.MovieReviewList.size() - 1);
    //loaded the fxml, get the controller,transferred object
    System.out.println("Clicking latest review button");
    FXMLLoader loader = new FXMLLoader(getClass().getResource("DetailView.fxml"));
    Pane root = (Pane) loader.load();
    DetailViewController detailViewController = loader.getController();
    detailViewController.setMovieReviewDataObject(latest);

    //For showing the newly loaded DetailView fxml
    Stage detailViewStage = new Stage();
    Scene detailViewScene = new Scene(root);
    detailViewStage.setScene(detailViewScene);
    detailViewStage.setTitle("Detail view");
    detailViewStage.sizeToScene();
    detailViewStage.show();


  }


  public void initialize() {
    System.out.println("From initialize Method");

    //TODO: replace with deserialization call
//    this.MovieReviewList=new ArrayList<>();
//    this.ObservableMovieReviewList=FXCollections.observableArrayList(MovieReviewList);
//    this.MovieListView.setItems(ObservableMovieReviewList);
//    this.MovieReviewList=new HashSet<>()

    this.MovieReviewList = Serialization.deserialize("./dataBase.bin");
    if (this.MovieReviewList == null) {
      this.MovieReviewList = new ArrayList<>();
    }
    this.ObservableMovieReviewList = FXCollections.observableArrayList(MovieReviewList);
    this.MovieListView.setItems(ObservableMovieReviewList);


    // (Movie / TV series Combo Box)
    ArrayList<String> MovieAndTvSeriesOption = new ArrayList<>();
    MovieAndTvSeriesOption.add("The God Father");
    MovieAndTvSeriesOption.add("Parasite");
    MovieAndTvSeriesOption.add("Departed");
    MovieAndTvSeriesOption.add("The Dark Knight");
    MovieAndTvSeriesOption.add("Joker");
    MovieAndTvSeriesOption.add("Breaking Bad");
    MovieAndTvSeriesOption.add("Batter call saul");
    MovieAndTvSeriesOption.add("Inception");
    MovieAndTvSeriesOption.add("Interstellar");
    MovieAndTvSeriesOption.add("Martian");
    MovieAndTvSeriesOption.add("Lord of the Rings");
    MovieAndTvSeriesOption.add("Gladiator");
    /////////////////////////////////////////////////////////////////////////

    MovieAndTvSeriesOption.add("All The Bright Places");
    MovieAndTvSeriesOption.add("Annabelle");
    MovieAndTvSeriesOption.add("A Quiet Place");
    MovieAndTvSeriesOption.add("Avengers");
    MovieAndTvSeriesOption.add("Avengers End Game");
    MovieAndTvSeriesOption.add("Avengers Infinity War");
    MovieAndTvSeriesOption.add("Bad Boys For Life");
    MovieAndTvSeriesOption.add("Bad Trip");
    MovieAndTvSeriesOption.add("Bird Box");
    MovieAndTvSeriesOption.add("Black Panther");
    MovieAndTvSeriesOption.add("Brave");
    MovieAndTvSeriesOption.add("Fast And Furious");
    MovieAndTvSeriesOption.add("Five Feet Apart");
    MovieAndTvSeriesOption.add("Forgotten");
    MovieAndTvSeriesOption.add("Free Guy");
    MovieAndTvSeriesOption.add("Frozen");
    MovieAndTvSeriesOption.add("IT");
    MovieAndTvSeriesOption.add("IT Chapter Two");
    MovieAndTvSeriesOption.add("Lucy");
    MovieAndTvSeriesOption.add("Me Before You");
    MovieAndTvSeriesOption.add("Moana");
    MovieAndTvSeriesOption.add("Pandora");
    MovieAndTvSeriesOption.add("Sinister");
    MovieAndTvSeriesOption.add("Sinister2");
    MovieAndTvSeriesOption.add("Sky Fall");
    MovieAndTvSeriesOption.add("Spider-Man");
    MovieAndTvSeriesOption.add("Spider-Man Far From Home");
    MovieAndTvSeriesOption.add("Spider-Man Home Coming");
    MovieAndTvSeriesOption.add("Taken");
    MovieAndTvSeriesOption.add("Tangled");
    MovieAndTvSeriesOption.add("Tenet");
    MovieAndTvSeriesOption.add("The Amazing Spider-Man");
    MovieAndTvSeriesOption.add("The God Father");
    MovieAndTvSeriesOption.add("The Amazing Spider-Man 2");
    MovieAndTvSeriesOption.add("The Baby Sitter");
    MovieAndTvSeriesOption.add("The Conjuring");
    MovieAndTvSeriesOption.add("The Conjuring 2");
    MovieAndTvSeriesOption.add("The Conjuring 3");
    MovieAndTvSeriesOption.add("The Dictator");
    MovieAndTvSeriesOption.add("The Edge Of Seventeen");
    MovieAndTvSeriesOption.add("The Fault In Our Stars");
    MovieAndTvSeriesOption.add("The Incredibles");
    MovieAndTvSeriesOption.add("The Kissing Booth");
    MovieAndTvSeriesOption.add("The Kissing Booth 2");
    MovieAndTvSeriesOption.add("The Notebook");
    MovieAndTvSeriesOption.add("The Outpost");
    MovieAndTvSeriesOption.add("The Perfect Date");
    MovieAndTvSeriesOption.add("The Witches");
    MovieAndTvSeriesOption.add("Titanic");
    MovieAndTvSeriesOption.add("To All The Boys I Have Loved Before");
    MovieAndTvSeriesOption.add("Transformers");
    MovieAndTvSeriesOption.add("Trolls");
    /////////////////////////////////////////////////////////////////////////

    ObservableList<String> MovieAndTvSeriesObservableArrayList = FXCollections.observableArrayList(MovieAndTvSeriesOption);
    this.MovieNameComboBox.setItems(MovieAndTvSeriesObservableArrayList);

    ArrayList<String> storyRatingComboBoxOption = new ArrayList<>();
    storyRatingComboBoxOption.add("1");
    storyRatingComboBoxOption.add("2");
    storyRatingComboBoxOption.add("3");
    storyRatingComboBoxOption.add("4");
    storyRatingComboBoxOption.add("5");
    ObservableList<String> storyRatingComboBoxObservableArrayList = FXCollections.observableArrayList(storyRatingComboBoxOption);
    this.StoryRatingComboBox.setItems(storyRatingComboBoxObservableArrayList);

    ArrayList<String> ActingRatingComboBoxOption = new ArrayList<>();
    ActingRatingComboBoxOption.add("1");
    ActingRatingComboBoxOption.add("2");
    ActingRatingComboBoxOption.add("3");
    ActingRatingComboBoxOption.add("4");
    ActingRatingComboBoxOption.add("5");
    ObservableList<String> ActingRatingComboBoxOptionObservableArrayList = FXCollections.observableArrayList(ActingRatingComboBoxOption);
    this.ActingRatingComboBox.setItems(ActingRatingComboBoxOptionObservableArrayList);

    ArrayList<String> DialogueRatingComboBoxOption = new ArrayList<>();
    DialogueRatingComboBoxOption.add("1");
    DialogueRatingComboBoxOption.add("2");
    DialogueRatingComboBoxOption.add("3");
    DialogueRatingComboBoxOption.add("4");
    DialogueRatingComboBoxOption.add("5");
    ObservableList<String> DialogueRatingComboBoxOptionObservableArrayList = FXCollections.observableArrayList(DialogueRatingComboBoxOption);
    this.DialogueRatingComboBox.setItems(DialogueRatingComboBoxOptionObservableArrayList);

    ArrayList<String> VisualRatingComboBoxOption = new ArrayList<>();
    VisualRatingComboBoxOption.add("1");
    VisualRatingComboBoxOption.add("2");
    VisualRatingComboBoxOption.add("3");
    VisualRatingComboBoxOption.add("4");
    VisualRatingComboBoxOption.add("5");
    ObservableList<String> VisualRatingComboBoxOptionObservableArrayList = FXCollections.observableArrayList(VisualRatingComboBoxOption);
    this.VisualRatingComboBox.setItems(VisualRatingComboBoxOptionObservableArrayList);


  }

}

