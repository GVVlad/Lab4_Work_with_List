import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class OperationService {

    public long checkTimeOfSequentialAccess(List<Integer> list) {

        long startTime = System.currentTimeMillis();
        Iterator<Integer> iteratorArrayList = list.iterator();
        while (iteratorArrayList.hasNext()) {
            iteratorArrayList.next();
        }
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public long checkTimeOfRandomAccess(List<Integer> list, int indexToAccess) {
        long startTime = System.currentTimeMillis();
        int elementAtIndex = list.get(indexToAccess);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public long checkTimeOfFillingLists(List<Integer> arrayList, int size) {

        long startTime = System.currentTimeMillis();
        fillList(arrayList, size);
        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }
    public long checkTimeOfInsertionAtBeginning(List<Integer> list, int insertSize) {
        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < insertSize; i++) {
            list.add(0, random.nextInt());
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long checkTimeOfInsertionAtMiddle(List<Integer> list,int insertSize) {
        int indexToInsert = list.size() / 2;

        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < insertSize; i++) {
            list.add(indexToInsert, random.nextInt());
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public long checkTimeOfInsertionAtEnd(List<Integer> list,int insertSize) {
        int indexToInsert = list.size();

        long startTime = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < insertSize; i++) {
            list.add(indexToInsert, random.nextInt());
        }

        long endTime = System.currentTimeMillis();

        return endTime - startTime;
    }

    public void fillList(List<Integer> list, int size) {
        Random random = new Random();
        for(int i = 0; i < size; i++) {
            list.add(random.nextInt(size));
        }
    }

}
