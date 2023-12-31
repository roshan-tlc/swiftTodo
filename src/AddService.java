import java.util.Stack;

public class AddService {

    private final Stack<Integer> valueSet = new Stack<>();

    public void pushFunction(HomeView view, int... value) {
        for (int i: value) {
            valueSet.push(i);
        }
        System.out.printf("Sum = %d\n",getValue());
        view.next();
    }

    public void popFunction(HomeView view) {
        valueSet.pop();
        System.out.printf("Sum = %d\n",getValue());
        view.next();
    }

    public int getValue() {
        int sum = 0;
        for (Integer value : valueSet) {
            sum += value;
        }
        return sum;
    }

}
