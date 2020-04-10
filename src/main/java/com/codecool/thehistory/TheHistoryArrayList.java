package com.codecool.thehistory;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class TheHistoryArrayList implements TheHistory {
    /**
     * This implementation should use a String ArrayList so don't change that!
     */

    private String text = "Petunia is a decent little country with a strong and wise leader He sets wise laws in order to keep the country safe stable and prosperous ";
    private List<String> wordsArrayList = new ArrayList<>();

    @Override
    public void add(String text) {
        wordsArrayList = new ArrayList<String>(Arrays.asList(text.split("\\s+")));
//        for (String word : wordsArrayList) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        wordsArrayList.removeIf(word -> word.equals(wordToBeRemoved));
//        for (String word : wordsArrayList) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public int size() {
        return wordsArrayList.size();
    }

    @Override
    public void clear() {
        wordsArrayList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        Collections.replaceAll(wordsArrayList, from, to);
//        for (String word : wordsArrayList) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
        //TODO: check the TheHistory interface for more information
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArrayList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

//    public static void main(String[] args) {
//        TheHistoryArrayList historyList = new TheHistoryArrayList();
//        historyList.add(text);
//        System.out.println();
//
//        System.out.println("Size of ArrayList: " + historyList.size());
//        System.out.print("Word to be removed:");
//        Scanner inRemove = new Scanner(System.in);
//        String wordToBeRemoved = inRemove.nextLine();
//        historyList.removeWord(wordToBeRemoved);
//
//
//
//        System.out.println("\nWord to be replaced:");
//        Scanner inFrom = new Scanner(System.in);
//        String from = inFrom.nextLine();
//        System.out.print("Word to be inserted:");
//        Scanner inTo = new Scanner(System.in);
//        String to = inTo.nextLine().toUpperCase();
//        historyList.replaceOneWord(from, to);
//        historyList.clear();
//        System.out.println("\nSize of ArrayList: " + historyList.size());
//
//    }

}
