package com.tryonyourown.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    List<State> stateList = new ArrayList<>();

    public void push(State state) {
        stateList.add(state);
    }
    public State pop() {
        int lastIndex = stateList.size() - 1;
        State state = stateList.get(lastIndex);
        stateList.remove(lastIndex);
        return state;
    }
}
