package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_28278 {
    //스택 2
    private int[] stack;
    private int capacity;
    private int top;

    public boj_28278(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int x) {
        if (top + 1 == capacity) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = x;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("-1");
        } else System.out.println(stack[top--]);
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("-1");
        } else System.out.println(stack[top]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int orderCount = Integer.parseInt(st.nextToken());
        boj_28278 stack = new boj_28278(orderCount);

        for (int i = 0; i < orderCount; i++) {
            st = new StringTokenizer(br.readLine());
            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println(stack.top+1);
                    break;
                case 4:
                    if (stack.isEmpty()){
                        System.out.println("1");
                    } else System.out.println("0");
                    break;
                case 5:
                    stack.peek();
                    break;
            }
        }
    }
}
