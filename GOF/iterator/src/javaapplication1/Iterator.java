/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author fa20-bse-040
 */
public interface Iterator {
   public boolean hasNext();
   public Object next();
   public boolean hasPrevious();
   public Object previous();
   public void moveToFirst();
   public void moveToLast();
}