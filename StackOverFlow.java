package DSA_Que;

public class StackOverFlow {
    int count = 0;
    void print(){
        if (count == 3){
            return;
        }
        System.out.println(count);
        count++;
        print();
    }

    public static void main(String[] args) {
        StackOverFlow st = new StackOverFlow();
        st.print();
    }
}
