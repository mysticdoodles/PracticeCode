public class employees{
		private String name;
		private String Id_Number;
		private int age;
		private String seniority;

		employees(String name, String Id_number, int age, String seniority){
				this.name=name;
				this.age=age;
		}
	    void setname(String name){
	     	this.name=name;
		}
		void setname(int name){
			this.age=age;
		}
		String getname(){
		return this.name;
		}
		int getage(){
		return this.age;
		}
		public class salaries extends employees{
				private double salary;
				private double bonuses;
				
			salaries(){
				super();
				}	

			double getsalary(){
				return this.salary;
			}

			double getbonuses(){
				double this.bonuses;
			}
		
			void setbonuses(double bonuses){
					this.bonuses=bonuses;
			}
			void setsalary(double salary){
				this.salary=bonuses;
				}
		double total(){
		salary1= getsalary();
		bonues1=getbonuses();
		double total=salary1+bonuses1
		}
		
		public class rates extends employees{
				private double salary;
				private double bonuses;
				private double rates;
		
			double getsalary(){
				return this.salary;
			}

			double getbonuses(){
				double this.bonuses;
			}
		    double getrates(){
				double this.rates;
			}

			void setbonuses(double bonuses){
					this.bonuses=bonuses;
			}
			void setsalary(double salary){
				this.salary=bonuses;
				}
		    void setrates(double rates){
				this.srates=rates;
				}
		    double total(){
				salary1= getsalary();
				bonues1=getbonuses();
				rates1=getrates();
			double total=salary1*rates1+bonuses1
		}
		
		}
}