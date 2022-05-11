package hw11;

public class Monitor {
    private int diagonal;
    private MatrixType matrixType;
    private String make;
    private String model;

    public Monitor(int diagonal, MatrixType matrixType, String make, String model) {
        this.diagonal = diagonal;
        this.matrixType = matrixType;
        this.make = make;
        this.model = model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public MatrixType getMatrixType() {
        return matrixType;
    }

    public void setMatrixType(MatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Monitor: diagonal - "+diagonal+", matrixType - "+matrixType+", make - "+make+", model - " + model;
    }
}
