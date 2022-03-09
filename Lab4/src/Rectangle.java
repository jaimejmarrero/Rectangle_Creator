public class Rectangle {
    private int height = 0;
    private int width = 0;
    private String symbol = "";

    public Rectangle(int height, int width, String symbol) {
        this.height = height;
        this.width = width;
        this.symbol = symbol;
    }

    public int calculate_area() {
        int area = height * width;
        return area;
    }

    public int calculate_perimeter() {
        int perimeter = height + width;
        int perimeter2 = perimeter * 2;
        return perimeter2;
    }

    public String get_details_text() {
        return ("Width: " + this.width + ", Height: " + this.height + ", Symbol: " + this.symbol);
    }

    public String toString()  {
        String result = "";
        for (int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                result = result + this.symbol;
            }
            result = result + "\n";
        }
        return result;
    }
}