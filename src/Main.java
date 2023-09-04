public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle figure1 = new Rectangle(6, 9);
        int area1 = figure1.getWidth() * figure1.getHeight();
        int perimeter1 = 2 * (figure1.getWidth() + figure1.getHeight());

        System.out.println("area: " + area1 + " unit");
        System.out.println("perimeter: " + perimeter1 + " unit");
    }
}
