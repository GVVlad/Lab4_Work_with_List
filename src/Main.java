import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        OperationService operationService = new OperationService();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int size = 1000000;
        int insertSize = 1000;
        int indexToAccess = size / 2;

        System.out.println(
            "Час заповнення ArrayList: " + operationService.checkTimeOfFillingLists(arrayList, size) + " мілісекунд");

        System.out.println(
            "Час заповнення LinkedList: " + operationService.checkTimeOfFillingLists(linkedList, size) + " мілісекунд");


        System.out.println(
            "\nЧас доступу за індексом в ArrayList: " + operationService.checkTimeOfRandomAccess(arrayList, indexToAccess) + " мілісекунд");
        System.out.println(
            "Час доступу за ітератором в ArrayList: " + operationService.checkTimeOfSequentialAccess(arrayList) + " мілісекунд");

        System.out.println(
            "Час доступу за індексом в LinkedList: " + operationService.checkTimeOfRandomAccess(linkedList, indexToAccess) + " мілісекунд");
        System.out.println(
            "Час доступу за ітератором в LinkedList: " + operationService.checkTimeOfSequentialAccess(linkedList) + " мілісекунд");

        System.out.println(
            "\nЧас вставки елемента на початок ArrayList: " + operationService.checkTimeOfInsertionAtBeginning(arrayList,insertSize) + " мілісекунд");
        System.out.println(
            "Час вставки елемента на початок LinkedList: " + operationService.checkTimeOfInsertionAtBeginning(linkedList,insertSize) + " мілісекунд");

        System.out.println(
            "\nЧас вставки елемента в середину ArrayList: " + operationService.checkTimeOfInsertionAtMiddle(arrayList,insertSize) + " мілісекунд");
        System.out.println(
            "Час вставки елемента на середину LinkedList: " + operationService.checkTimeOfInsertionAtMiddle(linkedList,insertSize) + " мілісекунд");

        System.out.println(
            "\nЧас вставки елемента в кінець ArrayList: " + operationService.checkTimeOfInsertionAtEnd(arrayList,insertSize) + " мілісекунд");
        System.out.println(
            "Час вставки елемента на кінець LinkedList: " + operationService.checkTimeOfInsertionAtEnd(linkedList,insertSize) + " мілісекунд");

    }

}
