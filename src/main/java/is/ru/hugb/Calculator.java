package	is.ru.hugb;


public	class	Calculator	{
				
				public	static int add(String numbers)	{
					if(numbers.equals(""))
						return 0;
					else{
						if(numbers.contains("\n") | (numbers.contains(","))){
							String stringnumb[] = numbers.split(",|\n");
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

				 public static void main(String[] args) {
       
   				}
}

