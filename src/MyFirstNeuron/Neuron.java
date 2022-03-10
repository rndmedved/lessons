package MyFirstNeuron;

public class Neuron {
    private double weight = 0.5d;
    private double LastError;
    private double Smoothing = 0.00001d;

    public double getSmoothing() {
        return Smoothing;
    }

//    public void setSmoothing(float smoothing) {
//        Smoothing = smoothing;
//    }

    public double getLastError() {
        return LastError;
    }

    private void setLastError(double lastError) {
        LastError = lastError;
    }

    public double ProcessInputData(double input) {
        return input * weight;
    }

    public double RestoreInputData(double output) {
        return output / weight;
    }

    public void Train(double input, double expectedResult) {
        double actualResult = input * weight;
        setLastError(expectedResult - actualResult);
        double correction = (LastError / actualResult) * Smoothing;
        weight += correction;
    }
}
