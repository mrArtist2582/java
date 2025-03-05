package singledimentional;

public class looping {
    public static void main(String[] args) {
        int[] marks = {
             65,7,89,97,66
        };
         
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
            
        }
    }
}
