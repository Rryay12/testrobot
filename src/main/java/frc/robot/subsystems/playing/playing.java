package frc.robot.subsystems.playing;

import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class playing extends SubsystemBase{
    final CANSparkMax lolmotor = new CANSparkMax(5, MotorType.kBrushless);

    public playing(){
        System.out.println("initiated playing");
        lolmotor.restoreFactoryDefaults();
        lolmotor.setIdleMode(IdleMode.kBrake);
    }

    public void runaround(double speed){
        lolmotor.set(speed);
    }
}
