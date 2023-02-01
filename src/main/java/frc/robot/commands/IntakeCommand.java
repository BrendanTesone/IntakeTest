package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;

import com.revrobotics.SparkMaxPIDController;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

/** An example command that uses an example subsystem. */
public class IntakeCommand extends CommandBase {
  
  private IntakeSubsystem m_intake = new IntakeSubsystem();
  private Spark spark = new Spark(3);  
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public void ExampleCommand(IntakeSubsystem intake) {
    m_intake = intake;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_intake);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  //@Override
  public void execute(double speed) {
    //double speed = this.speed;
    spark.set(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
