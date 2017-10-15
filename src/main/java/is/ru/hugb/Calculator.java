package	is.ru.hugb;
import java.util.ArrayList;import java.util.List;


public	class	Calculator	{
				
				public	static int add(String numbers)	{
					if(numbers.equals(""))
						return 0;
					else{
						if(numbers.contains("\n") | (numbers.contains(","))){
							String stringnumb[] = numbers.split(",|\n");

							negCheck(stringnumb);
							return sum(stringnumb);
						}

						return toInt(numbers);
					}
				}

				private static int toInt (String number){
					return Integer.parseInt(number);
				}

				private static int sum(String [] numbers){
					int total = 0;
					for(String number : numbers){
						total += toInt(number);
					}
					return total;
				}

				public static void negCheck(String [] numbers){
					List negNumbers = new ArrayList();

					for(String number : numbers){
						int numberInt = toInt(number);
						if(numberInt < 0){
							negNumbers.add(number);
						}
					}

					if (negNumbers.size() > 0) {
						throw new RuntimeException("Negatives not allowed: " + negNumbers.toString().replace("[", "").replace("]", ""));

					}

				}

				 public static void main(String[] args) {
       
   				}
}

