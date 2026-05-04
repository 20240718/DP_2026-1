package ch12.Q2;
import java.util.ArrayList;
// MultiStringDisplay 클래스를 구현해 보세요.
public class MultiStringDisplay extends Display {
    private ArrayList<String> strings = new ArrayList<String>();

    public void add(String string) {
        strings.add(string);
    }

    @Override
    public int getColumns() {
        int max = 0;
        for (String s : strings) {
            if (max < s.getBytes().length) {
                max = s.getBytes().length;
            }
        }
        return max;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        if (row < 0 || row >= strings.size()) {
            return null;
        }
        return strings.get(row);
    }
}