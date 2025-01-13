package dsa.customstack;

public class dynamicstack extends customstack{

    public dynamicstack(int size) {
        super(size);
    }

    @Override
    public boolean push(int value) {
        if(isFull()) {
            // double the array length
            int[] temp = new int[data.length * 2];
            for(int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(value);
    }
}
