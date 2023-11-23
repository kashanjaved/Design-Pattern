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
public class ProxyPatternDemo {
	
   public static void main(String[] args) {
      // Example using Virtual Proxy
      Image virtualProxyImage = new VirtualProxyImage("test_10mb.jpg");

      // Image will be loaded from disk
      virtualProxyImage.display(); 
      System.out.println("");
      
      // Image will not be loaded from disk (cached)
      virtualProxyImage.display();

      // Example using Smart Reference Proxy
      Image smartReferenceProxyImage = new SmartReferenceProxyImage("unsupported.bmp");

      // Fake display for unsupported image type
      smartReferenceProxyImage.display();
   }
}
