public class Vgpu extends Vcomponent{
//=====================================================================================
    public Vgpu(int id, int p){
        super.setId(id);
        super.setP(p);
    }

    public void run(){
        System.out.println("Gpu " + id + " is running // priority:" + p);
    }
//=====================================================================================
}