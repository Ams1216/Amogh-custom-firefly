// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj.Timer;




public class IntakeInCommand extends Command {
  /** Creates a new IntakeInCommand. */
  public IntakeSubsystem intake = new IntakeSubsystem();
  private final Timer timer = new Timer();
  

  public IntakeInCommand(IntakeSubsystem intake) {
    this.intake = intake;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    intake.spinIn(Constants.Intake.kIntakeSpeed);
    intake.armDown();
    timer.reset();
    timer.start();
    while (!timer.hasElapsed(1.00)){}
    timer.stop();
    timer.reset();
    intake.armUp();
    intake.spinOut();

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
