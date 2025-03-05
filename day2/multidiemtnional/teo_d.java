package multidiemtnional;

public class teo_d {
    public static void main(String[] args) {
        int[][] marks = {
    
            // {math,sci,eng}   
               {89,87,88},
               {23,53,55},
               {24,66,77}
           };

           System.out.println("Marks of 2nd students in sci : " + marks[1][1]);

           for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + " Marks: ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); 
        }
    }
    


}
