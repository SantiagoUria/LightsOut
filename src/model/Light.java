package model;

public class Light {

	private boolean isOn;

	Light(boolean isOn) {
		this.isOn = isOn;
	}

	protected boolean getState() {
		return isOn;
	}

	protected void setState(boolean isOn) {
		this.isOn = isOn;
	}

	protected void hitSwitch() {
		isOn = !isOn;
	}
}