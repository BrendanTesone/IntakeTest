package frc.robot.subsystems;

import frc.lib.AftershockSubsystem;
import frc.robot.Constants.ControllerConstants;
import frc.robot.Constants.PortConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.Constants.ControllerConstants;
import frc.robot.commands.IntakeCommand;
public class IntakeSubsystem extends AftershockSubsystem {
    //jnsefk
    //@author
    //TODO: test motor with this code, add "brushless" motor type to sparkmax object
    //TODO: add constants for motor speed for all 4 situations
   // Spark spark = new Spark(PortConstants.kSparkMaxPort); // 0 is the RIO PWM port this is connected to

   private CANSparkMax spark = new CANSparkMax(3, MotorType.kBrushless); 
    public IntakeSubsystem(){
        super();
    }
    private XboxController primaryController = new XboxController(ControllerConstants.kPrimaryControllerPort);
   // private IntakeSubsystem Intake = new IntakeSubsystem();

    public void intakePeriodic() {
        boolean leftBumperPressed = primaryController.getLeftBumper();
        if(leftBumperPressed){
            outputCube();
            System.out.println("LeftBump");
        }
        double leftTriggerAmount = primaryController.getLeftTriggerAxis();
        if(leftTriggerAmount >= .5){
            outputCone();
            System.out.println("LeftTrig " + primaryController.getLeftTriggerAxis());
        }
        boolean rightBumperPressed = primaryController.getRightBumper();
        if(rightBumperPressed){
            intakeCube();
            System.out.println("RightBump ");
        }
        double rightTriggerAmount = primaryController.getRightTriggerAxis();
        if(rightTriggerAmount >= .5){
            outputCone();
            System.out.println("RightTrig " + primaryController.getRightTriggerAxis());
        }
    }
    //Turn on the motor to input the cone
    //Button right trigger
    //clockwise to output
    public void setSpeed(double speed){
        spark.set(speed);
        System.out.println(speed);
    }
    public void intakeCone(){
        spark.set(-0.75);
        
    }
    //Turn on the motor to output the cone
    //Button left trigger
    //counterclockwise to intake
    public void outputCone(){
        spark.set(0.75);
    }
    //Turn on the motor to input the cube
    //Button right bumper
    //counterclockwise to input
    public void intakeCube(){
        spark.set(0.75);
    }
    //Turn on the motor to output the cube
    //Button left bumper
    //clockwise to output
    public void outputCube(){
        spark.set(-0.75);
    }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void outputTelemetry() {
        // TODO Auto-generated method stub
        
    }

//right trigger, left trigger - cones
//right bumper left bumper - cubes
//right for consume, left for expel

    

}
