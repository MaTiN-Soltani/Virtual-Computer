public class Vcpu extends Vcomponent{
//=====================================================================================
    public Vcpu(int id, int p) {
        super.setId(id);
        super.setP(p);
    }

    public void run() {
        System.out.println("Cpu " + id + " is running // priority:" + p);
    }
//=====================================================================================
}
