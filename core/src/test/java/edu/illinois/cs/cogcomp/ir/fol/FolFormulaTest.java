package edu.illinois.cs.cogcomp.ir.fol;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import edu.illinois.cs.cogcomp.ir.IndicatorVariable;
import edu.illinois.cs.cogcomp.ir.fol.norm.Conjunction;
import edu.illinois.cs.cogcomp.ir.fol.norm.Disjunction;
import edu.illinois.cs.cogcomp.ir.fol.norm.Negation;

import static org.junit.Assert.*;

/**
 * Created by haowu on 5/19/16.
 */
public class FolFormulaTest {

    @Test
    public void evalNormForm() throws Exception {
        IndicatorVariable t = new IndicatorVariable("I","t");
        IndicatorVariable f = new IndicatorVariable("I","f");

        Map<IndicatorVariable, Boolean> assignment = new HashMap<>();

        assignment.put(t,true);
        assignment.put(f,false);
    }

}