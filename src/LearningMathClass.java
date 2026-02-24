public class LearningMathClass {

    public static void main(String[] args) {

        System.out.println(Math.abs(-99.5));
        System.out.println(Math.ceil(5.07));
        System.out.println(Math.floor(5.97));
        System.out.println(Math.round(5.48));
        System.out.println(Math.round(5.57));
        System.out.println(Math.PI);

        for (int i = 1; i < 10; i++) {
            int randomNumber = (int) Math.round(Math.random() * 100);
            System.out.println(randomNumber);
        }
    }
}
