import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        SmartArray smartArray = new SmartArray();
        for(int i = 0 ; i < 10 ;i++) {
            smartArray.add(i);
        }
        int index = smartArray.get(9);

        int removedElement = smartArray.remove(1);
        smartArray.add(10 , 69);
        boolean contains = smartArray.contains(69);

        CustomStack customStack = new CustomStack();
        customStack.push(12);
        customStack.push(22);
        customStack.push(32);
        int a = customStack.peek();
        int element = customStack.pop();
        int b = customStack.peek();

        System.out.println();
    }
}