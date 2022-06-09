public class Main {
    public static void main(String[] args)
    {
        Vcpu cpu1 = new Vcpu(4, 5);
        Vcpu cpu2 = new Vcpu(7, 2);
        Vcpu cpu3 = new Vcpu(3, 7);
        Vgpu gpu1 = new Vgpu(7, 2);
        Vgpu gpu2 = new Vgpu(9, 4);

        Vclock vc = new Vclock();

        vc.register(cpu1);
        vc.register(cpu2);
        vc.register(cpu3);
        vc.register(gpu1);
        vc.register(gpu2);

        vc.start(1000, 500);
    }
}
