public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        Triangle triangle1 = new Triangle(2.0, 1.8, 3.2);
        System.out.println(triangle1);

        Triangle triangle3 = new Triangle("grey", false, 1.7, 2.4, 3.0);
        System.out.println(triangle3);
    }
}
