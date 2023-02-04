package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.subsystems.IntakeSubsystem;

/** An example command that uses an example subsystem. */
public class InputConeCommand extends InstantCommand {
  
  private IntakeSubsystem mInput;
    
    
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public InputConeCommand(IntakeSubsystem input) {
    mInput = input;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(mInput);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    System.out.println("input cone command starting");
  }

  // Called every time the scheduler runs while the command is scheduled.
  //@Override
  public void execute() {
    //double speed = this.speed;
    mInput.intakeCone();
  }
}