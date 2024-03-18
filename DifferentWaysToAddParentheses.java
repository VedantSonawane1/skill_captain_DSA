import java.util.ArrayList;
import java.util.List;

public class DifferentWaysToAddParentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                String left = expression.substring(0, i);
                String right = expression.substring(i + 1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for (int l : leftResults) {
                    for (int r : rightResults) {
                        if (c == '+') {
                            result.add(l + r);
                        } else if (c == '-') {
                            result.add(l - r);
                        } else {
                            result.add(l * r);
                        }
                    }
                }
            }
        }
        
        if (result.isEmpty()) {
            result.add(Integer.parseInt(expression));
        }
        
        return result;
    }

    public static void main(String[] args) {
        DifferentWaysToAddParentheses solution = new DifferentWaysToAddParentheses();
        String expression1 = "2-1-1";
        System.out.println(solution.diffWaysToCompute(expression1)); 

        String expression2 = "2*3-4*5";
        System.out.println(solution.diffWaysToCompute(expression2)); 
    }
}
