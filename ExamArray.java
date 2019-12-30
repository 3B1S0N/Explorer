public class ExamArray{
    public int[] myArray = new int[20];
    public int numitems = 0;
    public int low = 0;
    public int high = numitems;
    //public int mid = 0;

    public void addItem ( int item) {
        myArray[numitems] = item;
        numitems += 1;
    }

    public void addAtEnd( int item) {
        final int atEnd = (myArray.length - 1);
        myArray[atEnd] = item;
        numitems++;
    }

    public boolean findItem( int item){
        for(int i= 0; i < numitems; i++){
            if(item == myArray[i]){
                return true;
            }
        }
        return false;
    }

    public void deleteItem(int item) {
        for( int i = 0; i < numitems; i++){
            if(myArray[i] == item){
                for(int j = i; j < numitems -1; j++){
                    myArray[j] = myArray[j+1];
                } 
                break;  
            }
        }
        numitems--;
    }

    public void insertItem(int item, int index){
        int temp = 0;
        for(int i = numitems -1; i > -1; i--){
            temp = myArray[i + 1];
            myArray[ i + 1] = myArray[i];
            myArray[i] = temp;
            if(i == index){
                myArray[index] = item;
                numitems ++;
                break;
            }
        }   
    }
    public int getItem(int index){
        for(int i = 0; i< numitems; i++){
            if(i == index){
                return myArray[i];
            }
        }
        return -1;
    }

    public void insertAtBeginning( int item) {
        int temp = 0;
        for(int i = numitems; i > -1; i--){
            if(myArray[i] > item){
                temp = myArray[i + 1];
                myArray[ i + 1] = myArray[i];
                myArray[i] = temp;
            }
            else{
                myArray[i] = item;
                numitems++;
            }    
        }

        }
        
        public int binaryASearch(int item){
            
            if(high >= low){
                int mid = low + ((high - low)/2);
            
                if(myArray[mid] == item){
                    return mid;
                    }
                if(myArray[mid] > item){
                    low = mid + 1;
                    return binaryASearch(item);
                    }
    
                else if (myArray[mid] > item){
                    high = mid - 1;
                    return binaryASearch(item);
                    }
            }
            return -1; 
        }
        
    


    private void printArray() {
        for (int i = 0; i < numitems; i++) {
            System.out.print(myArray[i]);
            System.out.println();
            
        }
    }



    public static void main(String[] args) {
        ExamArray myArray = new ExamArray();

        myArray.addItem(10);
        myArray.addItem(14);
        myArray.addItem(18);
        myArray.addItem(23);
        myArray.addItem(36);
        myArray.addItem(38);
        myArray.addItem(40);
        myArray.addItem(45);
        myArray.addItem(52);
        System.out.println(myArray.binaryASearch(40));
        //myArray.insertAtBeginning(1);
        //System.out.println(myArray.findItem(31));
        //myArray.deleteItem(23);
        //myArray.insert(4,2);
        //System.out.println(myArray.getItem(4));

        //myArray.printArray();
    }
}

