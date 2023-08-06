class StringsSorting{
    public static void main(String args[]){
        String[] arr = {"Java","Python","C++","Kotlin","Tableau"};
        String temp;
        int i,j,min;
        //sorting using bubble sort.
        for(i=0;i<4;i++){
            for(j=0;j<(4-i);j++){
                if((int)arr[j].charAt(0)>(int)arr[j+1].charAt(0)){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;                   
                }
            }
        }
        for(i=0;i<5;i++){
            System.out.println(arr[i]);
        }
    }
}