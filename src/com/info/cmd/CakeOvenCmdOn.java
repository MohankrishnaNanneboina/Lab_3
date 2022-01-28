package com.info.cmd;

public class CakeOvenCmdOn implements Command {
	CakeOven ovenOn;

	public CakeOvenCmdOn(CakeOven ovenOn) {
		super();
		this.ovenOn = ovenOn;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		ovenOn.on();
	}
}
