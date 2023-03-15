package listproblem1;

import java.util.List;

public class DemoMain {
    public static void main(String[] args) {
        Office o = new Office();
        o.addElement(101, "Manish", "tech");
        o.addElement(102, "Akash", null);
        o.addElement(103, null, "tech");
        o.addElement(101, null, null);
        List el = o.getEmplyeeList();
        Emplyee e = (Emplyee) el.get(2);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getDept().getName());
         o.SearchId(103);
    }
}
