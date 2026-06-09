class squar{
    int sq;

    public int area(){
        return sq*sq;
    } 

    public int per(){
        return 4*sq;
    }



}


public class square {
    public static void main(String[] args) {
        squar in=new squar();
        in.sq=3;
        System.out.println(in.area());
        System.out.println(in.per());
    }

   
    


    
}
