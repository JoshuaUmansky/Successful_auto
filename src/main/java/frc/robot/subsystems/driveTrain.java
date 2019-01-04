/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */

public class driveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private VictorSP leftFront = new VictorSP(RobotMap.frontLeftDrive);
  private VictorSP leftBack = new VictorSP(RobotMap.backLeftDrive);


  public void drive(double leftInput, double rightInput){

    leftFront.set(leftInput);
    leftBack.set(rightInput);

    //DifferentialDrive m_drive = new DifferentialDrive(left, right);

    //m_drive.curvatureDrive(leftInput, rightInput, false);
    //m_drive.arcadeDrive(leftInput, rightInput);
    //m_drive.tankDrive(leftInput, rightInput);
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    //setDefaultCommand(new Move());
  }
}
