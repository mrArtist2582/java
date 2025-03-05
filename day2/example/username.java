package example;

public class username {
    public static void main(String[] args) {
      
        String username = "Kashish";
        username += " Darji"; 
        System.out.println("Using String: " + username);
        
        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Kashish");
        sb.append(" Darji");
        System.out.println("Using StringBuilder: " + sb);
        
        // Using StringBuffer 
        StringBuffer sbf = new StringBuffer("Kashish");
        sbf.append(" Darji");
        System.out.println("Using StringBuffer: " + sbf);
    }
}
