package phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookSolution {
    static String
            personOne = "Иванов И.И.",
            personTwo = "Петров П.П.",
            personThree = "Сидоров С.С.";

    static ArrayList<String> personOneNumbs = new ArrayList<String>(),
                             personTwoNumbs = new ArrayList<String>(),
                             personThreeNumbs = new ArrayList<String>();

    static HashMap<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();

	private static Scanner sc;

    static void initRecords() {
        personOneNumbs.add("+8 800 2000 500");
        personOneNumbs.add("+8 800 200 600");
        personTwoNumbs.add("+8 800 2000 700");
        personThreeNumbs.add("+8 800 2000 800");
        personThreeNumbs.add("+8 800 2000 900");
        personThreeNumbs.add("+8 800 2000 000");

        phoneBook.put(personOne, personOneNumbs);
        phoneBook.put(personTwo, personTwoNumbs);
        phoneBook.put(personThree, personThreeNumbs);
    }

    static void printPhones(ArrayList<String> arr){
        for(String s : arr) {
            System.out.println(arr.indexOf(s) + 1 + ". " + s);
        }
    }

    static void printContacts(){
        int count = 0;
        Iterator<String> it = phoneBook.keySet().iterator();
        while(it.hasNext())
            System.out.println(++count + ". " + it.next());
    }

    static {
        initRecords();
    }
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        System.out.println("Введите ФИО");
        String fio;
        while ((fio = sc.nextLine()) != null)
            printPhones(phoneBook.get(fio));
    }

	public static void printNumbers(String string) {
		
	}
}