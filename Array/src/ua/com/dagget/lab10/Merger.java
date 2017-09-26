package ua.com.dagget.lab10;

/**
 * Created by derrki on 11:16.
 */
public class Merger {
    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;
        while (fstIndex + sndIndex != result.length) {
            if (fstIndex < fst.length && sndIndex < snd.length) {
                if (fst[fstIndex] < snd[sndIndex]) {
                    result[fstIndex + sndIndex] = fst[fstIndex++];
                } else {
                    result[fstIndex + sndIndex] = snd[sndIndex++];
                }
            }else if(fstIndex<fst.length){
                result[fstIndex + sndIndex] = fst[fstIndex++];
            }

            else if (sndIndex < snd.length){
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        return result;
    }
}
