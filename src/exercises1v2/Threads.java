package exercises1v2;

import java.util.ArrayList;

public class Threads implements Runnable{
    private int firstNumber = 1;

    private final Object LOCK = new Object();
    private ArrayList<Integer> getDividedList = new ArrayList<>();;
    private ArrayList<Integer> getDividedList2 = new ArrayList<>();;
    private ArrayList<Integer> getDividedList3 = new ArrayList<>();;
    private ArrayList<Integer> getDividedList4 = new ArrayList<>();;
    private ArrayList<Integer> oddNumbers = new ArrayList<>();;
    private ArrayList<Integer> evenNumber = new ArrayList<>();;

    public Threads() {
    }

    @Override
    public void run() {
        synchronized (LOCK) {
            if (this.firstNumber <= 2500) {
                this.getDividedList.add(this.firstNumber);
                System.out.println(this.firstNumber);
            } else if (this.firstNumber <= 5000) {
                this.getDividedList2.add(this.firstNumber);
                System.out.println(this.firstNumber);
            } else if (this.firstNumber <= 7500) {
                this.getDividedList3.add(this.firstNumber);
                System.out.println(this.firstNumber);
            } else {
                this.getDividedList4.add(this.firstNumber);
                System.out.println(this.firstNumber);
            }

            if (this.firstNumber % 2 == 0) {
                this.evenNumber.add(this.firstNumber);
                System.out.println(this.firstNumber);
            } else {
                this.oddNumbers.add(this.firstNumber);
                System.out.println(this.firstNumber);
            }
            this.firstNumber++;
        }
        }


    public ArrayList<Integer> getGetDividedList() {
        return getDividedList;
    }

    public ArrayList<Integer> getGetDividedList2() {
        return getDividedList2;
    }

    public ArrayList<Integer> getGetDividedList3() {
        return getDividedList3;
    }

    public ArrayList<Integer> getGetDividedList4() {
        return getDividedList4;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }

    public ArrayList<Integer> getEvenNumber() {
        return evenNumber;
    }
}
