package	is.ru.hugb;


public	class	Calculator	{
				
				public	static int add(String numbers)	{
					if(numbers.equals(""))
						return 0;
					else{
						if(numbers.contains(",")){
							String stringnumb[] = numbers.split(",");
							return toInt(stringnumb[0]) + toInt(stringnumb[1]);
						}
						return 1;
					}
				}

				private static int toInt (String number){
					return Integer.parseInt(number);
				}

				 public static void main(String[] args) {
       
   				}
}

