package sample;

import dataClass.MovieReviewData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class DetailViewController {
  @FXML
  private Label LatestReviewerNameLabel;

  @FXML
  private Label MovieNameLabel;

  @FXML
  private Label StoryRatingLabel;

  @FXML
  private Label ActingRatingLabel;

  @FXML
  private Label DialogueRatingLabel;

  @FXML
  private Label VisualRatingLabel;
  @FXML
  private Label ShortReviewMessageLabel;

  @FXML
  private Label LatestReviewRatingLabel;
  @FXML
  private ImageView MoviePosterImageView;


  public void setMovieReviewDataObject(MovieReviewData movieReviewDataObject) throws IOException {
    this.LatestReviewerNameLabel.setText(movieReviewDataObject.getReviewerName());
    this.MovieNameLabel.setText(movieReviewDataObject.getMovieAndTvSeriesName());
    this.StoryRatingLabel.setText(movieReviewDataObject.getStoryRating());
    this.ActingRatingLabel.setText(movieReviewDataObject.getActingRating());
    this.DialogueRatingLabel.setText(movieReviewDataObject.getDialogueRating());
    this.VisualRatingLabel.setText(movieReviewDataObject.getVisualRating());
    this.ShortReviewMessageLabel.setText(movieReviewDataObject.getShortReviewMassage());
    int visualRatingInt = Integer.parseInt(movieReviewDataObject.getVisualRating());
    int dialogueRatingInt = Integer.parseInt(movieReviewDataObject.getDialogueRating());
    int actingRatingInt = Integer.parseInt(movieReviewDataObject.getActingRating());
    int storyRatingInt = Integer.parseInt(movieReviewDataObject.getStoryRating());
    double LatestReviewRatingDouble = (double) ((visualRatingInt + actingRatingInt + dialogueRatingInt + storyRatingInt) / 4.0);
    this.LatestReviewRatingLabel.setText(LatestReviewRatingDouble + "");

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The God Father")) {
      Image theGodFatherImage = new Image("/PosterOfMovies/TheGodFather.jpg");
      this.MoviePosterImageView.setImage(theGodFatherImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Parasite")) {
      Image ParasiteImage = new Image("/PosterOfMovies/Parasite.jpg");
      this.MoviePosterImageView.setImage(ParasiteImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Departed")) {
      Image DepartedImage = new Image("/PosterOfMovies/Departed.jpg");
      this.MoviePosterImageView.setImage(DepartedImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Lord of the Rings")) {
      Image LordOfTheRingsImage = new Image("/PosterOfMovies/LordOfTheRings.jpg");
      this.MoviePosterImageView.setImage(LordOfTheRingsImage);
    }


    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Dark Knight")) {
      Image TheDarkKnightImage = new Image("/PosterOfMovies/TheDarkKnight.jpg");
      this.MoviePosterImageView.setImage(TheDarkKnightImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Joker")) {
      Image JokerImage = new Image("/PosterOfMovies/Joker.jpg");
      this.MoviePosterImageView.setImage(JokerImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Breaking Bad")) {
      Image BreakingBadImage = new Image("/PosterOfMovies/BreakingBad.jpg");
      this.MoviePosterImageView.setImage(BreakingBadImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Batter call saul")) {
      Image BatterCallSaulImage = new Image("/PosterOfMovies/BatterCallSaul.jpg");
      this.MoviePosterImageView.setImage(BatterCallSaulImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Interstellar")) {
      Image InterstellarImage = new Image("/PosterOfMovies/Interstellar.jpg");
      this.MoviePosterImageView.setImage(InterstellarImage);
    }


    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Martian")) {
      Image MartianImage = new Image("/PosterOfMovies/Martian.jpg");
      this.MoviePosterImageView.setImage(MartianImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Inception")) {
      Image InceptionImage = new Image("/PosterOfMovies/Inception.jpg");
      this.MoviePosterImageView.setImage(InceptionImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Gladiator")) {
      Image GladiatorImage = new Image("/PosterOfMovies/Gladiator.jpg");
      this.MoviePosterImageView.setImage(GladiatorImage);
    }


///////////////////////////////////////////////////////////////////////////////////////

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("All The Bright Places")) {
      Image AllTheBrightPlacesImage = new Image("/PosterOfMovies/AllTheBrightPlaces.jpg");
      this.MoviePosterImageView.setImage(AllTheBrightPlacesImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Annabelle")) {
      Image AnnabelleImage = new Image("/PosterOfMovies/Annabelle.jpg");
      this.MoviePosterImageView.setImage(AnnabelleImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("A Quiet Place")) {
      Image AQuietPlaceImage = new Image("/PosterOfMovies/AQuietPlace.png");
      this.MoviePosterImageView.setImage(AQuietPlaceImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Avengers")) {
      Image AvengersImage = new Image("/PosterOfMovies/Avengers.jpg");
      this.MoviePosterImageView.setImage(AvengersImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Avengers End Game")) {
      Image AvengersEndGameImage = new Image("/PosterOfMovies/AvengersEndGame.png");
      this.MoviePosterImageView.setImage(AvengersEndGameImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Avengers Infinity War")) {
      Image AvengersInfinityWarImage = new Image("/PosterOfMovies/AvengersInfinityWar.jpg");
      this.MoviePosterImageView.setImage(AvengersInfinityWarImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Bad Boys For Life")) {
      Image BadBoysForLifeImage = new Image("/PosterOfMovies/BadBoysForLife.jpg");
      this.MoviePosterImageView.setImage(BadBoysForLifeImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Bad Trip")) {
      Image BadTripImage = new Image("/PosterOfMovies/BadTrip.jpg");
      this.MoviePosterImageView.setImage(BadTripImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Bird Box")) {
      Image BirdBoxImage = new Image("/PosterOfMovies/BirdBox.png");
      this.MoviePosterImageView.setImage(BirdBoxImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Black Panther")) {
      Image BlackPantherImage = new Image("/PosterOfMovies/BlackPanther.png");
      this.MoviePosterImageView.setImage(BlackPantherImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Brave")) {
      Image BraveImage = new Image("/PosterOfMovies/Brave.jpg");
      this.MoviePosterImageView.setImage(BraveImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Fast And Furious")) {
      Image FastAndFuriousImage = new Image("/PosterOfMovies/FastAndFurious.jpg");
      this.MoviePosterImageView.setImage(FastAndFuriousImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Five Feet Apart")) {
      Image FiveFeetApartImage = new Image("/PosterOfMovies/FiveFeetApart.jpg");
      this.MoviePosterImageView.setImage(FiveFeetApartImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Forgotten")) {
      Image ForgottenImage = new Image("/PosterOfMovies/Forgotten.jpg");
      this.MoviePosterImageView.setImage(ForgottenImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Free Guy")) {
      Image FreeGuyImage = new Image("/PosterOfMovies/FreeGuy.jpg");
      this.MoviePosterImageView.setImage(FreeGuyImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Frozen")) {
      Image FrozenImage = new Image("/PosterOfMovies/Frozen.jpg");
      this.MoviePosterImageView.setImage(FrozenImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("IT")) {
      Image ITImage = new Image("/PosterOfMovies/IT.jpg");
      this.MoviePosterImageView.setImage(ITImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("IT Chapter Two")) {
      Image ITChapterTwoImage = new Image("/PosterOfMovies/ITChapterTwo.jpg");
      this.MoviePosterImageView.setImage(ITChapterTwoImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Lucy")) {
      Image LucyImage = new Image("/PosterOfMovies/Lucy.jpg");
      this.MoviePosterImageView.setImage(LucyImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Me Before You")) {
      Image MeBeforeYouImage = new Image("/PosterOfMovies/MeBeforeYou.png");
      this.MoviePosterImageView.setImage(MeBeforeYouImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Moana")) {
      Image MoanaImage = new Image("/PosterOfMovies/Moana.jpg");
      this.MoviePosterImageView.setImage(MoanaImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Pandora")) {
      Image PandoraImage = new Image("/PosterOfMovies/Pandora.jpg");
      this.MoviePosterImageView.setImage(PandoraImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Sinister")) {
      Image SinisterImage = new Image("/PosterOfMovies/Sinister.jpg");
      this.MoviePosterImageView.setImage(SinisterImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Sinister2")) {
      Image Sinister2Image = new Image("/PosterOfMovies/Sinister2.jpg");
      this.MoviePosterImageView.setImage(Sinister2Image);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Sky Fall")) {
      Image SkyFallImage = new Image("/PosterOfMovies/SkyFall.jpg");
      this.MoviePosterImageView.setImage(SkyFallImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Spider-Man")) {
      Image SpiderManImage = new Image("/PosterOfMovies/Spider-Man.jpg");
      this.MoviePosterImageView.setImage(SpiderManImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Spider-Man Far From Home")) {
      Image SpiderManFarFromHomeImage = new Image("/PosterOfMovies/Spider-ManFarFromHome.jpg");
      this.MoviePosterImageView.setImage(SpiderManFarFromHomeImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Spider-Man Home Coming")) {
      Image SpiderManHomeComingImage = new Image("/PosterOfMovies/Spider-ManHomeComing.jpg");
      this.MoviePosterImageView.setImage(SpiderManHomeComingImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Taken")) {
      Image TakenImage = new Image("/PosterOfMovies/Taken.jpg");
      this.MoviePosterImageView.setImage(TakenImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Tangled")) {
      Image TangledImage = new Image("/PosterOfMovies/Tangled.jpg");
      this.MoviePosterImageView.setImage(TangledImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Tenet")) {
      Image TenetImage = new Image("/PosterOfMovies/Tenet.jpg");
      this.MoviePosterImageView.setImage(TenetImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Amazing Spider-Man")) {
      Image TheAmazingSpiderManImage = new Image("/PosterOfMovies/TheAmazingSpider-Man.jpeg");
      this.MoviePosterImageView.setImage(TheAmazingSpiderManImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The God Father")) {
      Image theGodFatherImage = new Image("/PosterOfMovies/TheGodFather.jpg");
      this.MoviePosterImageView.setImage(theGodFatherImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Amazing Spider-Man 2")) {
      Image TheAmazingSpiderMan2Image = new Image("/PosterOfMovies/TheAmazingSpider-Man2.jpg");
      this.MoviePosterImageView.setImage(TheAmazingSpiderMan2Image);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Baby Sitter")) {
      Image TheBabySitterImage = new Image("/PosterOfMovies/TheBabySitter.jpg");
      this.MoviePosterImageView.setImage(TheBabySitterImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Conjuring")) {
      Image TheConjuringImage = new Image("/PosterOfMovies/TheConjuring.jpg");
      this.MoviePosterImageView.setImage(TheConjuringImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Conjuring 2")) {
      Image TheConjuring2Image = new Image("/PosterOfMovies/TheConjuring2.jpg");
      this.MoviePosterImageView.setImage(TheConjuring2Image);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Conjuring 3")) {
      Image TheConjuring3Image = new Image("/PosterOfMovies/TheConjuring3.jpg");
      this.MoviePosterImageView.setImage(TheConjuring3Image);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Dictator")) {
      Image TheDictatorImage = new Image("/PosterOfMovies/TheDictator.jpg");
      this.MoviePosterImageView.setImage(TheDictatorImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Edge Of Seventeen")) {
      Image TheEdgeOfSeventeenImage = new Image("/PosterOfMovies/TheEdgeOfSeventeen.jpg");
      this.MoviePosterImageView.setImage(TheEdgeOfSeventeenImage);
    }

    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Fault In Our Stars")) {
      Image TheFaultInOurStarsImage = new Image("/PosterOfMovies/TheFaultInOurStars.png");
      this.MoviePosterImageView.setImage(TheFaultInOurStarsImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Incredibles")) {
      Image TheIncrediblesImage = new Image("/PosterOfMovies/TheIncredibles.jpg");
      this.MoviePosterImageView.setImage(TheIncrediblesImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Kissing Booth")) {
      Image TheKissingBoothImage = new Image("/PosterOfMovies/TheKissingBooth.jpg");
      this.MoviePosterImageView.setImage(TheKissingBoothImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Kissing Booth 2")) {
      Image TheKissingBooth2Image = new Image("/PosterOfMovies/TheKissingBooth2.jpg");
      this.MoviePosterImageView.setImage(TheKissingBooth2Image);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Notebook")) {
      Image TheNotebookImage = new Image("/PosterOfMovies/TheNotebook.jpg");
      this.MoviePosterImageView.setImage(TheNotebookImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Outpost")) {
      Image TheOutpostImage = new Image("/PosterOfMovies/TheOutpost.jpg");
      this.MoviePosterImageView.setImage(TheOutpostImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Perfect Date")) {
      Image ThePerfectDateImage = new Image("/PosterOfMovies/ThePerfectDate.jpg");
      this.MoviePosterImageView.setImage(ThePerfectDateImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("The Witches")) {
      Image TheWitchesImage = new Image("/PosterOfMovies/TheWitches.png");
      this.MoviePosterImageView.setImage(TheWitchesImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Titanic")) {
      Image TitanicImage = new Image("/PosterOfMovies/Titanic.png");
      this.MoviePosterImageView.setImage(TitanicImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("To All The Boys I Have Loved Before")) {
      Image ToAllTheBoysIHaveLovedBeforeImage = new Image("/PosterOfMovies/ToAllTheBoysIHaveLovedBefore.jpg");
      this.MoviePosterImageView.setImage(ToAllTheBoysIHaveLovedBeforeImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Transformers")) {
      Image TransformersImage = new Image("/PosterOfMovies/Transformers.jpg");
      this.MoviePosterImageView.setImage(TransformersImage);
    }
    if (movieReviewDataObject.getMovieAndTvSeriesName().equals("Trolls")) {
      Image TrollsImage = new Image("/PosterOfMovies/Trolls.jpg");
      this.MoviePosterImageView.setImage(TrollsImage);
    }


//////////////////////////////////////////////////////////////////////////////////////
  }


}

