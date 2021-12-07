package racingcar.model.classes;

import java.util.ArrayList;
import java.util.List;

import racingcar.model.TrackInterface;

public class GameData {
	private List<Car> cars = new ArrayList<>();
	private TrackInterface track = new Track();
	private String trackStatus;
	private int counts;


	public void makeData(String[] names, int counts) {
		for (String carName: names) {
			Car car = new Car(carName);
			cars.add(car);
		}
		trackStatus = track.makeTrack(cars);
		this.counts = counts;
	}

	public String getTrackStatus() {
		trackStatus = track.makeTrack(cars);
		return trackStatus;
	}

	public void setTrackStatus(String trackStatus) {
		this.trackStatus = trackStatus;
	}

	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public TrackInterface getTrack() {
		return track;
	}

	public void setTrack(TrackInterface track) {
		this.track = track;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}
}