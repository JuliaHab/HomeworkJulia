package hw11;

public class App {
    public static void main(String[] args) {

    // Create 2 computers
    // Get CPU Frequence from computer1
    // Get RAM size from computer2

    // конструктор записывается в обратном порядке (сначало пишутся конструкторы атрибутов компьютера, а затем сам конструктор компьютера)

    Keyboard keyboardCom1 = new Keyboard("LOGITECH","G G213 Prodigy");
    Mouse mouseCom1 = new Mouse("Bloody","W60 Max");
    Monitor monitorCom1 = new Monitor(27,MatrixType.ISP,"ASUS","VY279HE");
    PowerSupply powerSupplyCom1 = new PowerSupply(800,"*","*");
    Disk diskCom1 = new Disk(2048,DiskType.HDD,"HPE","SAS BC 512e");
    Case caseCom1 = new Case("Zalman","i3");
    GPU gpuCom1 = new GPU(GPUmake.AMD,12288,"GeForce","RTX 3060");
    CPU cpuCom1 = new CPU(2.9,"Intel Core i5","10400F");
    MotherBoard motherBoardCom1 = new MotherBoard(cpuCom1,16,"GIGABYTE","Z690 UD DDR4");
    SystemBlock systemBlockCom1 = new SystemBlock(powerSupplyCom1,diskCom1,caseCom1,gpuCom1,motherBoardCom1);
    Copmuter copmuter1 = new Copmuter(keyboardCom1,mouseCom1,monitorCom1,systemBlockCom1," ","");


    Keyboard keyboardCom2 = new Keyboard("OKLICK","420MRL");
    Mouse mouseCom2 = new Mouse("Defender","Safari MM-675");
    Monitor monitorCom2 = new Monitor(32,MatrixType.VA,"Samsung","C32T550FDI");
    PowerSupply powerSupplyCom2 = new PowerSupply(500,"*","*");
    Disk diskCom2 = new Disk(4000,DiskType.SSD,"ADATA","SX8100 ASX8100NP-4TT-C");
    Case caseCom2 = new Case("Zalman","S2");
    GPU gpuCom2 = new GPU(GPUmake.NVIDIA,12288,"GeForce","RTX 3060");
    CPU cpuCom2 = new CPU(3.6,"Intel Core i3","10100f");
    MotherBoard motherBoardCom2 = new MotherBoard(cpuCom2,8,"ASRock","B560M STEEL LEGEND");
    SystemBlock systemBlockCom2 = new SystemBlock(powerSupplyCom2,diskCom2,caseCom2,gpuCom2,motherBoardCom2);
    Copmuter copmuter2 = new Copmuter(keyboardCom2,mouseCom2,monitorCom2,systemBlockCom2,"","");

    double cpuFrequence = copmuter1.getSystemBlock().getMotherBoard().getCpu().getFrequency();
    int ramSize = copmuter2.getSystemBlock().getMotherBoard().getRamSize();

        System.out.println("CPU Frequence from computer1 = "+cpuFrequence);

        System.out.println("RAM size from computer2 = "+ramSize);

        System.out.println(copmuter1);
        System.out.println(copmuter2);

    }
}
