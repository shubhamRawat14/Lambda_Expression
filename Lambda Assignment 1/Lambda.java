interface max{
    int Maximum(int Number1, int Number2);
}
public class Lambda {
    public static void main(String[] args) {
    
        max object1= ( num1, num2)->(num1>num2) ? num1: num2;
        
        System.out.println("the greatest Number among 12 and 13 is: "+object1.Maximum(12,13));
        
    }
    
}
