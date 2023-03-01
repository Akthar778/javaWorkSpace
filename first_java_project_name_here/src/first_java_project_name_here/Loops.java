package first_java_project_name_here;

	 class empcheckstatus{
			public static void main(String[] args) {
				String interviewStatus=("pass");
				if (interviewStatus=="pass") {
					System.out.println("you have cleared round one");
					String secondRound=("pass");
					if(secondRound=="pass") {
						System.out.println("you have clear cleared your second round wait for 3rd round");
						String thordRound=("pass");
						if (thordRound=="pass") {
							System.out.println("you have cleared your thord tound wait for hr round");
							String HrRound=("pass");
							if (HrRound=="pass") {
								System.out.println("you have cleard your hr round");
								System.out.println("then we are youing to discuss salr y discussion");
								
								int saralry=10000;
								switch (saralry) {
								case 8000:
									System.out.println("salry 8000 im not fine, im expecting more salry");
									break;
								case 9000:
									System.out.println("salary 9000 better then previous offer but im expecting more");
									break;
								case 1000:
									System.out.println("1100 im happy and ready to work");
									break;
									default:
										System.out.println("more then 1100 im happy");
										break;
								}
							
								
							}else {
								System.out.println("you have not clear hr round");
							}
							
							
							
						} else {
							System.out.println("you have not selected on thord round soory");

						}
					}
					else {
						System.out.println("sorry you have not cleard your second round");
					}
				}
				else {
					System.out.println("go to home you are not selected");
				}
			}
		}

	
}