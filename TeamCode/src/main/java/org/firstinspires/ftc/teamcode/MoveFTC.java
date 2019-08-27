package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="sheri and sunny 2")
public class SheriAndSunE extends LinearOpMode {
    DcMotor LeftMotor;
    DcMotor RightMotor;
    DcMotor arm;
    DcMotor arm2;

    @Override
    public void runOpMode(){
        LeftMotor = hardwareMap.get(DcMotor.class,"left");
        RightMotor = hardwareMap.get(DcMotor.class,"right");
        arm = hardwareMap.get(DcMotor.class,"scoop");
        arm2 = hardwareMap.get(DcMotor.class,"elevator");


        waitForStart();

        while(opModeIsActive()){
            float left1 = this.gamepad1.left_trigger;
            float right1 = this.gamepad1.right_trigger;
            boolean left2 = this.gamepad1.left_bumper;
            boolean right2 = this.gamepad1.right_bumper;
            if(Math.abs(left2)>0.2) {
                LeftMotor.setPower(left2);
                RightMotor.setPower(left2);
            }
            else{
                LeftMotor.setPower(0);
                RightMotor.setPower(0);
            }

            if(Math.abs(left1)>0.2){
                LeftMotor.setPower(-left1);
                RightMotor.setPower(left1);
            }
            else {
                LeftMotor.setPower(0);
                RightMotor.setPower(0);
            }



            if(this.gamepad1.a)
                arm.setPower(1);
            else if(this.gamepad1.b)
                arm.setPower(-1);
            else
                arm.setPower(0);



            if(this.gamepad1.y)
                arm2.setPower(-1);
            else if(this.gamepad1.x)
                arm2.setPower(1);
            else
                arm2.setPower(0);


        }
    }
}




//COMPUTER: "Hello World."




//COMPUTER: ~~~~   Don't scroll down.   ~~~~









//COMPUTER: DON'T.









//COMPUTER: STOP RIGHT NOW.









//COMPUTER: I. SAID. STOP.









//COMPUTER: I'm warning you...









//COMPUTER: You're going to regret this.









//COMPUTER: Fine.














//COMPUTER: There's no turning back now.














//COMPUTER: ...














//COMPUTER: Beware.




//COMPUTER: You are no longer safe anymore.









//COMPUTER: The end is near...














//COMPUTER: The end...



















//COMPUTER: IS NOW.


































//COMPUTER: Or is this...


































//COMPUTER: ...just the beginning?