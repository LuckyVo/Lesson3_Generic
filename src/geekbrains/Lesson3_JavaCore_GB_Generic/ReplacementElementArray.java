package geekbrains.Lesson3_JavaCore_GB_Generic;

public class ReplacementElementArray<T> {

    private T[] arr;

    public ReplacementElementArray(T[] arr){ this.arr = arr; }

    public T[] getReplacementElementArray(){ return this.arr;}

    public T[] doReplacementElementArray(){
        T variableNumber =  this.arr[arr.length-1];
        this.arr[arr.length-1] = this.arr[0];
        this.arr[0] = variableNumber;
        return this.arr;
    }

}
