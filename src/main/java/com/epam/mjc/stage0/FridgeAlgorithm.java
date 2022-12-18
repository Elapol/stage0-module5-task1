package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

import java.util.LinkedList;

public class FridgeAlgorithm implements Fridge {

    private final LinkedList<Actions> actionsQueue = new LinkedList<>();

    @Override
    public void close() {
        actionsQueue.add(Actions.CLOSE);
    }

    @Override
    public void open() {
        actionsQueue.add(Actions.OPEN);
    }

    @Override
    public void getMilk() {
        actionsQueue.add(Actions.GET_MILK);
    }

    public LinkedList<Actions> getActionsQueue() {
        return actionsQueue;
    }
    public void fridgeAlgorithm(Fridge fridge) {
        fridge.open();
        fridge.getMilk();
        fridge.close();
    }
    public enum Actions {
        OPEN,
        CLOSE,
        GET_MILK
    }

}
