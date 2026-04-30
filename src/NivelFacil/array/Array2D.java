package NivelFacil.array;

public class Array2D {

    public static void main(String[] args) {

        String[][] ninjasArray = new String[3][3];

        //NivelFacil.array[linha][coluna]
        ninjasArray[0][0] = "ninja 1 aldeia verde";
        ninjasArray[0][1] = "ninja 2 aldeia verde";
        ninjasArray[0][2] = "ninja 3 aldeia verde";

        ninjasArray[1][0] = "ninja 1 aldeia azul";
        ninjasArray[1][1] = "ninja 2 aldeia azul";
        ninjasArray[1][2] = "ninja 3 aldeia azul";

        ninjasArray[2][0] = "ninja 1 aldeia vermelha";
        ninjasArray[2][1] = "ninja 2 aldeia vermelha";
        ninjasArray[2][2] = "ninja 3 aldeia vermelha";

        for (int i = 0; i < 3; i++) {
            System.out.println("Aldeira Verde: " + ninjasArray[0][i]);
            System.out.println("Aldeira Azul: " + ninjasArray[1][i]);
            System.out.println("Aldeira Vermelha: " + ninjasArray[2][i]);
        }

    }
}
