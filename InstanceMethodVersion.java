package assignment02;
import java.util.Arrays;
public class InstanceMethodVersion{
    private String string;
    
    public InstanceMethodVersion(String str){
    string = str;
    }
    public int countSpaces(){ // counts the spaces in the field string{
           int count = -1;
            if(string != null) {
	       count = 0;
            // do the counting here
            for(int i=0;i<string.length();i++){
                if(string.charAt(i)==(' ')){
                    count++;
                }
            }
        }       
        return count; 
    }
    public int countSpaces2(){// counts the spaces in the field string{
        int count =-1;
        if(string != null) {
	       count = 0;
            // do the counting here
            char[] arr = string.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==' '){
                    count++;
                }
            }
        }       
        return count;
}
    public String withoutExtraSpaces() {// returns a copy of the field string without the extra spaces{
        String returnVal = null;
        if(string != null) {
            //assign returnVal to str.trim() and the ints len1 and len2 to 0
            returnVal = string.trim();
            int len1 = 0;
            int len2 = 0;
            len1 = returnVal.length();
            //in a do { ... } while(len2 < len1);
            while(len2<len1){
                len1 = returnVal.length();
                returnVal = returnVal.replace("  "," ");
                len2 = returnVal.length();
            }
            //execute set len1 to the length of returnVal, change returnVal to returnVal.replace("  ", " ")
            //and set len2 to the length of the new returnVal
            
        }
        
        return returnVal;
    }
    public String first() {// returns the first word in the field string{
         String returnVal = null;
        if(string != null) {
             // set returnVal to str.trim(), which removes all leading and trailing space
             returnVal = string.trim();
             // set i to be returnVal.indexOf(' ')
             int i= returnVal.indexOf(' ');
             // if i >= 0, meaning there are more than one words in str, change returnVal to
             if(i>=0){
                 returnVal = returnVal.substring(0,i);
        }
        // returnVal.substring(0,i)
        }
        return returnVal;
    }
    public String rest(){ // returns the remainder of the field string removing the first word
        String returnVal = null;
        if(string != null) {
             // set returnVal to str.trim(), which removes all leading and trailing space
             returnVal = string.trim();
             // set i to be returnVal.indexOf(' ')
             int i= returnVal.indexOf(' ');
             // if i >= 0, meaning there are more than one words in str, change returnVal to
             if(i>=0){
                 returnVal = returnVal.substring(i);
        }
        // returnVal.substring(0,i)
        }
        return returnVal;
    }
    public String[] splitOnSpaces() // returns an array of the words in the field string SEE BELOW
   // (skip splitOnSpaces1)
    {
        // Define len to be countSpaces(withoutExtraSpaces(str))
        InstanceMethodVersion pass = new InstanceMethodVersion(this.withoutExtraSpaces());
        int len = pass.countSpaces();
            //if len is not 0, len + 1 is exactly the number of words in str
            //if len is 0, there is a bit more work--depends if there is one word or no word
            String[] returnVal = null;
        if(len >= 0) {
            pass = new InstanceMethodVersion(string.trim());
            returnVal = new String[len+1];
            for(int i=0;i<returnVal.length;i++){
                returnVal[i] = this.first();
                string = this.rest();
            }
            //in the case str.trim() has length 0, the return value is {}, the empty array 
            //otherwise change returnVal to an array of length len+1
            //in a for loop set returnVal[i] to first(str) and change str to rest(str)
        }
        return returnVal;
    
    }
    public int[] strLengths(){ // returns an array of the lengths of the words in the field string{
        if(string!=null){
         String[] words = this.splitOnSpaces();
        int[] lengths = new int[words.length];
        int index=0;
        for(String x: words){
            lengths[index] = x.length();
            index++;
        }
        return lengths;
        }
        return null;
    }
    
    public static void main(String[] args){
        //Count Spaces
        System.out.print("Expected Value: -1 Got: ");
        InstanceMethodVersion nullString = new InstanceMethodVersion(null);
        System.out.println(nullString.countSpaces());
        System.out.print("Expected Value: 0 Got: ");
       InstanceMethodVersion emptyString = new InstanceMethodVersion("");
        System.out.println(emptyString.countSpaces());
        System.out.print("Expected Value: 0 Got: ");
        InstanceMethodVersion Stringy = new InstanceMethodVersion("matthew");
        System.out.println(Stringy.countSpaces());
        System.out.print("Expected Value: 2 Got: ");
        InstanceMethodVersion spaceyString = new InstanceMethodVersion("I am Matthew");
        System.out.println(spaceyString.countSpaces());
        System.out.println();
        
        //Countspaces2
        System.out.print("Expected Value: -1 Got: ");
        System.out.println(nullString.countSpaces2());
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(emptyString.countSpaces2());
        System.out.print("Expected Value: 0 Got: ");
        System.out.println(Stringy.countSpaces2());
        System.out.print("Expected Value: 2 Got: ");
        System.out.println(spaceyString.countSpaces2());
        
        //WithoutExtraSpaces
        System.out.print("Expected Value: my computer fans are loud Got: ");
        Stringy = new InstanceMethodVersion("My       computer      fans     are      loud");
        System.out.println(Stringy.withoutExtraSpaces());
        
        //first
        System.out.print("Expected Value: null Got: ");
        System.out.println(nullString.first());
        System.out.print("Expected Value:  Got: ");
        System.out.println(emptyString.first());
        Stringy = new InstanceMethodVersion("   ");
        System.out.print("Expected Value:  Got: ");
        System.out.println(Stringy.first());
        Stringy = new InstanceMethodVersion("      word1    ");
        System.out.print("Expected Value: word1 Got: ");
        System.out.println(Stringy.first());
        System.out.print("Expected Value: word2 Got: ");
        Stringy = new InstanceMethodVersion("word2");
        System.out.println(Stringy.first());
        System.out.print("Expected Value: The Got: ");
        Stringy = new InstanceMethodVersion("      The lion is the king of the jungle    ");
        System.out.println(Stringy.first());
        System.out.print("Expected Value: My Got: ");
        Stringy = new InstanceMethodVersion("My computer fans are loud");
        System.out.println(Stringy.first());
        System.out.println();
        
        //Rest
        System.out.print("Expected Value: null Got: ");
        System.out.println(nullString.rest());
        System.out.print("Expected Value:  Got: ");
        System.out.println(emptyString.rest());
        Stringy = new InstanceMethodVersion("   ");
        System.out.print("Expected Value:  Got: ");
        System.out.println(Stringy.rest());
        Stringy = new InstanceMethodVersion("      word1    ");
        System.out.print("Expected Value: word1 Got: ");
        System.out.println(Stringy.rest());
        System.out.print("Expected Value: word2 Got: ");
        Stringy = new InstanceMethodVersion("word2");
        System.out.println(Stringy.rest());
        System.out.print("Expected Value: lion is the king of the jungle Got: ");
        Stringy = new InstanceMethodVersion("      The lion is the king of the jungle    ");
        System.out.println(Stringy.rest());
        System.out.print("Expected Value: computer fans are really loud Got: ");
        Stringy = new InstanceMethodVersion("My computer fans are loud");
        System.out.println(Stringy.rest());
        System.out.println();
        
        //SplitonSpaces
        System.out.print("Expected Value: null Got: ");
        System.out.println(nullString.splitOnSpaces());
        System.out.print("Expected Value: [] Got: ");
        System.out.println(Arrays.toString(emptyString.splitOnSpaces()));
        System.out.print("Expected Value: [Matthew, Schultz, is, really, COol, and, likes, to, write, javaa] Got: ");
        Stringy = new InstanceMethodVersion("Matthew                 Schultz is really COol and likes     to write javaa            ");
        System.out.println(Arrays.toString(Stringy.splitOnSpaces()));
        
        //StrLengths
         System.out.print("Expected Value: null Got: ");
        System.out.println(nullString.strLengths());
        System.out.print("Expected Value: [0] Got: ");
        System.out.println(Arrays.toString(emptyString.strLengths()));
        System.out.print("Expected Value: [7, 7, 2, 6, 4, 3, 5, 2, 5, 5] Got: ");
        Stringy = new InstanceMethodVersion("Matthew                 Schultz is really COol and likes     to write javaa           ");
        System.out.println(Arrays.toString(Stringy.strLengths()));

    }
}
