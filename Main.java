public class Main {

    static int[] a = new int[15];
    static double[] x = new double[19];
    static double[][] pip = new double[15][19];

    public static void main(String[] args) {
        firstArray();

        for (int z = 0; z < x.length; z++) {
            x[z] = getRandomNumber();
        }
        lastArray();
        getResult();
    }

    static void lastArray() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                if (a[i] == 18) {
                    pip[i][j] = Math.pow(Math.pow(((Math.log(Math.abs(x[j])) - 1) / (Math.pow(x[j], 1 - x[j]))), 2), 3);
                } else if (a[i] == 7 | a[i] == 9 | a[i] == 10 | a[i] == 11 | a[i] == 12 | a[i] == 14 || a[i] == 20) {
                    pip[i][j] = Math.atan(Math.sin(Math.cos(Math.tan(x[j]))));
                } else if (a[i] != 6 | a[i] != 8 | a[i] != 13 | a[i] != 15 | a[i] != 16 | a[i] != 17 | a[i] != 18 | a[i] != 19) {
                    pip[i][j] = Math.cos(Math.cos(Math.cbrt(Math.pow(x[j] / (x[j] + 3), x[j]))));
                }
            }
        }
    }

    static void firstArray() {
        for (int i = a.length - 1; i >= 6; i--) {
            a[i] = i;
        }

    }

    static double getRandomNumber() {

        return ((double) (Math.random() * 8) - 5);
    }

    static void getResult() {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.format("%.2f\t", pip[i][j]);
            }
            System.out.println();
        }
        int[] nanCounter = new int[15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                if (Double.isNaN(pip[i][j])) {
                    nanCounter[j] += 1;

                }
            }
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 19; j++) {
                if (nanCounter[j] == 0)
                    System.out.format("%.2f\t", pip[i][j]);
                else System.out.printf("%2c\t", ' ');
            }
            System.out.println();
        }
    }
}


