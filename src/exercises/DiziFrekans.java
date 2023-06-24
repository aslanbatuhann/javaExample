package exercises;

public class DiziFrekans {
    public void finder(){
        int[] arr = new int[] { 10, 20, 12, 15, 20, 5, 20 };
        int[] frekans = new int[arr.length];
        int visited = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frekans[j] = visited;
                }
            }
            if (frekans[i] != visited) {
                frekans[i] = count;
            }
        }
        for (int i = 0; i < frekans.length; i++) {
            if (frekans[i] != visited) {
                System.out.println(arr[i] + " sayisi " + frekans[i] + " kez tekrar etti.");
            }
        }
    }
}
