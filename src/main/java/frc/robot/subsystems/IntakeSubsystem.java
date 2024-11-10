// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;


public class IntakeSubsystem extends SubsystemBase  {
  public final TalonSRX motor = new TalonSRX(Constants.MotorIDs.INTAKE_MOTOR);
  public final DoubleSolenoid piston = new DoubleSolenoid(Constants.Solenoids.COMPRESSOR_MODULE_ID,PneumaticsModuleType.REVPH,Constants.Solenoids.INTAKE_IN_SOLENOID,Constants.Solenoids.INTAKE_OUT_SOLENOID);
  
  public void spinIn(double speed){
    motor.set(TalonSRXControlMode.PercentOutput,speed);
  }
  public void spinOut(){
    motor.set(TalonSRXControlMode.PercentOutput, 0);
  }
  public void armUp(){
    piston.set(Value.kForward);
  }
  public void armDown(){
    piston.set(Value.kReverse);
  }
  
  /** Creates a new IntakeSubsystem. */
  public IntakeSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
