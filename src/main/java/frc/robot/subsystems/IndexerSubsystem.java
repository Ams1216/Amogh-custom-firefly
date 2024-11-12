// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class IndexerSubsystem extends SubsystemBase {
  public TalonSRX greenTopPreloadMotor = new TalonSRX(Constants.MotorIDs.PRELOAD_INDEXER_MOTOR);
  public TalonSRX blueTopFeederMotor = new TalonSRX(Constants.MotorIDs.FEEDER_INDEXER_MOTOR);
  public DigitalInput beamBreakPreload = new DigitalInput(Constants.Indexer.preloaderBeamBreak);
  public DigitalInput beamBreakFeeder = new DigitalInput(Constants.Indexer.feedBeamBreak);

  
  /** Creates a new IndexerSubsystem. */
  public IndexerSubsystem() {

  }
  public void runPreloadMotor(double speed){
    greenTopPreloadMotor.set(TalonSRXControlMode.PercentOutput,speed);

  }
   public void stopPreloadMotor(){
    greenTopPreloadMotor.set(TalonSRXControlMode.PercentOutput,0);

  }
   public void runFeederMotor(double speed){
    blueTopFeederMotor.set(TalonSRXControlMode.PercentOutput,speed);

  }
  public void stopFeederMotor(){
    blueTopFeederMotor.set(TalonSRXControlMode.PercentOutput,0);

  }
  public boolean checkPreloadSensor(){
    return !beamBreakPreload.get();

  }
  public boolean checkFeedSensor(){
    return !beamBreakFeeder.get();

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
