public class MyList <T> {
	
	//Varsayýlan kapasitenin tanýmlanmasý
    public int capacity=10;

    //10 elemanlý jenerik bir dizi tanýmlama
    T[] array= (T[]) new Object[10];
    
    //Varsayýlan constructur --> 10 elemanlý
    public MyList() {
        T[] array = (T[]) new Object[10];
    }

    //capacity parametresini dýþardan alan constructor
    public MyList(int capacity) {
        this.capacity = capacity;
        T[] array= (T[]) new Object[capacity];
    }
    
    // Listenin boyutu döndüren metot
    public int size(){
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]!=null){
                count++;
            }
        }
        return count;
    }
    
    // capacity field'ý için getter metodu
    public int getCapacity(){
        return this.capacity;
    }
    
    // Listeye eleman eklemek için tanýmlanan metot
    public void add(T data){

        if(this.size()==this.getCapacity())
        {
            this.capacity=capacity*2;
            T [] newArray= (T[]) new Object[capacity];
            for (int i = 0; i < array.length ; i++) {
                newArray[i]=array[i];
            }
            newArray[(array.length)]=data;
            this.array=newArray;

        }
        else{
            array[this.size()]=data;
        }
    }

    // Ýndex'e göre elemaný getiren metod
    public T get(int index){
        return this.array[index];
    }
    
    // Ýndex'e göre elemaný silen metod
    public T remove(int index){

        this.array[index]=null;
        T removed=this.array[index];
        if(index>this.getCapacity()&&index<0){
            return null;
        }
        for (int i = index; i <this.size() ; i++) {
            this.array[i+1]=this.array[i];
            //1,2,null,3,4,5 gibi
            this.array[i]=removed;
        }
        return removed;
    }
    
    // Ýndex'e göre veriyi güncelleyen metot
    public T set(int index,T data){
        this.array[index]=data;
        T set = this.array[index];
        return set;

    }
    
    // To string metodunun override edilmesi
    @Override
    public String toString(){
        String str="";
        for (int i = 0; i <this.array.length ; i++) {
            if(array[i]!=null){
                str=str+this.array[i]+",";
            }
        }
        return str;
    }
    
    // Listedeki elemanýn index'ini döndüren metot
    public int indexOf(T data){
        for (int i = 0; i <this.array.length ; i++) {
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    
    // Listenin son elemaný döndüren metot
    public int lastIndexOf(T data){
        for (int i = this.array.length-1; i>=0; i--) {
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    
    // Listenin boþ-dolu bilgisini döndüren metod
    public boolean isEmpty(){
        int count =0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]==null){
                count++;
            }
        }if(count==array.length){
            return true;
        }
        else{
            return false;
        }
    }
    
    // Listeyi diziye dönüþtüren metot
    public T []toArray(){
        T [] newlist= (T[]) new Object[getCapacity()];
        for (int i = 0; i <this.array.length ; i++) {
            newlist[i]=this.array[i];
        }
        return newlist;
    }
    
    // Listeyi temizleyen metot
    public void clear(){
        for (int i = 0; i <this.array.length ; i++) {
            this.array[i]=null;
        }
    }
    
    // Listenin istenilen bir paçasýný dönen metot
    public MyList <T> subList(int start,int finish){
        int size=finish+1-start;
        MyList <T> myNewList =new MyList<>(size);
        int j=0;
        for (int i = start; i <=finish ; i++) {
            myNewList.add(array[i]);
        }
        return myNewList;
    }
    
    // Listenin verilen elemaný içerip içermediðini kontrol eden metod
    public boolean contains(T data){
        if(lastIndexOf(data)!=-1&&indexOf(data)!=-1){

            return true;
        }
        else{
            return false;
        }
    }
}
