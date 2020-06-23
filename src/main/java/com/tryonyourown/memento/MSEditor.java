package com.tryonyourown.memento;

public class MSEditor implements   Editor {

    String content;
    int fontSize;
    String fontName;

    public String getContent() {
        return content;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontName() {
        return fontName;
    }

    History history = new History();

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public void save() {
        EditorState editorState = new EditorState(content, fontSize, fontName);
        history.push(editorState);
    }
    public void restore() {
        EditorState editorState = (EditorState) history.pop();
        this.content = editorState.content;
        this.fontName = editorState.fontName;
        this.fontSize = editorState.fontSize;
    }
}
