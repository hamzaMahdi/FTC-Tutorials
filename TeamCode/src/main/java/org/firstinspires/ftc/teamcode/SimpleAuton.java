package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;


@Autonomous(name = "Simple Auto")
public class SimpleAuton extends LinearOpMode{
    private DcMotor rightMotor;
    private  DcMotor leftMotor;
    @Override
    public void runOpMode(){
        rightMotor = hardwareMap.get(DcMotor.class,"right");
        leftMotor = hardwareMap.get(DcMotor.class,"left");
        ElapsedTime myTimer = new ElapsedTime();//create a timer object
        telemetry.addData("Status","Initialized");
        telemetry.update();
        waitForStart();
        myTimer.reset();
        leftMotor.setPower(0.5);
        rightMotor.setPower(0.5);
        while(myTimer.milliseconds()<1000){
            //dont do anything
        }
        leftMotor.setPower(0);
        rightMotor.setPower(0);


    }
}
