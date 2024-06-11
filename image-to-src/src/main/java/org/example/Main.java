package org.example;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\bahee\\Documents\\Coding\\image-to-ascii\\src\\main\\ascii.txt");

        File image = new File("C:\\Users\\bahee\\Documents\\daki.jpg");

        BufferedImage img = ImageIO.read(image);

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int pixel = img.getRGB(x, y);

                Color color = new Color(pixel);

                int red = color.getRed();
                int blue = color.getBlue();
                int green = color.getGreen();
            }
        }
    }
}