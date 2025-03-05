package multidiemtnional;

public class jagg_arry {
    public static void main(String[] args) {
        int[][] jaggedArr = {
            {1, 2, 3},   
            {4, 5},      
            {6, 7, 8, 9} 
        };

        for (int[] jaggedArr1 : jaggedArr) {
            for (int j = 0; j < jaggedArr1.length; j++) {
                System.out.print(jaggedArr1[j] + " ");
            }
            System.out.println();
        }
    }
}
