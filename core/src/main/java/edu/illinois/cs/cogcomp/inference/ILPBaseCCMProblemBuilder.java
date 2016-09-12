package edu.illinois.cs.cogcomp.inference;

import edu.illinois.cs.cogcomp.representation.logic.LogicFormula;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haowu on 5/14/16.
 */
public class ILPBaseCCMProblemBuilder {

    private Objective objective;

    private List<LogicFormula> hardConstraints;
    private List<Pair<LogicFormula, Double>> softConstraints;

    public ILPBaseCCMProblemBuilder subjectTo(
        List<LogicFormula> hardConstraints) {
        return subjectTo(hardConstraints,new ArrayList<>());
    }
    public ILPBaseCCMProblemBuilder subjectTo(
        List<LogicFormula> hardConstraints,
        List<Pair<LogicFormula, Double>> softConstraints) {
        this.hardConstraints = hardConstraints;
        this.softConstraints = softConstraints;
        return this;
    }

    public ILPBaseCCMProblemBuilder setObjective(Objective objective) {
        this.objective = objective;
        return this;
    }

    public ILPBaseCCMProblem getProblem(){
        return new ILPBaseCCMProblem(objective.objectives, hardConstraints, softConstraints);
    };
}
