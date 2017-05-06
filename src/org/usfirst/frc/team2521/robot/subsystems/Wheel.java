package org.usfirst.frc.team2521.robot.subsystems;
import org.usfirst.frc.team2521.robot.RobotMap;
import org.usfirst.frc.team2521.robot.OI;
import org.usfirst.frc.team2521.robot.commands.SpinWheel;

import edu.wpi.first.wpilibj.command.Subsystem;

import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;



public class Wheel extends Subsystem {
	
	private CANTalon frontMotor;  
	
	public Wheel(){
		frontMotor = new CANTalon(RobotMap.FRONT_RIGHT_MOTOR);
		frontMotor.changeControlMode(TalonControlMode.PercentVbus);
	}
	
	public void spinWheel(){
		frontMotor.set(OI.getInstance().getJoystick().getY());
	}
	
	
    public void initDefaultCommand() {
    	setDefaultCommand(new SpinWheel());
    	
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

