package taskNumber6;

public class Main {
    public static void main(String args[]){

        СountingWordsFromFile count = new СountingWordsFromFile();
        moreTimes more = new moreTimes();
        count.output();
        System.out.println();
        more.maximumOutput(count.redStrings(), more.maximumRepeat(count.redStrings()));
    }
}
