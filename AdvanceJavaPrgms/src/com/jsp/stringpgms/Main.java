package com.jsp.stringpgms;

import java.util.*;

class Main {

    public static String OverlappingRectangles(String[] strArr) {
        // Parse the input to extract coordinates
        String[] coordinates = strArr[0].split(",");
        
        // Parse coordinates for the first and second rectangles
        int[] rect1 = parseCoordinates(coordinates, 0);
        int[] rect2 = parseCoordinates(coordinates, 4);
        
        // Calculate area of the first rectangle
        int areaRect1 = calculateArea(rect1);
        
        // Calculate coordinates of the overlapping region
        int[] overlap = calculateOverlap(rect1, rect2);
        
        // If there's no overlap, return 0
        if (overlap == null) {
            return "0";
        }
        
        // Calculate area of the overlapping region
        int areaOverlap = calculateArea(overlap);
        
        // Calculate how many times the overlap can fit into the first rectangle
        int timesFit = areaRect1 / areaOverlap;
        
        return String.valueOf(timesFit);
    }

    // Helper method to parse coordinates
    private static int[] parseCoordinates(String[] coordinates, int offset) {
        int[] result = new int[4];
        for (int i = 0; i < 4; i++) {
            String coord = coordinates[i + offset].replaceAll("[()]", "");
            String[] parts = coord.split(",");
            result[i] = Integer.parseInt(parts[0]);
            result[i + 1] = Integer.parseInt(parts[1]);
        }
        return result;
    }

    // Helper method to calculate the area of a rectangle
    private static int calculateArea(int[] rect) {
        int width = Math.abs(rect[2] - rect[0]);
        int height = Math.abs(rect[3] - rect[1]);
        return width * height;
    }

    // Helper method to calculate the coordinates of the overlapping region
    private static int[] calculateOverlap(int[] rect1, int[] rect2) {
        int x1 = Math.max(rect1[0], rect2[0]);
        int y1 = Math.max(rect1[1], rect2[1]);
        int x2 = Math.min(rect1[2], rect2[2]);
        int y2 = Math.min(rect1[3], rect2[3]);
        
        // Check if there's an overlap
        if (x1 >= x2 || y1 >= y2) {
            return null;
        }
        
        return new int[]{x1, y1, x2, y2};
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
  //      System.out.print(OverlappingRectangles(s.nextLine()));
        System.out.println(Main.OverlappingRectangles(args));
    }
}
