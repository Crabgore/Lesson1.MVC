package geekbrains.ru.lesson1mvc;

import java.util.Arrays;
import java.util.List;

class Model {
    private List<Integer> mList = Arrays.asList(0,0,0);

    int getElementValueAtIndex(int index){
        return mList.get(index);
    }

    void setElementValueAtIndex(int index, int value){
        mList.set(index, value);
    }
}

