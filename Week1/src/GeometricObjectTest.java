public class GeometricObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(1.3);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(r1);
        System.out.println(r2);
    }
}
