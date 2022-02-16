interface EvenNumber{
    long NextEvenNumber(long Number1);
}
public class Lambda {
    public static void main(String[] args) {
    
        EvenNumber object1= (num)-> num+2 -(num%2);
        
        System.out.println("The Next Even number is : "+object1.NextEvenNumber(1123));
        
    }
    
}
