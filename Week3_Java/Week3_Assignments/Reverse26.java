package Week3_Assignments;
public class Reverse26 {
    public static void main(String[] args) {
        String my_string = "1234";
        try {
            String reversed_string = new StringBuilder(my_string).reverse().toString();
            System.out.println("Reversed string is : " + reversed_string);
        } catch (Exception err) {
            System.out.println("Error : " + err.getMessage());
        } finally {
            System.out.println("Type of my_string is : " + my_string.getClass().getSimpleName());
        }
    }
}
