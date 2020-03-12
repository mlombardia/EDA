public class Soundex {
    public static char mapping[] = {'0','1','2','3','0','1','2','0','0','2','2','4','5','5','0','1','2','6','2','3','0','1','0','2','0','2'};
    //                               A   B   C   D   E   F   G   H   I   J   K   L   M   N   O   P   Q   R   S   T   U   V   W   X   Y   Z
    public static void main(String args[]){

        char in[] = new String("INTELLIJ").toCharArray();
        char out[] = {'0','0','0','0'};

        out[0]=in[0];
        int count = 1;
        char current, last = getMapping(in[0]);
        for(int i = 1; count < 4 && i < in.length;i++, last = current){
            char aux = in[i];
            current = getMapping(aux);
            if(current != last && current != '0'){
                out[count++] = current;
            }
        }
        System.out.println(out);
    }

    static char getMapping(char candidate){
        return mapping[candidate-'A'];
    }
}
