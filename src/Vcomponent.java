public class Vcomponent implements Synchronizable{
    protected int id, p;
//=====================================================================================
    //Setter // Getter
    public void setP(int p) {
        this.p = p;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getP() {
        return p;
    }
    public int getId() {
        return id;
    }

//=====================================================================================
    //Overriden Methods
    @Override
    public int compare(Comparable c) 
    {
        if (this.p > ((Vcomponent) c).getP()) 
        {
            return -1;
        } 
        else if (this.p < ((Vcomponent) c).getP()) 
        {
            return 1;
        }
        return 0;
    }

    @Override
    public void run() {}
}
