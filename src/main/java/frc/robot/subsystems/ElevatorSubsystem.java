package frc.robot.subsystems;
import frc.lib.AftershockSubsystem;
import frc.lib.Lidar;
import frc.lib.PID;
import frc.robot.Constants.PortConstants;
import frc.robot.Constants.PIDvalues;
import edu.wpi.first.wpilibj.XboxController;
public class ElevatorSubsystem extends AftershockSubsystem {
    
    private Lidar m_lidar = new Lidar(PortConstants.kLidarPort);   
    private PID mPID = new PID();
    double elevatorDistance; 
    XboxController m_roboController = new XboxController(0);
    boolean xButton = m_roboController.getXButton();
    boolean aButton = m_roboController.getAButton();
    boolean bButton = m_roboController.getBButton();
    
    public enum States 
    {
        eLOW(0), eMID(45), eHIGH(90);

        private final int currentLidarDistance;

        private States(int distance) {
            currentLidarDistance = distance;
        }
    }

    public void ElevatorSubsystem()
    {
        
    }
    public void ElevatorPeriodic()
    {
        
        elevatorDistance = m_lidar.getDistanceIn();//lidar distance in inches
        
    }
    public void ElevatorTerminate(){
        //if(elevatorDistance==){
         //   elevatorDistance=
        //}
    }
    public void initialize() {
        // TODO Auto-generated method stub
      mPID.start(PIDvalues.kPIDvalue);
    }   
    public void outputTelemetry() {
        // TODO Auto-generated method stub
        
    }
    
}
