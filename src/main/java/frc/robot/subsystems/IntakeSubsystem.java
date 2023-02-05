package frc.robot.subsystems;

import frc.lib.AftershockSubsystem;
import frc.robot.Constants.ControllerConstants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.IntakeCommand;
import frc.robot.Constants.IntakeConstants;
import frc.robot.Constants.MotorConstants;
public class IntakeSubsystem extends AftershockSubsystem {

    //TODO: test motor with this code, add "brushless" motor type to sparkmax object
    //TODO: add constants for motor speed for all 4 situations
    
    private CANSparkMax sparkMotorController = new CANSparkMax(MotorConstants.kCANSparkMaxID, MotorType.kBrushless); 
    public IntakeSubsystem(){
        super();
    }

    public void intakePeriodic() {
        /**  boolean leftBumperPressed = primaryController.getLeftBumper();
        boolean rightBumperPressed = primaryController.getRightBumper();
        //double rightTriggerAmount = primaryController.getRightTriggerAxis();
        //double leftTriggerAmount = primaryController.getLeftTriggerAxis();
        boolean rightTriggerPressed = primaryController.getRightTriggerAxis() >= .25;
        boolean leftTriggerPressed = primaryController.getLeftTriggerAxis() >= .25;
        //cube out
        if(leftBumperPressed){
            setSpeed(IntakeConstants.outputCubeSpeed); 
            System.out.println("LeftBump");
        //cone out
        } else if(leftTriggerPressed){
            setSpeed(IntakeConstants.outputConeSpeed);
            System.out.println("LeftTrig " + " axis value: " + primaryController.getLeftTriggerAxis());
        //cube in
        } else if (rightBumperPressed){
            setSpeed(IntakeConstants.intakeCubeSpeed);
            System.out.println("RightBump ");
        //cone in
        } else if(rightTriggerPressed){
            setSpeed(IntakeConstants.intakeConeSpeed);
            System.out.println("RightTrig " + " axis value: " + primaryController.getRightTriggerAxis());
            
        } else {
            setSpeed(0);
            System.out.println("Hi");
        }**/
    }
    //Turn on the motor to input the cone
    //Button right trigger
    //clockwise to output

    /**
     * 
     * This sets the motor speed
     * 
     */
    private void setSpeed(double speed){
        sparkMotorController.set(speed);
        System.out.println(speed);
    }
    public void intakeCone(){
        setSpeed(-(IntakeConstants.kIntakeConeSpeed));
        System.out.println("Intaking cone: " + -(IntakeConstants.kIntakeConeSpeed));
    }
    //Turn on the motor to output the cone
    //Button left trigger
    //counterclockwise to intake
    public void outputCone(){ 
        setSpeed(IntakeConstants.kIntakeConeSpeed);
        System.out.println("outputting cone: " + IntakeConstants.kIntakeConeSpeed);
    }
    //Turn on the motor to input the cube
    //Button right bumper
    //counterclockwise to input
    public void intakeCube(){
        setSpeed(IntakeConstants.kIntakeCubeSpeed);
        System.out.println("Intaking cube " + IntakeConstants.kIntakeCubeSpeed);
    }
    //Turn on the motor to output the cube
    //Button left bumper
    //clockwise to output
    public void outputCube(){
        setSpeed(-(IntakeConstants.kIntakeCubeSpeed));
        System.out.println("outputting cube " + -(IntakeConstants.kIntakeCubeSpeed));
    }

    public void stopIntakeMotor() {
        sparkMotorController.set(0);
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
