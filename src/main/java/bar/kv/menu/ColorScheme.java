package bar.kv.menu;

import java.awt.*;

public class ColorScheme {
    private Color darkColor;
    private Color brightColor;
    private Color mediumColor;

    public ColorScheme() {
        setDarkColor(new Color(29, 44, 59));
        setBrightColor(new Color(247, 236, 63));
        setMediumColor(new Color(65, 41, 25));
    }

    public ColorScheme(Color darkColor, Color brightColor, Color mediumColor) {
        setDarkColor(darkColor);
        setBrightColor(brightColor);
        setMediumColor(mediumColor);
    }

    public Color getDarkColor() {
        return darkColor;
    }

    public void setDarkColor(Color darkColor) {
        this.darkColor = darkColor;
    }

    public Color getBrightColor() {
        return brightColor;
    }

    public void setBrightColor(Color brightColor) {
        this.brightColor = brightColor;
    }

    public Color getMediumColor() {
        return mediumColor;
    }

    public void setMediumColor(Color mediumColor) {
        this.mediumColor = mediumColor;
    }
}