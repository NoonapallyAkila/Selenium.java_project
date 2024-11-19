package Test;

public class sampleprogram {

	public static void main(String[] args) {
        // Input statement
        String statement = "C is a programming Language, Java is also a programming language but Java is widely used because java is object oriented programming language.";
        String[] words = statement.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" ");
 
        int repeatCount = 0;
        
 
        for (int i = 0; i < words.length; i++) {
            // Skip if already counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    alreadyCounted = true;
                    break;
                }
            }
            
 
            // Count repeats
            if (!alreadyCounted) {
                int count = 0;
                for (int k = 0; k < words.length; k++) {
                    if (words[i].equals(words[k])) {
                        count++;
                    }
                }
                if(count>1)
                {
                    System.out.println(words[i] + ": " + count);
                    repeatCount++;
                }
            }
        }
    }
}

