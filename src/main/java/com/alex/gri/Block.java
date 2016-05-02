package com.alex.gri;

/**
 * Created by alex on 02.05.16.
 *
 * The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
 */
public class Block {

    private int width;
    private int length;
    private int height;

    public Block(int[] ints) {
        width = ints[0];
        length = ints[1];
        height = ints[2];
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        return 2 * (width * length
                + length * height
                + width * height);
    }
}
