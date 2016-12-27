package com.example.matt.quizapp;
import java.util.*;
/**
 * Created by Matt on 2016-12-21.
 */
//Generate three unique random numbers
public class UniqueRandomNumbers {

        private ArrayList<Integer> list = new ArrayList<Integer>();
        public UniqueRandomNumbers() {
            for (int i = 0; i < 3; i++) {
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
        }
        public ArrayList<Integer> getList() {
            return list;
        }

    }

