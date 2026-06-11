class employee{
    private int id;
    private String name;


    public employee(){
        int id=90;
        String name="cj";
    }
    public void setname(String n){
        name=n;
    }
    public String getname(){
        return name;
    }

}






public class constructox {
    public static void main(String[] args) {
        employee in =new employee();
        System.out.println(in.getname());
    }
    
}
