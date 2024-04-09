package customException;

/**
 * Class:
 *
 * @author: Farhana Rahman
 * @version: 1.0
 * Course: ITEC 2140 Fall 2023
 * Written: April 09 ,2024
 * <p>
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Creating and checking Triangle 1
            Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
            System.out.println("Triangle 1 sides are: " + triangle1.getSide1() + ", " + triangle1.getSide2() + ", " + triangle1.getSide3());
            if (triangle1.checkSides()) {
                System.out.println("Triangle 1 is a valid triangle.");
            }

            // Creating and checking Triangle 2
            Triangle triangle2 = new Triangle(1.0, 1.0, 3.0);
            System.out.println("Triangle 2 sides are: " + triangle2.getSide1() + ", " + triangle2.getSide2() + ", " + triangle2.getSide3());
            if (triangle2.checkSides()) {
                System.out.println("Triangle 2 is a valid triangle.");
            }

            // Creating and checking Triangle 3
            Triangle triangle3 = new Triangle(5.0, 12.0, 13.0);
            System.out.println("Triangle 3 sides are: " + triangle3.getSide1() + ", " + triangle3.getSide2() + ", " + triangle3.getSide3());
            if (triangle3.checkSides()) {
                System.out.println("Triangle 3 is a valid triangle.");
            }

        } catch (IllegalTriangleSideException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
