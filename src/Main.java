public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int heightInKg = 98;
        double weightInM = 1.87;
        int bmi = (int) service.calculate(98, 1.87);
        System.out.println(bmi);
    }
}