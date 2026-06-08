class Employee{
    int salary;
    String name;

    public int getsalary(){
    return salary;
    }
    

    public String getname(){
        return name;
    }

    public void setname(String n){
        name=n;

    }

}





public class customclasxques {
    public static void main(String[] args) {
        
    
    Employee in=new Employee();
    in.salary=12000;
    in.name="cj";
    System.out.println(in.getname());
    System.out.println(in.getsalary());

    }


    
}
