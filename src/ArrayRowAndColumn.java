public class ArrayRowAndColumn {
    // Write a program to calculate the sum of each row and each column of a 2D array.
    public static void main(String[] args) {
        int[][] array = {     // My array
                {1, 2, 3},
                {5, 6, 7},
                {2, 4, 6},
        };

        for(int[] row : array){
            int rowSum = 0;   //sum of my row 1
            for (var entry : row){
                rowSum += entry;   //sum of my row 1/2
            }
            System.out.println(rowSum);
        }

        for(int col = 0; col < array[0].length; col++){
            int colSum = 0;  // sum of my column 2
            for(int row = 0; row < array.length; row++){
                colSum += array[row][col];  // sum of my column 2/2
            }
            System.out.println(colSum);
        };

    };




    }
