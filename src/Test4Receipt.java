public class Test4Receipt {
    public static void main(String[] args) {
        String plate;
        plate = "лист салата, ";
        plate = plate+ "соль, ";
        plate = plate + blender("помидоры, ");
        System.out.println(plate);
    }

    static String blender(String vegetable) {
        String resultPlate;
        resultPlate = "нарезанные " + vegetable;
        // вернуть то, что хранится в resultPlate и выйти из метода
        return  resultPlate;
    }
}
