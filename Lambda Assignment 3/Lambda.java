interface ConcatString{
    String ConcatToUpercase(String str1,String str2,String str3,String str4,String str5,String str6,String str7);
}
public class Lambda {
    public static void main(String[] args) {
    
        ConcatString object1= (a,b,c,d,e,f,g)-> (a+b+c+d+e+f+g).toUpperCase();
        
        System.out.println("The concat String : "+object1.ConcatToUpercase("THE","LAMBDA","HAS","TOO","MANY","STRING","ARGUMENTS."));
        
    }
    
}
