package org.usfirst.frc.team948.robot.commands;

import org.usfirst.frc.team948.robot.DS2016;
import org.usfirst.frc.team948.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.command.Command;

public abstract class CommandBase extends Command {
	public static Drive drive = new Drive();
	
	public static DS2016 ds = new DS2016();
}
