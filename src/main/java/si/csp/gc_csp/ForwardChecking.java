package si.csp.gc_csp;

import si.csp.utils.GraphIterator;

import java.util.List;

/**
 * @author Jakub Licznerski
 *         Created on 05.04.2017.
 */
public class ForwardChecking extends CSPStrategy{

    private final int UNIT_COST = 1;

    public ForwardChecking(int n, GraphIterator iterator) {
        super(n, iterator);
    }

    @Override
    public List<int[][]> solve() {
        //todo implement body
        return null;
    }

    @Override
    protected int getUnitCost() {
        return UNIT_COST;
    }
}
