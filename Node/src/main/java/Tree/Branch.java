package Tree;

import java.awt.*;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Branch {

    ArrayList<Branch> BranchList = new ArrayList<Branch>();

    public ArrayList<mainBranch> growUP () {
        int randomNum = ThreadLocalRandom.current().nextInt(4, 8 + 1);
        for(int i = 0; i < randomNum; i++) {
            mainBranch mainBranch = new mainBranch();
            mainBranchList.add(mainBranch);
        }
        return mainBranchList;
    }
}