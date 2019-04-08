public class TwoDShape {
    double width;
    double height;

    void showDim(){
        System.out.println("W: "+width +" H: "+height);
    }
}

class Triangle extends TwoDShape{
    String style;

    double area(){
        return width * height / 2;
    }

    void showStyle(){
        System.out.println("Style: " + style);
    }
}

class Shapes{

}
