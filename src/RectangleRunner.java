public class RectangleRunner {
    public static void main(String[] args) {

        // creating one instance/object from the Rectangle class "blueprint"
        Rectangle rect1 = new Rectangle(5, 6);
        rect1.printArea();  // calling a method on the object
        rect1.printPerimeter();
        System.out.println(rect1.area());

        // creating ANOTHER instance/object from the Rectangle class
        Rectangle rect2 = new Rectangle(10, 8);
        rect2.printArea();  // calling a method on the object
        rect2.printPerimeter();
        System.out.println(rect2.area());

        // creating a third instance/object from the Rectangle class
        Rectangle rect3 = new Rectangle(100, 3);
        rect3.printArea();
        rect3.printPerimeter();
        System.out.println(rect3.area());
    }
}

