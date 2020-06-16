import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Exercise2 {
	public static void main(String[] args) {

        //  FASE 1
        char[] MyName = {'P','e','d','r','o'};

        System.out.println();

        for (char c : MyName) {
            System.out.println("- " + c);
        }
        System.out.println();
        
        
        //  FASE 2

        List<Character> NameList = new ArrayList();



        NameList.add('P');

        NameList.add('e');

        NameList.add('d');

        NameList.add('r');

        NameList.add('o');

  



        int[] NumberInArray = {'0','1','2','3','4'};



        System.out.println("Número total de letras: " + NameList.size());

        System.out.println();



        for(char i: NameList) {

            for (int e : NumberInArray) {

                if(i == e){

                    System.out.println("Los nombres de personas no tienen numeros!");

                    return;

                }

            }

            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {

                System.out.println("VOCAL");

            } else {

                System.out.println("CONSONANTE");

            }

        }

        System.out.println();

        // FASE 3

        Map<Integer, Character> myNewMap  = new LinkedHashMap();

        int counterRepeated = 0;



        for(Character e: NameList){

            for(Character i: NameList){

                if(e.equals(i)){

                    counterRepeated++;

                }

            }

            if(counterRepeated > 2){

                System.out.println(e + " = " + counterRepeated + " ");

                myNewMap.put(counterRepeated, e);

            } else {

                System.out.println(e + " = " + counterRepeated + " ");

                myNewMap.put(counterRepeated, e);

            }

            counterRepeated = 0;

        }

        
        // FASE 4

        List<Character> SurnameList = new ArrayList();



        SurnameList.add(' ');

        SurnameList.add('R');

        SurnameList.add('o');

        SurnameList.add('d');

        SurnameList.add('r');

        SurnameList.add('i');

        SurnameList.add('g');

        SurnameList.add('u');

        SurnameList.add('e');

        SurnameList.add('z');


        NameList.addAll(SurnameList);



        List<Character> AllName;



        AllName = NameList;



        System.out.println();

        System.out.println("FULLNAME: " + AllName);
        
    }
}
