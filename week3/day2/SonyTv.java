package week3.day2;

public class SonyTv implements SmartTV {
//implement all the interface methods
	@Override
	public void increseVolume() {
		System.out.println("Increase Volume");
	}

	@Override
	public void changeChannel() {
		System.out.println("Change the Channel");
	}

	@Override
	public void switchOff() {
		System.out.println("Switch it Off");
	}

	@Override
	public void playMusic() {
		System.out.println("Play the Music");
	}

	public static void main(String[] args) {
		// Create object for the class and call all the methods
		SonyTv objSonyTv = new SonyTv();
		objSonyTv.increseVolume();
		objSonyTv.changeChannel();
		objSonyTv.switchOff();
		objSonyTv.playMusic();
	}

}
