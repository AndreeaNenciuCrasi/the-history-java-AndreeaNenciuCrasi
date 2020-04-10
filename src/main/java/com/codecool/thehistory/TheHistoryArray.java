package com.codecool.thehistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TheHistoryArray implements TheHistory {

    private String text = "Petunia is a decent little country with a strong and wise leader He sets wise laws in order country with to keep the country safe stable and prosperous country with a strong and wise leader";
//            "For example it is forbidden to use the word dictator since it induces uneasiness and threatens peace";

    private String[] wordsArray = new String[0];

    @Override
    public void add(String text) {
        String[] temp = text.split("\\s+");
        String[] tempArray = new String[wordsArray.length + temp.length];
        System.arraycopy(wordsArray, 0, tempArray, 0, wordsArray.length);
        System.arraycopy(temp, 0, tempArray, wordsArray.length, temp.length);
        wordsArray = tempArray;
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        int count = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(wordToBeRemoved)) {
                wordsArray[i] = null;
                count += 1;
            }
        }
        String[] tempArray = new String[wordsArray.length - count];
        int ct = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i] != null) {
                tempArray[ct] = wordsArray[i];
                ct++;
            }
        }
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public int size() {
        return wordsArray.length;
    }

    @Override
    public void clear() {
        wordsArray = new String[0];
    }

    @Override
    public void replaceOneWord(String from, String to) {
        for (int i = 0; i < wordsArray.length; i++) {
            if (wordsArray[i].equals(from)) {
                wordsArray[i] = wordsArray[i].replace(wordsArray[i], to);
            }
        }
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public void replaceMoreWords(String[] fromWords, String[] toWords) {
//        String joinedFromWords = String.join(" ", fromWords);
//        String joinedWordsArray = String.join(" ", wordsArray);
//        String joinedToWords = String.join(" ", toWords);
//        String replacedStr = joinedWordsArray.replaceAll(joinedFromWords, joinedToWords);
//
//        wordsArray = replacedStr.split("\\s+");
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 0; i < wordsArray.length - fromWords.length + 1; i++) {
            if (wordsArray[i].equals(fromWords[0])) {
                boolean missMatched = false;
                for (int j = 1; j < fromWords.length && !missMatched; j++) {
                    if (!(wordsArray[i + j].equals(fromWords[j]))) {
                        missMatched = true;
                    }
                }
                if (!missMatched) {
                    temp.add(i);
                    i = i + fromWords.length - 1;
                }
            }
        }
        int i = 0;
        int ct = 0;
        String[] tempArray = new String[wordsArray.length - temp.size() * (fromWords.length - toWords.length)];
        for (int index : temp) {
            while (i < index) {
                tempArray[ct++] = wordsArray[i++];
            }
            for (int j = 0; j < toWords.length; j++)
                tempArray[ct++] = toWords[j];
            i += fromWords.length;
        }

        while (i < wordsArray.length)
            tempArray[ct++] = wordsArray[i++];

        wordsArray = tempArray;


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word : wordsArray) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

//    public static void main(String[] args) {
//        TheHistoryArray history = new TheHistoryArray();
//        history.add(text);
//        System.out.println();
//
////        System.out.print("Word to be removed:");
////        Scanner inRemove = new Scanner(System.in);
////        String wordToBeRemoved = inRemove.nextLine();
////        history.removeWord(wordToBeRemoved);
////
////        System.out.println("\nThe text has: " + history.size() + " words");
////
////        System.out.print("\nWord to be replaced:");
////        Scanner inFrom = new Scanner(System.in);
////        String from = inFrom.nextLine();
////        System.out.print("Word to be inserted:");
////        Scanner inTo = new Scanner(System.in);
////        String to = inTo.nextLine().toUpperCase();
////        history.replaceOneWord(from, to);
//
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
//
//        System.out.println();
//        System.out.print("\nWords to be replaced:");
//        Scanner wordsToBeReplaced = new Scanner(System.in);
//        String text1 = wordsToBeReplaced.nextLine();
//        String[] fromWords = text1.split("\\s+");
//
//        System.out.print("Words to be inserted:");
//        Scanner wordsToBeInserted = new Scanner(System.in);
//        String text2 = wordsToBeInserted.nextLine().toUpperCase();
//        String[] toWords = new String[]{text2};
//
//
//        history.replaceMoreWords(fromWords, toWords);
//        for (String word : wordsArray) {
//            System.out.print(word + " ");
//        }
////        history.clear();
////        System.out.println("\nCLEAR -  Length of array: " + history.size());
//    }
}
