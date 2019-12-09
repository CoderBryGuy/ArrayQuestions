package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	int[][] scores = new int[5][];
//	printArray(scores);
//
//	Object[][][] cubbies = new Object[3][0][5];
//	printArray(cubbies);
//
//	String beans[] = new String[6];
//	printArray(beans);
//
//	java.util.Date[] dates[]= new java.util.Date[2][];
//
//	int[][] types = new int[2][];
//
//	int[][] java = new int[2][];

//	char[] c = new char[2];
//
//	int length = c.length;
//
//
//    int[] random = {6,-4,12,0, -10};
//    int x = 12;
//        System.out.println(Arrays.toString(random));
//    Arrays.sort(random);
//        System.out.println(Arrays.toString(random));
//    int y = Arrays.binarySearch(random,x );
//        System.out.println(y);

//        int[] arr1;
//        int[] arr2 = new int[3];
//        char[] arr3 = {'a', 'b'};
//        arr1 = arr2;
//  //      arr1 = arr3;
//        System.out.println(arr1[0] + ":" + arr1[1]);
//
//        int[][] array1 = {{1,2,3}, {}, {1,2,3,4,5}};
//        int[][] array5 = new int[2][];

//    int[] list = {10,8, 10, 9};
//        for (int x : list
//             ) {
//            System.out.println(x + ", ");
//            if(x % 2 == 0){
//                continue;
//            }
//        }
//
//        ArrayList myList = new ArrayList();
//        ArrayList<Object> myList2 = new ArrayList<>();
//        ArrayList<String> list = new ArrayList<String>();
//        ArrayList<String> list2 = new ArrayList<>();
//        List<String>  list3 = new ArrayList<>();
//
//        ArrayList<String> list4 ;
//        List<String> list5 = new ArrayList<>(20);

       // List list = new ArrayList();
//        List<Object> list = new ArrayList<>();
//        list.add("dog");
//        list.add(5);
//
//        System.out.println(list);
//
//        List<String> pets = new ArrayList<>();
//        pets.add("dog");
//
//        System.out.println(pets);
//        pets.add(0, "cat");
//        System.out.println(pets);
//
//        pets.add(1, "parrot");
//        System.out.println(pets);
//
//        pets.add(0, "husky");
//        System.out.println(pets);
//
//        pets.add(1, "bird");
//        System.out.println(pets);
//
//        pets.remove("parrot");
//        System.out.println(pets);
//
//        pets.remove(2);
//        System.out.println(pets);
//
//        pets.set(0, "newBird");
//        System.out.println(pets);
//
//        List<String> pets = new ArrayList<>();
//        System.out.println(pets.isEmpty());
//        System.out.println(pets.size());
//
//        if(pets.isEmpty()){
//            System.out.println("pets");
//        }
//
//        if(pets.size() == 0){
//            System.out.println("no pets");
//        }
//
//        pets.add("cat");
//        System.out.println(pets.isEmpty());
//        System.out.println(pets.size());
//
//        pets.clear();
//        System.out.println(pets.isEmpty());
//
//        pets.add("dog");
//        System.out.println(pets.contains("cat"));
//        System.out.println(pets.contains("dog"));
//
//        List<String> newPets = new ArrayList<>();
//        newPets.add("dog");
//
//        System.out.println(pets.equals(newPets));
//
//        newPets.add("cat");
//        System.out.println(pets.equals(newPets));
//
//        pets.add( "cat");
//    //    pets.add( 0, "cat");
//        System.out.println(pets);
//        System.out.println(newPets);
//
//        System.out.println(pets.equals(newPets));
//
//        List<Double> doubleList = new ArrayList<>();
//
//        doubleList.add(10.5);
//        doubleList.add(new Double(55.10));
//        doubleList.remove(55.10);
//        double first = doubleList.get(0);
//
//        System.out.println(doubleList);
//        System.out.println(first);
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(null);
//
//        System.out.println(numbers);
//
//      //  int number = numbers.get(0);
//
//        List<Integer> nums = new ArrayList<>();
//        nums.add(1);
//        nums.add(2);
//
////        nums.remove(1);
//        nums.remove(new Integer(1));
//      System.out.println(nums);
//
//      List<String> names = new ArrayList<>();
//      names.add("Tony");
//      names.add("Jimmy");
//      names.add("Anthony");

