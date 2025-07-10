package DesignPartten.FlyWeightDesignPattern;

public class LCharacter implements Letter{
    char ch;
    String style;
    int font;
    public LCharacter(char ch, String style, int font) {
        this.ch = ch;
        this.style = style;
        this.font = font;
    }

    @Override
    public void display(int x, int y) {
        NotePade.page[x][y]=this.ch;
    }

}
