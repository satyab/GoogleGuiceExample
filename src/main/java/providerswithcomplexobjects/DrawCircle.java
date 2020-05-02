package providerswithcomplexobjects;

public class DrawCircle implements DrawShape {

    private String color;
    private Integer radius;

    public DrawCircle(String color, Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle " + "color: " + color + " radius: " + radius);
    }
}
