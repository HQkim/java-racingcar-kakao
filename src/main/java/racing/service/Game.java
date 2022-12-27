package racing.service;

import java.util.ArrayList;
import java.util.List;
import racing.domain.Cars;
import racing.utils.RandomNumberGenerator;

public class Game {
    private final Cars cars;
    private final int length;
    private final RandomNumberGenerator generator;

    public Game(List<String> carNames) {
        cars = new Cars(carNames);
        length = carNames.size();
        generator = new RandomNumberGenerator();
    }

    public void play() {
        List<Double> randomNumbers = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            randomNumbers.add(generator.generate());
        }
        cars.play(randomNumbers);
    }

    public List<String> getStatus() {
        return cars.getStatus();
    }

    public List<String> getWinners() {
        return cars.getWinners();
    }


}
