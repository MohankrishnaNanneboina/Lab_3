package com.info.cmd;

public class CakeOvenCmdOff implements Command {
    CakeOven ovenOff;
    
    
	public CakeOvenCmdOff(CakeOven ovenOff) {
		super();
		this.ovenOff = ovenOff;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ovenOff.off();
	}

	
	
}
