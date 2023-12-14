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
public class SonExpression implements Expression {
    private Expression parent;
    private Expression child;

    public SonExpression(Expression parent, Expression child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public boolean interpret(String context) {
      
        return parent.interpret(context) && child.interpret(context);
    }
}