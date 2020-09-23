package pl.training.adapter;

import static java.lang.Integer.parseInt;

public class HexColorAdapter implements HexColor {

    private static final int RADIX = 16;

    private RGBColor rgbColor;

    public HexColorAdapter(RGBColor rgbColor) {
        this.rgbColor = rgbColor;
    }

    @Override
    public void setRed(String value) {
        rgbColor.setRed(parseInt(value, RADIX));
    }

    @Override
    public void setGreen(String value) {
        rgbColor.setGreen(parseInt(value, RADIX));
    }

    @Override
    public void setBlue(String value) {
        rgbColor.setBlue(parseInt(value, RADIX));
    }

    @Override
    public String toString() {
        return rgbColor.toString();
    }

}
