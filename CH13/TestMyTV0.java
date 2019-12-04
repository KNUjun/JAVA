public class TestMyTV0{
	static void print_tv(MyTV0 t){
		if(t.isOn())
			System.out.println("CH:"+t.getChannel()+
			" VOL:"+t.getVolume());
		else System.out.println("TV_OFF");
	}
	public static void main(String args[]){
		MyTV2 t = new MyTV2();
		
		t.setChannel(100);
		t.setVolume(0);
		print_tv(t);
		
		t.turnOnOff();
		t.raiseChannel();
		t.raiseVolume();
		print_tv(t);
		
		t.setChannel(10);
		t.setVolume(100);
		t.lowerChannel();
		t.lowerVolume();
		print_tv(t);
		
		t.turnOnOff();
		t.lowerChannel();
		t.lowerVolume();
		print_tv(t);
		
		t.turnOnOff();
		t.setChannel(50);
		print_tv(t);
		t.gotoPrevChannel();
		print_tv(t);
		t.gotoPrevChannel();
		print_tv(t);
		t.lowerChannel();
		t.lowerChannel();
		print_tv(t);
		t.gotoPrevChannel();
		print_tv(t);
		t.gotoPrevChannel();
		print_tv(t);
	}
}

class MyTV0{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	public static final int MAX_CHANNEL = 100;
	public static final int MIN_CHANNEL = 1;
	public static final int MAX_VOLUME = 100;
	public static final int MIN_VOLUME = 1;
	
	protected MyTV0(){
		this.isPowerOn=false;
		this.channel = MIN_CHANNEL;
		this.volume = MIN_VOLUME;
	}
	
	public boolean isOn(){
		return this.isPowerOn;
	}
	public void turnOn(){
		this.isPowerOn = true;
	}
	public void turnOff(){
		this.isPowerOn = false;
	}
	public int getChannel(){
		return this.channel;
	}
	public boolean setChannel(int channel){
		if( isOn() ){
			if( channel>=MIN_CHANNEL && channel<=MAX_CHANNEL ){
				this.channel = channel;
				return true;
			}
		}
		return false;
	}
	public int getVolume(){
		return this.volume;
	}
	public boolean setVolume(int volume){
		if( isOn() ){
			if( volume>=MIN_VOLUME && volume<=MAX_VOLUME ){
				this.volume = volume;
				return true;
			}
		}
		return false;
	}
}

class MyTV1 extends MyTV0{
	public void turnOnOff(){
		if( isOn()) turnOff();
		else turnOn();
	}
	
	public void lowerChannel(){
		setChannel(getChannel()-1);
	}
	public void raiseChannel(){
		setChannel(getChannel()+1);
	}
	public void lowerVolume(){
		setVolume(getVolume()-1);
	}
	public void raiseVolume(){
		setVolume(getVolume()+1);
	}
}

class MyTV2 extends MyTV1{
	protected int previousChannel;
	
	public boolean gotoPrevChannel(){
		if( isOn() ){
			setChannel(previousChannel);
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean setChannel(int channel){
		if( isOn() ){
			if( channel>=MIN_CHANNEL && channel<=MAX_CHANNEL ){
				this.previousChannel = getChannel();
				super.setChannel(channel);
				return true;
			}
		}
		return false;
	}
}