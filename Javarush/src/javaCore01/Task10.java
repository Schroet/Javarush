package javaCore01;

public class Task10 {
	
//	Посмотри внимательно на методы и добавь недостающие поля.
	public static void main(String[] args) {
	}

	public class Cat {
		
		private String name;
		private int age;
		private int speed;
		private int weight;
		

		public Cat(String name, int age, int weight) {
			this.name = name;
			this.age = age;
			this.weight = weight;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		}

		public void setSpeed(int speed) {
			this.speed = speed;

		}
	}
}
