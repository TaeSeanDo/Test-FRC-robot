package org.usfirst.frc.team1492.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class DriveBase {

    VictorSP leftMotor;
    VictorSP rightMotor;

    public DriveBase(int leftChannel, int rightChannel) {
        leftMotor = new VictorSP(leftChannel);
        rightMotor = new VictorSP(rightChannel);
    }
    
    public void drive(double leftPower, double rightPower) {
        leftMotor.set(leftPower);
        rightMotor.set(rightPower);
    }
    
    public void drive (double power) {
        drive(power, power);
    }

}
