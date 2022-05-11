package hw11;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disk disk;
    private Case desktopCase;
    private GPU graphicCard;
    private MotherBoard motherBoard;

    public SystemBlock(PowerSupply powerSupply, Disk disk, Case desktopCase, GPU graphicCard, MotherBoard motherBoard) {
        this.powerSupply = powerSupply;
        this.disk = disk;
        this.desktopCase = desktopCase;
        this.graphicCard = graphicCard;
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Case getDesktopCase() {
        return desktopCase;
    }

    public void setDesktopCase(Case desktopCase) {
        this.desktopCase = desktopCase;
    }

    public GPU getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(GPU graphicCard) {
        this.graphicCard = graphicCard;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "SystemBlock: \n"+powerSupply+"\n"+disk+"\n"+desktopCase+"\n"+graphicCard+"\n"+motherBoard;
    }
}
