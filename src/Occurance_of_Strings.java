public class Occurance_of_Strings {
    public static void main(String[] args){
        String str = "Java is a programming language. Java is widely used. java is best programming language.";
        String result = " ";
        String[] words = str.split("[ .]+");
        for(int i=0;i< words.length;i++){
            boolean found = false;
            for(int j=0;j<i;j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    found = true;
                    break;
                }
            }
            if(!found){
                int count = 1;
                for(int k=i+1;k< words.length;k++){
                    if(words[i].equalsIgnoreCase(words[k])){
                        count++;
                    }
                }
                if(count>1) {
                    System.out.println(words[i] + " : " + count);
                }else {
                    System.out.println(words[i] + " : " + count);
                }
            }
        }
    }
}
