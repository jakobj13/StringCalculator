package	is.ru.hugb;


public	class	Calculator	{
				
				public	static int add(String numbers)	{
					if(numbers.equals(""))
						return 0;
					else{
						if(numbers.contains(",")){
							String stringnumb[] = numbers.split(",");
							return Integer.parseInt(stringnumb[0]) + Integer.parseInt(stringnumb[1]);
						}
						return 1;
					}
				}

				 public static void main(String[] args) {
       
   				}
}

