package main.java.com.fiuba.algo3.modelo;

import main.java.com.fiuba.algo3.modelo.Observable;
import main.java.com.fiuba.algo3.modelo.Positionable;
import java.util.ArrayList;

public class Player implements Positionable, Observable {
	private AttackStrategy attackStrategy;
	private Position position;
	private ArrayList<Observer> observers;

	public Player() {
		super();
		observers = new ArrayList<Observer>();
		attackStrategy = new NoGun();
	}

	public void changeAttackStrategy(AttackStrategy newStrategy) {
		attackStrategy = newStrategy;
		notifyObservers();
	}

	public String getStrategyName() {
		return attackStrategy.getName();
	}

	@Override
	public Position getPosition() {
		return position;
	}

	@Override
	public void setPosition(Position position) {
		this.position = position;
		notifyObservers();
	}

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void notifyObservers() {
		observers.stream().forEach(observer -> observer.change());
	}
}
