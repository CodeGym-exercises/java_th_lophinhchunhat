public class Rectangle {
    private double width, height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width*this.height;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    public void display(){
        System.out.println("Rectangle:\nwidth: "+this.width+"\nheight:"+this.height);
        System.out.println("Rectangle:\narea: "+this.getArea()+"\nperimeter:"+this.getPerimeter());
    }

}

