package PracticePrograms.Arrays;

import java.util.Arrays;

public class FlippingImages {
        public static void main(String[] args) {
            int[][] image = { { 1, 1, 0,0},
                    { 1, 0, 0 ,1},
                    { 0, 1, 1,1},
                    { 1, 0, 1,1} };
            int[][] matrix = flipped_Invert_Image(image);
            for (int[] matele : matrix) {
                System.out.print(Arrays.toString(matele));
            }
        }
            public static int[][] flipped_Invert_Image(int[][] image)
            {
                int m = image.length;
                int n = image[0].length;
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < (n + 1) / 2; j++) {
                        // swap
                        int temp = image[i][j] ^ 1;
                        image[i][j] = image[i][n - 1 - i] ^ 1;
                        image[i][n - 1 - i] = temp;
                    }
                }
                return image;
            }
}
