package sample;

import dataClass.MovieReviewData;

import java.io.*;
import java.util.ArrayList;

public class Serialization {

  public static boolean serialize(String pathToFile, ArrayList<MovieReviewData> movieReviewDataArrayList) {
    File file = new File(pathToFile);
    FileOutputStream fileOutputStream;
    ObjectOutputStream objectOutputStream;
    boolean Success;

    try {
      fileOutputStream = new FileOutputStream(pathToFile);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(movieReviewDataArrayList);
      Success = true;
    } catch (Exception exception) {
      Success = false;
    }
    return Success;

  }

  public static ArrayList<MovieReviewData> deserialize(String pathToFile) {
    File file = new File(pathToFile);
    ArrayList<MovieReviewData> movieReviewDataArrayList = null;
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;
    try {
      fileInputStream = new FileInputStream(file);
      objectInputStream = new ObjectInputStream(fileInputStream);
      movieReviewDataArrayList = (ArrayList<MovieReviewData>) objectInputStream.readObject();
    } catch (Exception exception) {
      System.err.println(exception.getMessage());
    }
    return movieReviewDataArrayList;
  }



}
