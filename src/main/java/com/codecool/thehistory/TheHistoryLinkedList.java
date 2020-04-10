package com.codecool.thehistory;

import java.util.*;

public class TheHistoryLinkedList implements TheHistory {
    /**
     * This implementation should use a String LinkedList so don't change that!
     */
    private String text = "Petunia is a decent little country with a strong and wise leader He sets wise laws in order to keep the country safe stable and prosperous ";

    private List<String> wordsLinkedList = new LinkedList<>();

    @Override
    public void add(String text) {
        wordsLinkedList = new ArrayList<String>(Arrays.asList(text.split("\\s+")));
//        for (String word : wordsLinkedList) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public void removeWord(String wordToBeRemoved) {
        wordsLinkedList.removeIf(word -> word.equals(wordToBeRemoved));
//        for (String word : wordsLinkedList) {
//            System.out.print(word + " ");
//        }
    }

    @Override
    public int size() {
        return wordsLinkedList.size();
    }

    @Override
    public void clear() {
        wordsLinkedList.clear();
    }

    @Override
    public void replaceOneWord(String from, String to) {
        Collections.replaceAll(wordsLinkedList, from, to);
//        for (String word : wordsLinkedList) {
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
        for (String word : wordsLinkedList) {
            sb.append(word).append(" ");
        }
        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1); // last space char
        return sb.toString();
    }

//    public static void main(String[] args) {
//        TheHistoryLinkedList historyList = new TheHistoryLinkedList();
//        historyList.add(text);
//        System.out.println();
//
//        System.out.println("Size of LinkedList: " + historyList.size());
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
//        System.out.println("\nSize of LinkedList: " + historyList.size());
//
//    }

}
