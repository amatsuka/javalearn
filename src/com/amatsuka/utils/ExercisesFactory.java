package com.amatsuka.utils;

import com.amatsuka.contracts.RunnableExercise;
import com.amatsuka.procedural.func.ex1_NextDay;
import com.amatsuka.procedural.func.ex2_TwoHouse;
import com.amatsuka.procedural.func.ex3_Squares;
import com.amatsuka.procedural.iter.ex1_SumOfNumbers;
import com.amatsuka.procedural.iter.ex2_Fibonnachi;
import com.amatsuka.procedural.iter.ex3_Statistics;

import java.util.Map;

public class ExercisesFactory {
    private int autoIncrement = 0;

    private Map<Integer, RunnableExercise> exRegistry;

    public ExercisesFactory() {
        addExercise(new ex1_NextDay());
        addExercise(new ex2_TwoHouse());
        addExercise(new ex3_Squares());
        addExercise(new ex1_SumOfNumbers());
        addExercise(new ex2_Fibonnachi());
        addExercise(new ex3_Statistics());
    }

    private void addExercise(RunnableExercise ex) {
        exRegistry.put(autoIncrement, ex);

        autoIncrement++;
    }

    public RunnableExercise factoryById(int id) {
        return exRegistry.get(id);
    }

    /**
     * @TODO Должен возвращать список вида [id]описание задачи. Создавать отдельную фабрику под каждыую часть
     * Вынести из фабрики
     * @return
     */
    /*public String[] getDirectory() {

    }*/

}
