package frc.robot.subsystems;

import frc.lib.AftershockSubsystem;

import frc.robot.Constants.PortConstants;
import com.revrobotics.CANSparkMax;
public class IntakeSubsystem extends AftershockSubsystem {
    //jnsefk
    //@author
    //TODO: test motor with this code, add "brushless" motor type to sparkmax object
    //TODO: add constants for motor speed for all 4 situations
    CANSparkMax spark = new CANSparkMax(PortConstants.kSparkMaxPort, null); // 0 is the RIO PWM port this is connected to

    public IntakeSubsystem(){
        super();
    }

    //Turn on the motor to input the cone
    //Button right trigger
    //clockwise to output
    public void intakeCone(){
        spark.set(-0.75);
    }
    //Turn on the motor to output the cone
    //Button left trigger
    //counterclockwise to intake
    public void outputCone(){
        
    }
    //Turn on the motor to input the cube
    //Button right bumper
    //counterclockwise to input
    public void intakeCube(){

    }
    //Turn on the motor to output the cube
    //Button left bumper
    //clockwise to output
    public void outputCube(){
        
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
