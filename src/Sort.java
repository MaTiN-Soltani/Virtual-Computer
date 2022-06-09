public class Sort {
    private Comparable[] c;

    public void setList(Comparable[] c) {
        this.c = c;
    }
    public Comparable[] getList() {
        return c;
    }

    public void operate() 
    {
        for (int i = 0; i != c.length; i++) {
            for (int j = 0; j != c.length - 1; j++) {
                if (c[i].compare(c[j]) == 1)
                {
                    Comparable temp;
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }
}
