package multidiemtnional;

public class three_d {
    public static void main(String[] args) {
        int[][][] marks = {
            { {85, 90}, {78, 88} }, 
            { {92, 81}, {76, 80} }  
        };

        System.out.println("Marks of Class 2, Student 1, Subject 2: " + marks[1][0][1]); 
    }
}
