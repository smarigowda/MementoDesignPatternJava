package com.tryonyourown.memento;

public class EditorState implements State {
    String content;
    int fontSize;
    String fontName;

    @Override
    public String getMetadata() {
        return "Some metadata....";
    }

    public EditorState(String content, int fontSize, String fontName) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }
}
