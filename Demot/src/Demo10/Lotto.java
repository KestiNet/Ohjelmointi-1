package Demo10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main (String[] args) {
        Lotto lotto = new Lotto();

        lotto.printLottoNumbers();
    }
}

class Lotto {
    public void printLottoNumbers() {
        Integer[] lotto = getSortedLottoNumbers();

        System.out.print(lotto[0]);

        for(int i = 1 ; i < 6 ; i++) {
            System.out.print(", " + lotto[i]);
        }
    }

    private List<Integer> getLottoNumberList() {
        List<Integer> numberList = getNumberList();
        List<Integer> lotto;

        Collections.shuffle(numberList);

        lotto = numberList.subList(0, 6);

        return lotto;
    }

    private Integer[] getSortedLottoNumbers() {
        List<Integer> lotto = getLottoNumberList();
        Integer[] result = new Integer[6];

        lotto.toArray(result);
        Arrays.sort(result);

        return result;
    }

    private List<Integer> getNumberList() {
        List<Integer> numberList = new ArrayList<Integer>();

        for(int i = 0 ; i < 45 ; i++) {
            numberList.add(i + 1);
        }

        return numberList;
    }
}