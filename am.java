class accessmod{
    private int id;
    private String name;

    public void setname(String n){
        name=n;
    }

    public String getname(){
        return name;
    }

    public void setid(int i){
        id=i;

    }

    public int getid(){
        return id;
    }
}




public class am {
    public static void main(String[] args) {
        accessmod in=new accessmod();
        String n="cj";
        int i=90;
        in.setid(i);
        System.out.println(in.getid());
        in.setname(n);
        System.out.println(in.getname());




    }
    
}
