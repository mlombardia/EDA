public class SoundexTester {

    public static void main(String args[]){

        String word = Soundex.encode("INTELLIJ");
        System.out.println(word);

        String another_word = Soundex.encode("INTACTO");
        System.out.println(another_word);

        int result = Soundex.checkSimilarity(word, another_word);
        System.out.println(result);
    }
}
