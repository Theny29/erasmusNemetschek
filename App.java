public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(fibonacci(1));
    }

    public static int fibonacci(int pos){
        if(pos<=1) return pos;
    
        return fibonacci(pos-1) + fibonacci(pos-2);
    }
}
