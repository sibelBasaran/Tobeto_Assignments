package OOP;

import OOP.BaseCreditManager;
import OOP.ICreditManager;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Teacher credit calculated.");
    }
}