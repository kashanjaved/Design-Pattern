/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author FA20-BSE-040
 */
public class VirtualProxyImage implements Image {

   private RealImage realImage;
   private String fileName;

   public VirtualProxyImage(String fileName) {
      this.fileName = fileName;
   }

   @Override
   public void display() {
      if (realImage == null) {
         realImage = new RealImage(fileName);
      }
      realImage.display();
   }
}