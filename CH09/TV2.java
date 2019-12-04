public class TV2{
	int channel;
	int volumeLevel;
	boolean on;
	int previousChannel;
	
	TV2(int newCh, int newVol){ //constructor
		if( 1<=newCh && newCh<=120) channel=newCh;
		else channel=1;
		if( 1<=newVol && newVol<=7)	volumeLevel=newVol;
		else volumeLevel=1;
		previousChannel = channel;
	}
	
	// methods will be executed if 'on' is true
	public String getState(){
		String out = "On:" + on;
		if(on)	out = out + ", Ch:"+channel + ",Vol:"+volumeLevel;
		return out;
	}
	public void turnToggle(){
		if(on) on = false;
		else on = true;
	}
	public void setChannel(int newChannel){
		if(on){
			if( 1<=newChannel && newChannel<=120 ){
				previousChannel = channel;
				channel = newChannel;
			}
		}
	}
	public void gotoPreviousChannel(){
		if(on)	channel = previousChannel;
	}
	public void setVolume(int newVolumeLevel){
		if(on){
			if( 1<=newVolumeLevel && newVolumeLevel<=7)	volumeLevel = newVolumeLevel;
		}
	}		
	public void channelUp(){
		if (on){
			if( channel<120 ){
				previousChannel=channel;
				channel++;
			}
		}
	}
	public void channelDown(){
		if(on){
			if( channel>1 ){
				previousChannel=channel;
				channel--;
			}
		}
	}
	public void volumeUp(){
		if(on){
			if( volumeLevel<7 )	volumeLevel++;
		}
	}
	public void volumeDown(){
		if(on){
			if( volumeLevel>1 )	volumeLevel--;
		}
	}
}