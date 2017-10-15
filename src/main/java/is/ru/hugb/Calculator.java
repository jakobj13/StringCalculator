package	is.ru.hugb;


public	class	Calculator	{
				
				public	static int add(String numbers)	{
					if(numbers.equals(""))
						return 0;
					else{
						if(numbers.contains(",")){
							String stringnumb[] = numbers.split(",");
							int total = 0;
							for(String number : stringnumb){
								total += toInt(number);
							}
							return total;
						}

						return toInt(numbers);
					}
				}

				private static int toInt (String number){
					return Integer.parseInt(number);
				}

				 public static void main(String[] args) {
       
   				}
}

