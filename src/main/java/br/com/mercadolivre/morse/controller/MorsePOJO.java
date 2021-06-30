package br.com.mercadolivre.morse.controller;

public class MorsePOJO {

    private String translated;
    private String morse;

    public MorsePOJO(String translated, String morse) {
        this.translated = translated;
        this.morse = morse;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getMorse() {
        return morse;
    }

    public void setMorse(String morse) {
        this.morse = morse;
    }
}
