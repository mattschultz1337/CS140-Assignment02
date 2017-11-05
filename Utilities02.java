package assignment02;
import java.util.Optional;
import java.util.Arrays;
public class Utilities02{
    
    /**
    * @param an array of objects
    * @returns number of null objects in array
    *@returns 0 is array is empty or null
    **/
    public static int countNulls(Object[] array){
        if(array==null||array.length==0){
            return 0;
        }
        int retValue = 0;
        for(Object x:array){
            if(x==null){
                retValue +=1;
            }
        }
        return retValue;
    }
    public static int countSpaces(String str){
        int count = -1;
        if(str != null) {
	       count = 0;
            // do the counting here
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==(' ')){
                    count++;
                }
            }
        }       
        return count;
    }
    public static int countSpaces2(String str){
        int count =-1;
        if(str != null) {
	       count = 0;
            // do the counting here
            char[] arr = str.toCharArray();
            for(int i=0;i<arr.length;i++){
                if(arr[i]==' '){
                    count++;
                }
            }
        }       
        return count;
    }
    public static String first(String str){
        String returnVal = null;
        if(str != null) {
             // set returnVal to str.trim(), which removes all leading and trailing space
             returnVal = str.trim();
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
    public static String rest(String str){
        String returnVal = null;
        if(str != null) {
             // set returnVal to str.trim(), which removes all leading and trailing space
             returnVal = str.trim();
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

    public static String withoutExtraSpaces(String str){
        String returnVal = null;
        if(str != null) {
            //assign returnVal to str.trim() and the ints len1 and len2 to 0
            returnVal = str.trim();
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
    public static String[] splitOnSpaces(String str){
       // Define len to be countSpaces(withoutExtraSpaces(str))
        int len = countSpaces(withoutExtraSpaces(str));
            //if len is not 0, len + 1 is exactly the number of words in str
            //if len is 0, there is a bit more work--depends if there is one word or no word
            String[] returnVal = null;
        if(len >= 0) {
            returnVal = new String[len+1];
            for(int i=0;i<returnVal.length;i++){
                returnVal[i] = first(str);
                str = rest(str);
            }
            //in the case str.trim() has length 0, the return value is {}, the empty array 
            //otherwise change returnVal to an array of length len+1
            //in a for loop set returnVal[i] to first(str) and change str to rest(str)
        }
        return returnVal;
    }
    public static int[] strLengths(String str){
        if(str!=null){
        String[] words = splitOnSpaces(str);
        int[] lengths = new int[words.length];
        int index=0;
        for(String x: words){
            lengths[index] = x.length();
            index++;
        }
        return lengths;
        }
        else return null;
    }
    public static Optional<String[]> splitOnSpaces1(String str){
        String[] returnVal = null;
        if (str != null && str.trim().length() > 0) {
            //set returnVal to be an array of length str.length()
            returnVal = new String[str.length()];
            //introduce index = 0
            int index=0;
            // while the length of str in non-zero set returnVal[index] to first(str), set str equal to rest(str)
            str = str.trim();
            do{
                returnVal[index] = first(str);
                str = rest(str);
                index++;
            } while(str.length()!=0 && index<str.length());
            returnVal[index] = first(str);
          returnVal =  Arrays.copyOf(returnVal,index+1);
            // and add 1 to index
            // After the while loop truncate the array using returnVal = Arrays.copyOf(returnVal, index);
            return Optional.of(returnVal);
        }
        else return Optional.empty();
    }

}