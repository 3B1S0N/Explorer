public class SimpleArrayTest {


    public static void main(String[] args) {
        SimpleArray sa = new SimpleArray();


//      ADDING ITEMS TO THE GENERIC ARRAY
        sa.add("Cat");
        sa.add("Dog");
        sa.add("Mouse");
        sa.add("Andrew");
        sa.add("Killer");
        sa.add("Cat");
        sa.add("Cat");

//      TESTING THE FIND METHODS
        sa.find("Killer");
       System.out.println(sa.findLast("Cat"));
       int[] indecesList = sa.findAll("Cat");
        System.out.print("[");
        for (int i = 0; i < indecesList.length ; i++) {
            System.out.print(indecesList[i] + ", ");
        }
        System.out.println("]");
        sa.printAll();



//      TESTING THE INSERT METHODS
        sa.insert("Work", 2);
        String[] moreItems = {"Things", "More Things"};
        sa.insertAll(3, moreItems);


//        TESTING THE SIZE METHODS
        sa.size();
        sa.printAll();


//        TESTING THE INDEX METHODS
        sa.setIndex(4, "Cat");
        System.out.println(sa.getindex("Killer"));
        System.out.println(sa.getindex("Cat"));
        sa.printAll();

//        TESTING THE SET OCCURRENCES METHOD
        System.out.println(sa.setOccurrences("Cat"));



//        TESTING THE REMOVE METHODS
        sa.remove("Things");
        sa.removeAll("Cat");
        sa.printAll();


    }
}


