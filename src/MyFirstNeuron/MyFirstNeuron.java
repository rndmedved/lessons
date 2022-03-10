package MyFirstNeuron;

public class MyFirstNeuron {
    public static void main(String[] args) {
        double usd = 100;
        double rub = 7526;
        Neuron neuron = new Neuron();
        int i = 0;
        do {
            i++;
            neuron.Train(usd, rub);
            if((i % 100000 )  == 0) {
                System.out.println("Итерация: " + i + " Ошибка: " + neuron.getLastError());
            }
        } while (neuron.getLastError() > neuron.getSmoothing() || neuron.getLastError() < -neuron.getSmoothing());
        System.out.println("Обучение завершено");
        System.out.println(neuron.ProcessInputData(usd) + " рублей в " + usd + "USD.");
        System.out.println(neuron.ProcessInputData(235) + " рублей в " + 235 + "USD.");
        System.out.println(neuron.ProcessInputData(12) + " рублей в " + 12 + "USD.");
        System.out.println(neuron.RestoreInputData(75.26) + "USD в " + 75.26 + " рублей.");

    }
}
