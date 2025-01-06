package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;
//import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.playing.playing;


public class test extends Command{
    private final playing play;
    private final Supplier<Double> power;
    private final Supplier<Boolean> enable;

    public test(playing subsystem,Supplier<Double> leftyaxis,Supplier<Boolean> aButton){
        play = subsystem;
        power = leftyaxis;
        enable = aButton;
        System.out.println("initiated test");

        addRequirements(play);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        if (enable.get()){
            play.runaround(power.get());
        }
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }
}
