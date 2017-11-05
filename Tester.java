package assignment02;
import java.util.Arrays;
import java.util.Optional;

public class Tester{
    
    public static void main(String[] args){
        System.out.println("Expected value 0");
        System.out.println(Utilities02.countNulls(null));
        Object[] test = {}; 
        System.out.println("Expected value 0");
        System.out.println(Utilities02.countNulls(test));
        // another test with a non empty array of Objects (can be String[], Integer[], 
        // java.awt.Rectangle, etc) and some nulls that gives a non-zero expected value,
        // e.g. countNulls(new Integer[]{null, 1, null, 2,})
        System.out.println("Expected: 2");
       System.out.println(Utilities02.countNulls(new Integer[]{null, 1, null, 2,}));
        String[] ARR = new String[]{"Hello","Sir"};
        System.out.println(Arrays.toString(ARR));
        //4 tests
        System.out.print("Expected Value: -1 Got: ");
        System.out.println(Utilities02.countSpaces(null));
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(Utilities02.countSpaces(""));
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(Utilities02.countSpaces("matthew"));
        System.out.print("Expected Value: 3 Got: ");
        System.out.println(Utilities02.countSpaces("I am Matthew S"));
        
        //countspaces2
        System.out.print("Expected Value: -1 Got: ");
        System.out.println(Utilities02.countSpaces2(null));
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(Utilities02.countSpaces2(""));
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(Utilities02.countSpaces2("matthew"));
        System.out.print("Expected Value: 3 Got: ");
        System.out.println(Utilities02.countSpaces2("I am Matthew S"));
        
        //first
        System.out.print("Expected Value: null Got: ");
        System.out.println(Utilities02.first(null));
        System.out.print("Expected Value:  Got: ");
        System.out.println(Utilities02.first(""));
        System.out.print("Expected Value:  Got: ");
        System.out.println(Utilities02.first("    "));
        System.out.print("Expected Value: word1 Got: ");
        System.out.println(Utilities02.first("      word1      "));
        System.out.print("Expected Value: word2 Got: ");
        System.out.println(Utilities02.first("word2"));
        System.out.print("Expected Value: The Got: ");
        System.out.println(Utilities02.first("      The lion is the king of the jungle    "));
        System.out.print("Expected Value: My Got: ");
        System.out.println(Utilities02.first("My computer fans are loud"));
        System.out.println();
        //rest
         System.out.print("Expected Value: null Got: ");
        System.out.println(Utilities02.rest(null));
        System.out.print("Expected Value:  Got: ");
        System.out.println(Utilities02.rest(""));
        System.out.print("Expected Value:  Got: ");
        System.out.println(Utilities02.rest("    "));
        System.out.print("Expected Value: word1 Got: ");
        System.out.println(Utilities02.rest("      word1      "));
        System.out.print("Expected Value: word2 Got: ");
        System.out.println(Utilities02.rest("word2"));
        System.out.print("Expected Value: lion is the king of the jungle Got: ");
        System.out.println(Utilities02.rest("      The lion is the king of the jungle    "));
        System.out.print("Expected Value: computer fans are loud Got: ");
        System.out.println(Utilities02.rest("My computer fans are loud"));
        
        //withoutExtraSpaces
        System.out.print("Expected Value: my computer fans are loud Got: ");
        System.out.println(Utilities02.withoutExtraSpaces("My       computer      fans     are      loud"));
        
        //SplitonSpaces
        System.out.print("Expected Value: null Got: ");
        System.out.println(Utilities02.splitOnSpaces(null));
        System.out.print("Expected Value: [] Got: ");
        System.out.println(Arrays.toString(Utilities02.splitOnSpaces("")));
        System.out.print("Expected Value: [Matthew, Schultz, is, really, COol, and, likes, to, write, javaa] Got: ");
        System.out.println(Arrays.toString(Utilities02.splitOnSpaces("Matthew                 Schultz is really COol and likes     to write javaa            ")));
        
        //SplitsonSpaces1
        Optional<String[]> array = Utilities02.splitOnSpaces1(" should give an array of   these words  separated by commas   ");
        if(array.isPresent()) {
	       System.out.println(Arrays.toString(array.get()));
        } else {
	       System.out.println("The input was null or empty");
        }
        //strLengths
        System.out.print("Expected Value: null Got: ");
        System.out.println(Utilities02.strLengths(null));
        System.out.print("Expected Value: [] Got: ");
        System.out.println(Arrays.toString(Utilities02.strLengths("")));
        System.out.print("Expected Value: [7, 7, 2, 6, 4, 3, 5, 2, 5, 5] Got: ");
        System.out.println(Arrays.toString(Utilities02.strLengths("Matthew                 Schultz is really COol and likes     to write javaa            ")));
    
    }
}