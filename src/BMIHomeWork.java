public class BMIHomeWork {
    public static void main(String[] args) {
        double bmi = bmimethod(90, 180);
        System.out.println(bmi);
    }

    static float bmimethod(int weight, double height) {
        height = Math.pow(height/100, 2);
        double res = weight/height;
        return (float) res;
    }
}
