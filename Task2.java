public class Task2 {
    /*public static void main(String[] args) throws Exception {
        String greeting = "Hello World";
        String empty = "";
        String palindrome = "racecar";
        String random = "abasdamkopilcetarsis";
        System.out.println(reverseRecursively(random));
    }*/

    //O(n) speeds need to iterate over string
    //O(n) memory complexity because String builder(char array or String) is n and the rest is a constant
    public String reverseIteratively(String str){
        if(str == null){
            return null;
        }
        char[] ch = str.toCharArray();
        char[] reverseCh = new char[ch.length];

        int j = 0;
        for(int i = ch.length-1; i>=0; i--){
            reverseCh[j] = ch[i];
            j++;
        }

        String result = ""; 
        result = String.valueOf(reverseCh);

        return result;
    }

    //O(n) speeds need to iterate over string
    //O(n^2) memory complexity because recursion is n and String builder(char array or String) is n
    //so n*n = n^2
    public String reverseRecursively(String str){
        if(str == null){
            return null;
        }
        char[] ch = str.toCharArray();
        StringBuilder reverseStr = new StringBuilder();
        int i=0;
        revString(ch, reverseStr, i);
        String result = reverseStr.toString();
        return result;
    }

    public StringBuilder revString(char ch[], StringBuilder str, int i){
        if(i == ch.length){
            return str;
        }        
        revString(ch, str, i+1);
        return str.append(ch[i]);
    }
}
