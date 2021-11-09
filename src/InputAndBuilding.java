import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputAndBuilding {
    private List<String> list = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    private int linesEncounter = 0;


    public void Input() {
        do {
            String userinput = scanner.nextLine();
            setAction(userinput);
        } while (scanner.hasNext());


    }

    private void setAction(String userinput) {
        if (userinput.startsWith("|")) {

            list.add(userinput);

            linesEncounter++;
            userinput = "";


        }
        if (userinput.startsWith("B")) {

            print(list, userinput, linesEncounter);
        }

    }

    private void print(List list, String auctualUserInput, int linesEncounter) {
        Character acutalLetter;
        int packageEncuounter = 0;
        String acctualWord;
        String newWord = "";
        List printList = new ArrayList();
        for (int i = 0; i < auctualUserInput.length(); i++) {
            acutalLetter = auctualUserInput.charAt(i);
            if (acutalLetter.equals('B'))
                packageEncuounter++;

        }




        for (int k = 0; k < linesEncounter; k++) {
            acctualWord = list.get(k).toString();
            for (int l = 0; l < acctualWord.length(); l++) {
                acutalLetter = acctualWord.charAt(l);

                if (acutalLetter.equals('O') & packageEncuounter > 0) {

                    newWord = newWord + 'X';
                    packageEncuounter--;

                } else {
                    newWord = newWord + acutalLetter;

                }
            }
            printList.add(newWord);
            newWord = "";

        }


        for (int p = 0; p < printList.size(); p++) {
            System.out.println(printList.get(p));
        }
        this.list = printList;
    }


}
