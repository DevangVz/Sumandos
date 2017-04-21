/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumandos;

/**
 *
 * @author Devang
 */
public class Sumandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1,2,3,4,5,6,7,8,9,10,11,12,13
        //5,6,7,8,9 
        Integer a[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        new Sumandos().getSumandos(a);
    }
    
    
    
    public void getSumandos(Integer[] array){
        
        int half=array.length/2,first=1,last=array.length-2;
        System.out.println("First:"+ first);
        System.out.println("Half:"+ half);
        System.out.println("Last:"+ last);
     
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                System.out.print(array[i]+"+"+array[j]+" ");
            }
            System.out.println("");
        }
        
        
        for (int i = 0,j=array.length-1; i < array.length&&!array[i].equals(array[j]); i++,j--) {
            System.out.print(array[array.length/2]+"+"+array[i]+" ");
            System.out.print(array[array.length/2]+"+"+array[j]+" ");
            System.out.print(array[i]+"+"+array[j]+" ");
            
            System.out.println("");
        }
         System.out.println("");
        for ( half=array.length/2,first=1,last=array.length-2;first<=half&&half<array.length&&!array[first].equals(array[last])&&!array[first].equals(array[half]);first++,last--,half++){
           System.out.println(array[0]+"+"+array[array.length-1]+"|"+array[0]+"+"+array[first]+"|"+array[0]+"+"+array[last]+"|"+array[0]+"+"+array[first+1]+"|"+array[0]+"+"+array[last-1]);
            
        System.out.println(array[first]+"+"+array[first+1]+"|"+array[first]+"+"+array[last]+"|"+array[first]+"+"+array[first+1]+"|"+array[first]+"+"+array[last-1]+"|"+array[first]+"+"+array[last+1]);
        System.out.println(array[half]+"+"+array[first+1]+"|"+array[half]+"+"+array[last]+"|"+array[half]+"+"+array[first+1]+"|"+array[half]+"+"+array[last-1]+"|"+array[half]+"+"+array[last+1]);
        System.out.println(array[last]+"+"+array[first+1]+"|"+array[last]+"+"+array[first]+"|"+array[last]+"+"+array[first-1]+"|"+array[last]+"+"+array[last-1]+"|"+array[last]+"+"+array[last+1]);
        
        }
        System.out.println("****");
        for (half = array.length / 2, first = 1, last = array.length - 2; first <= half && half <= last && !array[first].equals(array[last]); first++, last--) {

            
            System.out.println(array[first-1] + "+" + array[first] + "|" + array[first-1] + "+" + array[first+1] + "|" +array[first-1] + "+" + array[half-1]+"|"+array[first-1] + "+" + array[half]+ "|" +array[first-1] + "+" + array[half+1]+"|" +  array[first-1] + "+" + array[last-1] + "|" + array[first-1] + "+" + array[last] + "|" + array[first-1] + "+" + array[last + 1]);
            System.out.println(array[first] + "+" + array[first+1] + "|" + array[first] + "+" + array[last-1] + "|" +array[first] + "+" + array[half-1]+"|"+array[first] + "+" + array[half]+ "|" +array[first] + "+" + array[half+1]+ "|" + array[first] + "+" + array[last] + "|" + array[first] + "+" + array[last + 1]);
            System.out.println(array[last] + "+" + array[first+1] + "|" +array[last] + "+" + array[half-1]+"|"+array[last] + "+" + array[half]+ "|" +array[last] + "+" + array[half+1]+ "|" + array[last] + "+" + array[last-1] + "|" + array[last] + "+" + array[last + 1]);
            
        }

    }
    
    
}
