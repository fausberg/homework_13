package task2;

public class CustomList<T> {

    public Object[] arr;

    private int n = 0;

    CustomList() {
        this.arr = new Object[10];
    }

    CustomList(int n) {
        this.arr = new Object[n];
    }

    public void add(T o) {
        rashirenie();
        arr[n] = o;
        this.n++;
    }


    public void sout() {


        for (Object o : arr) {
            System.out.println(o);
        }
    }

    public void rashirenie() {
        if (n == arr.length) {
            Object[] arr1 = new Object[arr.length + 5];
            for (int i = 0; i < arr.length; i++) {
                arr1[i] = arr[i];
            }
            arr = new Object[arr1.length];
            for (int i = 0; i < arr.length - 5; i++) {
                arr[i] = arr1[i];
            }
        }
    }

    public void delete(int k) {
        arr[k-1] = null;
        Object[] arr1 = new Object[arr.length];
        int e = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[k - 1]) {
            }else{
                arr1[e] = arr[i];
                e++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr1[i];
        }

    }

    public T Element(int n){
        return (T) arr[n-1];
    }

    public boolean serch(T o) {
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == null){
                break;
            }
            if (arr[i].equals(o)) {
                a = true;
                break;
            }
        }
        return a;
    }

    public void clear(){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == null){
                break;
            }else{
                arr[i] = null;
            }
        }
    }
}
