package listproblem1;

public class Emplyee {
    int id;
    String name;
    Department dept;
    Emplyee(int id,String name, Department dept ){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
