package no.hvl.dat100.lab6.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j]);
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {


        if (matrise == null)
            return "null";
        StringBuilder tabellS = new StringBuilder();
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                tabellS.append(matrise[i][j] + " ");

            }
            tabellS.append('\n');


        }
        return tabellS.toString();


    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {

                matrise[i][j] = matrise[i][j] * tall;

            }

        }
        return matrise;

    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        int[][] matriseSpeil = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {

                matriseSpeil[j][i] = matrise[i][j];
            }

        }
        return matriseSpeil;
    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {
        int[][] multi = new int[a.length][b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                for (int k = 0; k < a.length; k++) {

                    multi[i][j] += (a[i][k] * b[k][j]);

                }

            }

        }
        return multi;


    }
}
