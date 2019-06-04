/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.isht3ii.palindromo;

/**
 *
 * @author killua
 */
public class Palindromes {

  /**
   * Iterative solution to this problem. This algorithm has a complexity order in time terms of
   * O(N/2) = O(N) where N is the number of letters in the word. In space terms, this algorithm has
   * a complexity order equals to O(1) because we are not using any other data structure to store
   * temporal information.
   */
  public boolean evaluate(String word) {
    if (word == null) {
      throw new IllegalArgumentException("You can't pass a null String as input.");
    }
    boolean result = true;
    int length = word.length();
    for (int i = 0; i < length / 2; i++) {
      if (word.charAt(i) != word.charAt(length - 1 - i)) {
        result = false;
        break;
      }
    }
    return result;
  }

}
