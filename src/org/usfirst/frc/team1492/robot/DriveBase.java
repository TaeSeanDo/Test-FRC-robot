package org.usfirst.frc.team1492.robot;

import edu.wpi.first.wpilibj.VictorSP;

public class DriveBase {

    VictorSP leftDrive;
    VictorSP rightDrive;
    
    public DriveBase(int leftChannel, int rightChannel) {
        leftDrive = new VictorSP(leftChannel);
        rightDrive = new VictorSP(rightChannel);
    }
    
    public void drive(double leftPower, double rightPower) {
        leftDrive.set(leftPower);
        rightDrive.set(rightPower);
    }
    
    public void drive(double power) {
        drive(power, power);
    }
    
    public void drive() {
        drive(1.0);
    }
}
