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

        File image = new File("C:\\Users\\bahee\\Documents\\jaegerrr.jpg");

        BufferedImage img = ImageIO.read(image);

        for (int y = 0; y < img.getHeight(); y++) {
            for (int x = 0; x < img.getWidth(); x++) {
                int pixel = img.getRGB(x, y);

                Color color = new Color(pixel);

                int red = color.getRed();
                int blue = color.getBlue();
                int green = color.getGreen();

                double brightness = 0.2126 * red + 0.7152 * green + 0.0722 * blue;

                System.out.println(brightness);

                if (brightness <= 28) {
                    writer.append("#");
                } else if (brightness <= 56) {
                    writer.append("X");
                } else if (brightness <= 84) {
                    writer.append("%");
                } else if (brightness <= 112) {
                    writer.append("&");
                } else if (brightness <= 140) {
                    writer.append("*");
                } else if (brightness <= 168) {
                    writer.append("+");
                } else if (brightness <= 196) {
                    writer.append("/");
                } else if (brightness <= 224) {
                    writer.append("(");
                } else if (brightness <= 252) {
                    writer.append("'");
                } else {
                    writer.append(" ");
                }




                //# X % & * + / ( ' " "
            }
            writer.append("\n");
            writer.flush();
        }
        writer.close();
    }
}