//      Object[] namesArray = names.toArray();
//        System.out.println(namesArray.length);

//        String[] stringArray = names.toArray(new String[0]);
//        System.out.println(stringArray.length);
//        String[] anotherStringArray = names.toArray(new String[names.size()]);
//
//        String[] petsArray = {"dog", "cat", "parrot"};
//        List<String> petList = Arrays.asList(petsArray);
//
//        List<String> petsList = Arrays.asList("dog", "cat", "parrot");
//        String[] petsArray = {"dog", "cat", "parrot"};
//        List<String> petsList = Arrays.asList(petsArray);
//        System.out.println(petsList.size());
//
//        petsList.set(0, "bird");
//        System.out.println(petsList);
//        System.out.println(Arrays.toString(petsArray));
//
//        petsArray[0] = "husky";
//        System.out.println(petsList);
//        System.out.println(Arrays.toString(petsArray));
//
//        //petsList.add("newDog");
//       // petsList.remove(1);
//
//        List<String> list = Arrays.asList("one", "two", "three");
//        System.out.println(list);
//        list.add("four");
//
//    List<String> numsList = new ArrayList<>();
//    numsList.add("500");
//    numsList.add("10");
//    numsList.add("9");
//    numsList.add("50");
//    numsList.add("40");
//
//        System.out.println(numsList);
//        Collections.sort(numsList);
//        System.out.println(numsList);
//
//        List<Integer> numbers = Arrays.asList(5,4,8,10,11,7,3);
//        System.out.println(numbers);
//        Collections.sort(numbers);
//        System.out.println(numbers);

//
//        List<String> numsList = new ArrayList<>();
//        numsList.add("add");
//        numsList.add("10");
//        numsList.add("9");
//        numsList.add("50");
//        numsList.add("40");
//
//        System.out.println(numsList);
//
//        int index = Collections.binarySearch(numsList, "10");
//        System.out.println(index);
//
//
//        Collections.sort(numsList);
//        System.out.println(numsList);
//        index = Collections.binarySearch(numsList, "10");
//        System.out.println(index);
//
//        List<Integer> numbers = Arrays.asList(5,4,8,10,11,7,3);
//
//        index =Collections.binarySearch(numbers, 7);
//        System.out.println(index);
//
//        Collections.sort(numbers);
//        System.out.println(numbers);
//        index = Collections.binarySearch(numbers, 7);
//        System.out.println(index);
//
//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(2);
//        numbers.add(4);
//        numbers.add(6);
//
//        for (int i = 0; i < numbers.size() ; i++) {
//            System.out.println("element at index " + i + " is " + numbers.get(i));
//
//         //   numbers.remove(2);
//        }
//
//        for (Integer number: numbers
//             ) {
//
//            System.out.println("numbers= " + number);
//         //   numbers.remove(2);
//
//        }
//
//        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();) {
//            Integer number = iterator.next();
//            System.out.println(number);
//            iterator.remove();
//        }
//
//        System.out.println(numbers);
//
//        numbers.addAll(Arrays.asList(1,2,3,4,5,6));
//
//        for(ListIterator<Integer> listIterator = numbers.listIterator(3);
//        listIterator.hasPrevious();){
//            System.out.println(listIterator.previous());
//            listIterator.remove();
//        }
//
//        System.out.println(numbers);

        List<String> list = Arrays.asList(createArray());

        // for loop
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < list.size() ; i++) {
            String temp = list.get(i);
        }

        long totalTime = System.currentTimeMillis() - startTime;

        System.out.println("for loop total time " + totalTime + " ms");

        // for each loop
        startTime = System.currentTimeMillis();

        for (String temp: list
             ) {

        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("forEach loop total time " + totalTime + " ms");

       //iterator
        startTime = System.currentTimeMillis();
        for(Iterator<String> iterator = list.iterator(); iterator.hasNext();){
            String temp = iterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("iterator total time " + totalTime + " ms");

        //list iterator
        startTime = System.currentTimeMillis();

        for(ListIterator<String> listIterator = list.listIterator();
            listIterator.hasNext();){
            String temp = listIterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("listIterator total time " + totalTime + " ms");

    }

    private static String[] createArray(){
        String[] stringArray = new String[1_000_000];

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;

        }

        return stringArray;
    }

    public static void printArray(Object[] o){
        System.out.println(Arrays.toString(o));
    }
}
