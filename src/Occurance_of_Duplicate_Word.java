public class Occurance_of_Duplicate_Word {
    public static void main(String[] args) {
        String str = "MyNameisJavaistheJavaHelloJava";
        String word = "Java";
        int count = 0;
        for (int i=0;i<=str.length()-word.length();i++){
            String sub="";
            for (int j=0;j<word.length();j++){
                sub+=str.charAt(i+j);
            }
            if (sub.equals(word)){
                count++;
            }
        }
        System.out.println("The word " + word + " occurs " + count + " times in the given string.");
    }
}
