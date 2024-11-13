// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.lang.invoke.ConstantBootstraps;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.IndexerSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeAndIndexCommand extends IntakeInCommand{
  private IndexerSubsystem index;
  /** Creates a new IntakeAndIndexCommand. */
  public OutakeCommand(IntakeSubsystem intake,IndexerSubsystem index) {
    super(intake);
    this.index = index ; 
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(index);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {super.initialize();}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    super.execute();
    if (!index.checkFeedSensor()){
      index.runPreloadMotor(-Constants.Indexer.preloadeMotorSpeed);
      index.runFeederMotor(-Constants.Indexer.feedMotorSpeed);
    }else if(!index.checkPreloadSensor()&&index.checkFeedSensor()){
      index.runPreloadMotor(-Constants.Indexer.preloadeMotorSpeed);
      index.runFeederMotor(0);
    }else if (index.checkFeedSensor()&&index.checkPreloadSensor()){
      index.runPreloadMotor(0);
      index.runFeederMotor(0);
    }

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    super.end(interrupted);
    index.runPreloadMotor(0);
    index.runFeederMotor(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return index.checkFeedSensor()&&index.checkPreloadSensor();
  }
}
