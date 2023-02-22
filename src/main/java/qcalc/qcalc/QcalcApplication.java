package qcalc.qcalc;

import com.crio.qcalc.LogicCalculator;
import com.crio.qcalc.StandardCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(QcalcApplication.class, args);
		// StandardCalculator calc = new StandardCalculator();


		// int result = calc.add(1, 1);
		// System.out.println(calc.add(1, 1));


		// calc.add(1, 1);
		// calc.add(1, 2);
		// calc.printResult();
		// calc.subtract(10, 5);
		// calc.result = -1;


       	// System.out.println(calc.getResult());


		// calc.printResult();
		// calc.multiply(10, 5);
		// calc.printResult();
		// calc.divide(10, 2);
		// calc.printResult();


		// StandardCalculator calc = new StandardCalculator();
		// calc.add(Double.MAX_VALUE, 1.0);
		// calc.printResult();

		
		// StandardCalculator calc = new StandardCalculator();
		// calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		// calc.printResult();

		
		LogicCalculator calc = new LogicCalculator();
		calc.OR(8, 6);
		calc.printResult();


	}

}
