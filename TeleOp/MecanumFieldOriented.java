import com.arcrobotics.ftclib.hardware.REVIMU

double angle = gyro.getHeading();


// rotation 
double x_rotated = x * Math.cos(angle) - y * Math.sin(angle);
double y_rotated = x * Math.sin(angle) + y * Math.cos(angle);
// x, y, theta input mixing
frontLeftMotor.setPower(x_rotated + y_rotated + t);
backLeftMotor.setPower(x_rotated - y_rotated + t);
frontRightMotor.setPower(x_rotated - y_rotated - t);
backRightMotor.setPower(x_rotated + y_rotated - t);
