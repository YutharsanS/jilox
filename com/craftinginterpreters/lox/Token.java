package com.craftinginterpreters.lox;

class Token {
    final TokenType type; // meta data
    final String lexeme; // meta data
    final Object literal; // object representation of the literal
    final int line; // tracking the line

    Token(TokenType type, String lexeme, Object literal, int line){
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}