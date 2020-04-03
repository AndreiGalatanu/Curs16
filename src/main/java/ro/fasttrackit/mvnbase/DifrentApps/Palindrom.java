package ro.fasttrackit.mvnbase.DifrentApps;


import java.util.Stack;

import static java.lang.Character.isWhitespace;

public class Palindrom {


    public boolean isPalindrome(String phrase) {
        if (phrase == null) {
            return false;
        } else if (phrase.length() <= 1) {

            return true;
        } else {
            return phrase.equals(reverse(phrase));
        }


    }

    private String reverse(String phrase) {

        var stack = new Stack<>();
        for (Character chr : phrase.toCharArray()) {
            if (!isWhitespace(chr))
            stack.push(chr);
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }

}
