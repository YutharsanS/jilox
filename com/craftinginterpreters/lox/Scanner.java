package com.craftinginterpreters.lox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Scanner {
    private final String source; // source file maybe
    private final List<Token> tokens = new ArrayList<>(); // where the tokens are stored

    private int start = 0; // start of the file
    private int current = 0; // the current place we are in
    private int line = 1; // tracking the line

    Scanner(String source) {
        this.source = source;
    }

    List<Token> scanTokens() {
        while (!isAtEnd()) {
            // at the beginning of the next lexeme
            start = current;
            scanTokens();
        }

        tokens.add(new Token(TokenType.EOF, "", null, line)); // add end of the line at the end
        return tokens;
    }

    private boolean isAtEnd() {
        // helper function to indicate the end of the file
        return current >= source.length();
    }
}
