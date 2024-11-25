package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1935 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //피연산자 개수
        int N = Integer.parseInt(br.readLine());

        //후위연산 식
        String str = br.readLine();

        //후위연산 배열에 넣기
        double[] arr = new double[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        //피연사자 스택
        Stack<Double> stack = new Stack<>();

        //결과
        double result = 0;


        for (int i = 0; i < str.length(); i++) {
            //후위 연산식 중 연산자를 제외한 피연산자 확인후 피연산자는 스택에 넣음
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                stack.push(arr[str.charAt(i) - 'A']); // -'A'를 하면 65를 빼서 해당 알파벳에 있는 인덱스 값을 찾아 그 값을 푸쉬할 수 있음
            } else {
                //후위연산식 중 피연산자가 아닌 즉 연산자들을 찾았을 때 연산자에 맞게 피연산자 두개를 pop 하고 연산 후 다시 push
                if (!stack.isEmpty()) {
                    double first = stack.pop();
                    double second = stack.pop();

                    switch (str.charAt(i)) {
                        case '+':
                            result = second + first;
                            stack.push(result);
                            continue;
                        case '-':
                            result = second - first;
                            stack.push(result);
                            continue;
                        case '*':
                            result = second * first;
                            stack.push(result);
                            continue;
                        case '/':
                            result = second / first;
                            stack.push(result);
                            continue;
                    }
                }
            }
        }

        System.out.printf("%.2f", stack.pop());

        br.close();
    }
}
