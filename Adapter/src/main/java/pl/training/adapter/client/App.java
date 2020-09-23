package pl.training.adapter.client;

import pl.training.adapter.HexColor;
import pl.training.adapter.HexColorAdapter;
import pl.training.adapter.RGBColor;

public class App {

    public static void main(String[] args) {
        HexColor hexColor = new HexColorAdapter(new RGBColor());
        //------------------------------------------------------
        hexColor.setBlue("11");
        hexColor.setGreen("FF");
        hexColor.setRed("22");
        System.out.println(hexColor);
    }

}
