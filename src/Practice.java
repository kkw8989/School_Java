/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.util.ArrayList;

class Numbers {
    private ArrayList<Integer> myList = new ArrayList<Integer>();
    private int min;
    private int max;

    public Numbers(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public void setNumbers() {
        for (int x = min; x <= max; x++) {
            if (x % 4 == 0 && x % 5 != 0) {
                myList.add(x);
            }
        }
    }
    public int sumList() {
        int sum=0;
        for(int i : myList) {
            System.out.printf("%d..", i);
            sum += i;
        }
        return sum;
    }
}


/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */

class TestNumbers {
    public static void main(String[] args) {
        Numbers n = new Numbers(1, 100);
        n.setNumbers();
        System.out.println("\nSum: " + n.sumList());
    }
}