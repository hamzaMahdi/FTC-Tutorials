package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="Basic: Linear OpMode", group="Linear Opmode")

public class MyFIRSTJavaOpMode extends LinearOpMode {
    private DcMotor rightMotor;
    private  DcMotor leftMotor;
    @Override
    public void runOpMode(){
        rightMotor = hardwareMap.get(DcMotor.class,"right");
        leftMotor = hardwareMap.get(DcMotor.class,"left");

        telemetry.addData("Status","Initialized");
        telemetry.update();

        waitForStart();
        while(opModeIsActive()){
            double left = this.gamepad1.left_stick_y;
            double right = -this.gamepad1.right_stick_y;
            leftMotor.setPower(left);
            rightMotor.setPower(right);
            telemetry.addData("Status","Running");
            telemetry.addData("Left Joystick",left);
            telemetry.addData("Right Joysticl",right);
            telemetry.update();

        }
    }

}
