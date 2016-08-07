package tr.org.linux.kamp2016.helloworlf;

public class Animall {

		private String name;
		private int age;
		private String type;
		
		public Animall(String name, int age, String type ) {
			this.name = name;
			if(age>0 && age<100) {
				this.age = age;
			}
			this.type = type;
		}
		
		
		@Override
		public String toString() {
			return "Animall [Bu hayvanın ismi=" + name + ", yaşı=" + age + ", türü=" + type + "]";
		}


		public String getName() {
			return name;
		}
		
		public void setName (String name) {
			
			this.name = name;
		}
		
		public void setAge(int age) {
			if(age>0 && age<100)
			  this.age = age;
		}
		
		public int getAge() {
			return age;
	    }
		
		public void setType(String type) {
			this.type = type;
		}
		
		public String getType() {
			return type;
		}
		
		

}
