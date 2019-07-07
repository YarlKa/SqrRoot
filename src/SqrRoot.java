public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;

        for (num = 1.0; num < 100; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Корень квадратный из " + num + " равен: " + sroot);

            // вычисляем ошибку
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
    }
}
