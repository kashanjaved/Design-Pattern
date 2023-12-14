/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author fa20-bse-040
 */
public class DaughterExpression implements Expression {
    private Expression parent;
    private Expression child;

    public DaughterExpression(Expression parent, Expression child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public boolean interpret(String context) {
        // Check if the context indicates that the child is a daughter of the parent
        return context.contains(child.interpret("") + " is a daughter of " + parent.interpret(""));
    }
}