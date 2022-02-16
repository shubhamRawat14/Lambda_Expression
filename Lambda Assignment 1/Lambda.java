interface max{
    int Maximum(int Number1, int Number2);
}
public class Lambda {
    public static void main(String[] args) {
    
        max object1= (int num1, int num2)->{
            int n=(num1>num2) ? num1: num2;
            return n;
        };
        
        System.out.println("the greatest Number among 12 and 13 is: "+object1.Maximum(12,13));
        
    }
    
}
