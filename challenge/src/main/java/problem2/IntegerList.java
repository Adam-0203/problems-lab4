package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int numInteger =0;
    int length_list = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<length_list; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize(){
        int[] new_list = new int[list.length*2];
        for (int i=0; i<list.length ; i++){
            new_list[i] = list[i];
        }
        list = new_list;
    }

    public void addElement(int newVal){
        if (numInteger == list.length){
            this.increaseSize();
        }
        list[numInteger] = newVal;
        numInteger++;
        length_list++;
    }

    public boolean removeFirst(int newVal){
        int[] new_list = new int[list.length];
        int removal = 0;
        int var = length_list -1;
        for (int i=0; i<var; i++){
            if ((list[i] == newVal) && (removal == 0)){
                removal = 1;
                length_list--;
                numInteger--;
            }
            if (removal == 0){
                new_list[i] = list[i];
            }
            else{
                new_list[i] = list[i+1];
            }
        }
        if ((removal == 0 && list[length_list-1]!=newVal) || (removal==1)){
            new_list[length_list-1] = list[length_list-1];
        }
        else if (removal == 0){
            removal = 1;
            length_list--;
            numInteger--;
        }
        list = new_list;
        return (removal==1)? true : false;

    }

    public void removeAll(int newVal){
        boolean condition = removeFirst(newVal);
        while (condition){
            condition = removeFirst(newVal);
        }
    }
}
