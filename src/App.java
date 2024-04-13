public class App {
    public static void main(String[] args) throws Exception {
        int age = 2;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age >= 62) {
            System.out.println("You are a senior citizen");
        } else if (age >= 13) {
            System.out.println("You are a teenager");
        } else if (age >= 5) {
            System.out.println("You are a child");
        } else if (age >= 1) {
            System.out.println("You are a toddler");
        } else if (age >= 0) {
            System.out.println("You are an infant");
        } else {
            System.out.println("You are not born yet");
        }
    }
}