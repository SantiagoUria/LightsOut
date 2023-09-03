package model;

public class Light {

	private boolean isOn;

	Light(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean getState() {
		return isOn;
	}

	protected void hitSwitch() {
		isOn = !isOn;
	}
}