package Week_04;


//860. 柠檬水找零
class Solution1 {
    public boolean lemonadeChange(int[] bills) {
        if (null == bills)
            return false;

        //change代表目前手头上已有的钱，下标0,1,2分别代表5块，10块和20块钱的数量
        int[] change = new int[3];

        for (int bill : bills) {
            if (5 == bill) {
                change[0] += 1;
            } else if (10 == bill) {
                change[1] += 1;
                if (0 == change[0]) {
                    return false;
                } else {
                    change[0] -= 1;
                }
            } else {
                change[2] += 1;
                if (change[1] > 0 && change[0] > 0) {
                    change[1] -= 1;
                    change[0] -= 1;
                } else if (change[0] >= 3) {
                    change[0] -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
