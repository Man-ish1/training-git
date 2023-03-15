package listproblem1;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<Emplyee> emplyeeList = new ArrayList<>();

    public Emplyee addElement(int id, String name, String dept) {
        Emplyee emplyee = null;
        if (id != 0) {
            Emplyee e1 = new Emplyee(id, name, new Department(dept));
            emplyeeList.add(e1);
        }
        return emplyee;
    }

    public List<Emplyee> getEmplyeeList() {
        return emplyeeList;
    }

    public void setEmplyeeList(List<Emplyee> emplyeeList) {
        this.emplyeeList = emplyeeList;
    }

    public int SearchId(int id) {

        for (int i = 0; i < emplyeeList.size(); i++) {
            if (emplyeeList.get(i).getId() == id) {
                System.out.println("Employe name :"+emplyeeList.get(i).getName()+" "+" , Employee Id :"+ emplyeeList.get(i).getId()+" "+" , Employee dept :"+emplyeeList.get(i).getDept());
            }
        }
        return 1;
    }
}
