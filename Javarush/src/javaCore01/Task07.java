package javaCore01;

public class Task07 {
	
//	Скрыть все внутренние переменные класса Cat, но только те, к которым остается доступ с помощью методов.
	
	public static void main(String[] args) {
	}

	public class Cat {
		private String name;
		private int age;
		public int weight;

		public Cat(String name, int age, int weight) {
			this.name = name;
			this.age = age;
			this.weight = weight;
		}

		private String getName() {
			return name;
		}

		private void setName(String name) {
			this.name = name;
		}

		private int getAge() {
			return age;
		}

		private void setAge(int age) {
			this.age = age;
		}
	}
}