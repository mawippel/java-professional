package classes.enums;

public enum Season implements Color {
	WINTER("Cold") {
		@Override
		public void getDegreeInCelsius() {
		}

		@Override
		public void getColor() {
		}
	},
	SPRING("Cold") {
		@Override
		public void getDegreeInCelsius() {
		}

		@Override
		public void getColor() {
		}
	},
	FALL("Hot") {
		@Override
		public void getDegreeInCelsius() {
		}

		@Override
		public void getColor() {
		}
	},
	SUMMER("Hot") {
		@Override
		public void getDegreeInCelsius() {
		}

		@Override
		public void getColor() {
		}
	};
	
	private String description;
	
	// Gotta be private
	private Season(String x) {
		description = x;
	}
	
	public abstract void getDegreeInCelsius();
	
	public String getDescription() {
		return this.description;
	}
	
}
