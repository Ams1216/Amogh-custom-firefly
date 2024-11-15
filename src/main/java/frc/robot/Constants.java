// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static final class MotorIDs {
    public static final int TOP_SHOOTER_MOTOR = 15;
    public static final int BOTTOM_SHOOTER_MOTOR = 16;
    public static final int HOPPER_MOTOR = 17; // Horizontal blue compliant wheels
    public static final int PRELOAD_INDEXER_MOTOR = 18; // Green compliant wheel
    public static final int FEEDER_INDEXER_MOTOR = 19; // Small blue wheel directly under shooter
    public static final int INTAKE_MOTOR = 20;
    // public static final int ARM_MOTOR = 14;
    // public static final int PITCH_MOTOR = 91;
}

public static final class Solenoids {
    public static final int COMPRESSOR_MODULE_ID = 13;

    public static final int INTAKE_OUT_SOLENOID = 5;
    public static final int INTAKE_IN_SOLENOID = 4;

    public static final int SHOOTER_ANGLE_OUT_SOLENOID = 7;
    public static final int SHOOTER_ANGLE_IN_SOLENOID = 6;
}
public static final class Intake {  // Sets the speed of the motors
  public static final double kIntakeSpeed = .90;
  public static final double kHopperSpeed = .75;
}
public static final class Indexer {
  public static final int preloaderBeamBreak = 9;
  public static final int feedBeamBreak = 8;
  public static final double preloadeMotorSpeed = 1.0;
  public static final double feedMotorSpeed = -0.75;
}
}
