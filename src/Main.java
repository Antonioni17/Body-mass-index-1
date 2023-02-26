public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightKilo = 120.78;
        double hightMetr = 1.87;
        int myBMI = service.calculate(weightKilo, hightMetr);
        System.out.println(" Ваш  bmi-индекс равен : " + myBMI );
    }
}