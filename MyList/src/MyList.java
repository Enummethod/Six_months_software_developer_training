public class MyList <T> {
	
	//Varsay�lan kapasitenin tan�mlanmas�
    public int capacity=10;

    //10 elemanl� jenerik bir dizi tan�mlama
    T[] array= (T[]) new Object[10];
    
    //Varsay�lan constructur --> 10 elemanl�
    public MyList() {
        T[] array = (T[]) new Object[10];
    }

    //capacity parametresini d��ardan alan constructor
    public MyList(int capacity) {
        this.capacity = capacity;
        T[] array= (T[]) new Object[capacity];
    }
    
    // Listenin boyutu d�nd�ren metot
    public int size(){
        int count=0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i]!=null){
                count++;
            }
        }
        return count;
    }
    
    // capacity field'� i�in getter metodu
    public int getCapacity(){
        return this.capacity;
    }
    
    // Listeye eleman eklemek i�in tan�mlanan metot
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

    // �ndex'e g�re eleman� getiren metod
    public T get(int index){
        return this.array[index];
    }
    
    // �ndex'e g�re eleman� silen metod
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
    
    // �ndex'e g�re veriyi g�ncelleyen metot
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
    
    // Listedeki eleman�n index'ini d�nd�ren metot
    public int indexOf(T data){
        for (int i = 0; i <this.array.length ; i++) {
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    
    // Listenin son eleman� d�nd�ren metot
    public int lastIndexOf(T data){
        for (int i = this.array.length-1; i>=0; i--) {
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
    
    // Listenin bo�-dolu bilgisini d�nd�ren metod
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
    
    // Listeyi diziye d�n��t�ren metot
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
    
    // Listenin istenilen bir pa�as�n� d�nen metot
    public MyList <T> subList(int start,int finish){
        int size=finish+1-start;
        MyList <T> myNewList =new MyList<>(size);
        int j=0;
        for (int i = start; i <=finish ; i++) {
            myNewList.add(array[i]);
        }
        return myNewList;
    }
    
    // Listenin verilen eleman� i�erip i�ermedi�ini kontrol eden metod
    public boolean contains(T data){
        if(lastIndexOf(data)!=-1&&indexOf(data)!=-1){

            return true;
        }
        else{
            return false;
        }
    }
}
