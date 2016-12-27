package com.example.matt.quizapp;

import java.util.Random;

/**
 * Created by Matt on 2016-12-21.
 */

public class QuestionBank {
    public int[] leftAdders = {3,16,45,17,6,52,16,45,68,54,12,36,25,19,61,84,52,22,29,5,13,15,62,24,7,3,5,81,64};
    public int[] rightAdders = {4,32,12,16,14,46,65,35,19,85,63,58,32,94,13,49,74,14,18,19,15,47,15,93,6,9,55,17,46};
    public int[] correctAnswers = {7,48,57,33,20,98,81,80,87,139,75,94,57,113,74,133,126,36,47,24,28,62,77,117,13,12,60,98,110};
    public int[] firstIncorrectAnswers = {8,52,63,23,18,106,79,75,88,128,79,90,59,103,68,123,122,30,43,25,26,60,79,119,12,11,50,88,112};
    public int[] secondIncorrectAnswers = {10,61,55,43,22,88,68,70,97,140,70,84,62,116,72,135,136,42,53,34,30,72,89,127,15,16,70,95,100};


    public int getLeftAdder(int i) {
        return leftAdders[i];
    }
    public int getRightAdder(int i) {
        return rightAdders[i];
    }
    public int getCorrectAnswer(int i) {
        return correctAnswers[i];
    }
    public int getFirstIncorrect(int i) {
        return firstIncorrectAnswers[i];
    }
    public int getSecondIncorrect(int i) {
        return secondIncorrectAnswers[i];
    }
}
